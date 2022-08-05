/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float compra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor d ela compra") );
        
        if (compra>300){
            compra = (float) (compra*1.20);
            JOptionPane.showMessageDialog(null, "El valor de la compra es de: "+ compra);
        }
        else{
            JOptionPane.showMessageDialog(null,"El valo de la compra es :" +compra);
            
            
        }
    }
    
}
