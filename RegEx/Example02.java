package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example02 {

    public static void main(String[] args) {
        Pattern pattern =  Pattern.compile("Java");  //regex
//        Matcher matcher=pattern.matcher("JavaJavaJava");
//
//        Matcher matcher=pattern.matcher("Java Java Java");

        Matcher matcher=pattern.matcher("Java Kava Java");

        int matches = 0;

        while (matcher.find()) {

            matches++;
        }

        System.out.println(matches);
    }
}
