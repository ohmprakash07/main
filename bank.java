
import java.util.Scanner;

class bank{
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Inital balance:\n2.Deposit amount:\n3.Withdraw Amount\n4.PIN Reset:\n5.Check the balance:");
        System.out.print("Enter the option");
        int i=scan.nextInt();
        int deposite=0;
        int Inital;
         if(i==1){
         Inital=500;
        System.out.println("Inital amount is "+Inital);
    }
    else if(i==2){
        System.out.print("Enter the amount to deposite :");
        deposite=scan.nextInt();
        System.out.println(deposite+"is deposited");
    }
    else if(i==3){
        System.out.print("Enter the amount to withdraw:");
        int withdraw=scan.nextInt();
        System.out.print("withdrawed amount is:");

    }
    }
   
}