//this course not using service tab, only project tab
//coffee cup is pure java
import java.util.Scanner;

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
 * 
 */
public class p1q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter name: ");
    String name = scanner.nextLine();
    
    System.out.print("Enter your year of study: ");
    int yearOfStudy = scanner.nextInt();
    
    System.out.print("What is your target GPA for this semester? ");
    double gpa = scanner.nextDouble();
    
    System.out.println("Welcome " + name + "!");
    System.out.print("Work hard to achieve your target GPA of " + gpa + " this semester of your Year " + yearOfStudy + " ya.");
    }
    
}
