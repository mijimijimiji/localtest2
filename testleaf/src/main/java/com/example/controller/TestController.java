package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.Dept;
import com.example.service.TestService;


@Controller
public class TestController {
	
	@Autowired
	TestService service;
	
	@RequestMapping("/")
	public String selectAll(Model m) {
		List<Dept> dtos= service.selectAll();
		m.addAttribute("dtos", dtos);	
		System.out.println("hotfix수정 같은 라인");
		return  "index";
	}
	
	

}
