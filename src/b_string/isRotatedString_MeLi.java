package b_string;
import java.util.*;

public class isRotatedString_MeLi {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        scan.close();
        System.out.println(isRotatedString(a, b));
    }

    // Method that verify to is rotated a string
    static boolean isRotatedString(String a, String b) {
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);
        return Arrays.equals(c,d);
    }
}
