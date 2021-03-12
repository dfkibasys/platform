package de.dfki.cos.basys.platform.runtime.processcontrol.camunda;

import java.io.File;
import java.io.FileReader;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.OffsetDateTime;

import com.google.gson.stream.JsonReader;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.common.rest.camunda.ApiException;
import de.dfki.cos.basys.common.rest.camunda.api.DeploymentApi;
import de.dfki.cos.basys.common.rest.camunda.dto.DeploymentDto;
import de.dfki.cos.basys.common.rest.camunda.dto.DeploymentWithDefinitionsDto;
import de.dfki.cos.basys.platform.runtime.processcontrol.deployment.DeploymentService;

public class CamundaDeploymentService implements ServiceProvider<DeploymentService>, DeploymentService {

	public final Logger LOGGER = LoggerFactory.getLogger(getClass());
	private DeploymentApi api = null;
	
	@Override
	public boolean connect(ComponentContext context, String connectionString) {
		if (connectionString.endsWith("/"))
			connectionString = connectionString.substring(0, connectionString.length()-1);	
		
		api = new DeploymentApi();
		api.getApiClient().setBasePath(connectionString);
		return true;
	}

	@Override
	public void disconnect() {
		api = null;		
	}

	@Override
	public boolean isConnected() {
		return api != null;
	}

	@Override
	public DeploymentService getService() {
		return this;
	}

	@Override
	public String createDeployment(String filePath) {		
		LOGGER.debug("create deployment " + filePath);
		
		String tenantId = null;
        String deploymentSource = "BaSys Process Deployer";
        Boolean deployChangedOnly = null;
        Boolean enableDuplicateFiltering = null;
        String deploymentName = FilenameUtils.getBaseName(filePath);        
        try {
			DeploymentWithDefinitionsDto response = api.createDeployment(tenantId, deploymentSource, deployChangedOnly, enableDuplicateFiltering, deploymentName, new File(filePath));
			return response.getId();
		} catch (ApiException e) {
			LOGGER.error("could not create deployment " + filePath);
			LOGGER.error(e.getMessage());	
		}
        return null;
	}
	
	@Override
	public void deleteDeployment(String id) {		
		LOGGER.debug("delete deployment " + id);
		
        Boolean cascade = true;
        Boolean skipCustomListeners = null;
        Boolean skipIoMappings = null;
        try {
			api.deleteDeployment(id, cascade, skipCustomListeners, skipIoMappings);
		} catch (ApiException e) {
			LOGGER.error("could not delete deployment " + id);		
			LOGGER.error(e.getMessage());	
		}
	}

	@Override
	public void clearDeployments() {		
		LOGGER.debug("clear deployments");
		
		String id = null;
        String name = null;
        String nameLike = null;
        String source = null;
        Boolean withoutSource = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean includeDeploymentsWithoutTenantId = null;
        OffsetDateTime after = null;
        OffsetDateTime before = null;
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        try {
			List<DeploymentDto> response = api.getDeployments(id, name, nameLike, source, withoutSource, tenantIdIn, withoutTenantId, includeDeploymentsWithoutTenantId, after, before, sortBy, sortOrder, firstResult, maxResults);
			
			for (DeploymentDto deployment : response) {
				deleteDeployment(deployment.getId());
			}
			
		} catch (ApiException e) {			
			e.printStackTrace();
		}
		
	}
}
