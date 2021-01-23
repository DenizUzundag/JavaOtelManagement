/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author Asus
 */
public class ConnetionsProvider {
    public static Connection getCon()
    {
      try
      { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          //connection stringler eklenmeli
         
          
         return con;
      }
     catch(Exception e)
      {
          return null;
      }
    }   
}
