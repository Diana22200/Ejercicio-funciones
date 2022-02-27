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
    public String nombre;
    public float materia;
    public String nmb_materia;
    public float nota;
    
    public Estudiante(int id, float id_est, String nombre, float genero, float materia, String nmb_materia, float nota){
        super(genero);
        this.id_est=id_est;
        this.nombre=nombre;
        this.materia=materia;
        this.nmb_materia=nmb_materia;
        this.nota=nota;
    }
    public float getId_est(){
        return =id_est;
    }
    public void setId_est(){
    this.id_est=id_est;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMateria() {
        return materia;
    }

    public void setMateria(float materia) {
        this.materia = materia;
    }

    public String getNmb_materia() {
        return nmb_materia;
    }

    public void setNmb_materia(String nmb_materia) {
        this.nmb_materia = nmb_materia;
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
    @Override
    public String toString(){
    return"Estudiante{id="+this.id+", id_est="+id_est+", nombre="+nombre+", genero="+this.genero+", materia="+materia+", nmb_materia="+nmb_materia+", nota="+nota+'}';
    }
}
