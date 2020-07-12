package f_exception_handling;

import java.util.*;

public class Exception_Handling_TryCatch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int X = scan.nextInt();
            int Y = scan.nextInt();
            System.out.println(CalculateDivision(X, Y));
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }
        catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }

    private static int CalculateDivision(int X, int Y){
        try{
            return X/Y;
        } catch (ArithmeticException e) {
            throw e;
        }
    }
}


/*
Se le darán dos enteros X e Y como entrada, debe calcular X / Y. Si X e Y no son enteros con signo de 32 bits o si Y es cero,
se producirá una excepción y deberá informarlo. Lea la entrada / salida de muestra para saber qué informar en caso de
excepciones.

- Sample Input 0:
10
3
- Sample Output 0:
3

- Sample Input 1:
10
Hello
- Sample Output 1:
java.util.InputMismatchException

- Sample Input 2:
10
0
- Sample Output 2:
java.lang.ArithmeticException: / by zero

- Sample Input 3:
23.323
0
- Sample Output 3:
java.util.InputMismatchException

 */