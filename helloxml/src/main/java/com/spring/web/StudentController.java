package com.spring.web;

import java.util.Vector;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public String student(@RequestParam("one") String one ,ModelMap model) {
      model.addAttribute("student", new Student());
     
      if(one.equals("one")){
    	  throw new SpringException("Request   param value is wrong");
      }
      return "student";
   }

 
}