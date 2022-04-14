package Student;

import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

public class StudentUtil implements StudentData{
    @NotNull
    public static Student generateStudent(String firstName, String lastName, int groupNumber, String faculty) {
        Student result = new Student(firstName, lastName, groupNumber, faculty);
        return result;
    }
    public static TreeSet<Student> createTreeSet(int quantity){
        TreeSet<Student> temp = new TreeSet<Student>();
        for(int i = 0; i< quantity; i++){
            int num = (int) (Math.random()* arr_firstName.length);
            temp.add(generateStudent(arr_firstName[num],arr_lastName[num], arr_groupNumber[num], arr_faculty[num]));

        }
        return temp;
    }
   /* public static TreeSet<Student> deleteOdd (TreeSet<Student> ts){
        TreeSet<Student> temporary = new TreeSet<Student>();
        for(int i=0; i< ts.size(); i+=2){
            ts.removeIf(arr_firstName[1]);
        }

    }*/
    public static void printStudents(TreeSet<Student> ts){
        for(Student st:ts){
            System.out.println(st);
        }
    }
}
