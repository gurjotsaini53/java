package _JavaArray;
import java.util.Arrays;
import java.util.Scanner;
public class ProjectCollectionDetails2 {

    public static  void main(String [] args)
    {
        Scanner inp = new Scanner(System.in);
        String[] employeeRequiredInfo = {"Id","Name", "Desination","Team","Project","Location"};
        String employeeInputData;
        String[] employeeInfo = new String[6];
        String[] employeeCompleteDetails = new String[6];
        String[] employee = new String[8];


        // for 2 employee only

        for (int i=0;i<2;i++)
        {
            for (int j=0;j<6;j++)
            {
                // taking inp
                System.out.print(employeeRequiredInfo[j] + " : ");
                employeeInputData = inp.nextLine();
                employeeInfo[j]=employeeInputData;

            }

            // printing
            for (int j=0;j<6;j++)
            {
                // taking inp

                employeeCompleteDetails[j]=employeeRequiredInfo[j] + " : " + employeeInfo[j] + ";";
                System.out.println(employeeCompleteDetails[j]);

            }
            // saving one entity at one index of employee
            employee[i] = employeeCompleteDetails.toString();
            employee[i]= Arrays.toString(employeeCompleteDetails);

        }
        for (int i=0;i<2;i++)
        {
            System.out.print("Employee Details - " + i + "\n");
            System.out.println(employee[i]);
        }



    }
}
