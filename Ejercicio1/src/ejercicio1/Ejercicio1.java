/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float number= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero"));
       
       if (number%10==0){
           JOptionPane.showMessageDialog(null, "Es multiplo de 10");
       }
       else{
           JOptionPane.showMessageDialog(null,"No es multiplo de 10");
       }
       
    }
    
}
