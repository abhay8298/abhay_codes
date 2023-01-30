import java.util.*;
public class exam{
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("John", 1),
            new Student("Jane", 5),
            new Student("Jim", 2)
        };
        
        Arrays.sort(students, (a, b) -> Integer.compare(a.getRollNumber(), b.getRollNumber()));
        
        for (Student student : students) {
            System.out.println(student.getName() + " (" + student.getRollNumber() + ")");
        }
        }
        
    }


class Student {
    private String name;
    private int rollNumber;
    
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}


