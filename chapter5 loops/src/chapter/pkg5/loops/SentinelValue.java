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
public class SentinelValue {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;
        
        do {
            System.out.print("Enter an int value (the progrem exist if the input is -1): ");
            num = input.nextInt();
            if (num != -1)
            sum += num;
        }while(num != -1);
        
        System.out.println("The total is : " + sum);
    }
}
