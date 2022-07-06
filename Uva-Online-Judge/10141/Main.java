import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int countOut = 1;
        while(in.hasNext()){
            int n = in.nextInt();
            int p = in.nextInt();
            in.nextLine(); // clear buffer
            if (n == 0 && p == 0) break;
            String proposal = null;
            double d,previousD = 0;
            int maxValue = -1;
            for (int i = 0 ; i < n ; i++){
                in.nextLine();
            }
            for (int i = 0 ; i < p ; i++){
                String name = in.nextLine();
                d = in.nextDouble();
                int r = in.nextInt();
                in.nextLine();
                if(maxValue < r){
                    maxValue = r;
                    proposal = name;
                    previousD = d;
                }else if(maxValue == r) if(previousD > d){
                    proposal = name;
                    previousD = d;
                }
                for (int j = 0 ; j < r ; j++){
                    in.nextLine();
                }
            }
            if(countOut > 1) System.out.println();
            System.out.println("RFP #"+countOut++);
            System.out.println(proposal);
        }
   }
}
