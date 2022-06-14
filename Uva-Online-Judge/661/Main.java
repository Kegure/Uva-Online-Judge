
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 1;
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int c = in.nextInt();
            int value = 0,maxValue = 0;
            int[] devices = new int[n];
            boolean[] devIsON = new boolean[n];
            if (n == 0 && m == 0 && c == 0) break;
            for(int i = 0; i < n; i++) {
                devices[i]=in.nextInt();
            }
            for(int i = 0; i < m; i++){
                int actions = in.nextInt();
                if(devIsON[actions-1]){
                    devIsON[actions-1] = false;
                    value -= devices[actions-1];
                }else{
                    devIsON[actions-1] = true;
                    value += devices[actions-1];
                }
                if(value > maxValue) maxValue = value;
            }
            if(maxValue > c) System.out.println("Sequence "+count+"\n"+"Fuse was blown.\n");
            else System.out.println("Sequence "+count+"\n"+"Fuse was not blown."+"\n"+"Maximal power consumption was "+maxValue+" amperes.\n");
            count++;
        }
    }
}
