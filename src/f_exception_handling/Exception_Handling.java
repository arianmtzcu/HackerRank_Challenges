package f_exception_handling;

import java.util.Scanner;

class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    public long power(int n, int p) throws Exception {
        if(n == 0 && p == 0) throw new Exception("n and p should not be zero.");
        else if(n < 0 || p < 0) throw new Exception("n or p should not be negative.");
        return (long) Math.pow(n,p);
    }
}

public class Exception_Handling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


/*
- Sample Input 0
3 5
2 4
0 0
-1 -2
-1 3

Sample Output 0
243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.

Explanation 0
In the first two cases, both n and p are postive. So, the power function returns the answer correctly.
In the third case, both n and p are zero. So, the exception, "n and p should not be zero.", is printed.
In the last two cases, at least one out of n and p is negative. So, the exception, "n or p should not be negative.", is printed for these two cases.
 */