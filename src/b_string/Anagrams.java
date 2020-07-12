package b_string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        /*
            1. Eliminar espacios en blanco
            2. Convertir palabras a minusculas
            3. Si tienen el mismo no de elemento, entonces es un anagrama de lo contrario no!
        */
        a = a.replaceFirst(" ","").toLowerCase();
        b = b.replaceFirst(" ","").toLowerCase();

        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);
        return Arrays.equals(c,d);
        //OJO MAL! return c.equals(d);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/*
- Sample Input 1
anagramm
marganaa
- Sample Output 1
Not Anagrams

- Sample Input 2
Hello
hello
Sample Output 2
Anagrams

*/