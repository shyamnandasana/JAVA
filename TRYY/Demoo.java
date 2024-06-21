import java.util.Scanner;

class details {
   int accountNo;
   int AccountBalance;
   String userName;
   String Email;
   String accountType;

   details() {
   }

   void getAccountDetails() {
      Scanner var1 = new Scanner(System.in);
      this.accountNo = var1.nextInt();
      this.AccountBalance = var1.nextInt();
      this.userName = var1.next();
      this.Email = var1.next();
      this.accountType = var1.next();
   }

   void displyAccountDetails() {
      System.out.println(this.accountNo);
      System.out.println(this.AccountBalance);
      System.out.println(this.userName);
      System.out.println(this.Email);
      System.out.println(this.accountType);
   }
}
