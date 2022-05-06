/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC-1
 */
public class Carrera {
    private int codigo;
    private String nombre;
    private String nombreDirector;
    private int numeroEstudiantes;
    private Asignatura asignatura;

    public Carrera(int codigo, String nombre, String nombreDirector, int numeroEstudiantes, Asignatura asignatura) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nombreDirector = nombreDirector;
        this.numeroEstudiantes = numeroEstudiantes;
        this.asignatura = asignatura;
    }
    public String nombreDirectorDeCarrera(){
        return "El nombre del director es"+this.nombreDirector;
    }
    
    public String carreraQueEstudia(){
        return "La carrera que estudia es"+this.nombre;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre 
                + ", nombreDirecto=" + nombreDirector + ", numeroEstudiantes=" 
                + numeroEstudiantes + ", asignatura=" + asignatura + '}';
    }
    
    
}
