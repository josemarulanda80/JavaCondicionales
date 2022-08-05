/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float number1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
        float number2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        float number3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tercer numero"));
        
        if (number1 > number2){
            if (number2 > number3){
                JOptionPane.showMessageDialog(null, number1);
                JOptionPane.showMessageDialog(null, number2);
                JOptionPane.showMessageDialog(null, number3);
            }else{
               if (number3<number1){
                JOptionPane.showMessageDialog(null, number1);
                JOptionPane.showMessageDialog(null, number3);
                JOptionPane.showMessageDialog(null, number2);
               }
               else{
                JOptionPane.showMessageDialog(null, number3);
                JOptionPane.showMessageDialog(null, number1);
                JOptionPane.showMessageDialog(null, number2);
               }
                
            }
        }
        else{
             if (number1 > number3){
                JOptionPane.showMessageDialog(null, number2);
                JOptionPane.showMessageDialog(null, number1);
                JOptionPane.showMessageDialog(null, number3);
            }else{
               if (number3<number2){
                JOptionPane.showMessageDialog(null, number3);
                JOptionPane.showMessageDialog(null, number2);
                JOptionPane.showMessageDialog(null, number1);
               }
               else{
                JOptionPane.showMessageDialog(null, number2);
                JOptionPane.showMessageDialog(null, number3);
                JOptionPane.showMessageDialog(null, number1);
               }
                
            }
        }
    }
    
}
