package _javaStrings.Programs;

public class VotingApplication{
        private final String name, country, age;


        VotingApplication(String Name ,  String Age,String Country)
        {
            this.name = Name.trim().toLowerCase();
            this.age = Age.trim().toLowerCase();
            this.country = Country.trim().toLowerCase();
        }

        public String getName()
        {
            return name;
        }

        public String getAge()
        {
            return age;
        }
        public String getCountry()
        {
            return country;
        }
        public boolean CheckEligiblity()
        {
            int ageInt  = Integer.parseInt(age);
            String validCountry = new String("india");
            if (ageInt >=18  )
            {
                if(getCountry().equals(validCountry))
                {
                    System.out.println("You are eligible");
                    return true;
                }
                else{
                    System.out.println("You are not eligible, your Country is not India");
                    return false;
                }

            }
            else {
//                System.out.println(getCountry());
                if (getCountry().equals(validCountry)==false)
                {
                        System.out.println("You are not eligible , your age is less than 18 and your Country is not India");
                    return  false;
                }
                else {
                    System.out.println("You have to wait " + (18-ageInt) + " years to vote");
                    return  false;
                }


            }




        }
}

