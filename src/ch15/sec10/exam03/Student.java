package ch15.sec10.exam03;

public class Student implements Comparable<Student>{
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }


    @Override
    public int compareTo(Student o) {
        if (this.score > o.score) {
            return 1;
        }
        if (this.score == o.score) {
            return 0;
        }
        return -1;
    }
}
