package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	private static final String FORMATO_FECHA = "yyyy/MM/dd";
	private static final String FORMATO_HORA = "HH:mm:ss";
	private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);

	public static Date convertirFecha(String fechaStr) throws Exception {
		SimpleDateFormat sf = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate = null;
		try {
			LOGGER.trace("Convirtiendo fecha" + fechaStr);
			fechaDate = sf.parse(fechaStr);
			LOGGER.trace("Fecha Convertida" + fechaStr);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			LOGGER.error("La fecha no tiene el formato correto" + e);
			throw new Exception("La fecha no tiene el formato correcto");
		}
		return fechaDate;
	}

	public static Date convertirHora(String horaStr) throws Exception {
		SimpleDateFormat sf = new SimpleDateFormat(FORMATO_HORA);
		Date horaDate = null;
		try {
			horaDate = sf.parse(horaStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			LOGGER.error("\"La hora no tiene el formato correcto" + e);
			throw new Exception("La hora no tiene el formato correcto");
		}
		return horaDate;
	}
}
