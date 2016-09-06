/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrol;

import java.util.List;
import java.util.ArrayList;
/**
 * Desde esta clase se administran los pagos
 * 
 * @author Juanfe 
 * @version 22/07/2016
 */
public class Pagos
{
    // instance variables - replace the example below with your own
    private ArrayList<Empleados> empleados;
    private int propinaDiaria;
    private int propinaPorTrabajador;

    /**
     * Constructor for objects of class Pagos
     */
    public Pagos()
    {
        // initialise instance variables
        empleados = new ArrayList<>();
        propinaDiaria=0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void muestraPagosDiarios()
    {
        // put your code here
        for(Empleados empleado : empleados){
            System.out.println(empleado.toString());
        }
    }
    
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void muestraPropinasDiarias()
    {
        // put your code here
        System.out.println("Las propinas del dia son $" + propinaDiaria + " dolares"); 
    }
    
    public int getPropina()
    {
        return propinaDiaria;
    }
    
    public void ingresaPropina(int propina)
    {
        propinaDiaria = propina;
    }
    
    public void asignaPropinaDiaria()
    {
        int trabajadoresDelDia = empleados.size();
        propinaPorTrabajador = propinaDiaria/trabajadoresDelDia;
        for(Empleados empleado: empleados)
        {
            empleado.setCantidadPago(propinaPorTrabajador);
        }
    }
    
    public int getPropinaPorTrabajador()
    {
        return propinaPorTrabajador;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void agregaEmpleado(Empleados empleado)
    {
        // put your code here
        empleados.add(empleado);
    }
    
    public void actualizarPagos()
    {
        for(Empleados empleado : empleados){
            if(empleado.getRango().equals("nuevo"))
            {
                int pago = empleado.getHorasTrabajadas()*7;
                empleado.setCantidadPago(pago);
            }if(empleado.getRango().equals("antiguo"))
            {
                int pago = empleado.getHorasTrabajadas()*10;
                empleado.setCantidadPago(pago);
            }
            
        }
    }
    
    public ArrayList getEmpleados()
    {
        return empleados;
    }
}
