import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Для выхода из программы введите ноль или отрицательное число");
            System.out.println("Введите положительное число для нахождения всех пар положительных чисел, произведение которых будет равно этому числу");
            int value = new Scanner(System.in).nextInt();
            if (value <= 0) {
                break;
            }
            for (int i = value; i > 0; i--) {
                for (int j = value; j > 0; j--) {
                    if (i * j == value) {
                        System.out.println(j + "*" + i);
                    }
                }
            }
        }
    }
}
