/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrol;

import java.util.ArrayList;
/**
 * Desde esta clase se genera el documento a imprimir
 * 
 * @author Juanfe 
 * @version 22/07/2016
 */
public class Documento
{
    // instance variables - replace the example below with your own
    private Pagos pago;

    /**
     * Constructor for objects of class Documento
     */
    public Documento(Pagos pago)
    {
        // initialise instance variables
        this.pago = pago;
    }
    
    public void generarDocumento()
    {
        pago.actualizarPagos();
        pago.asignaPropinaDiaria();
        ArrayList<Empleados> empleados = pago.getEmpleados();
        
        System.out.println("Nombre                                    Id                   Horas trabajadas      Valor a pagar");
        for(Empleados empleado : empleados)
        {
            System.out.println(empleado.toString());
        }
        
       pago.muestraPropinasDiarias();
       System.out.println("El valor correspondiente para cada empleado es: "+pago.getPropinaPorTrabajador());
    }

    
}
