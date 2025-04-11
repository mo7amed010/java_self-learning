/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testgui;

import javax.swing.JOptionPane;

/**
 *
 * @author mohamed
 */
public class TestGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, name);
        String country = JOptionPane.showInputDialog("Where are you from?");
        JOptionPane.showMessageDialog(null, country);
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, age);
    }

}
