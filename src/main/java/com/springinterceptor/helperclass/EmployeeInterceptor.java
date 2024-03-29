package com.springinterceptor.helperclass;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class EmployeeInterceptor implements HandlerInterceptor
{
	
	public  boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception 
	{
		System.out.println("Pre Handle method is Calling");
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception 
	{
		System.out.println("Post Handle method is Calling");
	}
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception 
	{
		System.out.println("Employee COntroller method is calling,"+"Request and Responce is completed");
	}
	
}
