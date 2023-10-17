import java.util.Scanner;

class ATM {
    public static void main(String[] args) {

        String s1 = "1234";
        String s2 = "1234";

        int pin1 = 2244, pin2, i = 0;
        System.out.println("Enter ypur pin:");
        Scanner sc = new Scanner(System.in);
        pin2 = sc.nextInt();

        while (pin1 != pin2) {
            if (pin1 != pin2) {
                System.out.println("Invalid pin");
                pin2 = sc.nextInt();
            }
            i++;
            System.out.println(i);
            if (i >= 3)
                System.exit(0);
        }

        int balance = 10000, withdraw, deposit;

        Scanner s = new Scanner(System.in);
        Scanner p1 = new Scanner(System.in);
        System.out.println("Enter Password:");
        s2 = p1.nextLine();

        if (s1.equals(s2)) {
            while (true) {
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for EXIT");
                System.out.print("Choose the operation you want to perform:");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter money to be withdrawn:");

                        withdraw = sc.nextInt();

                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                            System.out.println("Your Remaining Balance is: " + balance);
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println(" ");
                        break;

                    case 2:
                        System.out.println("Enter money to be deposit:");

                        deposit = sc.nextInt();

                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully depsited");
                        System.out.println("Your Balance is: " + deposit);
                        System.out.println(" ");
                        break;

                    case 3:

                        System.out.println("Balance : " + balance);
                        System.out.println(" ");
                        break;

                    case 4:

                        System.exit(0);
                }
            }
        } else {
            System.out.println("Incorrect Password: ");
        }
    }
}