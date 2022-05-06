/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import Modelo.Proveedor;
import Servicio.ProveedorServicio;
import java.util.List;

/**
 *
 * @author PC-1
 */
public class ProveedorControl {
    
    public ProveedorServicio proveedorServicio = new ProveedorServicio();
    public Proveedor crear(int c, String e, String t, int v, int cP, String nP, int pP, String conP, String tam){
        var producto = new Producto(cP, nP, pP, conP,  tam);
        var proveedor = new Proveedor(c, e, t, v, producto);
        this.proveedorServicio.crear(proveedor);
        return proveedor;
    }
    
    public Producto eliminar(int c) {
        return this.proveedorServicio.eliminar(c);
    }
    
    public Proveedor modificar(int c, Proveedor p) {
        return this.proveedorServicio.modificar(c,p);
    }
    
    
    
    public List<Proveedor> listar()
    {
        return this.proveedorServicio.listar();
    }
    
}
