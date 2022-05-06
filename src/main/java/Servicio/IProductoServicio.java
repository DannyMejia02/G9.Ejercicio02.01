/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Producto;
import java.util.List;

/**
 *
 * @author PC-1
 */
public interface IProductoServicio {
    public Producto crear(Producto p);
    public List<Producto> listar();
    public Producto modificar(int c, Producto p);
    public Producto eliminar(int c);
    
}
