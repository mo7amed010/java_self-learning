/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter2;

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class Chapter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
//        System.out.print("Enter three numbers :\n");
//        double num1 = input.nextDouble();
//        double num2 = input.nextDouble();
//        double num3 = input.nextDouble();
//        
//        double avg = (num1 + num2 + num3) / 3;
//        
//        System.out.println("The avg of ( "+ num1 + " , " + num2 +" , " + num3 + " = " + avg  );

//        ======================================

//        System.out.println("\nnew line");
////        String name = "moham"
//          double age = 22;
//        System.out.format("my age is %4.2f\n", age);

//    ================================================

    System.out.println("enter seconds:");
    int second = input.nextInt();
    
    int min = second / 60;
    
    float sec = second % 60;
    
    
    
    System.out.format("%d minutes and %4.2f seconds\n", min, sec);
        

    }
    
}
