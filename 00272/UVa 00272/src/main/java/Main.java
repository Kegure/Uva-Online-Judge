import java.util.Scanner;

public class Main {
    public static void main(String Args[]){
        Scanner input = new Scanner(System.in);
        StringBuffer text = new StringBuffer();
        boolean flag = true;
        while (input.hasNextLine()){
            text.append(input.nextLine());
            for (int i =0 ; i < text.length() ; i++){
                if(text.charAt(i) == '"'){
                    if(text.charAt(i) == '\u001a') {
                        break;
                    }
                    if(flag){
                        text.setCharAt(i,'`');
                        System.out.print("`");
                        System.out.print(text.charAt(i));
                        flag = false;
                        continue;
                    }else{
                        text.setCharAt(i,'\'');
                        System.out.print("'");
                        System.out.print(text.charAt(i));
                        flag = true;
                        continue;
                    }
                }
                System.out.print(text.charAt(i));
            }
            text.delete(0,text.length());
            System.out.print("\n");
        }
    }
}
