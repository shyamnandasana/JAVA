import java.util.*;
import java.io.*;
public class Labb {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter file directory");
        String filename=sc.nextLine();
        File f=new File(filename);
        if(f.exists()){
            if(f.isFile()){
                System.out.println("File size = "+f.Length());
            }
            else{
                System.out.println("Folder ;");
                String[]filenames=f.list();
                  for(int i=0;i<filenames.length;i++){
                    System.out.println(filenames[i]);
                 }

                }
            }
        }
    }
    

