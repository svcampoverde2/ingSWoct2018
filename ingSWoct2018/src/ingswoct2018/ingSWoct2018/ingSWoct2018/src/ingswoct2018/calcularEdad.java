/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingswoct2018.ingSWoct2018.ingSWoct2018.src.ingswoct2018;

import javax.swing.JOptionPane;
public class calcularEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int año_actual, año_nacimiento,edad;
         año_actual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año Actual: "));
         año_nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año que nacio: "));
        edad = año_actual - año_nacimiento;
        JOptionPane.showMessageDialog(null, "Su Edad es:" +edad);
    }
    
}
