package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Municipio;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminMunicipio {
	private static final Logger LOGGER = LogManager.getLogger(AdminProyecto.class);

	public static void insertar(Municipio municipio) throws Exception {
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

			//System.out.println("insertar");
		} catch (Exception e) {
			LOGGER.error("Error con la base de datos",e);
			throw new Exception("Error con la base de datos");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}

	}
}
