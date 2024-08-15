package Student;

import java.util.List;
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("bikash", 1, 27, 99);
        Student s2 = new Student("subham", 62, 24, 34);
        Student s3 = new Student("akash", 3, 26, 56);
        Student s4 = new Student("naveen", 4, 27, 67);
        Student s5 = new Student("ashutosh", 5, 27, 95);
        Student s6 = new Student("nimo", 6, 27, 93);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        //print though for loop
        // for (Student s : studentList) {
        // System.out.println(s.toString());
        // }

        // print though itterator
        // Iterator<Student> it = studentList.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());

        // }

        // print via lemda function
        // studentList.forEach(student -> System.out.println(student));

        // print the student list having more than 80 marks

        studentList.stream().filter(student1 -> student1.getMarks() > 80).forEach(student2 -> System.out.println(student2));

    }

}
