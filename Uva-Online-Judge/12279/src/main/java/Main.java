import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int giveCandy = 0,count = 0;
        int events;
        do{
            for (int i = 0 ; i < n ; i++){
                events = in.nextInt();
                if(events > 0){
                    giveCandy++;
                }else{
                    giveCandy--;
                }
            }
            count++;
            System.out.println("Case "+count+": "+giveCandy);
            giveCandy = 0;
            n= in.nextInt();
        }while(n != 0);
    }
}
