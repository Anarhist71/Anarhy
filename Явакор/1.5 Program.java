import java.util.Scanner;

  public class FifthProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число1: ");
        int number = in.nextInt();

        System.out.print("Введите число2: ");
        int number2 = in.nextInt();

        System.out.print("Введите число3: ");
        int number3 = in.nextInt();
        int min = number;
        if (number2 < min){
 min =number2;
        }
        if (number3 < min){
 min = number3;
        }

        System.out.println(min);
    }
}
