/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularEdad;

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
        if(edad > 90 || edad < 0){
       JOptionPane.showMessageDialog(null," eRROR ingrese datos nuevamente:");
    }else {
        JOptionPane.showMessageDialog(null, "Su Edad es:" +edad);
    }
    }   
}
