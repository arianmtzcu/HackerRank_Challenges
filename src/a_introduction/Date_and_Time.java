package a_introduction;

import java.io.*;
import java.text.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    /*Sample Input

    08 05 2015
    Sample Output

    WEDNESDAY
    Explanation

    The day on August th  was WEDNESDAY.*/

    public static String findDay(int month, int day, int year) throws IOException {
        try{
            //String inputDateStr= month+"/"+day+"/"+year;
            String inputDateStr = String.format("%s/%s/%s", month, day, year);
            Date inputDate = new SimpleDateFormat("MM/dd/yyyy").parse(inputDateStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(inputDate);
            return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        } catch (ParseException e) {
            throw new IOException(e.getMessage());
        }

        /*LocalDate ld = new LocalDate.of(year,month,day);
        return ld.getDayOfWeek().name();*/
    }

}

public class Date_and_Time {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);*/
        /* ------ fake code ------ */
        int month = 8;
        int day = 5;
        int year = 2015;
        /* ----------------------- */
        String res = Result.findDay(month, day, year);
        System.out.println(res);
        /*bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
