package b_string;

import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    //public static final String regularExpression = null;
    public static final String regularExpression = "^[A-Za-z][a-zA-Z0-9\\_]{7,29}";
}

public class Valid_Username_RegularExpression {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

/*
Está actualizando la política de nombre de usuario en la plataforma de red interna de su empresa. De acuerdo con la política,
un nombre de usuario se considera válido si se cumplen todas las siguientes restricciones:

El nombre de usuario consta de 8 a 30 caracteres inclusive. Si el nombre de usuario consta de menos de 8 o más de 30 caracteres,
entonces es un nombre de usuario no válido. El nombre de usuario solo puede contener caracteres alfanuméricos y guiones bajos (_).
Los caracteres alfanuméricos describen el conjunto de caracteres que consiste en letras minúsculas [a-z], letras mayúsculas [A-Z]
y dígitos [0-9]. El primer carácter del nombre de usuario debe ser un carácter alfabético, es decir, ya sea en minúsculas [a-z]
o en mayúsculas [A-Z].

EXPRESION: ^[A-Za-z][a-zA-Z0-9\_]{7,29}

CHECK: https://regexr.com/
 */