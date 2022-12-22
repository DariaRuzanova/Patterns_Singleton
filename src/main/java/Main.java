import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner sc = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка: ");
        System.out.print("Введите размер списка: ");
        int sizeList = sc.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        int valueUpBorder = sc.nextInt();

        logger.log("Создаём и наполняем список ");
        Random random = new Random();
        List<Integer> source = new ArrayList<>(sizeList);
        for (int i = 0; i < sizeList; i++) {
            source.add(random.nextInt(valueUpBorder));
        }
        System.out.print("Вот случайный список: ");
        source.forEach(x -> System.out.print(x + " "));

        logger.log("Просим пользователя ввести входные данные для фильтрации: ");
        System.out.print("Введите порог для фильтра: ");
        int valueFilter = sc.nextInt();

        Filter filter = new Filter(valueFilter);
        List<Integer> result = filter.filterOut(source);
        logger.log("Прошло фильтр " + result.size() + " элемента из " + valueUpBorder);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        result.forEach(x -> System.out.print(x + " "));
        System.out.println();

        logger.log("Завершаем программу");

    }
}
