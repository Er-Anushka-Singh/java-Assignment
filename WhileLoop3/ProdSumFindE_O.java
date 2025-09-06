package WhileLoop3;
 import java.util.Scanner;

public class ProdSumFindE_O {
 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int result =printProductDigit(n);
        if(result%2 ==0){
            System.out.println("It will give even number");
        }else{
            System.out.println("It will give odd number");
        }

    }

    public static int printProductDigit(int n) {

        int prod = 1;
        while(n>0){
            int rem = n%10;
             prod *=rem;
            n=n/10;
        }
        return prod;

    }
}
  

