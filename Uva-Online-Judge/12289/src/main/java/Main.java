import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        in.nextLine(); // clear scanner
        for (int i = 0 ; i < count ; i ++){
            String word = in.nextLine();
            int correctLetter = 0;

            if(word.charAt(0) == 'o'){
                correctLetter++;
            }
            if(word.charAt(1) == 'n'){
                correctLetter++;
            }
            if(word.charAt(2) == 'e'){
                correctLetter++;
            }
            if(word.length() == 5){
                System.out.println(3);
            }else if(correctLetter >= 2){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
    }
}
