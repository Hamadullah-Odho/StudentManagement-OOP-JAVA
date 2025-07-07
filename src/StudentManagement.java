
import java.util.*;
public class StudentManagement {
    Scanner scan = new Scanner(System.in);
    Student[] student = new Student[100];
    private int stdcount = 0;

    public void addStudent(){

        try {
            System.out.print("Enter Student Name :");
            String name = scan.nextLine();
            int rollno;
            while (true) {
                System.out.print("Enter Student Roll No :");
                rollno = Integer.parseInt(scan.nextLine());
                int count = 0;
                for(Student s : student){

                    if(s == null){
                        count++;
                        continue;
                    }
                    if(rollno == s.getRollno()){
                        System.out.println("Roll No Already Exist");
                        break;
                    }
                    count++;

                }
                if(count == student.length){
                    break;
                }
            }

            double[] marks = new double[3];
            String[] subject = {"Math","English","Urdu"};

            for(int i = 0; i < marks.length; i++){
                System.out.print("Enter "+ subject[i] + " Marks :");
                marks[i] = Integer.parseInt(scan.nextLine());

            }
            student[stdcount] = new Student();
            student[stdcount].setName(name);
            student[stdcount].setRollno(rollno);
            student[stdcount].setMarks(marks);
            student[stdcount].setGrade(marks);
            stdcount++;
            System.out.println("Student Added Successfully");

        }
        catch (NumberFormatException e){
            System.out.println("Error occurred > Non- numeric value found");
            //student[stdcount] = null;
        }

    }

    public void allStudent(){

        boolean empty = true;
        for(Student s : student){

            if(s != null){
                empty = false;
                Display.display(s);
                System.out.println();
            }
        }
        if(empty){
            System.out.println("Students Not Added\n");
        }
    }
    public void search(){
        try {
            System.out.print("Enter Roll No :");
            int rollno = Integer.parseInt(scan.nextLine());
            boolean notFound = true;
            for (Student s : student) {

                if (s == null) {
                    continue;
                }
                if (rollno == s.getRollno()) {
                    Display.display(s);
                    System.out.println();
                    notFound = false;
                    break;
                }

            }
            if(notFound){
                System.out.println("Student Not Found\n");
            }
        }
        catch (NumberFormatException e){
            System.out.println("Roll no cannot be non-numeric\n");
        }
    }
    public void delete(){
        try {
            System.out.print("Enter Roll No :");
            int rollno = Integer.parseInt(scan.nextLine());
            int count = 0;
            boolean notFound = true;
            for (Student s : student) {

                if(s == null){
                    count++;
                    continue;
                }
                if (rollno == s.getRollno()) {
                    Display.display(s);
                    student[count] = null;
                    System.out.println("Student Removed Successfully \n");
                    notFound = false;
                    break;
                }
                count++;
            }
            if(notFound){
                System.out.println("Student Not Found\n");
            }
        }
        catch (NumberFormatException e){
            System.out.println("Roll no cannot be non-numeric\n");
        }
        catch (Exception e){
            System.out.println("Unexpected error occurred\n");
        }
    }
}
