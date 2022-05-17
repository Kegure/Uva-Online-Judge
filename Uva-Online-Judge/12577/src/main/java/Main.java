import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = 0;
        while(!(s.equals("*"))){
            count++;
            if(s.equals("Hajj")){
                System.out.println("Case "+count+": Hajj-e-Akbar");
            }else{
                System.out.println("Case "+count+": Hajj-e-Asghar");
            }
            s = in.nextLine();
        }
    }
}
