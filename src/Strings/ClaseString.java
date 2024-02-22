package Strings;

import java.util.Arrays;

public class ClaseString {
    public static void main(String[] args) {
        String cadena = "Cadena de caracteres que contiene ccasa";

        System.out.println(cadena.charAt(3));
        System.out.println(cadena.length());

        // IndexOf
        int index = -1;
        char c = 'x';
        for (int i=0; i<cadena.length(); i++) {
            if (c==cadena.charAt(i)) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        System.out.println(cadena.indexOf(c));

        // isEmpty
        System.out.println(cadena.isEmpty());

        System.out.println(indexOf(cadena, "casa"));
        System.out.println(cadena.indexOf("casa"));
        System.out.println(cadena.indexOf("casa",36));

        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

        System.out.println(cadena.replace(" ","_"));
        System.out.println(cadena);

        // replace
        // lastIndexOf
        // startsWith
        // endsWith
        // trim -- quitar espacios del principio y del final
        // substring

        String a = "a,bebe,casa,d,e,f";
        String d[] = a.split(",");
        System.out.println(Arrays.toString(d));
    }

    public static int indexOf(String fuente, String palabraBuscada) {
        int index;
        for (int i = 0; i < fuente.length(); i++) {
            if (fuente.charAt(i) == palabraBuscada.charAt(0)) {
                index = i;
                for (int j = 1; j < palabraBuscada.length(); j++) {
                    if (fuente.charAt(i+j) != palabraBuscada.charAt(j)) {
                        index = -1;
                        break;
                    }
                }
                if (index!=-1) {
                    return index;
                }
            }
        }

        return -1;
    }

    public static boolean myIsEmptyExtendedSuperGuay(String string) {
        if (string == null) {
            return true;
        }
        if (string.length()==0) {
            return true;
        }
        return false;
    }
}
