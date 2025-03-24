import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<T;i++){
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            sb.append(A+B).append('\n');
        }
        System.out.print(sb);
    }
}