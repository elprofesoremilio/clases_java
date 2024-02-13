package Cadenas;

import java.util.ArrayList;
import java.util.Arrays;

public class InterpretarCSV {
    // Comma Separated Values
    // a,3,2
    // a:b:c


    public static void InterpretarCSVIndexOf(String cadena) {
        int inicio=0,fin;
        while ((fin = cadena.indexOf(",",inicio))!=-1) {
            System.out.println(cadena.substring(inicio,fin));
            inicio = fin+1;
        }
        System.out.println(cadena.substring(inicio));
    }
    public static void InterpretarCSVBajoNivel (String cadena) {
        //String[] datos = new String[4];
        ArrayList<String> datos = new ArrayList<>();

        StringBuilder actual = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)!=',' && i!=cadena.length()-1) {
                actual.append(cadena.charAt(i));
            } else if  (i==cadena.length()-1) {
                actual.append(cadena.charAt(i));
                datos.add(actual.toString());
            } else {
                datos.add(actual.toString());
                actual = new StringBuilder();
            }
        }

        System.out.println(Arrays.toString(datos.toArray()));
    }
    public static void InterpretarHora(String cadena) {
        StringBuilder hora=new StringBuilder(),minutos=new StringBuilder(),segundos=new StringBuilder();
        int i=0;
        while (cadena.charAt(i)!=':') {
            hora.append(cadena.charAt(i));
            i++;
        }
        i++;
        while (cadena.charAt(i)!=':') {
            minutos.append(cadena.charAt(i));
            i++;
        }
        i++;
        for (;i<cadena.length();i++) {
            segundos.append(cadena.charAt(i));
        }

        System.out.println("Horas: " + hora);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
    public static void main(String[] args) {
        String cadena = "Pepito,Pérez,Cazorla,23470";
        // Este falla: ¿se te ocurre cómo arreglarlo?
        // String cadena = "Pepito,Pérez,Cazorla,23470,'C/ Nueva, 2'";

        String[] datos = cadena.split(",");
        System.out.println(Arrays.toString(datos));
    }
}
