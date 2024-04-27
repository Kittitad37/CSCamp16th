public class lab2 {
    public static void main(String[] args){
        System.out.println(avg(1,2,3,1,4));
        System.out.println(avg(2.5,2.4,3.6,1.5,4.8));
        double d = 2.0;
        int n = 5;
        d = n;
    }
    
    static double avg (int ...number){
        double sum = 0;
        for (int i : number){
        sum += i;
       }
       double avg = sum/number.length;
       return avg;
    }

    static double avg (double ...number){
        double sum = 0;
        for (double i : number){
         sum += i;
        }
        double avg = sum/number.length;
        return avg;
     }
}
