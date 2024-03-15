import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String course;
    float marks;

    Student(String name, int rollNo, String course, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. View students");
            System.out.println("3. Delete student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter roll number: ");
                    int rollNo = sc.nextInt();
                    System.out.print("Enter course: ");
                    String course = sc.next();
                    System.out.print("Enter marks: ");
                    float marks = sc.nextFloat();
                    students.add(new Student(name, rollNo, course, marks));
                    break;
                case 2:
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    System.out.print("Enter roll number to delete: ");
                    int rollNoToDelete = sc.nextInt();
                    students.removeIf(student -> student.rollNo == rollNoToDelete);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
