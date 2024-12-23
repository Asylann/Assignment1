import java.util.ArrayList;

public class Student extends Person{
    private int studentID;
    private static int IDcounter = 1;
    private ArrayList<Integer> grades = new ArrayList<>();
    public Student(String name, String surname, int age,String gender) {
        super(name, surname, age, gender);
        this.studentID = IDcounter++;
    }
    public void addGrade(int grade){
        if(grade>=0 && grade<=100) {
            grades.add(grade);
        }
    }
    public float calculateGPA(){
        float sum = 0;
        for (int grade:grades){
            sum+=grade;
        }
        return sum/grades.size();
    }

    @Override
    public String toString() {
        return super.toString()+" I am a student with ID "+studentID+", and My GPA is "+calculateGPA();
    }
}
