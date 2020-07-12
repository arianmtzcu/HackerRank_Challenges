package b_string;

import java.util.Scanner;

public class Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        java.util.SortedSet<String> s1 = new java.util.TreeSet<String>();
        for(int i=0; i<=s.length()-k; i++){
            s1.add((s.substring(i,i+k)));
        }
        smallest = s1.first();
        largest = s1.last();
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        String res = Substring_Comparisons.getSmallestAndLargest(s,k);
        System.out.println(res);
    }
}

/*
El orden lexicográfico, también conocido como orden alfabético o de diccionario, ordena los caracteres de la siguiente manera:
Por ejemplo, pelota <gato, perro <dormitorio, feliz <feliz, zoológico <pelota. [A,B,C, ... Z]

Una subcadena de una cadena es un bloque contiguo de caracteres en la cadena. Por ejemplo, las subcadenas de abc son a, b, c, ab, bc y abc.
Dada una cadena, y un número entero, completa la función para que encuentre las subcadenas lexicográficamente más pequeñas y más grandes de longitud.

Formato de entrada
La primera línea contiene una cadena que denota s.
La segunda línea contiene un número entero que denota k.

Formato de salida
Devuelva las subcadenas lexicográficamente más pequeñas y más grandes respectivas como una sola cadena separada por una nueva línea.

Entrada de muestra 0
welcometojava
3
Salida de muestra 0
ava
wel

Explicación 0
La cadena tiene las siguientes subcadenas de longitud ordenadas lexicográficamente:
["ava", "com", "elc", "eto", "jav", "lco", "met", "oja", "ome", "toj", "wel"]

Luego devolvemos la primera subcadena (lexicográficamente más pequeña) y la última subcadena (lexicográficamente más grande) como dos valores separados por una nueva línea (es decir, ava \ nwel).
El código auxiliar en el editor imprime ava como nuestra primera línea de salida y bien como nuestra segunda línea de salida.
 */