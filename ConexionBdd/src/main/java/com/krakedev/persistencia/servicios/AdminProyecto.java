package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminProyecto {
	private static final Logger LOGGER = LogManager.getLogger(AdminProyecto.class);

	public static void insertar(Proyecto proyecto) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>" + proyecto);

		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"INSERT INTO proyecto (proy_id, proyecto, monto, fecha_inicio, fecha_entrega) VALUES (?, ?, ?, ?, ?)");

			ps.setInt(1, proyecto.getProy_id());
			ps.setString(2, proyecto.getProyecto());
			ps.setBigDecimal(3, proyecto.getMonto());
			ps.setDate(4, new java.sql.Date(proyecto.getFecha_inicio().getTime()));
			ps.setDate(5, new java.sql.Date(proyecto.getFecha_entrega().getTime()));
			ps.executeUpdate();

			// System.out.println("insertar");
		} catch (Exception e) {
			// mostrar el error al usuario
			// loggear el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

	}

	public static void actualizar(Proyecto proyecto) throws Exception {

		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Proyecto a actualizar >>" + proyecto);

		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"UPDATE proyecto SET proyecto=?, monto=?, fecha_inicio=?, fecha_entrega=? WHERE proy_id=?;");

			ps.setString(1, proyecto.getProyecto());
			ps.setBigDecimal(2, proyecto.getMonto());
			ps.setDate(3, new java.sql.Date(proyecto.getFecha_inicio().getTime()));
			ps.setDate(4, new java.sql.Date(proyecto.getFecha_entrega().getTime()));
			ps.setInt(5, proyecto.getProy_id()); // El valor para el WHERE
			ps.executeUpdate();

			// System.out.println("insertar");
		} catch (Exception e) {
			// mostrar el error al usuario
			// loggear el error
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void eliminar(Proyecto proyecto) throws Exception {

		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Proyecto a actualizar >>" + proyecto);

		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("DELETE FROM proyecto WHERE proy_id=?");

			ps.setInt(1, proyecto.getProy_id());
			ps.executeUpdate();

			// System.out.println("insertar");
		} catch (Exception e) {
			// mostrar el error al usuario
			// loggear el error
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	
	public static ArrayList<Proyecto> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Proyecto> proyecto = new ArrayList<Proyecto>(); 
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs= null;
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("Select * from proyecto where proyecto like ?");
			ps.setString(1, nombreBusqueda+"%");
			
			rs=ps.executeQuery();
			
//			if(rs.next()) {
//				//Crear Persona 
//				
//			}else {
//				//return null
//			}
			
			while(rs.next()) {
				String proyect=rs.getString("proyecto");

				Proyecto p = new Proyecto();
				//Seteo datos
				p.setProyecto(proyect);
				//Agrego al arreglo
				proyecto.add(p);
			}
			
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		
		return proyecto;
	}
	
	public static Proyecto buscarLlavePrimaria(int llavePrimaria) throws Exception{
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs= null;
	    Proyecto proyecto = null; // Inicializamos el proyecto para retornar luego

		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("SELECT * FROM proyecto where proy_id=?");
			ps.setInt(1, llavePrimaria);
			
			rs=ps.executeQuery();
			
			if(rs.next()) {
				//Crear Persona 
	            int proyId = rs.getInt("proy_id");
	            String nombreProyecto = rs.getString("proyecto");
	            //Bad result
	            BigDecimal monto = rs.getBigDecimal("monto");
	          //Bad result
	            java.util.Date fechaInicio = rs.getDate("fecha_inicio");
	            java.util.Date fechaEntrega = rs.getDate("fecha_entrega");
	            proyecto = new Proyecto(proyId, nombreProyecto, monto, fechaInicio, fechaEntrega);
 
				
			}else {
				return null;
			}
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por llave primaria", e);
			throw new Exception("Error al consultar por llave primaria");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		
		return proyecto;
	}
}
