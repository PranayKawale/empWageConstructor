package com.bridgelab;

import java.util.Random;


  public class UC1 {

	    public static void EmpStatus(int num){
	        if(num == 1)
	            System.out.println("Employee Present");
	        else
	            System.out.println("Employee Absent");

	    }

	    public static void main(String[] args) {
	        
	        Random randm = new Random();
	        int r = randm.nextInt(2);
	         EmpStatus(r);

	    }
	
  }	
	


