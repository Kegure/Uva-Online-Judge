import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        for(int i = 0 ; i < testCases;i++){
            int line = (input.nextInt())/3;
            int colum = (input.nextInt())/3;
            int answer = (int)(Math.ceil(line) * Math.ceil(colum));
            System.out.println(answer);
        }
    }
}
