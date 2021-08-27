package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

	@GetMapping
	public String firstMethod()
	{
		return "hiii trying first example";
	}
	@GetMapping("/service")
	public String services()
	{
		return "sdagdagsdjgasdg";
	}
}
