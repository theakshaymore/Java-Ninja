package oops_proj01;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
private List<Student> students;
    
    public StudentRegistration() {
        students = new ArrayList<>();
    }
    
    public void registerStudent(Student student) {
        students.add(student);
    }
    
    public List<Student> getRegisteredStudents() {
        return students;
    }
}
