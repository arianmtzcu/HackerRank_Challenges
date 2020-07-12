package a_introduction;

import java.util.Scanner;

public class Output_Formatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d\n",s1,x);
        }
        System.out.println("================================");
    }
}

/*La función System.out.printf de Java se puede utilizar para imprimir resultados formateados.
El propósito de este ejercicio es evaluar su comprensión del formato de salida utilizando printf.

Para comenzar, se proporciona una parte de la solución en el editor; debe formatear e imprimir la entrada para completar la solución.
Formato de entrada
Cada línea de entrada contendrá una Cadena seguida de un número entero.
Cada cadena tendrá un máximo de caracteres alfabéticos, y cada número entero estará en el rango inclusivo desde hasta.

Formato de salida
En cada línea de salida debe haber dos columnas:
La primera columna contiene la Cadena y se deja justificada usando exactamente caracteres.
La segunda columna contiene el número entero, expresado exactamente en dígitos; Si la entrada original tiene menos de tres dígitos, debe rellenar los dígitos iniciales de su salida con ceros.

Sample Input

java 100
cpp 65
python 50
Sample Output
================================
java           100
cpp            065
python         050
================================
Explicación
Cada cadena se justifica a la izquierda con espacios en blanco al final de los primeros caracteres.
El primer dígito del entero es el carácter, y cada entero que era menor que los dígitos ahora tiene ceros a la izquierda.*/
