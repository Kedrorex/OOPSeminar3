import java.util.Comparator;

public class StudentGroupComparator implements Comparator<StudentGroup> {
    @Override
    public int compare (StudentGroup s1, StudentGroup s2) {
        String t1 = s1.getNameGruop() + s1.getIdGruop();
        String t2 = s2.getNameGruop() + s2.getIdGruop();

        return t1.compareTo(t2);
    }
}

