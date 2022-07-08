
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            char[] nameOneCharArray = in.nextLine().toUpperCase().toCharArray();
            char[] nameTwoCharArray = in.nextLine().toUpperCase().toCharArray();
            removeNonAlphabetic(nameOneCharArray);
            removeNonAlphabetic(nameTwoCharArray);
            int nameValueOne = getNameValue(nameOneCharArray);
            int nameValueTwo = getNameValue(nameTwoCharArray);
            double loveRatio = (Math.min(getLoveValue(nameValueOne), getLoveValue(nameValueTwo))*100.0)/Math.max(getLoveValue(nameValueOne), getLoveValue(nameValueTwo));
            System.out.println(String.format("%.2f",loveRatio)+" %");
        }
    }
    public static void removeNonAlphabetic(char[] charArray){
        for(int i = 0 ; i < charArray.length;i++){
            if(!Character.isLetter(charArray[i])) charArray[i] = '\0';
        }
    }
    public static int getNameValue(char[] charArray){
        int value = 0;
        for(int i = 0 ; i < charArray.length ; i++){
            if(charArray[i] == '\0') continue;
            value += charArray[i]-64;
        }
        return value;
    }
    public static int getLoveValue(int nameValue){
        int loveValue = 0;
        while(nameValue > 0){
            int rest = nameValue%10;
            nameValue = nameValue/10;
            loveValue += rest;
            if(nameValue <= 0 && loveValue >= 10) {
                nameValue = loveValue;
                loveValue = 0;
            }
        }
        return loveValue;
    }
}
