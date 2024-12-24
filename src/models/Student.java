package models;

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
        float average = sum/grades.size();
        if(average>=95){
            return 4f;
        }else if(average>=90){
            return 3.67f;
        }else if(average>=85){
            return 3.33f;
        }else if(average>=80){
            return 3f;
        }else if(average>=75){
            return 2.67f;
        }else if(average>=70){
            return 2.33f;
        }else if(average>=65){
            return 2f;
        }else if(average>=60){
            return 1.67f;
        }else if(average>=55){
            return 1.33f;
        }else if(average>=50){
            return 1f;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString()+" I am a student with ID "+studentID+", and My GPA is "+calculateGPA();
    }
}
