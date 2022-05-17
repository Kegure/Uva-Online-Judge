import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        in.nextLine();
        int sum = 0;
        for (int i = 0 ; i < k ; i++){
            StringTokenizer command = new StringTokenizer(in.nextLine());
            String s = command.nextToken();
            if(s.equals("donate")){
                sum += Integer.parseInt(command.nextToken());
            }else{
                System.out.println(sum);
            }
        }
    }
}
