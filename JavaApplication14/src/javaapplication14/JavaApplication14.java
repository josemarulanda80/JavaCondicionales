/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char mensaje = JOptionPane.showInputDialog("Ingrese el caracter").charAt(0);
        char mensaje2=Character.toUpperCase(mensaje);
       if(mensaje == mensaje2){
            JOptionPane.showMessageDialog(null, "Si es una letra mayuscula");
        } else {
             JOptionPane.showMessageDialog(null, "No es una letra mayuscula");
        }
    }
    
}
