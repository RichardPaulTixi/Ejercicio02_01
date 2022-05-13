/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2_01;
import controlador.FacturaControlador;
import modelo.Factura;
import modelo.Producto;
/**
 *
 * @author User
 */
public class Ejercicio2_01 {

    public static void main(String[] args) {
         var facturaControl = new FacturaControlador();
        facturaControl.crear(300, "Lucho", "Av.Paucarbamba", "0101563207", 200,
                "Cereales");
        facturaControl.crear(350, "Rocio", "Av Fray Vicente Solano", "010213570", 568, 
                "Kiwis");
        facturaControl.crear(400, "rabbit", "Av.Americas", "0214698101", 200, 
                "Queso");
        System.out.println("Listado de Facturas");
        
        for(Factura f: facturaControl.listar())
            System.out.println(f.toString());
        
        facturaControl.eliminar(400);

        System.out.println("Eliminar factura 400");
        
        for(Factura f: facturaControl.listar())
            System.out.println(f.toString());

        System.out.println("Modificar datos de la Factura");
         
        var nuevaFactura = new Factura(500, "Juan", "UPS");
        
        facturaControl.modificar(500, nuevaFactura);
        
        for(Factura f: facturaControl.listar())
            System.out.println(f.toString());
        
        
    }
}
