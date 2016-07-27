package com.example;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author yandypiedra
 */
@ManagedBean(name = "helloBean")
@RequestScoped
public class HelloBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init(){
		System.out.println("HelloWorld started!");
	}

	public String hello() {
		return "Hello World";
	}

}
