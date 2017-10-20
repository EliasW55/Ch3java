import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    
        String computerPlay;  
        Random generator = new Random();
        int computerInt=generator.nextInt(3)+1;
        Scanner choice=new Scanner(System.in);
        System.out.println("Enter rock(1) paper(2) scissors(3)");
        int decision=choice.nextInt();
        switch(decision) {
            case 1:
            System.out.println("You entered rock");
            if(computerInt==1) {
                System.out.println("The computer entered rock. It's a tie");
            }
            else if(computerInt==2) {
                System.out.println("The computer entered paper. You lose");
            }
            else if(computerInt==3) {
                System.out.println("The computer entered scissors. You win");
            }
            case 2:
            System.out.println("You entered paper");
            if(computerInt==1) {
                System.out.println("The computer entered rock. You win");
            }
            else if(computerInt==2) {
                System.out.println("The computer entered paper. It's a tie");
            }
            else if(computerInt==3) {
                System.out.println("The computer entered scissors. You lose");
            }
            case 3:
            System.out.println("You entered scissors");
            if(computerInt==1) {
                System.out.println("The computer entered rock. You lose.");
            }
            else if(computerInt==2) {
                System.out.println("The computer entered papered. It's a win");
            }
            else if(computerInt==3) {
                System.out.println("The computer entered scissors. It's a tie");
            }
        }
    }
}

