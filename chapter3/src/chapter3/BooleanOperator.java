/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter3;

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class BooleanOperator {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        System.out.println("Is " + num + " divisible by 2 and 3 ? : " + 
                (num % 2 == 0 && num % 3 == 0));
        System.out.println("Is " + num + " divisible by 2 or 3 ? : " + 
                (num % 2 == 0 || num % 3 == 0));
        System.out.println("Is " + num + " divisible by 2 or 3  but not both ? : " + 
                (num % 2 == 0 ^ num % 3 == 0));
    }
}
