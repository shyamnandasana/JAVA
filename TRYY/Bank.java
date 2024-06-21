import java.util.Scanner;
public class Bank{
    public static void main(String[]args){
    details d1= new details();
    d1.getAccountDetails();
     details d2= new details();
    d2.getAccountDetails();
    d1.displyAccountDetails();
    d2.displyAccountDetails();

    }
    }
class details{
    int accountNo;
    int AccountBalance;
    String userName;
    String Email;
    String accountType;
    
    void getAccountDetails(){
    Scanner sc= new Scanner(System.in);
    this.accountNo= sc.nextInt();
    this.AccountBalance= sc.nextInt();
    this.userName=sc.next();
    this.Email=sc.next();
    this.accountType=sc.next();
   }
    void displyAccountDetails(){
        System.out.println(this.accountNo);
        System.out.println(this.AccountBalance);
        System.out.println(this.userName);
        System.out.println(this.Email);
        System.out.println(this.accountType);

    }
}
    