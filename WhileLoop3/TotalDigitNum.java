package WhileLoop3;
 import java.util.Scanner;
public class TotalDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        System.out.println(printBiggestNumDigit(n));
    }
    
    public static int printBiggestNumDigit(int n) {

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }
}

