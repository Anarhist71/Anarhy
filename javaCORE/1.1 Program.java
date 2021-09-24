import java.util.Scanner;

public class FirstProgram{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int i = number % 10;
        System.out.println(i);
    }
}
