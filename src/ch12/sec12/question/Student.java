package ch12.sec12.question;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student target = (Student) obj;
            return this.studentNum.equals(((Student) obj).getStudentNum());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum.hashCode();
    }
}