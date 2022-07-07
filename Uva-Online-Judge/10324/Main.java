
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = 1;
        while (in.hasNext()) {
            char[] zerosAndOnes = in.nextLine().toCharArray();
            if(zerosAndOnes == null) break;
            int n = in.nextInt();
            System.out.println("Case "+cases+++":");
            for(int p = 0 ; p < n ; p++){
                boolean equal = true;
                int i = in.nextInt();
                int j = in.nextInt();
                in.nextLine();
                int min = Math.min(i,j);
                int max = Math.max(i,j);
                for(int l = min+1 ; l <= max ; l++){
                    if (zerosAndOnes[min] != zerosAndOnes[l]){
                        equal = false;
                        break;
                    }
                }
                if(equal) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}
