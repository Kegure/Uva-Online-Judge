import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for(int i = 0 ; i< cases ; i++){
            int valueOne= input.nextInt();
            int valueTwo= input.nextInt();
            if(valueOne > valueTwo){
                System.out.println(">");
            }else if(valueOne < valueTwo){
                System.out.println("<");
            }else{
                System.out.println("=");
            }
        }
    }
}
