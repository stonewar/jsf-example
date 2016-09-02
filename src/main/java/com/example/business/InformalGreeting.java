package com.example.business;

import javax.enterprise.inject.Produces;

import com.example.common.Greeting;
import com.example.qualifier.Informal;
import com.example.qualifier.StandardInformal;

@Informal
public class InformalGreeting implements Greeting {
	
	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "Hi " + name;
	}
	
	@Produces 
	@StandardInformal
	public String getInfStandGreet() {
		return "Hi Hi World";
	}
	
	@Produces
	public String getOtherInfGreeting() {
		return "Hey Jo!";
	}

}
