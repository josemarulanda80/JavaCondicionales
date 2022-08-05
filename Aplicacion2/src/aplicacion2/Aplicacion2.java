/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion2;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Aplicacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float numero1= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
        float numero2= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        if (numero1>numero2){
            JOptionPane.showMessageDialog(null, "El "+numero1+" es mayor que "+numero2);
        }
        else{
            JOptionPane.showMessageDialog(null, (numero1<numero2)?"El "+numero2 +"es mayor que "+numero1:"ambos numero son iguales");
        }
             
    }
    
}
