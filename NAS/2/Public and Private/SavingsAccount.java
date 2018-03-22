public class SavingsAccount {

   // class properties
   private int balance;

   // class constructors
   public SavingsAccount() {
      balance = 0;
   }

   public SavingsAccount(int initialBalance) {
      balance = initialBalance;
   }
   // class methods
   // greets user
   public void greet() {
      System.out.println("Welcome to the best bank ever!");
   }

   // deposit cash
   public void deposit(int howMuch) {
      if (balance >= 0) {
         balance += howMuch;
      }
      else {
         System.out.println("Error: Negative number");
      }
   }

   // withdraw cash
   public void withdraw(int howMuch) {
      if (balance >= 0) {
         balance -= howMuch;
      }
      else {
         System.out.println("Error: Negative number");
      }
   }

   // displays balance
   public void showBalance() {
      System.out.println("Balance: " + String.valueOf(balance));
   }
}