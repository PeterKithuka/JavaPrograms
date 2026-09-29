import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double balance = 10.00;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("*****************");
            System.out.println("BANKING PROGRAMS");
            System.out.println("*****************");
            System.out.println("1.Show my balance ");
            System.out.println("2. Deposit");
            System.out.println("3.Withdrawal");
            System.out.println("4. Exit");

            System.out.println("Enter your choice(1-4): ");
            choice = s.nextInt();

            switch (choice){
                case 1 -> showbalance(balance);
                case 2 -> balance += deposit(s);
                case 3 ->balance -= withdraw(s,balance);
                case 4 -> isRunning = false;
                default-> System.out.println("INVALID CHOICE");
            }


        }
        System.out.println("****************");
        System.out.println("Thank you welcome back again.");
        System.out.println("****************");



        s.close();
    }
    static void showbalance(double balance){
        System.out.printf("$ %f \n",balance);
    }
    static double deposit(Scanner s){
        double amount;

        System.out.println("Enter an amount to be deposited: ");
        amount = s.nextDouble();

        if(amount < 0) {
            System.out.println("Amount can`t be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

    static double withdraw(Scanner s,double balance){
        double amount;

        System.out.println("Enter the amount you want to withdraw:");
        amount = s.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS!");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Can`t transact negative.");
            return 0;
        }
        else {
            return amount;
        }
    }
}


