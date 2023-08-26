package _JavaArray;
import java.util.*;
public class ProjectCollectionDetails {

    public static void main(String [] args)
    {
        Scanner inp = new Scanner(System.in);
        String[] empReqInfo = {"Id","Name" ,"Team", "Project"};
        String[] empInfo = new String[4] ;

        for(int i=0;i<4;i++)
        {
            System.out.print(empReqInfo[i] + " : ");
            empInfo[i] = inp.nextLine();
        } for(int i=0;i<4;i++)
        {
            System.out.println(empReqInfo[i] + " : " + empInfo[i]);

        }


    }
}
