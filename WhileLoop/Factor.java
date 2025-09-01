public class Factor {

    public static void main(String[] args) {
        int n = 30;
        System.out.print(1 + "  "+ n+"  ");
        int i =2;
        int count =2;
        while(i*i<=30){
            if(n%i ==0){
                int fact1 = i;
                int fact2 = n/i;
                if(fact1 !=fact2){
                    System.out.print(fact1 +" "+fact2+" ");
                     count+=2;
                }
                else {
                    System.out.print(fact1 + " ");
                    count++;
                }
            }
            i++;
        }
        System.out.println("\n TotalNumber is : "+count);
    }
}
