import java.util.Scanner;

public class SeventhProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберете город: ");
        System.out.println("Москва(905)");
        System.out.println("Ростов(194)");
        System.out.println("Краснодар(491)");
        System.out.print("Киров(800)\n");
        int number = in.nextInt();
        double answer = 10;
        double m=4.45, r=1.98, kr=2.69, ki=5.0;
        switch (number){
            case 905:
                answer *=m;
                break;
            case 194:
                answer *=r;
                break;
            case 491:
                answer *=kr;
                break;
            case 800:
                answer *=ki;
                break;
            default:
                System.out.println("Ошибка, несуществующий объект");
        }
        System.out.print(answer);
    }
}
