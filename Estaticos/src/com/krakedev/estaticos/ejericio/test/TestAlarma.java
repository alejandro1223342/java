package com.krakedev.estaticos.ejericio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.DiasSemana;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.entidades.Alarma;

public class TestAlarma {
    public static void main(String[] args) {
        
        Alarma alarma1 = new Alarma(DiasSemana.LUNES, 5, 45);
        Alarma alarma2 = new Alarma(DiasSemana.MARTES, 6, 45);
        Alarma alarma3 = new Alarma(DiasSemana.MIERCOLES, 7, 45);

        AdminAlarmas admin = new AdminAlarmas();
        admin.agregarAlarma(alarma1);
        admin.agregarAlarma(alarma2);
        admin.agregarAlarma(alarma3);

        ArrayList<Alarma> alarmasActuales = admin.getAlarma();
        System.out.println(alarmasActuales); // Imprime la lista de alarmas
        
        System.out.println(alarma1); // Lunes, 05:45
        System.out.println(alarma2); // Martes, 06:05
        System.out.println(alarma3); // Miércoles, 07:30
    }
}
