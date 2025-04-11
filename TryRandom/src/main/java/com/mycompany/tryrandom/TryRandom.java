/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tryrandom;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mohamed
 */
public class TryRandom {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(11);
        System.out.println("This is random number x : " + x);
        
        double y = random.nextDouble(5);
        System.out.println("This is random number y : " + y);
        
        boolean z = random.nextBoolean();
        System.out.println("This is random number z : " + z);
        
        ArrayList<Integer> food = new ArrayList();
        food.add(5);
        food.add(10);
        food.add(15);
        food.add(20);
        food.add(25);
        food.add(30);
//        food.set(1, 15);
//        food.clear();
        
//        for(int i =0; i<food.size();i++)
//        {
//            System.out.println(food.get(i));
//        }
        
        for(Integer i : food){
            System.out.println(i);
        }
    }
}
