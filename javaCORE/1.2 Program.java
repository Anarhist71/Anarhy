import java.util.Scanner;
import java.io.*;
public class SecondProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int sum = 0;
        int temp = 0;
        for (int i=0;i<3;i++){
            temp = number % 10;
            number /=  10;
            sum += temp;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
