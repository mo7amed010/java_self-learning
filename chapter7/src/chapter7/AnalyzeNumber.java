/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter7;

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class AnalyzeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        
        double[] arr = new double[n];
        double sum = 0;
        
        System.out.println("Enter the number: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextDouble();
            sum += arr[i];
        }
        
        double ave = sum / n;
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > ave){
                count++;
            }
        }
        
        System.out.println("The sum of number is : " + sum);
        System.out.println("The ave of number is : " + ave);
        System.out.println("The count of numbers above Ave : " + count);
    }
    
}
