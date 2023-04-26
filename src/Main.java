import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner input = new Scanner(System.in);
        int n = 0;

        while (n <= 0) {
            System.out.print("Введите размер списка: ");
            n = input.nextInt();
            if (n < 0)
                System.out.println("Размер списка не может быть меньше 0");
        }
        System.out.printf("Введите верхнюю границу для значений: ");
        int m = input.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> list = fillInList(n, m);
        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = input.nextInt();
        Filter filter = new Filter(f);
        System.out.printf("Отфильтрованный список: %s", filter.filterOut(list));

        logger.log("Завершаем программу");
    }

    public static List<Integer> fillInList(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            list.add(random.nextInt(m));
        }
        return list;
    }
}
