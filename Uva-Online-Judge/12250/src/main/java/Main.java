import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = 1;
        do{
            switch (s) {
                case "HELLO":
                    System.out.println("Case "+count+": ENGLISH");
                    break;
                case "HOLA" :
                    System.out.println("Case "+count+": SPANISH");
                    break;
                case "HALLO" :
                    System.out.println("Case "+count+": GERMAN");
                    break;
                case "BONJOUR" :
                    System.out.println("Case "+count+": FRENCH");
                    break;
                case "CIAO" :
                    System.out.println("Case "+count+": ITALIAN");
                    break;
                case "ZDRAVSTVUJTE" :
                    System.out.println("Case "+count+": RUSSIAN");
                    break;
                default :
                    System.out.println("Case "+count+": UNKNOWN");
            }
            s = in.nextLine();
            count++;
        }while(!s.equals("#"));
    }
}
