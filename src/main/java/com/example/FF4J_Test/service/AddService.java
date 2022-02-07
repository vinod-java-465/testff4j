package com.example.FF4J_Test.service;

import org.ff4j.FF4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddService {

	 /** Some logger. */
    private static final Logger LOGGER = LoggerFactory.getLogger(AddService.class);
	@Autowired
	FF4j ff4j=null;
	
	public static void addFunction() {
		 //if (ff4j.check("addService")) {
		LOGGER.info(" ADD Service is Activated");
		   System.out.println(" i am from One add service...");
		   
//		 } else {
			// LOGGER.info(" ADD Service is deactivated");
//		 }
	}
	}
