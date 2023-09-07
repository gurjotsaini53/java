package RegEx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Example05 {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("University",Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("Chitkara UNIVERSITy");
        Matcher matcher = pattern.matcher("UNIVERSITy Chitkara UNIVERSITy Chitkara");

//        boolean matchFound = matcher.find();
//        if (matchFound)
//        {
//            System.out.println("Match found from " + matcher.start() + " and ends at "+ (matcher.end()-1));
//        }
//        else {
//            System.out.println("Match not found");
//        }

        while(matcher.find())
        {
            System.out.println("Match found from " + matcher.start() + " and ends at "+ (matcher.end()-1));
        }

    }
}
