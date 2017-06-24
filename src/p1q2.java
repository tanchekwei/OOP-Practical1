/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Tan Chek Wei
 * @ID 1602116
 * @DCO2 DD4
 */

import java.util.Scanner;

public class p1q2 {
    public static void main(String[] args) {
        final int DAYS_IN_A_YEAR = 365;
        final int SECONDS_IN_A_DAY = 86400; //24*60*60
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age (years): ");
        int age = input.nextInt();
        
        //Processing
        int ageInDays = age * DAYS_IN_A_YEAR;
        int ageInSeconds = ageInDays * SECONDS_IN_A_DAY;
        
        
        System.out.println("Age in years: " + age + " years");
        System.out.println("Age in days: " + ageInDays + " days");
        System.out.println("Age in seconds: " + ageInSeconds + " seconds");
        
    }
}
