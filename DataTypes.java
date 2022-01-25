
public class DataTypes {

	public static void main(String[] args) {
		//-------------------------Numbers : Integeral-----------------------//
		//1.)Byte Type --- 8 bits -2^7 to (2^7-1)
		byte a=120;
		byte b=(byte)128;//this will print -128
		System.out.println("Byte\na:"+a+"  b:"+b);
		
		//2.)Short Type --- 16 bits  -2^15 to (2^15-1)
		short c=569;
		short d=(short)-32770;//this will print 32766
		System.out.println("Short\nc:"+c+"  d:"+d);
		
		//3.)Integer Type --- 32 bits -2^31 to (2^31-1)
		int e=2003;
		System.out.println("Integer\ne:"+e);
		
		//4.)Long Integer Type ---64 bits -2^63 to (2^63 -1)
		long f=9412367890L;
		System.out.println("Long\nf:"+f);
		
		//-------------------------Numbers : Floating Point-------------------//
		//5.)Float Type --- 32 bits 
		float g=3.14f;
		System.out.println("Float\ng:"+g);
		
		//6.)Double Type --- 64 bits
		double h=3.14;
		System.out.println("Double\nh:"+h);
		
		//-----------------------------	Characters -----------------------------//
		char i='\u0938';
		System.out.println("Character\ni:"+i);
		
		//-------------------------------Boolean----------------------------------//
		boolean j=false;
		System.out.println("Boolean\nj:"+j);
		
		//------------------------------String : Non-Primitive-------------------------//
		String str=""+'\u0938'+'\u0941'+'\u092E'+'\u093F'+'\u0924';
		System.out.println("String\nstr:"+str);

	}

}
