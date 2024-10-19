import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Вариант 10\n");
        out.println("Список задач:");
        out.println("1. Имена (1.3)");
        out.println("2. Человек с именем (2.2)");
        out.println("3. Человек с родителем (2.3)");
        out.println("4. Ломаная (3.2)");
        out.println("5. Создаем Ломаную (4.9)");
        out.println("6. Длина Ломаной (5.7)\n");
        out.print("Введите номер задания: ");
        String input = scanner.next();

        switch (input) {
            case "1": {
                // Задание 1.3
                Name name1 = new Name("Клеопатра");
                Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
                Name name3 = new Name("Маяковский", "Владимир");

                out.println(name1);
                out.println(name2);
                out.println(name3);
            } break;

            case "2": {
                // Задание 2.2
                Human human1 = new Human(new Name("Клеопатра"), 152);
                Human human2 = new Human(new Name("Пушкин", "Александр", "Сергеевич"), 167);
                Human human3 = new Human(new Name("Маяковский", "Владимир"), 189);

                out.println(human1);
                out.println(human2);
                out.println(human3);
            } break;

            case "3": {
                // Задание 2.3
                Human h1 = new Human(new Name("Чудов", "Иван"), getPositiveInt("Введите рост: ", scanner));
                Human h2 = new Human(h1, new Name("Чудов", "Петр"), getPositiveInt("Введите рост: ", scanner));
                Human h3 = new Human(h2, new Name("Борис"), getPositiveInt("Введите рост: ", scanner));

                out.println(h1);
                out.println(h2);
                out.println(h3);
            } break;

            case "4": {
                // Задание 3.2
                Point[] points1 = new Point[3];
                points1[0] = new Point(1, 5);
                points1[1] = new Point(2, 8);
                points1[2] = new Point(5, 3);
                Lomanaya l1 = new Lomanaya(points1);

                Point[] points2 = new Point[4];
                points2[0] = points1[0];
                points2[1] = new Point(2, -5);
                points2[2] = new Point(4, -8);
                points2[3] = points1[2];
                Lomanaya l2 = new Lomanaya(points2);

                out.println(l1);
                out.println(l2);
                l1.movePoint(1, 0, 3);
                out.println(l1);
                out.println(l2);
            } break;

            case "5": {
                // Задание 4.9
                Lomanaya l = new Lomanaya();
                int pointsCount = getPositiveInt("Введите количество точек для ломанной: ", scanner);
                Point[] points = new Point[pointsCount];
                for (int i = 0; i < pointsCount; i++) {
                    int x = getValidInt("Введите координату x точки " + (i+1) + ": ", scanner);
                    int y = getValidInt("Введите координату y точки " + (i+1) + ": ", scanner);
                    Point p = new Point(x, y);
                    points[i] = p;
                }
                l.setPoints(points);
                out.println(l);
            } break;

            case "6": {
                // Задание 5.7
                Point p1 = new Point(1, 5);
                Point p2 = new Point(2, 8);
                Point p3 = new Point(5, 3);
                Lomanaya l = new Lomanaya(new Point[] {p1, p2, p3});
                out.println("Длина ломаной: " + l.getLength());

                Point p4 = new Point(5, 15);
                Point p5 = new Point(8, 10);
                l.addPoints(new Point[] {p4, p5});
                out.println("Длина ломаной: " + l.getLength());
            } break;

            default: out.println("В списке нет данного номера задачи.");
        }
        scanner.close();
    }

    // Метод для проверки корректного ввода целого числа
    public static int getValidInt(String message, Scanner scanner) {
        while (true) {
            out.print(message);
            if (scanner.hasNextInt()) return scanner.nextInt();
            else {
                out.println("Ошибка: это не целое число. Попробуйте снова.");
                scanner.next();
            }
        }
    }

    // Метод для проверки корректного ввода неотрицательного числа
    public static int getPositiveInt(String message, Scanner scanner) {
        while (true) {
            out.print(message);
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num >= 0) return num;
                else out.println("Ошибка: это не положительное число. Попробуйте снова.");
            }
            else {
                out.println("Ошибка: это не целое число. Попробуйте снова.");
                scanner.next();
            }
        }
    }
}

