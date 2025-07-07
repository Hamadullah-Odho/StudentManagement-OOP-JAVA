
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        StudentManagement studentManagement = new StudentManagement();

        while(run){
            System.out.println("1. Add new Student");
            System.out.println("2. Show All Student");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Delete Student by Roll No");
            System.out.println("5. Exit");

            try{
                System.out.print("Enter selection :");
                int select = Integer.parseInt(scan.nextLine());

                switch (select){
                    case 1:
                        System.out.println();
                        studentManagement.addStudent();
                        break;
                    case 2:
                        System.out.println();
                        studentManagement.allStudent();
                        break;
                    case 3:
                        System.out.println();
                        studentManagement.search();
                        break;
                    case 4:
                        System.out.println();
                        studentManagement.delete();
                        break;
                    case 5:
                        run = false; break;
                    default:
                        System.out.println("Enter Valid Selection");
                }
            }
            catch (NumberFormatException e){
                System.out.println("selection cannot be non - numeric");
            }
        }
    }
}
