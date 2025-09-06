package WhileLoop3;
import java.util.Scanner;

public class SumCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        System.out.println(printCountNumDigit(n));

    }

    public static int printCountNumDigit(int n) {
              //43705
        int sum = 0;
        while(n>0){
            int rem = n%10;
            if(rem<=5)
             sum +=rem;
            n=n/10;
        }
        return sum;

    }
}
  

