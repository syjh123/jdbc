package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeServlet extends HttpServlet {

	  /**���췽��*/
    public LifeServlet() {
        System.out.println("LifeServlet��ʵ������...");
    }
    /**��ʼ������*/
    @Override
    public void init() throws ServletException {
        System.out.println("LifeServlet��init()������...");
    }
    /**���񷽷�*/
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("LifeServlet��service()������...");
    }
    /**���ٷ���*/
    @Override
    public void destroy() {
        System.out.println("LifeServlet��destroy()������...");
    }

}
