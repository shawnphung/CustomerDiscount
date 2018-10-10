/*
 * Shawn Phung
 * Oct 9, 2018
 * To determine the discount that the customer will recieve, depending on how much they spent.
 */

package customerdiscount;
    import java.util.Scanner;
/**
 *
 * @author shphu0697
 */
public class CustomerDiscount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner (System.in);
       
    // Variable and Constant Declaration
       double purchase;
       //Levels of Discount
       final double DiscountL1;
        DiscountL1 = 0.10;
       final double DiscountL2;
        DiscountL2 = 0.20;
       final double DiscountL3;
        DiscountL3 = 0.30;
       final double DiscountL4;
        DiscountL4 = 0.40; 
        
    //Input Output Area
    System.out.println("Enter the amount your are spending");
        purchase = keyedInput.nextInt();
    System.out.println("You Spent: $" + purchase);
    
    if (purchase >= 0.01 && purchase <= 40.00) {
        System.out.println ("You are saving: " + DiscountL1 * 100 + "%");
        System.out.println ("You are saving: $" + purchase * DiscountL1);
        System.out.println ("Your total is: $" + (purchase - DiscountL1 * purchase));
    }
    else if (purchase >= 40.01 && purchase <= 80.00){
        System.out.println ("You are saving: " + DiscountL2 * 100 + "%");
        System.out.println ("You are saving: $" + purchase * DiscountL2);
        System.out.println ("Your total is: $" + (purchase - DiscountL2 * purchase));
    }
    else if (purchase >= 80.01 && purchase <= 120.00){
        System.out.println ("You are saving: " + DiscountL3 * 100 + "%");
        System.out.println ("You are saving: $" + purchase * DiscountL3);
        System.out.println ("Your total is: $" + (purchase - DiscountL3 * purchase));
    }
    else if (purchase > 120){
        System.out.println ("You are saving: " + DiscountL4 * 100 + "%");
        System.out.println ("You are saving: $" + purchase * DiscountL4);
        System.out.println ("Your total is: $" + (purchase - DiscountL4 * purchase));
    }
    
    }
}
