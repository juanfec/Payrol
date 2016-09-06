/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * Desde esta clase se genera el documento a imprimir
 * 
 * @author Juanfe 
 * @version 22/07/2016
 */
public class Documento
{
    // instance variables - replace the example below with your own
    public Pagos pago;

    /**
     * Constructor for objects of class Documento
     */
    public Documento()
    {
        // initialise instance variables
        pago=Pagos.getInstancia() ;
    }
    
    public void generarDocumento() throws IOException
    {
        pago.actualizarPagos();
        pago.asignaPropinaDiaria();
        ArrayList<Empleados> empleados = pago.getEmpleados();
        try {
            /**  pago.actualizarPagos();
             * pago.asignaPropinaDiaria();
             * ArrayList<Empleados> empleados = pago.getEmpleados();
             * 
             * System.out.println("Nombre                                    Id                   Horas trabajadas      Valor a pagar");
             * for(Empleados empleado : empleados)
             * {
             * System.out.println(empleado.toString());
             * }
             * 
             * pago.muestraPropinasDiarias();
             * System.out.println("El valor correspondiente para cada empleado es: "+pago.getPropinaPorTrabajador());
             */
            Workbook wb = new HSSFWorkbook();
            FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
            CreationHelper createHelper = wb.getCreationHelper();
            Sheet sheet1 = wb.createSheet("Nomina");
            Row row = sheet1.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("Nombre         -");
            cell = row.createCell(1);
            cell.setCellValue("Id");
            cell = row.createCell(2);
            cell.setCellValue("Horas Trabajadas");
            cell = row.createCell(3);
            cell.setCellValue("Cantidad Pago");
            int i=2;
            row = sheet1.createRow(1);
            for(Empleados empleado : empleados)
            {
                cell = row.createCell(0);
                cell.setCellValue(empleado.getNombre());
                cell = row.createCell(1);
                cell.setCellValue(empleado.getId());
                cell = row.createCell(2);
                cell.setCellValue(empleado.getHorasTrabajadas());
                cell = row.createCell(3);
                cell.setCellValue(empleado.getCantidadPago());
                row = sheet1.createRow(i);
                i++;
            }
            sheet1.autoSizeColumn(0);
            sheet1.autoSizeColumn(1);
            sheet1.autoSizeColumn(3);
            sheet1.autoSizeColumn(2);
            
            fileOut = new FileOutputStream("workbook.xls");
            wb.write(fileOut);
            fileOut.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
