package com.krakedev.persistencia.servicios;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Ciudad;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminCiudad {
	private static final Logger LOGGER = LogManager.getLogger(AdminProyecto.class);

	public static void insertar(Ciudad ciudad) throws Exception {
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

			
			//System.out.println("insertar");
		} catch (Exception e) {
			//mostrar el error al usuario
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
		
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
		
	}

}
