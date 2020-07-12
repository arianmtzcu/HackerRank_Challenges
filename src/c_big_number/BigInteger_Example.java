package c_big_number;

import java.util.*;
import java.math.BigInteger;

public class BigInteger_Example {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.next());
        BigInteger b = new BigInteger(scan.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}


/*
Output Format

Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.

- Sample Input:
1234
20

- Sample Output:
1254
24680

 */