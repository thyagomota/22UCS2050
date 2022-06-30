import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeLineDriver {

    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        // events descriptions and dates
        String title = "Dr. Martin Luther King Jr. Timeline";
        String s1 = "graduated from Morehouse College";     Date d1 = df.parse("05/30/1948");
        String s2 = "born in Atlanta, GA";                  Date d2 = df.parse("01/15/1929");
        String s3 = "shot and killed in Memphis, TN";       Date d3 = df.parse("04/04/1968");
        String s4 = "Montgomery bus boycott";               Date d4 = df.parse("05/12/1955");
        String s5 = "married Coretta Scott";                Date d5 = df.parse("06/18/1953");
        String s6 = "\"I Have a Dream\" speech";            Date d6 = df.parse("08/28/1963");
        String s7 = "awarded the Nobel Peace Prize";        Date d7 = df.parse("01/01/1964");

        // TODO (4 points): create a timeline with the title and events above, making sure to add them in the given order 1-7
        

        // TODO (1 point): display the timeline
        
    }
}
