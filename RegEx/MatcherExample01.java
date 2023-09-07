package RegEx;
import java.util.regex.*;

// find the matches
public class MatcherExample01 {

    public static void main(String[] args) {
        Pattern pattern =  Pattern.compile("Java");  //regex
        Matcher matcher=pattern.matcher("JavaLearn");
        System.out.println(matcher.find());
    }
}
