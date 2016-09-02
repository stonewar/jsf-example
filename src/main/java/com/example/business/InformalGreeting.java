package com.example.business;

import com.example.common.Greeting;
import com.example.qualifier.Informal;

@Informal
public class InformalGreeting implements Greeting {

	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "Hi " + name;
	}

}
