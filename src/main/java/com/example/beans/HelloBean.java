package com.example.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import com.example.common.Greeting;
import com.example.qualifier.Informal;

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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init(){
		System.out.println(HelloBean.class.getName()+" started!");
		System.out.println("Informal Greeting: "+informalGreeting.greet("World"));
	}

	public String hello() {
		return formalGreeting.greet("World");
	}

}
