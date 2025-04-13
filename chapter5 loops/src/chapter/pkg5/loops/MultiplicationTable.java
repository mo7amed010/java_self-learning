package chapter.pkg5.loops;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mohamed
 */
public class MultiplicationTable {
    public static void main(String args[]){
        System.out.println("         Multiplication Table");
        System.out.println("   ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("   "+ i);
        }
        System.out.println("\n-------------------------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}
