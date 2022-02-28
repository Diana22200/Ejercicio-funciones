/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packagefunciones;
import java.util.Scanner;
/**
 *
 * @author Ambiente
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos;
        datos=new  Scanner(System.in);
        
        int cantidad=datos.nextInt();
        float notas[][]=new float[cantidad][4];
        float suma=(float)0.0;
        float promedio=(float)0.0;
        datos.nextLine(); 
        for(int i=0; i<cantidad; i++){
        String informacion=datos.nextLine();
        String lista []=informacion.split("");
        for(int j=0;j<lista.length;j++){
        String info=lista[j];
        notas[i][j]=Float.parseFloat(info);
        if(j==3){
        suma=suma+Float.parseFloat(info);
        }
        }
        }
        promedio=suma/cantidad;
        
        int mayor=0;
        int regular=0;
        for(int i=0; i<notas.length;i++){
            if(notas[i][3]>promedio){
               mayor=mayor+1;
            }
            if((notas[i][3]>2.5) && (notas[i][3]<=3.5)){
              regular=regular+1;
            }
        }
        System.out.println(mayor);
        System.out.println(regular);
        
        int quimica = 0;
        int idioma=0;
        int historia=0;
        for (int i =0;i<notas.length;i++){
            if((notas[i][2]==1.0)&&(notas[i][3]<=2.5)){
                quimica=quimica+1;
            }
            if((notas[i][2]==2.0)&&(notas[i][3]==2.5)){
                idioma=idioma+1;
            }
            if((notas[i][2]==3.0)&&(notas[i][3]==2.5)){
                historia=historia+1;
            }
        }
        if((quimica>idioma && quimica>historia)||(quimica==idioma && quimica>historia)||(quimica==historia && quimica>idioma)){
            System.out.println("quimica");
        }else if((idioma>quimica && idioma>historia)||(idioma==historia && idioma>quimica)){
            System.out.println("idiomas");
        }else if ((historia>quimica)&&(historia>idioma)){
            System.out.println("historia");
        }
           float mejor=0;
            float estudiante=0;
            for(int i=0 ;i < notas.length ;i++){
                if((notas[i][2]==1.0)&&(notas[i][3]>mejor)){
                        mejor=notas[i][3];
                        estudiante=notas[i][0];
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
        datos.close(); 
                        
    }
}
