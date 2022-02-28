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
    private float genero;
    private String Nombre;
    private String apellido;
    private int edad;
    private String correo;
     
    public Persona(float genero){
        this.genero=genero;
    } 
    
    public float getGenero(){
        return genero;
    }
    
    public void setGenero(float genero){
        this.genero=genero;
    }
    
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido=apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad=edad;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo=correo;
    }
}