package de.dfki.cos.basys.platform.runtime.gateway;

import de.dfki.cos.basys.common.component.FunctionalClient;

public interface GatewayProvider extends FunctionalClient {
	Gateway getGateway();
}
