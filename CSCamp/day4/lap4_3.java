import java.util.Scanner;

public class lap4_3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int max_input = sc.nextInt();
        System.out.println(calculateSum(max_input));
        sc.close();
    }

    static int calculateSum (int n){
        if(n == 0){
            return 0;
        }
         return n + calculateSum(n-1);
    }
}