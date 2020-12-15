/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturahashmap;


import java.util.HashMap;
import java.util.Map;
import misclases.*;
/**
 *
 * @author DAW
 */
public class FacturaHashMap {

   private static Map mapaFactura;
    public FacturaHashMap() {
}

    private static void crearRellenarAñadirFacturasHashMapPorNumeroFactura() {
    
    //FACTURA 1    
    Factura f1 = new Factura();
    f1.setNumeroFactura("000001");
    f1.setCliente("ClienteA");
    f1.setTotal(100.00);
    
     //FACTURA 2
    Factura f2 = new Factura();
    f2.setNumeroFactura("000002");
    f2.setCliente("ClienteB");
    f2.setTotal(200.00);
    
     //FACTURA 3
    Factura f3 = new Factura();
    f3.setNumeroFactura("000003");
    f3.setCliente("ClienteC");
    f3.setTotal(300.00);
 
     //FACTURA 4
    Factura f4 = new Factura();
    f4.setNumeroFactura("000004");
    f4.setCliente("ClienteD");
    f4.setTotal(400.00);
    
     //FACTURA 5
    Factura f5 = new Factura();
    f5.setNumeroFactura("000005");
    f5.setCliente("ClienteE");
    f5.setTotal(500.00);
    
    
    mapaFactura.put("000001", f1);
    mapaFactura.put("000002", f2);
    mapaFactura.put("000003", f3);
    mapaFactura.put("000004", f4);
    mapaFactura.put("000005", f5);
    }
    
    private static void obtenerMostrarFacturas2y3() {
    Factura f2 = (Factura) mapaFactura.get("000002");
    System.out.println("\nFactura 000002 - Número factura: " + f2.getNumeroFactura());
    System.out.println("Factura 000002 - cliente: " + f2.getCliente());
    System.out.println("Factura 000002 - total: " + f2.getTotal());
    Factura f3 = (Factura) mapaFactura.get("000003");
    System.out.println("\nFactura 000003 - Número factura: " + f3.getNumeroFactura());
    System.out.println("Factura 000003 - cliente: " + f3.getCliente());
    System.out.println("Factura 000003 - total: " + f3.getTotal());
    }
    public static void main(String[] args) {
        
        mapaFactura = new HashMap();
        crearRellenarAñadirFacturasHashMapPorNumeroFactura();
        obtenerMostrarFacturas2y3();
        
        
    }
    
    
    
}
