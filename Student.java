package Collection_Framework;

import java.util.Objects;

public class Student {
    public String studentName;
    public int rollNumber;

    public Student(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }
}
