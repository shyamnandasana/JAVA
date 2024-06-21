import java.util.*;
import java.io.*;
public class Lab{
    public static void main(String[] args) {
        try{
            File f = new File("File.txt");
            Scanner sc=new Scanner(f);
            System.out.println(sc.nextLine());
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
}