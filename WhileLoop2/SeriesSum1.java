package WhileLoop2;

 class SeriesSum1 {
  
    public static void main(String[] args) {
        int n=100;
        int i=1;
        double sum =0;
        while(i<=n){
            sum = sum +(1.0/i*(i+1));
            i++;
        }
        System.out.println(sum);
    }
}


