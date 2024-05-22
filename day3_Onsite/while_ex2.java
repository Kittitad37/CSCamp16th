package day3_Onsite;

import java.util.Random;
import java.util.Scanner;

public class while_ex2 {
    public static void main (String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number : ");
        int val = sc.nextInt();
        int ans = rand.nextInt(100);
        while(val != ans){
            if(val < ans){
                System.out.println("Your answer is lower");
            } else {
                System.out.println("Your answer is greater");
            }
            System.out.print("Guess again : ");
             val = sc.nextInt();
        }
        sc.close();
        System.out.println("Congrat! your answer is correct");
    }
}
