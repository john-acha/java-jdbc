package com.acha.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
	public static void main(String[] args) throws SQLException {
	
		//Creamos una variable que recibe la conexion;
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC", 
				"root", 
				"acha0517");
		System.out.println("Cerrando la conexión");
		//Cerramos la conexion;
		con.close();
		
	}

}
