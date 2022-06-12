import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        while(in.hasNext()){
            if(flag) System.out.println();
            int n = in.nextInt();
            String[] names = new String[n];
            String[] giver = new String[n];
            int[] netWorth = new int[n];
            for(int i = 0 ; i < n ; i++){
                names[i] = in.next();
            }
            for(int i = 0 ; i < n ; i++){
                giver[i] = in.next();
                int giftValue = in.nextInt();
                int gifters = in.nextInt();
                for(int j = 0 ; j < gifters ; j++){
                    String receive = in.next();
                    for(int k = 0 ; k < n ; k++){
                        if(names[k].equals(receive)) netWorth[k] += giftValue/gifters;
                        if(names[k].equals(giver[i])) netWorth[k] -= giftValue/gifters;
                    }
                }
            }
            for(int i = 0 ; i < n ; i++){
                System.out.println(names[i]+" "+netWorth[i]);
            }
            flag = true;
        }
    }
}
