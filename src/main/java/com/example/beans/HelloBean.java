package com.example.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import com.example.common.Greeting;
import com.example.qualifier.Informal;
import com.example.qualifier.StandardInformal;

/**
 *
 * @author yandypiedra
 */
@ManagedBean(name = "helloBean")
@RequestScoped
public class HelloBean implements Serializable{
	
	@Inject
	private Greeting formalGreeting;
	
	@Inject
	@Informal
	private Greeting informalGreeting;
	
	@Inject
	//@StandardInformal
	private String infStandGreete;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init(){
		System.out.println(HelloBean.class.getName()+" started!");
		System.out.println("Standard Informal Greeting: "+infStandGreete);
		System.out.println("Informal Greeting: "+informalGreeting.greet("World"));
	}

	public String hello() {
		return formalGreeting.greet("World");
	}

}
