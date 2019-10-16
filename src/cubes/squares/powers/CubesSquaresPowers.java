/*
 * Yama
 * 15/10/2019
 * To do the calculation of Cubes or Squares or Powers.
 */

package cubes.squares.powers;
import java.util.Scanner;
/**
 *
 * @author ayyam8774
 */
public class CubesSquaresPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int choice = 0;
        double base = 0;
        double ans;
        double power;
        
        while ( choice != 4)
        {
            System.out.println(" Cubes and Squares and Powers ");
            System.out.println("");
        
            System.out.println("Prease enter your choice.");
            System.out.println("");
            System.out.println("1 → Find the value of a number squared (Ex: 2*2 = 2 x 2)");
            System.out.println("2 → Find the value of a number cubed (Ex: 2*3 = 2 x 2 x 2)");
            System.out.println("3 → Find the value of a number, to any power");
            System.out.println("4 → Exit");
            System.out.println("Prease enter your choice.");
        
            choice = keyedInput.nextInt();
            
            if ( choice == 1 ) 
                {
                    System.out.println(" What is your BASE?? ");
                    base = keyedInput.nextInt();
                    System.out.println(" Your base = "+ base +"");
                    ans = base * base;
                    System.out.println("");
                    System.out.println("          Answer: "+ ans +"");
                    System.out.println("----------------------------------------------");
                }
            
            
            if ( choice == 2 )
                {
                    System.out.println(" What is your BASE?? ");
                    base = keyedInput.nextInt();
                    System.out.println("Your base = "+ base +"");
                    ans = base * base * base;
                    System.out.println("");
                    System.out.println("          Answer: "+ ans +"");
                    System.out.println("----------------------------------------------");
                }
            
            
            if ( choice == 3 )
                {
                    System.out.println(" What is your BASE?? ");
                    base = keyedInput.nextInt();
                    System.out.println("Your base = "+ base +"");
                    System.out.println("Prease enter the powers");
                    power = keyedInput.nextInt();
                    System.out.println("Your power = "+ power +"");
                    double num1 = 0;
                    double num2 = 1; 
                    while (num1 < power) 
                        {
                            num2 = num2 * base;
                            num1 = num1 + 1;
                        }
                    System.out.println("");
                    System.out.println("          Answer: "+ num2 +"");    
                    System.out.println("----------------------------------------------");
                }
        }    
        
            if ( choice == 4 )
                {
                    System.out.println("Thank you☺☺☺");
                }
        
        
        
    }
    
}
