package com.bridgelab;
import java.util.Random;


public class UC4 {
	 public static void EmpWageStatus(int num){
	        int WagePerHR = 20;
	        int DayHRs = 8;
	        int PartTimeHRs = 8;

	        switch (num){
	            case 1:
	                System.out.println("Employee Present");
	                System.out.println("DailyWage = " + WagePerHR * DayHRs);
	                break;
	            case 2:
	                System.out.println("Employee Present");
	                System.out.println("DailyWage with Part Time = " + WagePerHR * (DayHRs + PartTimeHRs));
	                break;
	            case 0:
	                System.out.println("Employee Absent");
	                System.out.println("DailyWage = "+0);
	         }
	   }
	                public static void main(String[] args) {
	               
	                Random random = new Random();
	                int a = random.nextInt(3);
	                EmpWageStatus(a);
	         }
}
