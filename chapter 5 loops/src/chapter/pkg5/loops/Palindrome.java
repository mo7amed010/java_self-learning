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
public class Palindrome {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any word: ");
        String word = input.nextLine();
        
        int low = 0;
        int high = word.length() -1;
        boolean isPalindrome = true;
        
        while(low < high){
            if(word.charAt(low) != word.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if(isPalindrome)
            System.out.println(word + " Is a palindrome.");
        else
            System.out.println(word + " Is not a palindrome.");
    }
    
}
