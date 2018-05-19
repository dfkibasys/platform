package de.dfki.iui.basys.runtime.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.basys.common.emf.json.JsonUtils;
import de.dfki.iui.basys.model.data.DataPackage;
import de.dfki.iui.basys.model.data.RobotPositionInformation;
import de.dfki.iui.basys.model.runtime.communication.Channel;
import de.dfki.iui.basys.model.runtime.communication.ChannelListener;
import de.dfki.iui.basys.model.runtime.communication.Notification;
import de.dfki.iui.basys.model.runtime.communication.Request;
import de.dfki.iui.basys.model.runtime.communication.Response;
import de.dfki.iui.basys.model.runtime.component.ComponentConfiguration;
import de.dfki.iui.basys.runtime.communication.CommFactory;
import de.dfki.iui.basys.runtime.component.ComponentContext;
import de.dfki.iui.basys.runtime.component.ComponentException;
import de.dfki.iui.basys.runtime.component.service.ServiceComponent;
import de.dfki.iui.basys.runtime.services.WorldModelManager;
import de.dfki.iui.basys.runtime.services.WorldModelManager.StaticWorldModel.WMPathTimes;
import de.dfki.iui.basys.runtime.services.WorldModelManager.StaticWorldModel.WMPathTimes.WMPathTime;

public class WorldModelManagerImpl extends ServiceComponent implements WorldModelManager {
    
    private long mMIRETA;
    
    // TODO
    // ProductInstances --> getlocalComponent
    // Symbolic positions for MIR --> MIRComponent handled alles --> Events // Verknüpfung zur Topologie herstellen
    // Capability info // StatusChannel wenn Wechsel zu Productie -> ResourceInstanceManager nach Capabilities fragen
    // Workplan
    
    public WorldModelManagerImpl(ComponentConfiguration config) {
        super(config);
    }
    
