package a_introduction;

import java.util.*;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        List<int[]> series = new ArrayList<int[]>();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            series.add(CalculateValue(a, b, n));
        }
        PrintValues(series);

        in.close();
    }

    private static int[] CalculateValue(int a, int b, int n){
        int[] collectionNumbers = new int[n];
        /*
           (a+2^0*b),(a+2^0*b+2^1*b),...,(a+2^0*b+2^1*b+2^(n-1)*b)
           A = a+2^i*b (i=0)
           B = A+2^i*b (i=1)
           C = B,B+2^i*b (i=2)
           A, B, C, C+2^3*b
        */
        collectionNumbers[0]=(a + b);
        for(int i=1; i<n; i++){
            collectionNumbers[i] = collectionNumbers[i-1] + (int)Math.pow(2,i)*b;
        }
        return collectionNumbers;
    }

    private static void PrintValues(List<int[]> series){
        for(int i=0; i<series.size(); i++){
            String res = "";
            for(int value: series.get(i)){
                res += value+" ";
            }
            System.out.println(res);
        }
    }
}

/*
Usamos los enteros, y para crear las siguientes series:

Recibirá consultas en forma de, y. Para cada consulta, imprima la serie correspondiente a los valores dados, y, como una sola línea de enteros separados por espacios.
Formato de entrada
La primera línea contiene un número entero, que denota el número de consultas.
Cada línea de las líneas subsiguientes contiene tres enteros separados por espacios que describen los valores respectivos, y para esa consulta.
Restricciones
Formato de salida
Para cada consulta, imprima la serie correspondiente en una nueva línea. Cada serie debe imprimirse en orden como una sola línea de enteros separados por espacios.

Entrada de muestra
2
0 2 10
5 3 5
Salida de muestra
2 6 14 30 62126254 510 1022 2046
8 14 26 50 98

Explicación
Tenemos dos consultas:
Usamos, y para producir algunas series:

... y así.
Una vez que tocamos, imprimimos los primeros diez términos como una sola línea de enteros separados por espacios.
Usamos, y para producir algunas series:
Luego imprimimos cada elemento de nuestra serie como una sola línea de valores separados por espacios.*/
