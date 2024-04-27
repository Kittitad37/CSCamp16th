import java.util.Scanner;

public class lap4_2 {
    static int[] arr = { 1, 2, 3, 4, 6, 5 ,2,4};

    public static void main(String[] args) {
        System.out.println(findMaxInArray(0,0));
    }

    static int findMaxInArray(int n, int max){
        if(n >= arr.length){
            return max;
        }
        if(arr[n] >= arr[max]){
            return max = n;
        }
        return findMaxInArray(n+1, max);
    }
}
