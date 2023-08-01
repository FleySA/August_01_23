import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1, num2, correctAnswer, userAnswer;

        do {
            num1 = random.nextInt(100); // Генерируем числа от 0 до 99
            num2 = random.nextInt(100);

            correctAnswer = num1 + num2;

            System.out.println("Первое число: " + num1);
            System.out.println("Второе число: " + num2);
            System.out.print("Введите сумму из этих чисел : ");
            userAnswer = scanner.nextInt();

            System.out.println("Правильный ответ: " + correctAnswer);

        } while (userAnswer != correctAnswer);

        System.out.println("Ура! Вы дали правильный ответ! Вы победили!");

        scanner.close();
    }
}