package b_string;

import java.util.Scanner;

class Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    /*
        [01]?\\d{1,2}   matcher number 0-199
        2[0-4]\\d       matcher number 200-249
        25[0-5]         matcher number 250-255
     */
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num+"."+num+"."+num+"."+num;
}

/*
Escriba una clase llamada MyRegex que contendrá un patrón de cadena. Debe escribir una expresión regular y asignarla
al patrón de manera que pueda usarse para validar una dirección IP. Use la siguiente definición de una dirección IP:

La dirección IP es una cadena en la forma "A.B.C.D", donde el valor de A, B, C y D puede variar de 0 a 255.
Se permiten ceros a la izquierda. La longitud de A, B, C o D no puede ser mayor que 3.

En este problema, se le proporcionarán cadenas que contienen cualquier combinación de caracteres ASCII.
Tienes que escribir una expresión regular para encontrar las IP válidas.
Simplemente escriba la clase MyRegex que contiene una cadena. La cadena debe contener la expresión regular correcta.
(La clase MyRegex NO DEBE ser pública)

- Sample Input
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

- Sample Output
true
true
true
false
false
false
*/