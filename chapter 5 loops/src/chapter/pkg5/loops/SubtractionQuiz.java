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
public class SubtractionQuiz {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        
        final int QUESTION_NUMBERS = 5 ;
        int correctCount = 0;
        int qustionNum = 1;
        long startTime = System.currentTimeMillis();
        String output = "";
        
        while (qustionNum <=  QUESTION_NUMBERS){
            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);
            System.out.println("Whtat is " + num1 + " - " +  num2 + " ? ");
            int answer = input.nextInt();
            if (answer == (num1 - num2)){
                correctCount++;
            }else{
                System.out.println("Your answer is wrong \n" +num1 + " - " +  num2 + " should be "+ (num1-num2)); 
            }
            qustionNum++;
            output += "\n" + +num1 + " - " +  num2 + " = " + answer + ((num1-num2) == answer ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        
        System.out.println("\nTest Time: " +  testTime / 1000 + " seconds");
        System.out.println("Correct answers is: " +  correctCount);
        System.out.println(  output);
        
    }
}
