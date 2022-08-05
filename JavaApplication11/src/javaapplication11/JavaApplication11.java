/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Condicionales;
        int numero, dato = 5,numero2;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        
        
        if (numero == dato){
            System.out.println("El numero es igual a 5");
        }
        else{
            System.out.println("El numero es diferente de 5");
        }
        
        // swith
        
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el caso"));
        
        switch(numero2){
            case 1: JOptionPane.showMessageDialog(null, "El número es 1");
            break;
            case 2: JOptionPane.showMessageDialog(null, "El número es 2");
            break;
            case 3: JOptionPane.showMessageDialog(null, "El número es 3");
            break;
            case 4: JOptionPane.showMessageDialog(null, "El numero es 4");
            break;
            
        }
        
        //Con el operador terciario

        
        JOptionPane.showMessageDialog(null, (numero==dato)? "Es igual a 5":"Es diferente de 5");
        
        
        
                
                
                
        
    }

}
