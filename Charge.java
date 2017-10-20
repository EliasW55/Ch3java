import java.util.Scanner;
import java.text.NumberFormat;
public class Charge
{
   public static void main (String[] args) {
       double prevBalance, newBalance, minPayment, finalBalance;
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter your previous balance: ");
       prevBalance=scan.nextInt();
       double interest=prevBalance*0.02;
       newBalance=prevBalance-interest;
       if(newBalance<=50) {
           finalBalance=0;
       }
       else {
           finalBalance=newBalance*0.2;
       }
       System.out.println("Your final balance is " + finalBalance);
   }
}
