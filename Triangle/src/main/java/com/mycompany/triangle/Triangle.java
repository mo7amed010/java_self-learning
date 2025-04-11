/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangle;
import java.util.Scanner;
/**
 *
 * @author mohamed
 */
public class Triangle {

    public static void main(String[] args) {
        double x ,y ,z;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x : ");
        x = scanner.nextDouble();
        
        System.out.println("Enter y : ");
        y = scanner.nextDouble();
        
        z = Math.sqrt((x*x)+(y*y));
        System.out.println(" z = " + z);
        
    }
}
