/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;
import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name!");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Where are you from?");
        String country = scanner.nextLine();
        
        System.out.println("your name is : " + name + " and your age is : " + age + " your from " + country);
    }
}
