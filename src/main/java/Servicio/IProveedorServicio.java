/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Producto;
import Modelo.Proveedor;
import java.util.List;

/**
 *
 * @author PC-1
 */
public interface IProveedorServicio {
    public Proveedor crear(Proveedor p);
    public List<Proveedor> listar();
    public Proveedor modificar(int c, Proveedor p);
    public Producto eliminar(int c);
    
}
