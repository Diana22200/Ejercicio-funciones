/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ambiente
 */
public class Persona {
    private float Genero;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Correo;
     
    public Persona(float Genero){
        this.Genero=Genero;
    } 
    
    public float getGenero(){
        return Genero;
    }
    
    public void setGenero(float genero){
        this.Genero=Genero;
    }
    
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public String getApellido() {
        return Apellido;
    }
    
    public void setApellido(String Apellido) {
        this.Apellido=Apellido;
    }
    
    public int getEdad() {
        return Edad;
    }
    
    public void setEdad(int Edad) {
        this.Edad=Edad;
    }
    
    public String getCorreo() {
        return Correo;
    }
    
    public void setCorreo(String Correo) {
        this.Correo=Correo;
    }
}