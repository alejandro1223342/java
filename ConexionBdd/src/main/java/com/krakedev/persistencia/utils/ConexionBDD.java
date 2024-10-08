package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDD {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/ejercicios";
	private final static String USUARIO = "postgres";
	private final static String CLAVE = "root";

	public static Connection conectar() throws Exception {

		
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexion exitosa");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error en la Infraestructura");
		}catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al conectarse revise usuario y clave");
		}
		return connection;
	}

}
