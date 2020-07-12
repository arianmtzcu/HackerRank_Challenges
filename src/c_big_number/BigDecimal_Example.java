package c_big_number;

import java.math.BigDecimal;
import java.util.*;

class BigDecimal_Example{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Comparator<String> myComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);
                return b.compareTo(a);
            }
        };
        Arrays.sort(s,0,n,myComparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}

/*
Output Format:
El código bloqueado en el editor imprimirá el contenido de la matriz en stdout.
Usted solo es responsable de reordenar los elementos de la matriz.

- Sample Input:
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

- Sample Output:
90
56.6
50
02.34
0.12
.12
0
000.000
-100
 */