package day4_Onsite;

public class lab4_2 {
    static int[] arr = { 9, 2, 1, 4, 5, 2, 4 };
    static Integer max;

    public static void main(String[] args) {
        findMaxInArray(0, 0);
        System.out.println(max);
    }

    static int findMaxInArray(int n, int max_locate) {
        if (n >= arr.length) {
            max = max_locate;
            return max_locate;
        }
        if (arr[n] > arr[max_locate]) {

            max_locate = n;
        }
        return findMaxInArray(n + 1, max_locate);
    }
}
