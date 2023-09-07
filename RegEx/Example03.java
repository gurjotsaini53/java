package RegEx;

import javafx.scene.shape.PathElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example03 {


    public int runTest(String regEx,String text)
    {
        Pattern pattern = Pattern.compile(regEx) ;
        Matcher matcher = pattern.matcher(text);

        int matches = 0;

        while(matcher.find())
        {
            matches++;
        }
        return matches;


    }

    public static void main(String[] args) {
        Example03 obj = new Example03();
        int matches = obj.runTest("."," ");
        System.out.println(matches);
    }
}
