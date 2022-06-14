import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int H = in.nextInt();
            Double U = in.nextDouble();
            int D = in.nextInt();
            float F = in.nextFloat()/100;
            if(H == 0) break;
            double move = 0,fatigueValue = U*F;
            int countDays = 0;
            while(move <= H){
                fatigueValue =U*F*countDays;
                countDays++;
                if(U-fatigueValue > 0) move += U-fatigueValue;
                if(move > H) break;
                move -= D;
                if(move < 0) break;
            }
            if(move > H) System.out.println("success on day "+countDays);
            else System.out.println("failure on day "+countDays);
        }
    }
}
