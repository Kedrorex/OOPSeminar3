import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu implements Iterable<Stream> {
    private static List<Stream> allStreams = new ArrayList<>();
    public static void addStream(Stream stream){
        allStreams.add(stream);
    }
    public static void infoAllStream(){
        for (Stream stream : allStreams){
            System.out.println(stream.getNameStream());
        }
    }

    public static Stream getStream(String name){
        for(Stream stream : allStreams){
            if (stream.getNameStream().equals(name)){
                return stream;
            }
        }
        return null;
    }

    @Override
    public Iterator<Stream> iterator(){
        return allStreams.iterator();
    }


    public static void Menu1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие:");
        System.out.println("1. Получить информацию о всех потоках");
        System.out.println("2. Получить информацию о потоке");
        System.out.println("3. Сравнить потоки");
        System.out.println("4. Получить информацию о студенте");
        System.out.println("5. Внести изменения=>");


        String numberMenu1 = scanner.nextLine();

        String exit;

        switch (numberMenu1) {
            case "1":
                Menu.infoAllStream();

                System.out.println("Вернуться в основною меню?(y/n)");
                exit = scanner.nextLine();

                if(exit.equals("y")){
                    exit = null;
                    Menu.Menu1();
                }else  {
                    break;// я не понял как эту команду включать через класс
                }

            case "2"://выводит лишь список групп гастрономического потока и электрики, галактический не знаю почему не хочет отображать, может getStream() не правльно реализовал без понятия
                System.out.println("Введите название потока:");
                String input = scanner.nextLine();

                for (StudentGroup studentGroup : getStream(input)) {
                    System.out.println(studentGroup.getNameGruop());
                }
                System.out.println("выводит лишь список групп гастрономического потока" +
                        " и электрики, галактический не знаю" +
                        " почему не хочет отображать, может getStream()" +
                        " не правльно реализовал без понятия");

                System.out.println("Вернуться в основною меню?(y/n)");
                exit = scanner.nextLine();

                if(exit.equals("y")){
                    exit = null;
                    Menu.Menu1();
                }else  {
                    break;
                }

//                System.out.println(Stream.getGroup(nameStream));
                break;
            case "3":
                System.out.println("Вы выбрали вариант 3");
                break;
            case "4":
                System.out.println("Вы выбрали вариант 4");
                break;
            case "5":
                Menu.Menu2();
                break;
            default:
                System.out.println("Некорректный выбор");
        }
        scanner.close();
    }

    public static void Menu2(){
        System.out.println("Выберите действие:");
        System.out.println("1. Редактировать поток");
        System.out.println("2. Редактировать группу");
        System.out.println("3. Редактировать студента");
        System.out.println("0. <=Вернуться в основное меню");

        Scanner scanner = new Scanner(System.in);
        String numberMenu2 = scanner.nextLine();

        switch (numberMenu2) {
            case "1":
                System.out.println("Вы выбрали вариант 1");
                break;
            case "2":
                System.out.println("Вы выбрали вариант 2");
                break;
            case "3":
                System.out.println("Вы выбрали вариант 3");
                break;
            case "0":
                Menu.Menu1();
                break;
            default:
                System.out.println("Некорректный выбор");
        }
        scanner.close();
    }


}
