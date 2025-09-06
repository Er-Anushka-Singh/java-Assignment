import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        printNumLeftToRight(n);

    }

    public static void printNumLeftToRight(int n) {

        while(n>0){
            int rem = n%10;
            System.out.println(rem);
            n=n/10;
        }
    }
}