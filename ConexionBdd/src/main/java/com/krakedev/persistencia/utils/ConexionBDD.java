package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/ejercicios";
	private final static String USUARIO = "postgres";
	private final static String CLAVE = "root";
	private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);

	public static Connection conectar() throws Exception {

		
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USUARIO, CLAVE);
			LOGGER.debug("Conexion Exitosa");
			//System.out.println("Conexion exitosa");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			LOGGER.error("Error en la infraesstructura "+ e);
			throw new Exception("Error en la Infraestructura");
		}catch (SQLException e) {
			LOGGER.error("Error al conectarse revise usuario y clave "+ e);
			throw new Exception("Error al conectarse revise usuario y clave");
		}
		return connection;
	}

}
