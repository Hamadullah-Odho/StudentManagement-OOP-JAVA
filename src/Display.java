public class Display {

    private Display(){}
    public static void display(Student s){

        System.out.println("Student Name :" + s.getName());
        System.out.println("> Roll No :" + s.getRollno());
        System.out.println("> Average Marks :" + (int)(s.getAverage()));
        System.out.println("> Grade : " + s.getGrade());
    }
}
