
public class Operators {

	public static void main(String[] args) {
		// 1. Arithmetic Operators
		// +, -, *, /, %
				
		double amount = 3565.55;
		double tax = 0.18;
		double total = amount + (tax*amount);
		System.out.println("Total to Pay: \u20b9"+total);
				
		int number = 10;
		int buckets = 3;
		int hashCode = number % buckets; // you will always get just -> 0 1 or 2 
		System.out.println("HashCode for number "+number+" with bucket size of "+buckets+" is: "+hashCode);
				
		// 2. Assignment Operators
		// =  +=, -=, *=, /=, %=
		int eWallet = 500; // assign operator to assign the value
		int myWallet = eWallet; // Value Copy Operation | Copy form Variable to Variable :)
				
		//eWallet = eWallet + 100;
		eWallet += 100; // short hand expression
		System.out.println("eWallet is: "+eWallet);
				
		eWallet %= 7; // eWallet = eWallet % 7; -> eWallet = 600 % 7;
		System.out.println("eWallet now is: "+eWallet);
				
		// 3. Increment and Decrement operators
		// ++ and --
		// ++ increments by 1
		// -- decrements by 1
		int quantity = 1;
				
		quantity++; // postfix
		++quantity; // prefix
		++quantity;
				
		quantity--;
				
		System.out.println("Quantity is: "+quantity); // 3
				
		System.out.println();
				
		//int value = quantity++; // copy the value first and update quantity later i.e. the last copy of data
		int value = ++quantity; // update quantity and copy the data into value i.e. the latest data
		System.out.println("value is: "+value);
		System.out.println("quantity is: "+quantity);
				
		eWallet = 300;
				
		// 4. Conditional or Relational
		// >, <, >=, <=, ==, !=
		int cabFare = 300;
		System.out.println("Can i book a Cab? "+(eWallet >= cabFare));
				
		int promoCode = 101;
		int promoCodeByUser = 201;
				
		System.out.println("Can i get a Dicsount? "+(promoCode == promoCodeByUser));
				
		// 5. Logical Operators
		// &&, ||, !
		System.out.println("Can i book can and get discount? "+ ( (eWallet >= cabFare) && (promoCode == promoCodeByUser) ) );
				
		boolean isGPSEnabled = true;
		System.out.println("Is GPS Enabled: "+isGPSEnabled);
		System.out.println("Is GPS Not Enabled: "+!isGPSEnabled);
		
		boolean black=true,white=true;
		System.out.println(black==true && white==true?"Grey can be formed":"No Grey Colour");
		
		//6. Bitwise Operator
		//&,|,^
		
		byte num1=2;//0000 0010
		byte num2=7;//0000 0111
		byte num3=(byte)(num1 & num2);
		/* 2   ->   0000 0010
		 * 7   ->   0000 0111
		 * 2&7 ->   0000 0010 ->2
		 */
		System.out.println("2 & 7 : "+num3);
		
		byte num4=(byte)(num1 | num2);
		/* 2   ->   0000 0010
		 * 7   ->   0000 0111
		 * 2|7 ->   0000 0111 ->7
		 */
		System.out.println("2 | 7 : "+num4);
		
		byte num5=(byte)(num1 ^ num2);
		/* 2   ->   0000 0010
		 * 7   ->   0000 0111
		 * 2^7 ->   0000 0101 ->5
		 */
		System.out.println("2 | 7 : "+num5);
		
		//7.Shift Operator
		// >>, <<, >>>
		
		int x = 8; // data
		int y = 3; // key
		int z = x >> y; // x / 2powery    8 / 2power3
		System.out.println("z rt shift is: "+z);
				
		z = x << y;  // x * 2powery   8 * 2power3
		System.out.println("z lt shift is: "+z);
				
		int result = z >> y;
		System.out.println("Result is: "+result);
				
		// 8 >> 3
		// 0 0 0 0  1 0 0 0
		// >> 3
		// _ _ _ 0  0 0 0 1
		// 0 0 0 0  0 0 0 1  -> 1
		
		// 8 << 3
		// 0 0 0 0  1 0 0 0
		// << 3
		// 0 1 0 0  0 _ _ _
		// 0 1 0 0  0 0 0 0  -> 64
				
		x = -11;
		y = 2;
		z = x >> y;
		System.out.println("z now is: "+z);
		
		//                0 0 0 0  1 0 1 1
		//1st Compl.      1 1 1 1  0 1 0 0
		//				               + 1
		// 2nd Compl.     1 1 1 1  0 1 0 1 -> -11
		// >> 2
		//                _ _ 1 1  1 1 0 1
		//                1 1 1 1  1 1 0 1
	    // 1st Copml.     0 0 0 0  0 0 1 0
		//           		           + 1
	    //2nd Compl.      0 0 0 0  0 0 1 1 -> -3
				
		System.out.println("z << 2: "+z);
				
				
		// 7. Ternary Operator
		String message = (eWallet > cabFare) ? "Cab Booked" : "Please recharge your wallet";
		System.out.println("message is: "+message);

	}

}
