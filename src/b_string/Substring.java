package b_string;

import java.util.*;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}

/*
Dadas dos cadenas de letras minúsculas en inglés y realiza las siguientes operaciones:

Suma las longitudes de A y B.
Determine si A es lexicográficamente más grande que B (es decir, ¿B viene antes que A en el diccionario?).
Escriba con mayúscula la primera letra en A y B e imprímala en una sola línea, separada por un espacio.

Entrada de muestra
Hola Mundo
3 7
Salida de muestra
lowo
 */