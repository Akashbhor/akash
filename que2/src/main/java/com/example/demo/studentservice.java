package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Browser :- htt://localhost:8080/student
@RestController
public class studentservice {
	ArrayList<student> arraylist = new ArrayList<student>();

	 studentservice() {
		 arraylist.add(new student(123, "new2", "12345678"));
		 arraylist.add(new student(122, "new3", "22345678"));
	}
	 
	//Browser :- htt://localhost:8080/students
	 @RequestMapping("api/products?page=2")
	 ArrayList<student> getAllstudent(){
		 return arraylist;
	 }
	 //Browser :- htt://localhost:8080/student/1
	 //{sid} is path variable .path-url-address
	 //path variable sid value is 1
	 @GetMapping("api/products/{id}")
     student getstudent(@PathVariable int sid){
		 student stud=null;
    	for(student Student:arraylist) {
    		if(Student.sid==sid) {
    			stud=Student;
    			break;
    		}
    	}
		return stud; 
     }
	 
	 
	 
	 
	 @PutMapping("api/products/{id}")
     ArrayList<student>upadestudent(@RequestBody student clientsid){
		 
		 student stud=null;
		 
    	for(student Student:arraylist) {
    		if(Student.sid==clientsid.sid) {
    			stud=Student;
    			break;
    		}
    	}
    	stud.setSname(clientsid.sname);
    	stud.setSphone(clientsid.sphone);
		return arraylist; 
     }
     
     @DeleteMapping("api/products/{id}")
 	ArrayList<student> deleteStudent(@PathVariable int sid)
 	{
 		student stud=null;
 		
 		for(student Student : arraylist)
 		{
 			if(Student.sid==sid)
 			{
 						
 				stud=Student;
 				break;
 			}
 		}
 		
 		arraylist.remove(stud);
 		
 		return arraylist;
 		
 	}
     
     
	 @PostMapping("api/products")
	 ArrayList<student> addStudent(@RequestBody student Student) {
		 arraylist.add(Student);
		return arraylist;
		
		                                                 
		 
	 }
}
