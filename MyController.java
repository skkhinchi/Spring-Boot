package com.practice.Control; //Another Package

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
@RequestMapping(value="/welcome", method=RequestMethod.GET)
  
public String welcomeMsg(@RequestParam String name)

{
	return "Welcome," +name+ " Sir! Where are You Sumit ?";
}


}
