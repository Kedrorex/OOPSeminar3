import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private static List<StudentGroup> streams;


    private String nameStream;
    private int idStream;
    public Stream (String nameStream, int idStream){
        this.nameStream = nameStream;
        this.idStream = idStream;
        this.streams = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup stream){
        streams.add(stream);
    }

    public String getNameStream(){
        return nameStream;
    }

    public static String getGroup(String name){
        for(StudentGroup studentGroup : streams){
            if (studentGroup.getNameGruop().equals(name)){
                return studentGroup.getNameGruop();
            }

        }
        return null;
    }

    public static void infoStream(){
        for (StudentGroup studentGroup : streams){
            System.out.println(studentGroup.getNameGruop());
        }
    }



    @Override
    public Iterator<StudentGroup> iterator(){
        return streams.iterator();
    }

}
