package do_WhileLoop;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        do{
            System.out.println("Enter the number : ");
            int num = sc.nextInt();
            System.out.println("Factorial of "+num+" ! = "+ getFactorial(num));
            System.out.println("Press Y/y to continue !...........");
            c = sc.next().charAt(0);
        }while(c =='Y' || c== 'y');

        System.out.println("======== Program Ends =======");

    }
    public static int getFactorial(int n){
        int fact =1;
        int i =1;
        while(i<=n){
            fact = fact * i;
            i++;
        }
        return fact;
    }
}