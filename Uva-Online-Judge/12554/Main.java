import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        FastScanner in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = in.nextInt();
        String song = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you";
        String[] splitSong = song.split(" ");
        String[] names = new String[n];
        int songLength = splitSong.length;
        int count = 0;
        int songCount = 0;
        for(int i = 0 ; i < n ; i++){
            names[i] = in.next();
        }
        for(int i = 0; i < n ; i++){
            out.println(names[i]+": "+splitSong[songCount]);
            songCount++;
            count++;
            if(songCount < songLength && i+1 == n) i = -1;
            if(songCount == songLength && count >= n) break;
            if(songCount == songLength) songCount = 0;
        }
        out.close();
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
