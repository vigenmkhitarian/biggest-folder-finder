import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Для выхода из программы введите отрицательное число");
            System.out.println("Введите число для вычисления его факториала");
            int value = new Scanner(System.in).nextInt();
            int result = 1;

            if (value >= 0) {
                for (int i = 1; i <= value; i++) {
                    result = i * result;
                }
                System.out.println("Факториал числа " + value + " равен " + result);

            } else {
                break;
            }
        }
    }
}