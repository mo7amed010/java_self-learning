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
public class Lottry {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int cum = (int)(Math.random()*100);
        
        System.out.println("Enter your guss : ");
        int guss = input.nextInt();
        
        int num1 = guss / 10 ;
        int num2 = guss % 10 ;
        int cum1 = cum / 10 ;
        int cum2 = cum % 10 ;
        
        if (guss == cum){
            System.out.println("You win 10000 $ ");
            System.out.println("Computer " +  cum);   

        } else if (num1 == cum2 && num2 == cum1){
            System.out.println("You win  3000 $ ");
            System.out.println("Computer " +  cum);
        } else if (num1 == cum1 || num1 == cum2 || num2 == cum1 || num2 == cum2){
            System.out.println("You win  1000 $ "); 
            System.out.println("Computer " +  cum);   
        } else {
            System.out.println("You lose " + cum);   
            
        }
        
        
        
    }
}
