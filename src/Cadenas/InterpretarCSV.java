package Cadenas;

import utils.Utils;

public class InterpretarCSV {
    // Comma Separated Values
    // a,3,2
    // a:b:c

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
        String cadena = Utils.scanner.nextLine();


//        InterpretarHora(cadena);
    }
}
