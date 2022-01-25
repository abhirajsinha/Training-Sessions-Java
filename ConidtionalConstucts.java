import java.util.*;
public class ConidtionalConstucts {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner Object Construction
				
		System.out.println("Enter an Amount: ");
		double amount = scanner.nextDouble(); // to read a double
				
		System.out.println("Enter Promo Code: ");
		//String promoCode = scanner.nextLine(); // to read a String
		int promoCode = scanner.nextInt();
				
		scanner.close(); // release the memory resources
				
		System.out.println("Amount is: "+amount);
		System.out.println("Promo Code is: "+promoCode);
				
		// 2 Promo Codes :)
				
		int JUMBO = 101;   // Flat 50% off for the items worth 200 or more
		int ZOMHELLO = 201; // Flat 60% off for the items worth 159 or more upto 120
				
		// Simple if/else -> replaced with ternary operator :)
		if(amount >= 159) {
				System.out.println("Dicsount Available");
		}else {
				System.out.println("No Discount Available");
		}
				
				
		double discount = 0;
				
				
//		   if-else Ladder
			if(amount >= 200) {
					
					//ternary Operator
					discount = promoCode==JUMBO?0.5 * amount:(promoCode==ZOMHELLO?0.6*amount:discount);
					
					//Nested if-else
					if(promoCode == JUMBO) {
						System.out.println("Promo Code JUMBO Applied Successfully\nYour fare is "+(amount-discount)+"/-");
					}
					else if(promoCode==ZOMHELLO)
					{
						System.out.println("Promo Code ZOMHELLO Applied Successfully\nYour fare is "+(amount-discount)+"/-");
					}
					else
					{
						System.out.println("Invalid Promo Code. Please try using JUMBO or ZOMHELLO codes\nYour fare is "+(amount-discount)+"/-");
					}
					
				}else if(amount>=159 && amount<=200)
				{
					discount = promoCode==ZOMHELLO?0.6 * amount:discount;
					if(promoCode==ZOMHELLO) System.out.println("Promo Code ZOMHELLO Applied Successfully\nYour fare is "+(amount-discount)+"/-");
					else if(promoCode==JUMBO) System.out.println("Promo Code JUMBO Cannot be Applied for amount less than 200/-. \nPlease add "+(200-amount)+"/- to Your amount to use JUMBO Promo Code");
					else System.out.println("Invalid Promo Code. Please try using JUMBO or ZOMHELLO codes\nYour fare is "+(amount-discount)+"/-");
				}
				else{
					System.out.println("Your fare is "+amount+"/-\nNo PromoCode available for this amount");
				}

	}

}
