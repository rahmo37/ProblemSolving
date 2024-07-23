package MISCTools.ComparatorVsComparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//In this file our Worker class is implementing the Comparable interface and
//Implementing the compareTo method
class Worker implements Comparable<Worker> {
    int age;
    String name;

    public Worker(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Worker [Age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Worker that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }

    ;
}

public class ImplementingComparable {
    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker(31, "Navin"));
        workers.add(new Worker(21, "Arun"));
        workers.add(new Worker(15, "Pravin"));
        workers.add(new Worker(26, "Karun"));


        Collections.sort(workers);

        for (Worker w : workers) {
            System.out.println(w);
        }
    }
}
