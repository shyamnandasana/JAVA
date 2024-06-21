import java.util.*;
    public class Age1 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("ENter AGe Ram ");
            int a1= sc.nextInt();
            System.out.println("ENter AGe SHyam");
            int a2= sc.nextInt();
            System.out.println("ENter AGe Ajay");
            int a3= sc.nextInt();
    
            if(a1>a2){
                if(a1>a3){
                    System.out.println("A1 is largest");
                }
                else{
                System.out.println("a3 is largest");
            }
            }
            else {
                if(a2>a3){
                    System.out.println("A2 is largest");
                }
                else{
                System.out.println("a3 is largest");
             }
    
            }
    
        }
        
    }
    
    
