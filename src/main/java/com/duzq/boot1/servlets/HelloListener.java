package com.duzq.boot1.servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("hello listener");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
