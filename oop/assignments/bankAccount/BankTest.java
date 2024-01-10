public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts

        BankAccount account1 = new BankAccount(1000, 2000);

        System.out.println("Account1 Checking Balance:" + account1.getChecking());
        System.out.println("Account1 Savings Balance:" + account1.getSavings());

        BankAccount account2 = new BankAccount(5000, 2500);
        
        System.out.println("Account2 Checking Balance:" + account2.getChecking());
        System.out.println("Account2 Savings Balance:" + account2.getSavings());
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        account1.checkingDeposit(1500);
        System.out.println("Account1 Checking Balance:" + account1.getChecking());
        System.out.println("Account1 Savings Balance:" + account1.getSavings());


        account2.checkingDeposit(2500);
        System.out.println("Account2 Checking Balance:" + account2.getChecking());
        System.out.println("Account2 Savings Balance:" + account2.getSavings());


        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        
        account1.withdrawSavings(2500);
        System.out.println("Account1 Checking Balance:" + account1.getChecking());
        System.out.println("Account1 Savings Balance:" + account1.getSavings());

        account2.withdrawSavings(2500);
        System.out.println("Account2 Checking Balance:" + account2.getChecking());
        System.out.println("Account2 Savings Balance:" + account2.getSavings());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(BankAccount.getAccounts());
        System.out.println(BankAccount.getTotalMoney());
    }
}
