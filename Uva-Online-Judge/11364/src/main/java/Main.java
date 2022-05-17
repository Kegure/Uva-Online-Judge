import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for (int i = 0 ; i < cases ; i++){
            int stores = input.nextInt();
            int minValue = Integer.MAX_VALUE ,maxValue = Integer.MIN_VALUE;
            for(int j = 0; j < stores ;j++){
                int value = input.nextInt();
                if(value < minValue){
                    minValue = value;
                }
                if(value > maxValue){
                    maxValue = value;
                }
            }
            System.out.println( (maxValue-minValue)*2);
        }
    }
}
