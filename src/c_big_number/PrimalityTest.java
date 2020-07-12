package c_big_number;

import java.math.*;
import java.util.*;

public class PrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //String n = scanner.nextLine();
        BigInteger n = new BigInteger(scanner.nextLine());
        scanner.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}

/*
Restricciones: n contiene como máximo 100 dígitos. OJO! BIGINTEGER!

Sample Input
13

Sample Output
prime

Explanation
The only positive divisors of  are  and , so we print prime.
 */