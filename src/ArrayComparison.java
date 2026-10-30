import java.util.ArrayList;

public class ArrayComparison {
    public static void main(String[] args) {

        System.out.println("Arrays vs Arrays List Comparison");
        System.out.println("Student Enrollment Program");

        //Array for fixed number of students
        String[] students = {"Matt", "Mike", "John"};

        System.out.println("Students enrolled in the class:");

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

        //ArrayList that changes with enrollment
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Sarah");
        studentList.add("Sydne");
        studentList.add("Jazmin");

        System.out.println("Students in the ArrayList");
        System.out.println(studentList);;

        //add additional Student
        studentList.add("Jacob");

        System.out.println("After Jacob enrolls:");
        System.out.println(studentList);

        //Student removed from class
        studentList.remove("Sarah");
        System.out.println(studentList);

    }

}
