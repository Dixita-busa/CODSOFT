import java.util.*;

public class task3 {
    static int tot = 0;
    static Scanner sc = new Scanner(System.in); // Declare Scanner as a static variable
    
    public static void main(String[] args) {
        System.out.println("Welcome to Our ATM!!!  \nInsert Your ATM Card  \nMake the Transaction Safe!!");
        System.out.println("1] DEPOSIT            //Deposit More than Rs.500   \n2] WITHDRAWAL         //Withdrawal Minimum Rs.500");
        System.out.println("3] CHECK BALANCE      \n4] EXIT");
        System.out.println();
        
        boolean last = true;
        while (last) {
            System.out.print("Enter the Number to choose the option:");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdrawl();
                    break;
                case 3:
                    System.out.println("The Balance Amount is: " + check_balance());
                    break;
                case 4:
                    last = false;
                    break;
            }
        }
        
        System.out.println("Thank You!!");
        sc.close(); // Close the Scanner after its use
    }
    
    public static void deposit() {
        System.out.print("Enter the amount for deposit:");
        int dep = sc.nextInt();
        if (dep < 500) {
            System.out.println("Sorry!! You need to deposit more than Rs.500!!");
        } else {
            tot += dep;
        }
    }
    
    public static void withdrawl() {
        System.out.print("Enter the amount for withdrawal:");
        int withdrawAmount = sc.nextInt();
        int currentBalance = check_balance();
        
        if (withdrawAmount < 500) {
            System.out.println("Sorry!! Minimum withdrawal amount is Rs.500.");
        } else if (withdrawAmount > currentBalance) {
            System.out.println("Your withdrawal amount exceeds the available balance!!");
        } else {
            tot -= withdrawAmount;
            System.out.println("Withdrawal Successful.");
            if (tot < 500) {
                System.out.println("Your balance is below minimum limit!!");
            }
        }
    }
    
    public static int check_balance() {
        return tot;
    }
}
