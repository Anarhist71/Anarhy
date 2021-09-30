import java.util.Scanner;

public class EightProgram {
    public static void main(String[] args) {
        int [] number ={1,-10,5,6,45,23,45,-34,0,32,56,-1,2,-2};
        int max = number[0];   
        int sum_pos = 0;     

        int sum_neg_for=0;   
        int chet_sum=0;       
        int amount_neg = 0;  
        int amount_pos=0;    
        for (int i=0;i< number.length;i++){
            max = Math.max(max,number[i]);
            if(number[i]>0){
                amount_pos++;
                sum_pos +=number[i];
            }
            if(number[i]<0){
                amount_neg++;
                sum_neg_for+=number[i];
                if(number[i] % 2 == 0){
                    chet_sum +=number[i];
                }

            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Сумма положительных чисел: " + sum_pos);
        System.out.println("Сумма четных открицательных чисел: " + chet_sum);
        System.out.println("Кол-во положительных элементов: " + amount_pos);
        System.out.println("Среднее арифметическое отрицательных чисел: " + (sum_neg_for/amount_neg));

    }
}
