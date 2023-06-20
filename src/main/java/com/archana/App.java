package com.archana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("configure.xml");
      Student s = ac.getBean("std",Student.class);
     
      
      System.out.println("hey, "+s.getFirstname() +" "+ s.getLastname() + " welcome here");
   
   
    
    
    }
    
}