    @Override
    public void activate(ComponentContext context) throws ComponentException {
        super.activate(context);
        
        ExecutorService executor = Executors.newCachedThreadPool();
        
        @SuppressWarnings("unused")
        Channel mirOut = CommFactory.getInstance().openChannel(context.getSharedChannelPool(), "mir-component#out",
                                                                 false, new ChannelListener() {
            
            @Override
            public void handleMessage(Channel channel, String msg) {
            }
            
            @Override
            public void handleNotification(Channel channel, Notification not) {
                
                CompletableFuture<Boolean> cf = new CompletableFuture<Boolean>();
                
                executor.submit(() -> {
                    
                    try {
                        EObject payload = JsonUtils.fromString(not.getPayload(), EObject.class);
                        
                        if (payload.eClass().equals(DataPackage.eINSTANCE.getRobotPositionInformation())) {
                            
                            RobotPositionInformation MIRPosition = (RobotPositionInformation) payload;
                            mMIRETA = (long) MIRPosition.getEta() * 1000;
                            
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    cf.complete(true);
                    return null;
                });
            }
            
            @Override
            public Response handleRequest(Channel channel, Request req) {
                return null;
            }
            
        });
    }
    
    @Override
    public WorldModel getCurrentWorld() {
        
        return null;
        
    }
    
    // protected static final String[] POSITION = { "Station-QA", "Station-TeachIn",
    // "Station-Cola", "Station-BaSys",
    // "Station-Wait", "Station-Festo" };
    
    @Override
    public StaticWorldModel getStaticWorld() {
        
        StaticWorldModel swm = new StaticWorldModel();
        List<WMPathTimes> pathTimes = new ArrayList<>();
        
        WMPathTimes pathTimesStationQA = swm.new WMPathTimes("Station-QA");
        List<WMPathTime> QATimes = new ArrayList<>();
        QATimes.add(pathTimesStationQA.new WMPathTime("Station-TeachIn", 10000));
        QATimes.add(pathTimesStationQA.new WMPathTime("Station-Cola", 20000));
        QATimes.add(pathTimesStationQA.new WMPathTime("Station-BaSys", 30000));
        QATimes.add(pathTimesStationQA.new WMPathTime("Station-Wait", 40000));
        QATimes.add(pathTimesStationQA.new WMPathTime("Station-Festo", 50000));
        pathTimesStationQA.setPathTimes(QATimes);
        pathTimes.add(pathTimesStationQA);
        
        WMPathTimes pathTimesStationTeachIn = swm.new WMPathTimes("Station-TeachIn");
        List<WMPathTime> teachInTimes = new ArrayList<>();
        teachInTimes.add(pathTimesStationTeachIn.new WMPathTime("Station-QA", 10000));
        teachInTimes.add(pathTimesStationTeachIn.new WMPathTime("Station-Cola", 20000));
        teachInTimes.add(pathTimesStationTeachIn.new WMPathTime("Station-BaSys", 30000));
        teachInTimes.add(pathTimesStationTeachIn.new WMPathTime("Station-Wait", 40000));
        teachInTimes.add(pathTimesStationTeachIn.new WMPathTime("Station-Festo", 50000));
        pathTimesStationTeachIn.setPathTimes(teachInTimes);
        pathTimes.add(pathTimesStationTeachIn);
        
        WMPathTimes pathTimesStationCola = swm.new WMPathTimes("Station-Cola");
        List<WMPathTime> colaTimes = new ArrayList<>();
        colaTimes.add(pathTimesStationCola.new WMPathTime("Station-QA", 20000));
        colaTimes.add(pathTimesStationCola.new WMPathTime("Station-TeachIn", 20000));
        colaTimes.add(pathTimesStationCola.new WMPathTime("Station-BaSys", 30000));
        colaTimes.add(pathTimesStationCola.new WMPathTime("Station-Wait", 40000));
        colaTimes.add(pathTimesStationCola.new WMPathTime("Station-Festo", 50000));
        pathTimesStationCola.setPathTimes(colaTimes);
        pathTimes.add(pathTimesStationCola);
        
        WMPathTimes pathTimesStationBaSys = swm.new WMPathTimes("Station-BaSys");
        List<WMPathTime> baSysTimes = new ArrayList<>();
        baSysTimes.add(pathTimesStationBaSys.new WMPathTime("Station-QA", 30000));
        baSysTimes.add(pathTimesStationBaSys.new WMPathTime("Station-TeachIn", 30000));
        baSysTimes.add(pathTimesStationBaSys.new WMPathTime("Station-Cola", 30000));
        baSysTimes.add(pathTimesStationBaSys.new WMPathTime("Station-Wait", 40000));
        baSysTimes.add(pathTimesStationBaSys.new WMPathTime("Station-Festo", 50000));
        pathTimesStationBaSys.setPathTimes(baSysTimes);
        pathTimes.add(pathTimesStationBaSys);
        
        WMPathTimes pathTimesStationWait = swm.new WMPathTimes("Station-Wait");
        List<WMPathTime> waitTimes = new ArrayList<>();
        waitTimes.add(pathTimesStationWait.new WMPathTime("Station-QA", 40000));
        waitTimes.add(pathTimesStationWait.new WMPathTime("Station-TeachIn", 40000));
        waitTimes.add(pathTimesStationWait.new WMPathTime("Station-Cola", 40000));
        waitTimes.add(pathTimesStationWait.new WMPathTime("Station-BaSys", 40000));
        waitTimes.add(pathTimesStationWait.new WMPathTime("Station-Festo", 50000));
        pathTimesStationWait.setPathTimes(waitTimes);
        pathTimes.add(pathTimesStationWait);
        
        WMPathTimes pathTimesStationFesto = swm.new WMPathTimes("Station-Festo");
        List<WMPathTime> festoTimes = new ArrayList<>();
        festoTimes.add(pathTimesStationFesto.new WMPathTime("Station-QA", 50000));
        festoTimes.add(pathTimesStationFesto.new WMPathTime("Station-TeachIn", 50000));
        festoTimes.add(pathTimesStationFesto.new WMPathTime("Station-Cola", 50000));
        festoTimes.add(pathTimesStationFesto.new WMPathTime("Station-BaSys", 50000));
        festoTimes.add(pathTimesStationFesto.new WMPathTime("Station-Wait", 50000));
        pathTimesStationFesto.setPathTimes(festoTimes);
        pathTimes.add(pathTimesStationFesto);
        
        swm.setPathTimes(pathTimes);
        
        return swm;
    }
    
}
