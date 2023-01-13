/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespbo;
import java.sql.*;
/**
 *
 * @author LEGION
 */
public class JDBC {
    static final String url = "jdbc:mysql://localhost/e-train";
    static final String username = "root";
    static final String password = "";
    
    public static Connection connectDB(){
        try{
            Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch(Exception e){
            System.out.println("Gagal mengkoneksikan database!");
            return null;
        }
    }
}
