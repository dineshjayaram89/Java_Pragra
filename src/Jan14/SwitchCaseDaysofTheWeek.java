package Jan14;

import java.util.Scanner;

public class SwitchCaseDaysofTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Make a Selection: ");
        System.out.println("Options 1 to 7");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("It's a Sunday!");
                break;
            case 2:
                System.out.println("It's Monday, Welcome to Hell!");
                break;
            case 3:
                System.out.println("It's a Tuesday, almost mid of the week");
                break;
            case 4:
                System.out.println("It's Wednesday, 2 more days to go");
                break;
            case 5:
                System.out.println("It's Thursday, 1 more day to weekend");
                break;
            case 6:
                System.out.println("It's Friday, Yay! We we almost done");
                break;
            case 7:
                System.out.println("It's a Saturday!");
                break;
            default:
                System.out.println("Invalid selection, only select 1 to 7");
        }
    }
}
