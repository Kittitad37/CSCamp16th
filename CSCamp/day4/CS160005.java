import java.util.Scanner;

public class CS160005 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour : ");
        int input = sc.nextInt();
        hellochaotam(input);
        sc.close();
    }

    static void hellochaotam (int hour){
        switch (hour){
            case 0 :
                System.out.println("undo morning");
                return;
        }
        int val = hour % 24;
        
        if(val >= 17 || val == 0){
            System.out.println("Cha Cha Va");
        } else if (val >= 9) {
            System.out.println("Kakai maya");
        } else {
            System.out.println("Undo morning");
        }
    }
}
