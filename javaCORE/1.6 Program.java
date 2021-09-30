import java.util.Scanner;

public class SixthProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        if (number > 0){
            if(number % 2 == 0){
                System.out.println("Положительное четное число");
            }
            else {
                System.out.println("Положительное нечетное число");
            }
        }
        else if (number < 0){
            if(number % 2 == 0){
                System.out.println("Отрицательное четное число");
            }
            else {
                System.out.println("Отрицательное нечетное число");
            }
        }
        else System.out.println("Нулевое число");
    }
}
