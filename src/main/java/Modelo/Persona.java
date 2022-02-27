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
    public int id;
    public float genero;
     
    public Persona(float genero ){
    this.genero=genero;
    } 
    public float getGenero(){
    return genero;
    }
    public void setGenero(float genero){
    this.genero=genero;
    }
    public int getId(){
    return id;
    }
    public void setId(int id){
        this.id=id;
    }
    
    
}
