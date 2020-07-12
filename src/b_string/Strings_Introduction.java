package b_string;

import java.util.*;

public class Strings_Introduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1));
        System.out.print(" ");
        System.out.print(B.substring(0,1).toUpperCase()+B.substring(1));
    }
}

/*
Dadas dos cadenas de letras minúsculas en inglés y realiza las siguientes operaciones:

Suma las longitudes de A y B.
Determine si A es lexicográficamente más grande que B (es decir, ¿B viene antes que A en el diccionario?).
Escriba con mayúscula la primera letra en A y B e imprímala en una sola línea, separada por un espacio.
*/