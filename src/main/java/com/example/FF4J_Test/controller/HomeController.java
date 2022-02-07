package com.example.FF4J_Test.controller;

import javax.servlet.http.HttpServletRequest;

import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.FF4J_Test.config.controller.TestController;
import com.example.FF4J_Test.service.AddService;


/**
 * Having a home page for our app allowing.
 * 
 * - To provide a link to web console
 * - To provide a link to REST API
 * - To check for features
 */
@Controller
@RequestMapping("/")
public class HomeController {
    
    private static final String Case1Feature = "Vinod";
    @Autowired
    public FF4j ff4j;
    
    @GetMapping("/")
    public String home() {
    	System.out.println(ff4j.getFeatures());
    	TestController txt = new TestController();
    	txt.get();
     // ADD_Feature
        if (ff4j.check(Case1Feature)) {
            AddService.addFunction();
            System.out.println("Activated........................ ");
          //  System.out.println(ff4j.getFeatures());
        } else {
        	System.out.println("Deactivated.............");
        //	System.out.println(ff4j.getFeatures());
        }
        return "index";
    }
}
