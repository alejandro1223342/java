package com.krakedev.ConexionBdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexion {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ejercicios", "postgres", "root");
			System.out.println("Conexion exitosa");

			ps = connection.prepareStatement(
					"INSERT INTO usuario (usu_id, nombre, apellido, fecha_nacimiento) VALUES (?,?,?,?)");
			
			ps.setInt(1,11);
			ps.setString(2, "Mario");
			ps.setString(3, "Hugo");
			ps.setDate(4, java.sql.Date.valueOf("2023-12-05"));
			
			ps.executeUpdate();
			
			System.out.println("Ejecuta el insert");

			//Para tipo money usar bigDecimal.
			//set.BigDecimal(posicion,new BigDecimal(1200.45))
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
