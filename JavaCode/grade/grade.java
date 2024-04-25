package grade;

import java.util.Scanner;

public class grade {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your grade : ");
        int num = sc.nextInt();
        sc.close();
        String grade;
        if (num > 50){
            grade = "Pass";
        } else {
            grade = "Fail";
        }
        System.out.println(grade);
    }
}
