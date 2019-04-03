package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable(value="page")String path) {
		return path;
	}
	
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
}
