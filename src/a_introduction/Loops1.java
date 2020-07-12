package a_introduction;

import java.util.*;

public class Loops1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        OperationsPrinted(N);
        scanner.close();
    }

    public static void OperationsPrinted(int valor){
        for (int i=1; i<=10; i++){
            //System.out.println(valor+" x "+i+" = "+(valor*i));
            System.out.printf("%d x %d = %d\n", valor, i, valor*i);
        }

    }
}

/*Objetivo
En este desafío, vamos a usar bucles para ayudarnos a hacer algunas matemáticas simples.
Tarea
Dado un número entero, imprime sus primeros múltiplos. Cada múltiplo (donde) debe imprimirse en una nueva línea en la forma: N x i = resultado.

Formato de entrada
Un solo entero,.
Restricciones

Formato de salida
Imprimir líneas de salida; cada línea (donde) contiene el de en la forma:
N x i = resultado.

Entrada de muestra
2
Salida de muestra
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/
