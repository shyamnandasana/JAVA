import java.util.*;
public class Lab_61 {
    public class student{
        int id_no;
        int no_of_subjects_registered[];
        String subject_code[];
        int subject_credits[];
        String grade_obtained[];
        double spi;

        public student(int id_no,int no_of_subjects_registered){
            this.id_no=id_no;
            this.no_of_subjects_registered=no_of_subjects_registered[];
            Scanner sc = new Scanner(System.in);
            System.out.println("enter id number");
            this.id_no=sc.nextInt();
            System.out.println("enter the submit subject");
            this.no_of_subjects_registered[1]=sc.nextInt();
            System.out.println("enter the subject code");
            this.subject_code[1]=sc.nextLine();
            System.out.println("enter the gredobtained:");
            this.grade_obtained[1]=sc.next();
            System.out.println("enter the spi");
            this.spi=sc.nextDouble();
         }

    }






    public static void main(String[]args){
        
     }   
}
