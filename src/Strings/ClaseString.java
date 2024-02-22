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

        // lastIndexOf

        String a = "a,bebe,casa,d,e,f";
        String d[] = a.split(",");
        System.out.println(Arrays.toString(d));
    }

    public static String subString(String cadena, int begin, int end) {
        StringBuilder result =new StringBuilder();

        for (int i = begin; i < end; i++) {
            result.append(cadena.charAt(i));
        }

        return result.toString();
    }

    public static String replace(String original, String origen, String destino) {
        StringBuilder result = new StringBuilder();

        int index = -1;
        int i = 0;
        while (i < original.length() - origen.length() - 1) {
            if (original.charAt(i)==origen.charAt(0)) {
                index = i;
                for (int j = 1; j < origen.length(); j++) {
                    if (original.charAt(i+j)!=origen.charAt(j)) {
                        index = -1;
                        break;
                    }
                }
                if (index != -1) {
                    result.append(destino);
                    i+=origen.length();
                } else {
                    result.append(original.charAt(i));
                    i++;
                }
            }
        }

        return result.toString();
    }
    public static String replace(String original, char origen, char destino) {
        char[] result = original.toCharArray();
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == origen) {
                result[i]=destino;
            } else {
                result[i] = original.charAt(i);
            }
        }
        return String.copyValueOf(result);
    }

    public static boolean startsWith(String cadena, String inicio) {
        if (cadena.length()<inicio.length()) {
            return false;
        }
        if (cadena.length() == inicio.length()) {
            return cadena.equals(inicio);
        }
        for (int i = 0; i < inicio.length(); i++) {
            if (cadena.charAt(i)!=inicio.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean endsWidth(String cadena, String end) {
        if (cadena.length()<end.length()) {
            return false;
        }
        if (cadena.length() == end.length()) {
            return cadena.equals(end);
        }
        for (int i = cadena.length()-1; i < end.length(); i--) {
            if (cadena.charAt(i)!=end.charAt(i)) {
                return false;
            }
        }

        return true;
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
