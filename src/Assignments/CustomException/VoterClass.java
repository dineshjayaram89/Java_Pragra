package Assignments.CustomException;

public class VoterClass {
    int age;
    public void setAge(int age) throws InvalidAgeException {

        if(age < 18){
                throw new InvalidAgeException("Age must be 18 or over to vote ");
        }
        this.age = age;

    }

    public void casVote(){
        System.out.println("Successfully casted the vote");
    }
}
