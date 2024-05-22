package day3_Onsite;
import java.util.Scanner;

public class while_ex1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ate = 0;
    while (ate < 10){
        System.out.print("Eat [y/n] : ");
        String mum = sc.nextLine();
        System.out.println(mum);
        if(mum.contains("y")){
            ate++;
        } else if (mum.contains("n")){

        } else {
            System.out.println("Please enter y or n");
        }
        System.out.println("Your capa : "+ ate);
    }
    System.out.println("Aiem leaw");
    sc.close();
    }
}
