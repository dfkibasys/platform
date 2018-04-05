package de.dfki.iui.basys.runtime.component.registry;

import java.util.List;

import de.dfki.iui.basys.runtime.component.Component;

public interface ComponentRegistry extends Component {

	ComponentRegistration createRegistration(Component instance) throws ComponentRegistrationException;

	List<ComponentInfo> getComponents(String category);

	ComponentInfo getComponentById(String category, String id);

	ComponentInfo getComponentByName(String category, String name);

}
