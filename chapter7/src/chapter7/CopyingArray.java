/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter7;

/**
 *
 * @author mohamed
 */
public class CopyingArray {
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] arr3 = new int[10];
        
        System.arraycopy(arr1, 0, arr3, 0, 5);
        System.arraycopy(arr2, 0, arr3, 5, 5);
        
        for (int i = 0; i < 10; i++) {
            System.out.print(arr3[i]+ " ");
        }
    }

    
}
