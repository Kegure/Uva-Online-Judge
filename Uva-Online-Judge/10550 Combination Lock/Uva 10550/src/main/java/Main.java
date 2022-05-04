    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int lockValue[] = new int[4];
            int totalDegrees;
            boolean clockwise;
            while(input.hasNextLine()){
                lockValue[0] = input.nextInt();
                lockValue[1] = input.nextInt();
                lockValue[2] = input.nextInt();
                lockValue[3] = input.nextInt();
                if (lockValue[0] == 0 && lockValue[1] == 0 && lockValue[2] == 0 && lockValue[3] == 0) {
                    break;
                }
                clockwise = true;
                totalDegrees = 1080;
                for (int i = 0; i < lockValue.length - 1; i++) {
                    int value = Math.abs(lockValue[i] - lockValue[i + 1]);
                    if(clockwise){
                        if( lockValue [i] < lockValue[i+1]){
                            totalDegrees += (40 - value) * 9;
                        }else{
                            totalDegrees += value*9;
                        }
                        clockwise = false;
                    }else{
                        if(lockValue[i] < lockValue[i+1]){
                            totalDegrees += value*9;
                        }else{
                            totalDegrees += (40 - value) * 9;
                        }
                        clockwise = true;
                    }
                }
                System.out.println(totalDegrees);
            }
        }
    }