package Jan14;

import java.util.Scanner;

public class IVRApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Welcome to the IVR application");
        System.out.println("Press 1 for English and 2 for French");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Press 1 for Mobile, 2 for Internet, 3 for TV, 4 for Exit");
            int a1 = sc.nextInt();
            if (a1 == 1) {
                System.out.println("Press 1. Tech support, 2. Billing, 3. exit");
                int a11 = sc.nextInt();
                switch (a11) {
                    case 1:
                        System.out.println("Welcome to Mobile tech support");
                        break;
                    case 2:
                        System.out.println("Welcome to Mobile billing");
                        break;
                    case 3:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
            } else if (a1 == 2) {
                System.out.println("Press 1. Tech support, 2. Billing, 3. exit");
                int a12 = sc.nextInt();
                switch (a12) {
                    case 1:
                        System.out.println("Welcome to tech Internet support");
                        break;
                    case 2:
                        System.out.println("Welcome to Internet billing");
                        break;
                    case 3:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
            } else if (a1 == 3) {
                System.out.println("Press 1. Tech support, 2. Billing, 3. exit");
                int a13 = sc.nextInt();
                switch (a13) {
                    case 1:
                        System.out.println("Welcome to TV tech support");
                        break;
                    case 2:
                        System.out.println("Welcome to TV billing");
                        break;
                    case 3:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
            }
            else {
                System.out.println("Exit");
            }
        } else if (a == 2) {
            System.out.println("Press 1 for Mobile, 2 for Internet, 3 for TV, 4 for Exit");
            int a2 = sc.nextInt();
            if (a2 == 1) {
                System.out.println("Press 1. Tech support, 2. Billing, 3. exit");
                int a21 = sc.nextInt();
                switch (a21) {
                    case 1:
                        System.out.println("Welcome to French Mobile tech support");
                        break;
                    case 2:
                        System.out.println("Welcome to French Mobile billing");
                        break;
                    case 3:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
            } else if (a2 == 2) {
                System.out.println("Press 1. Tech support, 2. Billing, 3. exit");
                int a22 = sc.nextInt();
                switch (a22) {
                    case 1:
                        System.out.println("Welcome to French Internet tech support");
                        break;
                    case 2:
                        System.out.println("Welcome to French Internet billing");
                        break;
                    case 3:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
            } else if (a2 == 3) {
                System.out.println("Press 1. Tech support, 2. Billing, 3. exit");
                int a23 = sc.nextInt();
                switch (a23) {
                    case 1:
                        System.out.println("Welcome to French TV tech support");
                        break;
                    case 2:
                        System.out.println("Welcome to French TV billing");
                        break;
                    case 3:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
            }
            else {
                System.out.println("Exit");
            }


        }
        else {
            System.out.println("Invalid Selection. Please only press 1 or 2");
        }
    }
}