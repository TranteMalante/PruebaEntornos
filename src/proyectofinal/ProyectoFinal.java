package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProyectoFinal {
static List<String> prueba = new ArrayList<>();
static List<String> crear = new ArrayList<>();
static List<String> insertar = new ArrayList<>();
static List<String> borrar = new ArrayList<>();
static List<String> actualizar = new ArrayList<>();
static List<String> consultar = new ArrayList<>();
    public static void main(String[] args) {
        //Cargamos la interfaz principal
        Interfaz Interfaz = new Interfaz();
        Interfaz.setVisible(true);
        
        //Creamos la conexión con la base de datos
        try {
                // Cargamos driver y creamos conexión
                Class.forName("com.mysql.cj.jdbc.Driver");     
                String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
                try (Connection conn = DriverManager.getConnection(url,"root","Lada3951"); Statement st = conn.createStatement()) {}
            } catch (SQLException | ClassNotFoundException e) {}
               
    }
    
    public static String concatenado(ArrayList lista){
        String str = String.join(" ", lista);
        return str;
    }
    
}
