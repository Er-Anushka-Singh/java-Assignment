package WhileLoop3;
import java.util.Scanner;
 class OddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        printOddNumDigit(n);

    }

    public static void printOddNumDigit(int n) {

        while(n>0){
            int rem = n%10;
            if(rem%2==1) {
                System.out.println(rem);
            }
            n=n/10;
        }
    }
}

