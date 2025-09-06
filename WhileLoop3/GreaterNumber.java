package WhileLoop3;
import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        printGreaterNumDigit(n);

    }

    public static void printGreaterNumDigit(int n) {

        while(n>0){
            int rem = n%10;
            if(rem>=5) {
                System.out.println(rem);
            }
            n=n/10;
        }
    }
}
  

