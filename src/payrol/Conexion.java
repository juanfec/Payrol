package payrol;
import java.util.*;
import java.sql.*;

/**
 *
 * @author cedav
 */
    public class Conexion {
    public Connection co;
    public Statement estado;
    
    
    //metodo de la conexion
    public Connection conexion()
    {
        
        //crear conexión
            try{    
        System.out.println("conectando");
        Class.forName("com.mysql.jdbc.Driver");
        co = DriverManager.getConnection("jdbc:mysql://localhost/payroll","root","root");
        System.out.println("conexion exitosa");
            }catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }return co;
    }
       
          Statement createStatement(){
         throw new UnsupportedOperationException("No soportado");
    }
    }
    