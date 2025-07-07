public class Student {

    private int rollno;
    private String name;
    final private double[] marks = new double[3];
    private char grade;

    public void setRollno(int rollno){this.rollno = rollno;}
    public void setName(String name){this.name = name;}
    public void setMarks(double[] marks){
        int count = 0;
        for(double m : marks) {
            this.marks[count] = m;
            count++;
        }
    }
    public void setGrade(double[] marks){
        double obtained  = marks[0] + marks[1] + marks[2];
        double percentage = obtained * 100/ 300;

        if(percentage < 40){
            grade = 'F';
        }
        else if(percentage >= 40 && percentage <= 49){
            grade = 'E';
        }
        else if(percentage >= 50 && percentage <= 59){
            grade = 'D';
        }
        else if(percentage >= 60 && percentage <= 69){
            grade = 'C';
        }
        else if(percentage >= 70 && percentage <= 79){
            grade = 'B';
        }
        else if(percentage >= 80 && percentage <= 100){
            grade = 'A';
        }

    }
    public int getRollno(){return rollno;}
    public String getName(){return name;}
    public char getGrade(){return grade;}
    public double getAverage(){
        double average = 0;
        for(double m : marks){
            average += m;
        }
        return average/marks.length;}
}
