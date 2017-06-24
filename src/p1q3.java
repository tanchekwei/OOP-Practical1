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
import java.lang.Math; //need to include when using pow()

public class p1q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an 8-digit number: ");

        int num = input.nextInt();
        int[] digit;
        digit = new int[8];

        digit[0] = num % 10;
        for (int i = 1; i < 8; i++) {
            int x = 10;
            double y = Math.pow(x, i);
            digit[i] = num / (int) y % x;
        }
        /*
        digit[1] = num / 10 % 10;
        digit[2] = num / 100 % 10;
        digit[3] = num / 1000 % 10;
        digit[4] = num / 10000 % 10;
        digit[5] = num / 100000 % 10;
        digit[6] = num / 1000000 % 10;
        digit[7] = num / 10000000 % 10;
         */

        int firstSum = digit[0] + digit[2] + digit[4] + digit[6];
        
        /*
        
        digit[1] *= 2;
        digit[3] *= 2;
        digit[5] *= 2;
        digit[7] *= 2;
        
        
        for (int i = 1; i < 8; i += 2) {
            digit[i] *= 2;
        }

        
        int secondSum = ((digit[1] % 10) + (digit[1] / 10))
                + ((digit[3] % 10) + (digit[3] / 10))
                + ((digit[5] % 10) + (digit[5] / 10))
                + ((digit[7] % 10) + (digit[7] / 10));
         */
        
        int secondSum = 0;
        for (int i = 1; i < 8; i += 2) {
            digit[i] *= 2;
            secondSum += (digit[i] % 10) + (digit[i] / 10);
        }

        int thirdSum = firstSum + secondSum;

        if (thirdSum % 10 == 0) {
            System.out.println("The credit card number is valid!");
        }
        else{
            System.out.println("The credit card number is not valid.");
            System.out.println("The last digit should be  " + ((num - thirdSum + 10)) % 10);
        }
    }
}
