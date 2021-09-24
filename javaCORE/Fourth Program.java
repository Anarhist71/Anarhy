import java.util.Scanner;

public class FourthProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        if (number > 0){
            number +=1;
        }
        else if (number < 0){
            number -=2;
        }
        else {
            number = 10;
        }
        System.out.println(number);
    }
}
