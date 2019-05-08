package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeServlet extends HttpServlet {

	  /**构造方法*/
    public LifeServlet() {
        System.out.println("LifeServlet被实例化了...");
    }
    /**初始化方法*/
    @Override
    public void init() throws ServletException {
        System.out.println("LifeServlet的init()被调用...");
    }
    /**服务方法*/
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("LifeServlet的service()被调用...");
    }
    /**销毁方法*/
    @Override
    public void destroy() {
        System.out.println("LifeServlet的destroy()被调用...");
    }

}
