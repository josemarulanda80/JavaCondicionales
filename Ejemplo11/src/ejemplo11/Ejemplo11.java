/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo11;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        char tipe = JOptionPane.showInputDialog("Ingrese s para suma r para resta m poara multiplicación y d para división").charAt(0);
        
        switch(Character.toUpperCase(tipe)){
            case 'S': JOptionPane.showMessageDialog(null, "la sumas es " + (numero1+numero2));
            break;
            case 'R': JOptionPane.showMessageDialog(null, "la resta es " + (numero1-numero2));
            break;
            case 'M': JOptionPane.showMessageDialog(null, "la multplicación es " + (numero1*numero2));
            break;
            case 'D': JOptionPane.showMessageDialog(null, "la división es " + (numero1/numero2));
            break;
            default:JOptionPane.showMessageDialog(null,"Opción incorrecta");
    }
                
        
    }
    
}
