
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chek Wei
 */
public class showOddNumber {
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter minimum number: ");
        int minNum = scanner.nextInt();
        
        System.out.print("Please enter maximum number: ");
        int maxNum = scanner.nextInt();
        
        int sum = 0, odd;
        for(int i = minNum; i <= maxNum; i++){
            if(i % 2 == 1){
                System.out.print(i + ", ");
                sum += i;
            }
        }
        
        System.out.println("\nTotal of odd number is " + sum);
    }
}
