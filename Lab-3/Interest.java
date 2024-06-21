import java.util.*;
public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter p");
        float p = sc.nextFloat();
        System.out.println("enter r");
        float r = sc.nextFloat();
        System.out.println("enter n");
        float n = sc.nextFloat();

        float result = (p*r*n)/100;
        System.out.println( "Interest is = "+ result);

    }
    
}
