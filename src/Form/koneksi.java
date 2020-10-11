/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author baru
 */
public class koneksi {
    
    private static Connection koneksi;
    public static Connection getKoneksi()
    {
        if(koneksi== null)
        {
            try {
                String url="jdbc:mysql://localhost:3306/persediaan_barang";
                String username= "root";     // default username
                String password= "";         // jika ada password bisa anda masukkan
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi =DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        return koneksi;
    }

    static Object createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

