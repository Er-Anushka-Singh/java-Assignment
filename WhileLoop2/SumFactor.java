package WhileLoop2;
import java.util.Scanner;

 class SumFactor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        System.out.println(sumFactor(n));
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
