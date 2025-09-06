package WhileLoop2;

class DivOddSum {
    public static void main(String[] args) {
        int n=100;
        int i=1;
        double sum =0;
        while(i<=n){
            if(i%2==1)
            sum = sum +(1.0/i);
            i++;
        }
        System.out.println(sum);
    }
}
 
