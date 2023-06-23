import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Account class
 */
class Account {
    private int id = 0;
    private double balance = 0;

    /**
     * Default constructor
     */
    public Account() {
    }

    /**
     * Constructor with arguments
     * 
     * @param id      the id of the account holder
     * @param balance the amount of money in the account
     */
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Withdraws a certain amount from the account
     * 
     * @param amount the money to withdraw
     */
    public void withdraw(double amount) {
        // We cannot withdraw more than what is in there
        if (amount > getBalance()) {
            System.out.println("Sorry, insufficient balance");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("WITHDRAWAL SUCCESSFUL\nAMOUNT:"+amount+"\nBALANCE:"+getBalance());
        }
    }

    /**
     * Deposits a certain amount to the account
     * 
     * @param amount the money to deposit
     */
    public void deposit(double amount) {
        // We must deposit a positive value
        if (amount <= 0) {
            System.out.println("Sorry, invalid amount");
        } else {
            setBalance(getBalance() + amount);
            System.out.println("DEPOSIT SUCCESSFUL\nAMOUNT:"+amount+"\nNEW BALANCE:"+getBalance());
        }
    }
}

/**
 * This class demonstrates the functionality of the Account class
 * by creating an Account, withdrawing and depositing
 */
public class AccountDemo {
    public static void main(String[] args) {
        int option = 0;
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        Account myAccount = new Account(1122, 20000);
        System.out.println("WELCOME TO FIRST BANK");
        while (loop) {
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n0. Exit");
            try {
                option = sc.nextInt();
            } catch (InputMismatchException ie) {
                System.err.println("INVALID CHOICE");
                sc=new Scanner(System.in);option=-1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            switch (option) {
                case 1:
                    System.out.println("A/C BALANCE: " + myAccount.getBalance());
                    break;
                case 2:
                    System.out.println("ENTER AMOUNT TO DEPOSIT:");
                    myAccount.deposit(sc.nextDouble());
                    ;
                    break;
                case 3:
                    System.out.println("ENTER AMOUNT TO WITHDRAW:");
                    myAccount.withdraw(sc.nextDouble());
                    ;
                    break;
                case 0:
                    System.out.println("THANK YOU FOR CHOOSING FIRST BANK");
                    loop=false;
                    break;
                default:
                System.err.println("INVALID CHOICE");
                    break;
            }
        }

    }
}