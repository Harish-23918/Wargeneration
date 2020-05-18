package com.changepond.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitial implements WebApplicationInitializer {


	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(Config.class);
		context.setServletContext(servletContext);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet",
				new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");	
	}

}
