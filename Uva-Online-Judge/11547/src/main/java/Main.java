import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder tenColum = new StringBuilder();
        int t = in.nextInt();
        for (int i = 0 ; i < t ; i ++){
            int n = in.nextInt();
            int math = ((((((n*567)/9)+7492)*235)/47) - 498);
            tenColum.append(math);
            tenColum.reverse();
            System.out.println(tenColum.charAt(1));
        }
    }
}
