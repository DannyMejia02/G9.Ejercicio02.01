/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.CarreraControl;
import Modelo.Carrera;

/**
 *
 * @author PC-1
 */
public class Principal {
    public static void main(String[] args){
        var carreraControlador = new CarreraControl();
        carreraControlador.crear(1,"Computacion", "Vladimir Robles", 45, 3, "Computacion", "Mauricio Ortiz", 9, 45);
        
        for(Carrera c: carreraControlador.listar());
        System.out.println (c.toString());
        
        
        
        
    }
    
}
