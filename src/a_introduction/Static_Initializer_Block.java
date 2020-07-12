package a_introduction;

import java.util.*;

public class Static_Initializer_Block {

    private static int B,H;
    private static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        try {
            flag = ValidateDimensions(B) && ValidateDimensions(H);
        }catch (Exception e){
            System.out.print(e.toString());
        }
    }

    private static boolean ValidateDimensions(int value) throws Exception {
        if(value <= 0 || value > 100) throw new Exception("Breadth and height must be positive");
        return true;
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}//end of class