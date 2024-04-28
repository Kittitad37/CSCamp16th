package day5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class project {
    static Map<String, String> map = new HashMap<>();
    static String times ="";
    static String expired = "";
    public static void main (String[] args) {
        System.out.println("Welcome to Freshgerator");
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.print("Enter food name (Type \"all\" to see your list) : ");
        String name = sc.nextLine();
        if(name.equals("all") || name.equals("All")){
            call_list();
            continue;
        }
        String dateInString = Checklenght(sc);
        try 
        {
            DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            Date current = new Date();
            Date date = formatter.parse(dateInString);
            if(date.compareTo(current) < 0){
                System.out.println("Please enter correctly date");
                Checklenght(sc);
            }
           
        } 
        catch (ParseException e) {
            System.out.println("Something went wrong!");
            Checklenght(sc);
        }
        map.put(name, expired);
        call_list();
        }
    }

    static void call_list () {
        ArrayList<String> sortbyKey = new ArrayList<>(map.keySet());
        System.out.println("Your list : ");
        Collections.sort(sortbyKey);
        for (int i = 0; i < sortbyKey.size() ; i++){
            System.out.println(sortbyKey.get(i) + "  expired date : " + map.get(sortbyKey.get(i)));
        }
    }

    static String Checklenght(Scanner sc){
        int check = 0;
        int count = 0;
        while(check != 3){
            if(count >= 1){
                System.out.println("Please enter data as same as example");
            }
            System.out.print("Enter expired date (year/month/day) : ");
            expired = sc.nextLine();
            String[] words = expired.split("/");
            check = words.length;
            times = expired;
            count++;
        }
        return times;
    }
    
}
