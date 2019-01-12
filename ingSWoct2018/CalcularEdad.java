import javax.swing.JOptionPane;
import java.util.Formatter;
import java.io.IOException;
import java.io.File;
public class CalcularEdad {
public static void main(String[]args){
 try{
    Formatter outArchivo = new Formatter("Mostrar edad.csv"); 
       int año_actual, año_nacimiento,edad;
         año_actual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año Actual: "));
         año_nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año que nacio: "));
        edad = año_actual - año_nacimiento;
        outArchivo.format(" actual; nacio;edad\n");
        if(edad > 90 || edad < 0){
       JOptionPane.showMessageDialog(null," ingresae datos nuevamente:");
    }else {
        JOptionPane.showMessageDialog(null, "Su Edad es:" +edad);
        }
        outArchivo.format("%d;%d;%d \n ",año_actual,año_nacimiento,edad);
        outArchivo.close();
    }catch(Exception e){
     System.out.print(e);
    } 
    }   
}