import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int num= sc.nextInt();
        if(num>=2) {
            int i = 2;
            int count = 0;
            while (i * i <= num) {
                if (num % i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 0) {
                System.out.println(" a prime number");
            } else {
                System.out.println(" not a prime");
            }
        }
        else{
            System.out.println("Not a valid number");
        }
    }
}

