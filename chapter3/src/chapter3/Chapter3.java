/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter3;

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class Chapter3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int num1 = (int)System.currentTimeMillis() %10;
        int num2 = (int)System.currentTimeMillis() * 3 %10;
        
        if (num1 < num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.print("What is "+ num1 + " - " + num2 + " ? ");
        int anwser = input.nextInt();
        
        
        if (anwser == (num1 - num2))
            System.out.println("Your answer is corret");
        else{
            System.out.println("Your answer is wrong");
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
    }
    
}
