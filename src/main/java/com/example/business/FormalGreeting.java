package com.example.business;

import com.example.common.Greeting;

//@Default 
//bean without qualifier has automatically the @Default annotation  
public class FormalGreeting implements Greeting {

	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

}
