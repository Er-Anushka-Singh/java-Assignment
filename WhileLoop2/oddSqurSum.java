package WhileLoop2;

class oddSqurSum {
    public static void main(String[] args) {
      int n=100;
      int i=1;
      int sum =0;
      while(i<=n){
          if(i%2==1)
          sum = sum +i*i;
          i++;
      }
        System.out.println(sum);
    }
} 
