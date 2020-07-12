package b_string;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

// VALIDAR SI UNA EXP REGULAR ES VALIDA!
public class Pattern_Syntax_Checker
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String pattern = in.nextLine();
            // Write you code
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (PatternSyntaxException pse){
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

/*
Nota: en este problema, una expresión regular solo es válida si puede compilarla utilizando el método Pattern.compile.
 */