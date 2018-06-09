package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.output.SumService;
import com.output.UserResponse;
import com.output.ValidationResponse;

import sample.aop.service.HelloWorldService;

@RestController
@RequestMapping(value = "/user")
public class ViewController {

	@Autowired
	private UserResponse response;

	@Autowired
	private  SumService  sumService;
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	@RequestMapping("/view")
	
	public  ValidationResponse view(@RequestParam(name="empId") String empId) {
	
		ValidationResponse vres = new ValidationResponse();

		System.out.println(this.helloWorldService.getHelloMessage());
		vres.setMessage(response.getSuccess());

		vres.setResponse(sumService.calculateSum(Integer.valueOf(empId), 20));
		vres.setVcode("200");
		return vres;

	}

}
