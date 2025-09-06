package WhileLoop2;

public class CubeSum {

    public static void main(String[] args) {
      int n=100;
      int i=1;
      int sum =0;
      while(i<=n){
          sum = sum +i*i*i;
          i++;
      }
        System.out.println(sum);
    }
}

  

