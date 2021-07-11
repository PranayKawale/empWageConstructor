package com.bridgelab;
import java.util.Random;

public class UC5 {
	 public static void EmpWageStatus(int num){
	        int WagePerHR = 20;
	        int DayHRs = 8;
	        int PartTimeHRs = 8;
	        int Days = 20;
	        double dailywage = 0;
	        double monthlywage = 0;

	        for (int i =0; i<Days; i++){
	            switch (num){
	                case 1:
	                    dailywage = WagePerHR * DayHRs * i;
	                    break;
	                case 2:
	                    dailywage = WagePerHR * (DayHRs + PartTimeHRs) * i;
	                    break;
	                case 0:
	                    break;

	            }
	            monthlywage = monthlywage + dailywage;
	        }
	        System.out.println("Monthly Wage : " + monthlywage);


	    }

	    public static void main(String[] args) {
	        
	        Random random = new Random();
	        int a = random.nextInt(3);
	        EmpWageStatus(a);

	    }
	

}
