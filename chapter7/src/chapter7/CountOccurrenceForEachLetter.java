/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter7;

/**
 *
 * @author mohamed
 */
public class CountOccurrenceForEachLetter {
    public static void main(String[] args) {
        
        char[] arr = createArr();
        
        System.out.println("The lower case is :");
        
        displayArr(arr);
        
        int[] counts = countLetter(arr);
        
        System.out.println("");
        System.out.println("The Occurrence for each letter is :");
        displayCounts(counts);
        
    }
    public static char[] createArr(){
        char[] arr = new char[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomChar('a','z');
        }
        return arr;
    }

    public static char getRandomChar(char c1,char c2){
        return (char)(c1 + Math.random() * (c2 - c1 + 1));
    }

    public static void displayArr(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            if((i+1)%20 == 0){
                System.out.println(arr[i] + " ");
            }else{
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static int[] countLetter(char[] arr){
        int[] count  = new int[26];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]-'a']++;
        }
        return count;
    }
    public static void displayCounts(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if((i+1)% 10 == 0){
                System.out.println(arr[i] + "  " + (char) (i+'a') + "  ");
            } else{
                System.out.print(arr[i] + "  " + (char) (i+'a')  + "  ");
            }
        }
            System.out.println();
    }
}
