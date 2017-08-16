package com.training.spring.springadv.control;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/myEndpoint")
public class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws
                                                  ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest,
                        ServletResponse servletResponse) throws
                                                         ServletException,
                                                         IOException {
        System.out.println("Service method");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
