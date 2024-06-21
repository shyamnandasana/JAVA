import java.util.*;
public class Age {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter AGe Ram ");
        int a1= sc.nextInt();
        System.out.println("ENter AGe SHyam");
        int a2= sc.nextInt();
        System.out.println("ENter AGe Ajay");
        int a3= sc.nextInt();

        if(a1>a2 && a1>a3){
            System.out.println("RAm is biggger than shyam and ajay");
        }
        else if(a2>a1 && a2>a3){
            System.out.println("Shyam is biggger than ram and ajay");
        }
        else if(a3>a1 && a3>a2){
            System.out.println("AJay is biig than shyam and ram");
        }
        else if(a1==a2 && a2==a3 && a3==a1){
            System.out.println("SAme age");

        }

    }
    
}
