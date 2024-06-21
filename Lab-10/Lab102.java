import java.util.*;
import java.io.*;
public class Lab102{
    public static void main(String[] args) {
        try{
            File f = new File("File.txt");
            BufferedReader br= new  BufferedReader (new FileReader(f));
            Scanner sc=new Scanner(f);
            System.out.println(sc.nextLine());
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
}