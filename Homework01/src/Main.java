import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        System.out.println("Треугольное число " + TriangleNumber(number) + " от числа " + number);
    }

    public static int TriangleNumber(int num) {
        return num * (num + 1) / 2;
    }
}