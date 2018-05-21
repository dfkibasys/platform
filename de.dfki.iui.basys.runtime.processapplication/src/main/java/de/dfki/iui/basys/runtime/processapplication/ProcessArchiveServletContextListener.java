package de.dfki.iui.basys.runtime.processapplication;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.camunda.bpm.application.ProcessApplicationInfo;
import org.camunda.bpm.application.ProcessApplicationInterface;


/**
 * <p>Sets the ProcessApplicationInfo.PROP_SERVLET_CONTEXT_PATH property if this is 
 * deployed as part of a WebApplication.</p>
 * 
 * @author Daniel Meyer
 * 
 */
@WebListener
public class ProcessArchiveServletContextListener implements ServletContextListener {
  
  @EJB
  private ProcessApplicationInterface ejbProcessApplication;

  public void contextInitialized(ServletContextEvent contextEvent) {

    String contextPath = contextEvent.getServletContext().getContextPath();
    
    ejbProcessApplication.getProperties().put(ProcessApplicationInfo.PROP_SERVLET_CONTEXT_PATH, contextPath);
    
  }

  public void contextDestroyed(ServletContextEvent arg0) {
  }

}
