package com.duzq.boot1.config;

import com.duzq.boot1.servlets.HelloFilter;
import com.duzq.boot1.servlets.HelloListener;
import com.duzq.boot1.servlets.HelloServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ServletComponentScan   // 开启 Servlet 组件扫描
public class AppConfig {
    /**
     * registration : n. 登记；注册；挂号
     * re gi stra  tion
     * 蕊 G  思追儿  申
     */

    @Bean // 注册一个Bean对象到Spring容器中
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.addUrlMappings("/helloServlet");
        bean.setServlet(new HelloServlet());
        return bean;
    }

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.addUrlPatterns("/*");  // 拦截公式
        bean.setFilter(new HelloFilter());
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean getServletListenerRegistrationBean() {
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean();
        bean.setListener(new HelloListener());
        return bean;
    }

}
