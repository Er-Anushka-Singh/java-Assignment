package WhileLoop2;

 class Power {
    public static void main(String[] args) {
        int a=6;
        int b=3;
        int i=1;
        int pow=1;
        while(i<=b){
            pow = pow *a;
            i++;
        }
        System.out.println(pow);
    }
}
 
