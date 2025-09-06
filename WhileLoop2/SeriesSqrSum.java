package WhileLoop2;

class SeriesSqrSum {
    public static void main(String[] args) {
        int n=100;
        int i=1;
        int sum =0;
        while(i<=n){
            sum = sum +i*(i+1)*(i+1);
            i++;
        }
        System.out.println(sum);
    }
}
 
