package com.my.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/my")
public class MyController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String testRequest() {
		logger.debug("called testRequest");
		return "GOOD";
	}
}
