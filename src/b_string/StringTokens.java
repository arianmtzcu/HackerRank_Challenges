package b_string;

import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        /*OJO: CASO BORDE A TENER EN CUENTA!*/
        s = s.trim();
        if(s.length() == 0) {
            System.out.println(0);
            //return;
        }
        else{
            String[] words = s.split("[^a-zA-Z]+");
            System.out.println(words.length);

            for(String word : words)
                System.out.println(word);
        }
    }
}


/*
- Sample Input
He is a very very good boy, isn't he?
- Sample Output
10
He
is
a
very
very
good
boy
isn
t
he

Explicación:
Consideramos que un token es un segmento contiguo de caracteres alfabéticos. Hay un total de 10 de estos tokens
en la cadena s, y cada token se imprime en el mismo orden en que aparece en la cadena.
 */