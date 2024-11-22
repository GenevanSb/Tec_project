/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Claudio
 */
public class Conexao {
    
    private static final String url ="jdbc:mysql://localhost:3306/escola";
    private static final String user="root";
    private static final String password ="";
     
    private static Connection conn;
    public static Connection getConexao(){
    try { 
        if (conn==null){
             conn =DriverManager.getConnection(url,user,password);
             return conn;
         }  
        else{
        return conn;
        }
     }
    catch (SQLException e) {
            e.printStackTrace();
            return null;
         }
    }
}
    




 
   