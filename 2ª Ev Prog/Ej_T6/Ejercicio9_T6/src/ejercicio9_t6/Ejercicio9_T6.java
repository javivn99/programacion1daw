/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_t6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author DAW
 */
public class Ejercicio9_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        int habHospital;
        GregorianCalendar fechaSalida;
       GregorianCalendar fechaactual=new GregorianCalendar(2019,25,12);
       GregorianCalendar fechaalta=new GregorianCalendar();
       
       Paciente paciente1 = new Paciente("Carmen", 41520, "indigestion", "suero");
       paciente1.Ingresar(fechaactual);
       System.out.println("El paciente: " +paciente1.getNombre() + "con diagnostico" + paciente1.getDiagnostico() + "tiene como tratamiento" + paciente1.getTratamiento());
       System.out.println("Ingresado en la fecha: " +fechaactual.get(Calendar.DATE) + "-" + fechaactual.get(Calendar) + "tiene como tratamiento" + paciente1.getTratamiento());
       habHospital = paciente1.Habitacion();
       
       //PAsafr de un string a Date y d este a Calendar
       Calendar calendar = Calendar.getInstance();
       //Fjamos el fomramto de al fecha tal y como vendra en la cadena
       SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-*yyy");
       String strFecha = "19-12-2017";
       Date fecha = null;
       //Convertimos la cadena a Date
       fecha = formatoDelTexto.parse(strFecha);
       //Finalmente, convertimos el Date en Calendar
       calendar.setTime(fecha);
       System.out.println(calendar.getTime());
       
       //Imprimir la fecha actual con formato de una base de datos sql: Año-Mes-Dia
       java.util.Date utilDate = new java.util.Date();
       java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
       System.out.println("La fecha actual es: " + sqlDate);
             
       
       
       
       
       
        
    }
    
}
