package com.bridgelab;
import java.util.Random;


public class UC6 {
	public static void EmpWageStatus(int num){
        int WagePerHR = 20;
        int DayHRs = 8;
        int PartTimeHRs = 8;
        int Days = 20;
        int MaxHRsPerMonth = 100;

        int totalEmpHrs = 0;
        int empHrs = 0;
        int totalWorkingDays = 0;
        double monthlywage = 0;

        while (totalEmpHrs != MaxHRsPerMonth && totalWorkingDays != Days){
            totalWorkingDays++;
            switch (num){
                case 1:
                    empHrs = DayHRs;
                    break;
                case 2:
                    empHrs = PartTimeHRs;
                    break;
                case 0:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs = totalWorkingDays + empHrs;
        }
        monthlywage = totalEmpHrs * WagePerHR;
        System.out.println("Monthly Wage : " + monthlywage);


    }

    public static void main(String[] args) {
       
        Random random = new Random();
        int a = random.nextInt(3);
        EmpWageStatus(a);

    }


}
