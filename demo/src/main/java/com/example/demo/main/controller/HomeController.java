package com.example.demo.main.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/main")
@RequiredArgsConstructor
public class HomeController {

	// @Autowired
	// MyPageService myPageService;

	// @RequestMapping("/home")
	// public String home2() throws Exception {
	// 	return "home";
	// }
	@RequestMapping("/home")
	public ModelAndView home() throws Exception {
		log.info("This is an info log message");
		log.debug("This is a debug log message");
		log.error("This is an error log message");
		
		ModelAndView mav = new ModelAndView("/main/home");
		return mav;
	}
	
}

