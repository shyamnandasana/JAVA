import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int numOfDigts=0;
        int originaln;
        while(n>0){
            n=n/10;
            numOfDigts++;

        }
        System.out.println("number of digits "+ originaln +"=   " numOfDigts);
    }
}
                                                                                                   