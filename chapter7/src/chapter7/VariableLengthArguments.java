/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter7;

/**
 *
 * @author mohamed
 */
public class VariableLengthArguments {
    public static void main(String[] args) {
        printMax(10,20,5,12.5,17,50);
        
    }
    public static void printMax(double... arr){
        if (arr.length == 0){
            System.out.println("No Arguments passed");
            return;
        }
        
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("The max number is : " + max);
        
    }
}
