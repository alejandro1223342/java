package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminProyecto {

	public static void insertar(Proyecto proyecto) {
		Connection con=null;
		PreparedStatement ps;
		
		try {
			//abrir la conexion
			con=ConexionBDD.conectar();
			ps = con.prepareStatement(
					"INSERT INTO proyecto (proy_id, proyecto, monto, fecha_inicio, fecha_entrega) VALUES (?, ?, ?, ?, ?)");
			
			ps.setInt(1,proyecto.getProy_id());
			ps.setString(2, proyecto.getProyecto());
			ps.setBigDecimal(3, proyecto.getMonto());
			ps.setDate(4, new java.sql.Date(proyecto.getFecha_inicio().getTime()));
			ps.setDate(5, new java.sql.Date(proyecto.getFecha_entrega().getTime()));
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
