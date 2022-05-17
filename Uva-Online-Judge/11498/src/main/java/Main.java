import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int k = in.nextInt();
        do {
            int divisionPointa = 0,divisionPointb = 0;
            for (int i = 0; i < k + 1; i++) {
                int n = in.nextInt();
                int m = in.nextInt();
                if(i == 0){
                    divisionPointa = n;
                    divisionPointb = m;
                }else{
                    if (n == divisionPointa || m == divisionPointb) {
                        System.out.println("divisa");
                    } else if (n > divisionPointa && m > divisionPointb) {
                        System.out.println("NE");
                    } else if (n < divisionPointa && m > divisionPointb) {
                        System.out.println("NO");
                    } else if (n < divisionPointa && m < divisionPointb) {
                        System.out.println("SO");
                    } else {
                        System.out.println("SE");
                    }
                }
            }
            k = in.nextInt();
        }while(k != 0);
    }
}
