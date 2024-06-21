import java.util.*;
public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter size");
        int size=sc.nextInt();
        int number[]=new int[size];
        boolean flag = false;
        for(int i=0;i<size;i++){
            System.out.println("eneter value ");
              number [i]=sc.nextInt();
        }
         for(int i=0;i<number.length;i++){
            for(int j=i+1;j<=number.length;j++){
                if(number[i]==number[j]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;                
            }
        }
        if (flag) {
            System.out.println("duplicate number");
            
        }
        
        }
    }
    
