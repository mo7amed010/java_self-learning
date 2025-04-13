/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter.pkg5.loops;

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class RepeatAddtionQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        int num1 =(int)(Math.random() * 10);
        int num2 =(int)(Math.random() * 10);
        
        System.out.print("What is " + num1 + " + "+  num2 + " ? ");
        int answer = input.nextInt();
        
        while(answer != (num1 + num2)){
            System.out.print("Wrong answer. Try again. Whtat is " + num1 + " + "+  num2 + " ? ");
            answer = input.nextInt();
        }
        
        System.out.print("You got it!");
    }
    
}
