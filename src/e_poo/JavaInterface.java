package e_poo;
import java.util.*;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisor_sum(int n) {
        int suma = 0;
        for(int i=1; i<=n; i++)
            if(n%i==0) suma+=i;
        return suma;
    }
}

class JavaInterface {
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

/*
- Sample Input:
6
- Sample Output:
I implemented: AdvancedArithmetic
12
- Explanation:
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.
 */