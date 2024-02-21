package Assignments.CustomException;

public class VoterDemo {
    public static void main(String[] args) {
        VoterClass v = new VoterClass();
        try {
            System.out.println("Voter A, Age : 15 ");
            v.setAge(15);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nVoter B, Age : 25 ");
            v.setAge(25);
            v.casVote();
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("\nThanks of using the voting system");
        }
    }
}
