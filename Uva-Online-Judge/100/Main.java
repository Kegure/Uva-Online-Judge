
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int i = in.nextInt();
            int j = in.nextInt();
            int minValue = Math.min(i,j);
            int maxValue = Math.max(i,j);
            int maxCycleLength = 0;
            for(int k = minValue ; k <= maxValue; k++){
                int count = cycleCount(k);
                if(maxCycleLength < count) maxCycleLength = count;
            }
            System.out.println(i+" "+j+" "+maxCycleLength);
        }
    }
    public static int cycleCount(int n) {
        int sequenceValue = 1;
        while (n != 1) {
            if (n % 2 != 0) n = 1 + (n * 3);
            else n /= 2;
            sequenceValue++;
        }
        return sequenceValue;
    }
}
