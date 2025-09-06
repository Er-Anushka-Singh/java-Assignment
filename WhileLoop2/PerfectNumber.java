package WhileLoop2;

 import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        if(n==sumFactor(n)) {
            System.out.println(n + " is a prefect number");
        }
        else{
            System.out.println(n +" Not a perfect number");
        }
    }

    public static int sumFactor(int n){
        int i=2;
        int sum=1;
        while(i*i<=n) {
            if (n % i == 0) {
                int fact1 = i;
                int fact2 = n / i;
                if (fact1 != fact2) {
                    sum = sum + fact1 + fact2;
                } else {
                    sum = sum + fact1;
                }
            }
                i++;
            }
            return sum;

    }
}
 
