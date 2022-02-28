/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ambiente
 */
public class Estudiante extends Persona{
    public float id_est;
    //public String nombre;
    public float materia;
    //public String nmb_materia;
    public float nota;
    public float nombre;
    
    public Estudiante(float id_est,float genero, float materia, float nota){
        super(genero);
        this.id_est=id_est;
        this.materia=materia;
        this.nota=nota;
    }
    public float getId_est(){
        return id_est;
    }
    public void setId_est(float id_est){
    this.id_est=id_est;
    }
    public float getMateria() {
        return materia;
    }

    public void setMateria(float materia) {
        this.materia = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public int contarRegulares(){
    int regular=0;
    if(nota>2.5 && nota<=3.5){
        regular=regular+1;
    }
    return regular;
    }
}
