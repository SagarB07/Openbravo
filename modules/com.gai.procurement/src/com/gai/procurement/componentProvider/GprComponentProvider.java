package com.gai.procurement.componentProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import org.openbravo.client.kernel.BaseComponentProvider;
import org.openbravo.client.kernel.Component;
import org.openbravo.client.kernel.ComponentProvider;
import org.openbravo.client.kernel.KernelConstants;

@ApplicationScoped
@ComponentProvider.Qualifier(GprComponentProvider.GPR_VIEW_COMPONENT_TYPE)
public class GprComponentProvider extends BaseComponentProvider {
  public static final String GPR_VIEW_COMPONENT_TYPE = "GprViewComponentType";

  /*
   * (non-Javadoc)
   *
   * @see org.openbravo.client.kernel.ComponentProvider#getComponent(java.lang.String,
   * java.util.Map)
   */
  @Override
  public Component getComponent(String componentId, Map<String, Object> parameters) {
    throw new IllegalArgumentException("Component id " + componentId + " not supported.");
    /* in this howto we only need to return static resources so there is no need to return anything here */
  }

  @Override
  public List<ComponentResource> getGlobalComponentResources() {
    final List<ComponentResource> globalResources = new ArrayList<ComponentResource>();
    globalResources.add(createStaticResource("web/com.gai.procurement/js/GprToolbarAction.js", false));
		globalResources.add(createStyleSheetResource("web/org.openbravo.userinterface.smartclient/openbravo/skins/" + KernelConstants.SKIN_VERSION_PARAMETER + "/com.gai.procurement/gpr_toolbar.css", false));

    return globalResources;
  }

  @Override
  public List<String> getTestResources() {
    return Collections.emptyList();
  }
}
