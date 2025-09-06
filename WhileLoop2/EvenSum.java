
package WhileLoop2;
class EvenSum {
    public static void main(String[] args) {
        int n=100;
        int i=1;
        int sum=0;
        while(i<=100){
            if(i%2==0)
                sum =sum+i;
            i++;
        }
        System.out.println(sum);
    }
}

