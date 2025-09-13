package do_WhileLoop;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=3;
        do{
            System.out.println("Enter the password : ");
            String userPass = sc.nextLine();
            if(checkPassword(userPass)){
                System.out.println("Login Successfull !........");
            }
            else{
                System.out.println("Wrong password Remaining Attempt is : "+(--i));
            }
        }while(i>0);
        System.out.println("Account Locked !.......");



    }
    public static boolean checkPassword(String userpass)
    {
        String password = "abc123";
        if(password.equals(userpass)){
            return true;
    }
        return false;
    }


}


