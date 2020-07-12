package a_introduction;

import java.util.*;

/*Tarea
Dado un número entero, realice las siguientes acciones condicionales:

Si es extraño, imprima Extraño
Si es par y está en el rango inclusivo de to, imprima Not Weird
Si es par y está en el rango inclusivo de to, imprime Weird
Si es par y mayor que, imprima Not Weird
Complete el código auxiliar provisto en su editor para imprimir si es extraño o no.*/

public class Conditionals_If_Else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(!isPar(N) || (isPar(N) && isInclusiveRange(N,6,20)))
            System.out.println("Weird");
        else
            if((isPar(N) && isInclusiveRange(N,2,5))||(isPar(N) && N>20))
                System.out.println("Not Weird");

        scanner.close();
    }

    private static boolean isPar(int number){
        return number%2 == 0;
    }

    private static boolean isInclusiveRange(int number, int initRange, int finalRange){
        return (number>=initRange && number<=finalRange);
    }
}