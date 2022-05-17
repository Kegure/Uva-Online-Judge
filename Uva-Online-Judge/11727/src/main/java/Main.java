

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int value;
        for(int i = 0 ; i < t ; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if( !( a > b && a > c ) && !(a < b && a < c)  ){
                value = a;
            }else if( !( b > a && b > c ) && !(b < a && b < c)  ){
                value = b;
            }else{
                value = c;
            }
            System.out.println("Case "+(i+1)+": "+value);
        }
    }
}
