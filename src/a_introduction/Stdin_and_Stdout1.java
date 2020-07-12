package a_introduction;

import java.util.*;

public class Stdin_and_Stdout1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;
        while (cont < 3){
            int a = scan.nextInt();
            System.out.println(a);
            cont++;
        }
    }
}