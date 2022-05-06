/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Carrera;
import java.util.List;

/**
 *
 * @author PC-1
 */
public interface ICarreraServicio {
    public Carrera crear(Carrera c);
    public List<Carrera> listar();
    public Carrera modificar(int c, Carrera c1);
    public Carrera eliminar(int c);
    
}
