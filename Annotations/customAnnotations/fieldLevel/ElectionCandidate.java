package Annotations.customAnnotations.fieldLevel;

public class ElectionCandidate {
    private String candidateName ;
    private int candidateAge ;
    public ElectionCandidate(String name , int age)
    {
        System.out.println("Election Candidate");
        this.candidateAge=age;
        this.candidateName=name;
    }
}
