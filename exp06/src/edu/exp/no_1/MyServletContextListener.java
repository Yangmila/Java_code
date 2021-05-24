package edu.exp.no_1;

import java.util.Date;
import javax.servlet.*;

public final class MyServletContextListener implements ServletContextListener, ServletContextAttributeListener {
    private ServletContext context = null;

    public void contextInitialized(ServletContextEvent sce){
        context = sce.getServletContext();
        context.log("Ӧ�ó�����������"+new Date());
    }

    public void contextDestroyed(ServletContextEvent sce){
        context = sce.getServletContext();
        context.log("Ӧ�ó����ѹرգ�"+new Date());
    }

    public void attributeAdded(ServletContextAttributeEvent sce){
        context = sce.getServletContext();
        context.log("���һ�����ԣ�"+sce.getName()+"��"+sce.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent sce){
        context = sce.getServletContext();
        context.log("ɾ��һ�����ԣ�"+sce.getName()+"��"+sce.getValue());
    }

    public void attributeReplaced(ServletContextAttributeEvent sce){
        context = sce.getServletContext();
        context.log("�滻һ�����ԣ�"+sce.getName()+"��"+sce.getValue());
    }
}

