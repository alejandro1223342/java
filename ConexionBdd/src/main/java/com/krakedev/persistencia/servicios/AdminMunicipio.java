package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.krakedev.persistencia.entidades.Municipio;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminMunicipio {
	public static void insertar(Municipio municipio) {
		Connection con = null;
		PreparedStatement ps;

		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"INSERT INTO municipio (mun_id, nombre, ciu_id)	VALUES (?, ?, ?);");

			ps.setInt(1,municipio.getMun_id());
			ps.setString(2, municipio.getNombre());
			ps.setInt(3, municipio.getCiu_id().getCiu_id());
			ps.executeUpdate();

			System.out.println("insertar");
		} catch (Exception e) {
			// mostrar el error al usuario
			System.out.println(e.getMessage());
			// loggear el error
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error de infraestructura");
			}
		}

	}
}
