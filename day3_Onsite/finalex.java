package day3_Onsite;

import java.util.Scanner;
import java.util.Arrays;

public class finalex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] num = new int[size];
        int[] num_reversed = new int[size];
        System.out.println("Size : " + size);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value : ");
            num[i] = sc.nextInt();
        }
        sc.close();
        int time = 1;
        for (int i = 0; i < size ; i++){
            num_reversed[i] = num[num.length-i-1];
        }
        double val = num_reversed[0];
        System.out.println(Arrays.toString(num));
        for (int i = 1; i < size ; i++){
            if(time % 4 == 1){
                // +
               val += num_reversed[i];
            } else if (time % 4 == 2){
                //-
                val -= num_reversed[i];
            } else if (time % 4 == 3){
                //* 
                val *= num_reversed[i];
            } else {
                // /
                val = val/num_reversed[i];
            }
            time++;
        }
        System.out.println(val);
    }
}