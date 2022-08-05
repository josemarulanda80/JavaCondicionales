/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas")),aux;
        float salario;
        
        if (horas<=40){
            salario=40*16;
            JOptionPane.showMessageDialog(null, "el valor dado "+salario);
        }
        else{
            aux=horas-40;
            salario= (float)40*16+(aux*20);
              JOptionPane.showMessageDialog(null, "el valor dado "+salario);
            
        
        }
        
    }
    
}
