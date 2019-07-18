package com.duzq.boot1.servlets;

import javax.servlet.*;
import java.io.IOException;

public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("hello filter");
        // 1. 一般filter都是一个链,web.xml 里面配置了几个就有几个。一个一个的连在一起
        //      request -> filter1 -> filter2 ->filter3 -> …. -> request resource.
        // 2. doFilter将请求转发给过滤器链下一个filter , 如果没有filter那就是你请求的资源
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
