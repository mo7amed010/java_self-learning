/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter6;

/**
 *
 * @author mohamed
 */
public class RandomCharacterTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int MAX_CHARACHER = 20;
        for (int i = 0; i < MAX_CHARACHER; i++) {            
            char myChar = RandomCharchter.getRandomLowerChar();
            System.out.print(myChar);
        }
        System.out.println("");
    }
    
}
