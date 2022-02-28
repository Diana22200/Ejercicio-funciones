/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Prueba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos;
        datos=new Scanner(System.in);
        //Paso 1: cantidad de notas, llenamos la matriz con la información digitada y obtener promedio
        int cantidad=datos.nextInt();
        //Declaramos el vector
        Estudiante estudiantes[]=new Estudiante[cantidad];
        float suma=(float)0.0;
        float promedio=(float)0.0;
        datos.nextLine();
        for(int i=0; i<cantidad; i++) {
            //System.out.println("Digite los datos del estudiante "+(i+1) +" separados por espacios: );
            String informacion=datos.nextLine();
            String lista[]=informacion.split(" ");
            float info1, info2, info3, info4;
            info1=new Float(lista[0]); //Guarda el nombre
            info2=new Float(lista[1]); //Guarda el genero
            info3=new Float(lista[2]); //Guarda la materia o asignación
            info4=new Float(lista[3]); //Guarda la nota
            estudiantes[i]=new Estudiante(info1,info2,info3,info4);
            suma=suma+info4;
        }
        promedio=suma/cantidad;
        
        //Paso 2: calificaciones mayores a las del promedio y cantidad de examenes regulares
        int mayor=0;
        int regular=0;
        for(int i=0; i<cantidad; i++) {
            if(estudiantes[i].nota>promedio) {
                mayor=mayor+1;
            }
            regular=regular+estudiantes[i].contarRegulares();
        }
        System.out.println(mayor);
        System.out.println(regular);
        
        //Paso3: materia con mayor examenes reprobados
        int quimica=0;
        int idioma=0;
        int historia=0;
        for(int i=0; i<cantidad; i++) {
            if((estudiantes[i].materia==1.0) && (estudiantes[i].nota<=2.5)) {
                quimica=quimica+1;
            }
            if((estudiantes[i].materia==2.0) && (estudiantes[i].nota<=2.5)) {
                idioma=idioma+1;
            }
            if((estudiantes[i].materia==3.0) && (estudiantes[i].nota<=2.5)) {
                historia=historia+1;
            }
        }
        
        if((quimica>idioma && quimica>historia) || (quimica==idioma && quimica>historia) || (quimica==historia && quimica>idioma)) {
            System.out.println("quimica");
        }
        else if((idioma>quimica && idioma>historia) || (idioma==historia && idioma>quimica)) {
            System.out.println("idioma");
        }
        else if((historia>quimica) && (historia>idioma)) {
            System.out.println("historia");
        }
        
        //Paso 4: estudiantes con mayor desempeño en quimica
        float mejor=0;
        float estudiante=0;
        for(int i=0; i<cantidad; i++) {
            if((estudiantes[i].materia==1.0) && (estudiantes[i].nota>mejor)) {
                mejor=estudiantes[i].nota;
                estudiante=estudiantes[i].nombre;
            }
        }
        
        if(estudiante==1.0) {
            System.out.println("Armando");
        }
        else {
            if(estudiante==2.0) {
                System.out.println("Nicolas");
            }
            else {
                if(estudiante==3.0) {
                    System.out.println("Daniel");
                }
                else {
                    if(estudiante==4.0) {
                        System.out.println("Maria");
                    }
                    else {
                        if(estudiante==5.0) {
                            System.out.println("Marcela");
                        }
                        else {
                            System.out.println("Alexandra");
                        }
                    }
                }
            }
        }
        
        datos.close();
    }
}
