package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertidor {
	private static final String FORMATO_FECHA="yyyy/MM/dd";
	private static final String FORMATO_HORA="HH:mm:ss";

	public static Date convertirFecha(String fechaStr) throws Exception {
		SimpleDateFormat sf= new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate=null;
		try {
			fechaDate=sf.parse(fechaStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("La fecha no tiene el formato correcto");
		}
		return fechaDate;
	}
	
	public static Date convertirHora(String horaStr) throws Exception {
		SimpleDateFormat sf= new SimpleDateFormat(FORMATO_HORA);
		Date horaDate=null;
		try {
			horaDate=sf.parse(horaStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("La fecha no tiene el formato correcto");
		}
		return horaDate;
	}
}
