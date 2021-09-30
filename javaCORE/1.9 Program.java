public class NinthProgram {
    public static void main(String[] args) {
        int []number = {15,10,51,6,5,3,10,-34,0,32,56,12,24,52};
        int number2[];
        number2=new int[number.length];
        for (int i=0;i<number.length;i++){
            for(int j=1;j>0;j--){
                number2[i]=number[number.length-1-i];

            }
        }
        for (int i=0; i<number2.length;i++){
            System.out.print(number2[i] + " ");
        }
    }
}
