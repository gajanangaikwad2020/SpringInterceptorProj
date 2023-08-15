package com.springinterceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class EmployeeController 
{

	
	@GetMapping(value="/wel")
	public String saveEmployee() 
	{
		return "Welcome";
			
	}
	
	@GetMapping(value="/name/{name}")
	public String saveEmployee(@PathVariable String name) 
	{
		return "Welcome "+name;
			
	}
	

}
