package WhileLoop3;
  import java.util.Scanner;

public class BiggestNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        System.out.println(printLToRNumDigit(n));
    }

    public static int printLToRNumDigit(int n) {
        int biggest = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem > biggest){
                 biggest=rem;
            }
            n = n / 10;

        }
        return biggest;
    }
}
  

