public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts ++;
        totalMoney += (checkingBalance + savingsBalance);
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    

    public double getChecking(){
        return checkingBalance;
    }

    public double getSavings(){
        return savingsBalance;
    }

    public static int getAccounts(){
        System.out.println("Number of accounts in this bank:");
        return accounts;
    }

    public static double getTotalMoney(){
        // System.out.println("Checking account balance: " + getChecking());
        // System.out.println("Savings account balance: " + getSavings());
        System.out.println("The total balance of the Bank is : ");
        return totalMoney;
    }

    public void setTotalMoney(double totalMoneyInParams){
        totalMoney = totalMoneyInParams;
    }


    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account

    public void checkingDeposit(double moneyIn){
        checkingBalance += moneyIn;
        totalMoney += moneyIn;
        System.out.println("You made a deposit in you checking account for: $" + moneyIn);
    }
    public void savingDeposit(double moneyIn){
        savingsBalance += moneyIn;
        totalMoney += moneyIn;
        System.out.println("You made a deposit in you savings account for: $" + moneyIn);
    }

    public boolean withdrawChecking(double moneyOut) {
        if (checkingBalance >= moneyOut) {
            checkingBalance -= moneyOut;
            totalMoney -= moneyOut;
            System.out.println("Requested withdrawal from your Checking Account for " + moneyOut);
            return true; // Withdrawal successful
        }
        System.out.println("Your request was denied for insufficient funds");
        return false; // Insufficient funds
    }
    public boolean withdrawSavings(double moneyOut) {
        if (savingsBalance >= moneyOut) {
            savingsBalance -= moneyOut;
            totalMoney -= moneyOut;
            System.out.println("Requested withdrawal from your Savings Account for " + moneyOut);
            return true; // Withdrawal successful
        }
        System.out.println("Requested withdrawal from your Savings Account for " + moneyOut);
        System.out.println("Your request was denied for insufficient funds");
        return false; // Insufficient funds
    }
}
