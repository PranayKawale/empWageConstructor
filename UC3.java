package com.bridgelab;
import java.util.Random;


public class UC3 {
	public static void EmpStatus(int num){
        int WagePerHR = 20;
        int DayHRs = 8;
        int PartTimeHRs = 8;

        if(num == 1){
            System.out.println("Employee Present");
            System.out.println("DailyWage = " + WagePerHR * DayHRs);
        }
        else if(num == 2){
            System.out.println("Employee Present");
            System.out.println("DailyWage  Part Time = " + WagePerHR * (DayHRs + PartTimeHRs));
        }

        else{
            System.out.println("Employee Absent");
            System.out.println("DailyWage = " +0);
        }


    }

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(3);
        EmpStatus(a);
    }


}
