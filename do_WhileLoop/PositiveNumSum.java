package do_WhileLoop;
import java.util.Scanner;

public class PositiveNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum=0;
        do{
            System.out.println("Enter the number : ");
             n = sc.nextInt();
             if(n>0){
                 sum=sum +n;
             }
        }while(n>0);
        System.out.println("Sum of postive number is  : "+sum);

    }


}



