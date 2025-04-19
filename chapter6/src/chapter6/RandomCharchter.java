/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter6;

/**
 *
 * @author mohamed
 */
public class RandomCharchter {
    public static char getRandomChar(char c1,char c2){
        return (char)(c1 + Math.random() * (c2 - c1 + 1));
    }
    public static char getRandomLowerChar(){
        return getRandomChar('a','z');
    }
    public static char getRandomUpperChar(){
        return getRandomChar('A','Z');
    }
    public static char getRandomDigitChar(){
        return getRandomChar('0','9');
    }
}
