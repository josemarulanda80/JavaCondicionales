/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("ingrese el primer numero"));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("ingrese el primer numero"));
        
        int mod1 = (int) (numero1%2);
        int mod2 = (int) (numero2%2);
        
        if (mod1==0 && mod2==0){
          JOptionPane.showMessageDialog(null, "Ambos números son pares ");
        }
        else{
            
            if(mod1!=0 && mod2!=0){
                JOptionPane.showMessageDialog(null, "Ambos números son impares ");
            }
            else{
                if(mod1!=0 && mod2==0){
                JOptionPane.showMessageDialog(null, "el "+numero1+" es impar y el "+numero2+" es par");
            }
                else{
                     JOptionPane.showMessageDialog(null, "el "+numero1+" es impar y el " +numero2+" es par");
                }
            }
        }
        
        
    }
    
}
