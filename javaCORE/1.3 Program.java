import java.util.Scanner;

public class Third Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        if (number > 0){
            number +=1;
        }
        System.out.println(number);
    }
}
