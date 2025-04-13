/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter.pkg5.loops;

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class GreatestCommenDivisor {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first intger: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second intger: ");
        int num2 = input.nextInt();
        
        int commenDivisor = 1;
        int count = 2;
        
        while (count <= num1 && count <= num2){
            if (num1 % count == 0 && num2 % count == 0)
                commenDivisor = count;
            count++;
        }
        
        System.out.println("The greatest commen Divisor for "  + num1 + " and " +num2 + " is " + commenDivisor );
        
    }
}
