package com.krakedev.ConexionBdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PracticaInsertarRegistros {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;



		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ejercicios", "postgres", "root");
			System.out.println("Conexion exitosa");

			ps = connection.prepareStatement(
					"INSERT INTO proyecto (proy_id, proyecto, monto, fecha_inicio, fecha_entrega) VALUES (?, ?, ?, ?, ?)");
			
			ps.setInt(1,4);
			ps.setString(2, "Proyecto CTM");
			ps.setBigDecimal(3, new BigDecimal(9999.99));
			ps.setDate(4, java.sql.Date.valueOf("2023-12-05"));
			ps.setDate(5, java.sql.Date.valueOf("2024-01-01"));
			ps.executeUpdate();
			
			System.out.println("Ejecuta el primer insert");
			
			ps2 = connection.prepareStatement(
					"INSERT INTO ciudad(ciu_id, nombre) VALUES (?, ?);");
			
			ps2.setInt(1,11);
			ps2.setString(2, "Q TE IMPORTA");
			ps2.executeUpdate();
			System.out.println("Ejecuta el segundo primer insert");

			ps3 = connection.prepareStatement(
					"INSERT INTO municipio (mun_id, nombre, ciu_id)	VALUES (?, ?, ?);");
			
			ps3.setInt(1,11);
			ps3.setString(2, "MUNICIPIO CTM");
			ps3.setInt(3, 11);
			ps3.executeUpdate();
			
			System.out.println("Ejecuta el tercer insert");

			//Para tipo money usar bigDecimal.
			//set.BigDecimal(posicion,new BigDecimal(1200.45))
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
