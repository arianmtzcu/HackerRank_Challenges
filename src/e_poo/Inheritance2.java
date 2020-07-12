package e_poo;

class Arithmetic{
    int add(int a, int b){
        return a+b;
    }
}

class Adder extends Arithmetic { }

public class Inheritance2{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}


/*
Formato de entrada

Usted no es responsable de leer ninguna entrada de stdin; un código auxiliar bloqueado probará su envío llamando al método add en un objeto Adder y pasándole parámetros enteros.

Formato de salida

No es responsable de imprimir nada en stdout. Su método add debe devolver la suma de sus parámetros.

Salida de muestra

El método principal en la clase de Solución anterior debe imprimir lo siguiente:

Mi superclase es: aritmética
42 13 20
 */