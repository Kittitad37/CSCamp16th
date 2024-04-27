import java.util.Scanner;

public class lap4_1 {
    static int[] arr = {1,2,3,4,5,6};

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.close();
        System.out.println(findNumberInArray(val, 0));

    }

    static int findNumberInArray(int num, int locate){
        if(locate >= arr.length){
            return -1;
        }
        if(num == arr[locate]){
            return locate+1;
        }
        return findNumberInArray(num, locate+1);
    }
}
