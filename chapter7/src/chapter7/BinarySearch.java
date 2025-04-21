/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter7;

import java.util.Scanner;

/**
 *
 * @author mohamed
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10,20,30,35,45,50,80};
        System.out.print("Enter the number that you looking for: ");
        int num = input.nextInt();
        int index = binarySearch(arr, num);
        
        if( index != -1){
            System.out.println("The number is in the array at index : " + index);
        }else{
            System.out.println("The number isn't in the array");
        }
    }

    public static int binarySearch(int[] arr,int key) {
        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;
            if(key < arr[mid]){
                high = mid -1;
            }else if(key == arr[mid]){
                return mid;
            }else{
                low = mid +1;
            }
        }
        return -1;
    }
}
