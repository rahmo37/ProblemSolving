package MISCTools.ComparatorVsComparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [Age=" + age + ", name=" + name + "]";
    }
}

public class CustomObjectCompareUsingComparator {
    public static void main(String[] args) {
//
        Comparator<Student> comAge = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.age > s2.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };


        List<Student> studs = new ArrayList<>();
        studs.add(new Student(31, "Navin"));
        studs.add(new Student(21, "Arun"));
        studs.add(new Student(15, "Pravin"));
        studs.add(new Student(26, "Karun"));


        Collections.sort(studs, comAge);

        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
