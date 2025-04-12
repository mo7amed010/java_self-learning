/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4;

import java.util.Scanner;
/**
 *
 * @author mohamed
 */
public class OrderToCities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter city 1 : ");
        String city1 = input.next();
        System.out.print("Enter city 2 : ");
        String city2 = input.next();
        
        if (city1.compareTo(city2) < 0){
            System.out.println("The cities in alphabetical ara " + city1 + " "   + city2 );
        }else{
            System.out.println("The cities in alphabetical ara " + city2 + " "   + city1 );
            
        }
    }
    
}
