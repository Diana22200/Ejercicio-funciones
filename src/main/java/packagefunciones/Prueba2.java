/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packagefunciones;
import java.util.Scanner;

/**
 *
 * @author DIANA GUEVARA
 */
import static packagefunciones.Clase1.Llenarmatriz;
import static packagefunciones.Clase1.Matexamreprobados;
import static packagefunciones.Clase1.Sacarpromedio;
import static packagefunciones.Clase1.calmaypromycantexamregul;
import static packagefunciones.Clase1.Estmayordesquimica;
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float notas[][];
        float promedio = 0;
        notas=Llenarmatriz();
        promedio=Sacarpromedio(notas);
        
        calmaypromycantexamregul(notas,promedio);
        
        Matexamreprobados(notas);
        
        Estmayordesquimica(notas);
    }
    
}
