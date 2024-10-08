package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.krakedev.persistencia.entidades.Ciudad;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminCiudad {
	
	public static void insertar(Ciudad ciudad) {
		Connection con=null;
		PreparedStatement ps;
		
		try {
			//abrir la conexion
			con=ConexionBDD.conectar();
			ps = con.prepareStatement(
					"INSERT INTO ciudad(ciu_id, nombre) VALUES (?, ?);");
			
			ps.setInt(1,ciudad.getCiu_id());
			ps.setString(2, ciudad.getNombre());
			ps.executeUpdate();

			
			System.out.println("insertar");
		} catch (Exception e) {
			//mostrar el error al usuario
			System.out.println(e.getMessage());
			//loggear el error
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error de infraestructura");
			}
		}
		
	}

}
