package Student;




import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        final int STUDENTS_QTY = 10;
        TreeSet<Student> students = StudentUtil.createTreeSet(STUDENTS_QTY);
        StudentUtil.printStudents(students);

    }
}
