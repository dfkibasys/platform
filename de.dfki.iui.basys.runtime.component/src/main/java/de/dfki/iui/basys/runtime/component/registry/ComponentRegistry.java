package de.dfki.iui.basys.runtime.component.registry;

import java.util.List;

import de.dfki.iui.basys.runtime.component.Component;
import de.dfki.iui.basys.runtime.component.ComponentCategory;

public interface ComponentRegistry extends Component {

	ComponentRegistration createRegistration(Component instance) throws ComponentRegistrationException;

	List<ComponentInfo> getComponents(ComponentCategory category);

	ComponentInfo getComponentById(ComponentCategory category, String id);

	ComponentInfo getComponentByName(ComponentCategory category, String name);

}
