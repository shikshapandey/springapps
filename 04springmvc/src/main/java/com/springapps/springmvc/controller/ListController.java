package com.springapps.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springapps.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readlist")
	public ModelAndView sendList() {
		List<Employee> emps = new ArrayList<Employee>();
		Employee emp = new Employee();
		emp.setId(234);
		emp.setName("Jonathan");
		emp.setSalary(2400);
		emps.add(emp);
		
		emp = new Employee();
		emp.setId(235);
		emp.setName("Robert");
		emp.setSalary(3500);
		emps.add(emp);
		
		emp = new Employee();
		emp.setId(236);
		emp.setName("Rudy");
		emp.setSalary(3700);
		emps.add(emp);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("employees", emps);
		mv.setViewName("displaylist");
		return mv;
	}
	
}