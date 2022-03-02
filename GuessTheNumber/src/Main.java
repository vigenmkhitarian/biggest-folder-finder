import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        System.out.println("Загадано число от 0 до 100. Попробуйте угадать!");

        int attempt;

        while (true) {
            attempt = new Scanner(System.in).nextInt();
            if (attempt == value) {
                System.out.println("Вы угадали!");
                break;
            } else {
                if (attempt < value) {
                    System.out.println("Загаданное число больше указанного");
                } else {
                    System.out.println("Загаданное число меньше указанного");
                }
            }
        }
    }
}
