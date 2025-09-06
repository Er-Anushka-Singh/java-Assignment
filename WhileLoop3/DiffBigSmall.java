package WhileLoop3;

 import java.util.Scanner;

class DiffBigSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        System.out.println(printBigNumDigit(n)- printSmallNumDigit(n));
    }

    public static int printBigNumDigit(int n) {
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
    public static int printSmallNumDigit(int n) {
        int smallest = 9;

        while (n > 0) {
            int rem = n % 10;
            if (rem <smallest){
                smallest=rem;
            }
            n = n / 10;

        }
        return smallest;
    }
} 
