/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class HexDegToDec {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a hex digit: ");
        String SHex = input.next();
        
        if (SHex.length() != 1 ){
            System.out.print("You should enter on character");
            System.exit(0);
        }
        
        char ch = Character.toUpperCase(SHex.charAt(0));
        
        if (ch <= 'F' && ch >= 'A'){
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value) ;
        }else if (Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit " + ch + " is " + ch) ;
        }else {
            System.out.println(ch + " IS an invalid input") ;
        }
        
        
    }
}
