package de.dfki.iui.basys.runtime.component.device.tecs;

import java.util.Timer;
import java.util.TimerTask;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;

import hue.gen.Color;
import hue.gen.HueService;

public class HueLightsNotifier {

	private static final Color HUE_RED = new Color(255, 0, 255);
    private static final Color HUE_GREEN = new Color(255, 25500, 255);
	
    public void notifyByDevice(String ip, int port, String message, long durationMS, String lid) {
        int counter = 0;

        while (counter < 5) {
            try {
                if (counter > 0) {
                    Thread.sleep(1000);
                }
                TSocket socket = new TSocket(ip, port, 5000);
                TBinaryProtocol protocol = new TBinaryProtocol(socket);
                HueService.Client client = new HueService.Client(protocol);
                socket.open();             
                
                if(durationMS >= 0) {
                    // Turn Lights on 
                    client.setState(lid, true);
                    // Set color depending on message
                    switch(message) {
                        case "iO":
                            client.setColor(lid, HUE_GREEN);
                            break;
                        case "niO":
                            client.setColor(lid, HUE_RED);
                            break;
                        default:
                            // Ignore and switch lights off
                            client.setState(lid, false);
                            break;
                    }              
                    
                    if(durationMS!=0) {
                        // Turn lights off again after specified time
                        Timer t = new Timer();
                        t.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                try {
                                    TSocket socket = new TSocket(ip, port, 5000);
                                    TBinaryProtocol protocol = new TBinaryProtocol(socket);
                                    HueService.Client client = new HueService.Client(protocol);
                                    socket.open();             

                                    client.setState(lid, false);

                                     socket.close();
                                } catch (TException ex) {
                                   ex.printStackTrace();
                                }
                            }
                        }, durationMS);
                    }
                }
                else {
                     client.setState(lid, false);
                }
                
                socket.close();
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
            counter++;
        }

    }
	
}
