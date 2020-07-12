package a_introduction;

import java.util.Scanner;

public class Stdin_And_Stdout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    /*Si previamente hemos llamado al método nextInt(), luego de ejecutar el método nextInt() queda almacenado
    en el objeto de la clase Scanner el caracter "Enter" y si llamamos inmediatamente al método nextLine() este
    almacena dicho valor de tecla y continúa con el flujo del programa.
    Para solucionar este problema debemos generar un código similar a: scan.nextLine(); //Limpia en scan*/
}