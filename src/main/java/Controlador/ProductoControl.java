/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Factura;
import Modelo.Producto;
import Servicio.ProductoServicio;
import java.util.List;

/**
 *
 * @author PC-1
 */
public class ProductoControl {
    
    public ProductoServicio productoServicio = new ProductoServicio();
    public Producto crear(int c, String m, int p, String con, int cF, String nPF, int pPF, int iF, int tF){
        var factura = new Factura(cF, nPF, pPF, iF, tF);
        var producto = new Producto(c, m, p, con, factura);
        this.productoServicio.crear(producto);
        return producto;
    }
    
    public Producto eliminar(int c1) {
        return this.productoServicio.eliminar(c1);
    }
    
    public Producto modificar(int c, Producto p) {
        return this.productoServicio.modificar(c,p);
    }
    
    
    
    public List<Producto> listar()
    {
        return this.productoServicio.listar();
    }
    
}
