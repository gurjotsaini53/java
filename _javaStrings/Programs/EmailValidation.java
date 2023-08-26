package _javaStrings.Programs;

class Email{
    private final  String user_email;
    Email(String email)
    {
        this.user_email=email.trim().toLowerCase();
    }

    public String getEmail(){
        return user_email;
    }

    public boolean CheckValidity() {
        char[] email = getEmail().toCharArray();
        boolean flagForAtTheRate = false;
        boolean flagForDot = false;
        int atTheRateIndex = 0;
        for (int i = 0; i < email.length; i++) {
            if (email[i] == '@') {
                flagForAtTheRate = true;
                atTheRateIndex = i;
                break;
            }
        }

        for (int i=atTheRateIndex+1;i<email.length ;i++)
        {
            if (email[i]=='.')
            {
                flagForDot=true;
            }
        }

        if (flagForAtTheRate && flagForDot)
        {
            System.out.println("Valid");
            return true;
        }
        else {
            System.out.println("Not Valid");
            return false;
        }
    }

}

public class EmailValidation {





    public static void main(String[] args) {
        Email UserEmail1 = new Email("Gurjot1078.be21@chitkarauniversity.edu.in");
        System.out.println(UserEmail1.CheckValidity());

    }
}
