import java.util.Scanner;
public class Lab62 {
    public static void main(String[] args) {
        Scanner sc= new Scanner();
        Book b = new Book();
        Book_publication b1=new Book_publication();
        Paper_publication b2=new Paper_publication();
        b.disply();
        System.out.println("enter paper or book");
        String x=sc.next();
    }

    }
            class Book{
            String authername;
            public Book(String authorname){
               this.authername=authorname;
            }
            public void disply(){
                System.out.println();
            }
         }
        class Book_publication extends Book{
              String title;

        }
        class Paper_publication extends Book{
              String title;
        }


        