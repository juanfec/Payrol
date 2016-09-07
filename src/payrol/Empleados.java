/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrol;



/**
 *
 * @author Juanfec
 */

public class Empleados
{
    
    private String nombre;
    private int id;
    private final String nacimiento;
    private final String seguroSocial;
    private int horasTrabajadas;
    private String rango;
    private int cantidadPago;
    
    
    /**
     * Constructor for objects of class Empleados
     */
    public Empleados(String nombre , int id , String nacimiento , String seguroSocial , String rango)
    {
        
        this.nombre = nombre;
        this.id = id;
        this.nacimiento = nacimiento;
        this.seguroSocial = seguroSocial;
        this.rango = rango;
        cantidadPago=0;
    }

    /**
     * Obtiene las horas trabajadas
     * 
     * @param  
     * @return     the sum of x and y 
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * Obtiene establece las horas trabajadas
     * 
     * @param  horas trabajadas
     * @return     
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public String toString() {
        return nombre + "                     " + id + "                   " + horasTrabajadas+ "                   " + cantidadPago;
    }
    
    public String getRango()
    {
        return rango;
    }
    
    public void setRango(String rango)
    {
        this.rango = rango;
    }
    
    public int getCantidadPago()
    {
        return cantidadPago;
    }
    
    public void setCantidadPago(int cantidadPago)
    {
        this.cantidadPago = this.cantidadPago+cantidadPago;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
    
}
