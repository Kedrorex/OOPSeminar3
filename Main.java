import java.util.*;

public class Main {
    public static void main(String[] args) {


        Stream stream = new Stream("Галактический", 235);
        stream.addStudentGroup(new StudentGroup("Джидаи", 201));
        stream.addStudentGroup(new StudentGroup("Империя", 202));
        stream.addStudentGroup(new StudentGroup("Повстанци", 203));
        stream.addStudentGroup(new StudentGroup("Мандалорцы", 204));

        Stream stream2 = new Stream("Гастраномический", 335);
        stream2.addStudentGroup(new StudentGroup("Повар", 301));
        stream2.addStudentGroup(new StudentGroup("Кок", 302));
        stream2.addStudentGroup(new StudentGroup("Раздельщик", 303));
        stream2.addStudentGroup(new StudentGroup("Мойщики тарелок", 304));

        Menu menu = new Menu();
        menu.addStream(stream);
        menu.addStream(stream2);

        StudentGroup group101 = new StudentGroup("Электротехники",101);
        group101.addStudent(new Student("Шриша",1));
        group101.addStudent(new Student("Виталя",2));
        group101.addStudent(new Student("Анна",3));

        stream.addStudentGroup(group101);

        System.out.println("Запуск системы Универ-инфо");
        menu.Menu1();




        System.out.println("_____________________");
        System.out.println(group101.getStudent("Шриша").compareTo(group101.getStudent("Анна")));
        TreeSet<Student> set = new TreeSet<>(new StudentComparator());

        set.add(group101.getStudent("Шриша"));
        set.add(group101.getStudent("Виталя"));
        set.add(group101.getStudent("Анна"));

        System.out.println(set);

//        for (Student student : set){
//            set.add(student);
//        }

        Iterator<Student> iterator = group101.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getName().equals("Анна")){
                group101.removeStudent(student);
//                    iterator.remove();
            }
        }
        System.out.println("_____________________");
        for (Student studentPrint : group101) System.out.println(studentPrint.getName());
        System.out.println("_____________________");
        System.out.println("Выключение системы");
    }
    public static Object validateInput(String input) {

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // Если ввод не является числом, возвращаем его как строку
            return input;
        }
    }
}
