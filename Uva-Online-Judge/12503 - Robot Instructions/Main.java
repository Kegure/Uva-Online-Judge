import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        FastScanner in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = in.nextInt();
        while(t --> 0){
            int position = 0;
            int n = in.nextInt();
            String[] commands = new String[n];
            for(int i = 0 ; i < n ;i++){
                commands[i] = in.nextLine();
                position += check(commands,i);
            }
            out.println(position);
        }
        out.close();
    }
    public static int check(String[] command ,int i){
        if(command[i].equals("LEFT")) return -1;
        else if(command[i].equals("RIGHT")) return +1;
        else {
            String[] StringValue = command[i].split(" ");
            int value = Integer.parseInt(StringValue[StringValue.length-1])-1;
            return check(command,value);
        }
    }
    public static PrintWriter out;
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
