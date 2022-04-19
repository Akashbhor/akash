package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
    /* @RequestMapping("hello")
     String hello() {
    	 
		return "hello word from webservice";
    	 
     }*/
     @RequestMapping("student")
     student getstudent(){
    	 student Student=new student();
    	 Student.setSid(1101);
    	 Student.setSname("new1");
    	 Student.setSphone("123456");
		return Student;
    	 
     }
     
}
