import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        in.nextLine();
        for(int i = 0 ; i < s ; i++){
            String code = in.nextLine();
            int stringLenght = code.length();
            if(code.equals("1") || code.equals("4") || code.equals("78")){
                System.out.println("+");
            }else if(code.charAt(stringLenght-1) == '5' && code.charAt(stringLenght-2) == '3'){
                System.out.println("-");
            }else if(code.charAt(0) == '9'  && code.charAt(stringLenght-1)== '4'){
                System.out.println("*");
            }else{
                System.out.println("?");
            }
        }
    }
}
