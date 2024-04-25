import java.util.Scanner;
public class InputChecker {

    public static Object InputChecker(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // Если ввод не является числом, возвращаем его как строку
            return input;
        }
    }

}
