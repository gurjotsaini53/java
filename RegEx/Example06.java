package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example06 {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Un*",Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("Chitkara UNIVERSITy");
        Matcher matcher = pattern.matcher("UNIVERSITy Chitkara UNIVERSITy Chitkara");



        while(matcher.find())
        {
            System.out.println("Match found from " + matcher.start() + " and ends at "+ (matcher.end()-1));
        }
    }
}
