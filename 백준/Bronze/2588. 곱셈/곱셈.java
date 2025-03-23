import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int one = B%10;
        int ten = (B/10)%10;
        int hundred = B/100;
        
        System.out.println(A*one);
        System.out.println(A*ten);
        System.out.println(A*hundred);
        System.out.println(A*B);
    }
}