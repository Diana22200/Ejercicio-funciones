/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packagefunciones;

import java.util.Scanner;

/**
 *
 * @author Ambiente
 */
public class Clase1 {
    static float[][] Llenarmatriz(){
    Scanner datos;
    datos=new Scanner(System.in);
    
    int cantidad=datos.nextInt();
    float notas[][]=new float[cantidad][4];
    float suma=(float)0.0;
    
    datos.nextLine();
    for(int i=0;i<cantidad;i++){
        String informacion=datos.nextLine();
        String lista[]=informacion.split(" ");
        for(int j=0;j<lista.length;j++){
            String info=lista[j];
            notas[i][j]=Float.parseFloat(info);
        }
    }
    return notas;
    }
    
    static float Sacarpromedio(float nota[][]){
        float suma=(float)0.0;
        float promedio =(float)0.0;
        int c=0;
        for(int j=0;j<nota.length;j++){
            suma=suma+nota[j][3];
            c=c+1;
        }
        promedio=suma/c;
        return promedio;
    }
    
    static void calmaypromycantexamregul(float nota[][],float promedio){
        int mayor=0;
        int regular=0;
        for(int i=0;i<nota.length;i++){
            if(nota[i][3]>promedio){
                mayor=mayor+1;
            }
            if((nota[i][3]>2.5)&& (nota[i][3]<=3.5)){
                regular=regular+1;
            }
        }
        System.out.println(mayor);
        System.out.println(regular);
    }
    static void Matexamreprobados(float nota[][]){
    int quimica=0;
    int idioma=0;
    int historia=0;
    for(int i=0; i<nota.length;i++){
        if((nota[i][2]==1.0)&&(nota[i][3]<=2.5)){
            quimica=quimica+1;
        }
        if((nota[i][2]==2.0)&&(nota[i][3]<=2.5)){
            idioma=idioma+1;
        }
        if((nota[i][2]==3.0)&&(nota[i][3]<=2.5)){
            historia=historia+1;
        }
    }
    
    if((quimica>idioma && quimica>historia)||(quimica==idioma && quimica>historia)||(quimica==historia && quimica>idioma)){
        System.out.println("quimica");
    }
    else if((idioma>quimica && idioma>historia)||(idioma==historia && idioma>quimica)){
        System.out.println("idiomas");    
    }
    else if((historia>quimica)&&(historia>idioma)){
        System.out.println("historia");    
    }
}
    static void Estmayordesquimica(float nota[][]){
        float mejor=0;
        float estudiante=0;
        for (int i=0; i<nota.length;i++){
            if((nota[i][2]==1.0)&&(nota[i][3]>mejor)){
                mejor=nota[i][3];
                estudiante=nota[i][0];
            }
        }
        if(estudiante==1.0){
            System.out.println("Armando");
        }else{
            if(estudiante==2.0){
                System.out.println("Nicolas");
            }else{
                if(estudiante==3.0){
                    System.out.println("Daniel");
                }else{
                    if(estudiante==4.0){
                        System.out.println("María");
                    }else{
                        if(estudiante==5.0){
                            System.out.println("Marcela");
                        }else{
                            System.out.println("Alexandra");
                        }
                    }
                }
            }
        }
    }
}
