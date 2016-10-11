package com.wendell.web;

import javax.jws.WebService;

@WebService(endpointInterface = "com.wendell.web.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHi(String text) {
		
		System.out.println("sayHi called");
        return "Hello " + text;
	}

}
