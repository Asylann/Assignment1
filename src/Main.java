import models.School;
import models.Student;
import models.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        File Sfile = new File("src/input/students.txt");
        Scanner Sscan = new Scanner(Sfile);
        File Tfile = new File("src/input/teachers.txt");
        Scanner Tscan = new Scanner(Tfile);
        School ARTU = new School();
        while (Sscan.hasNext()){
            Student stud = new Student(Sscan.next(),Sscan.next(),
                    Sscan.nextInt(),Sscan.next());
            while (Sscan.hasNextInt()){
                stud.addGrade(Sscan.nextInt());
            }
            ARTU.addMember(stud);
        }
        while (Tscan.hasNext()){
            Teacher teach = new Teacher(Tscan.next(),Tscan.next(),
                    Tscan.nextInt(),Tscan.next(),Tscan.next(),Tscan.nextInt(),Tscan.nextInt());
            ARTU.addMember(teach);
        }
        ARTU.sort();
        ARTU.updateSalary();
        System.out.println(ARTU.toString());
    }
}