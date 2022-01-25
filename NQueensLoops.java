import java.util.*;
public class NQueensLoops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char blackSquare = '\u25A1';	// 1
		char whiteSquare = '\u25A0';	// 0
		char queen = '\u2655';
		
		int row[]=new int[4];
		int col[]=new int[4];
		for(int i=0;i<4;i++) {row[i]=-1;col[i]=-1;}
		int count=0;
		while(count<4)
		{
			System.out.println("Enter Row & Column for Queen "+(count+1)+":");
			int r=sc.nextInt();
			int c=sc.nextInt();
			int flag=0;
			for(int i=0;i<4;i++)
			{
				if(r>=8 || row[i]==r) {
					flag=1;break;
				}
			}
			if(flag!=1)
			{
				for(int i=0;i<4;i++)
				{
				if(c>=8 || col[i]==c) {
					flag=1;break;
				}
				}
			}
			if(flag==0)
			{
				row[count]=r;
				col[count]=c;
				count++;
			}
			else System.out.println("Quenn cannot be placed at this position. Please Enter the Co-ordinates again!\n");
		}
		sc.close();
		System.out.println("Quenn Locations:");
		for(int i=0;i<4;i++) System.out.println("("+row[i]+","+col[i]+")");
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				int flag=0;
				for(int k=0;k<4;k++)
				{
					if(i==row[k] && j==col[k]) {
						System.out.print(queen+" ");
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					if(i%2==0) {
					char square = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
					System.out.print(square+" ");
					}else {
					char square = (j % 2) == 0 ? blackSquare : whiteSquare;
					System.out.print(square+" ");
				}
				}
				
			}
			System.out.println();
		}

	}

}
