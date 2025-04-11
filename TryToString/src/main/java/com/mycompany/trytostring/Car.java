/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trytostring;

/**
 *
 * @author mohamed
 */
public class Car {
    int year = 2026;
    String make =  "MG";
    String model = "7";
    
    public String toString(){
        return make + "\nModed: " + model +"\n" + year;
    }
}
