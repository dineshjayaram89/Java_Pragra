package march05.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class TestMain {
        public static void main(String[] args) {

            List<Student> student = new ArrayList<>();
            student.add(new Student(103, "A Peter"));
            student.add(new Student(101, "C Parker"));
            student.add(new Student(101, "H Smith"));
            student.add(new Student(105, "B John"));

            Collections.sort(student);
            System.out.println(student);


            //  compare the strings
        }
    }
    class Student implements Comparable<Student>{
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        @Override
        public int compareTo(Student student) {

            return this.name.compareTo(student.name);
        }
        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

