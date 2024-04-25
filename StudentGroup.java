import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;
    private String nameGruop;
    private int idGroup;
    public StudentGroup(String nameGruop, int idGroup){
        this.nameGruop = nameGruop;
        this.idGroup = idGroup;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public String getNameGruop(){
        return nameGruop;
    }
    public int getIdGruop(){
        return idGroup;
    }
    public Student getStudent(String name){
        for(Student student : students){
           if (student.getName().equals(name)){
               return student;
           }

        }
        return null;
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public String toString(){
        return getNameGruop();
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }
}
    class StudentGroupIterator implements  Iterator<Student>{
        private  List<Student> students;
        private int index = 0;
        public StudentGroupIterator(List<Student> students){
            this.students = students;
        }


        @Override
        public boolean hasNext(){
            return index < students.size();
        }
        @Override
        public Student next(){
            return students.get(index++);
        }
    }

