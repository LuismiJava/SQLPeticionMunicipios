/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciudadesprovinciasxml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author FP Mañana A
 */
public class AccesoDatos {
    private static Connection conexion = null;
	private static Statement stmt = null;

	public static void conectar() {

		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ciudadesxml", "root", "");
			stmt = conexion.createStatement();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}

	public static void grabarProvincias(ClaseRaizProvincias p) {
            
            String query = "INSERT INTO provincias (Nombre, Codigo) VALUES ('01','INICIO')";
            
            for (Provincias x : p.getProvinciero()) {
                
                    query = "INSERT INTO provincias (Nombre, Codigo) VALUES ('" + x.getNp()+ "', '" + x.getCpine()+ "')";
                
            }

        try {
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      

		
		
	
        
}

}

