package b_string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ELIMINANDO APARICIONES DUPLICADAS!
// WEB PARA PROBAR EXP REGULARES: https://regex101.com/
//\b(\w+)(\W+\1\b)+
//My name name is Arian Arian Arian arian
public class Regex2_DuplicateWords {

    public static void main(String[] args) {
        /* Write a RegEx matching repeated words here -> \b(\w+)(\W+\1\b)+*/
        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        /* Insert the correct Pattern flag here -> Pattern.CASE_INSENSITIVE*/
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                /* The regex to replace -> m.group()*/
                /* The replacement -> m.group(1)*/
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}

/*
- Sample Input
5
Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB

- Sample Output
Goodbye bye world
Sam went to his business
Reya is the best player in eye game
in inthe
Hello Ab


 */