package b_string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tag_Content_Extractor{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            boolean matchFound = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher match = pattern.matcher(line);
            while(match.find()){
                System.out.println(match.group(2));
                matchFound=true;
            }
            if(!matchFound) System.out.println("None");
            /* ---------------------------------------------------- */

            testCases--;
        }
        in.close();
    }
}


/*
- Sample Input:
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>

- Sample Output:
Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush
 */

