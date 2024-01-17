package Jan16;

import java.util.Scanner;

public class LotterySystemForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int points = 0;
        System.out.println("You have 100 chances to win 100 Million. \nKeep entering numbers till you win or you use up the 100 chances");
        for ( int i = 1; i <= 100; i++ ){
            int x = sc.nextInt();
            if(x % 7 == 0){
                System.out.println("You got 7 points");
                points = points + 7;
                continue;
            } else if (x % 5 == 0) {
                System.out.println("You got 5 points");
                points = points + 5;
                continue;
            } else if ( x ==6) {
                System.out.println("You won the Jackpot of 100M");
                break;
            }
        }
        System.out.println("Your total points: "+points);
    }
}
