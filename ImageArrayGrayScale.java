public class ImageArrayGrayScale {

	public static void main(String[] args) {
		int[] pixel1 = {12, 45, 78};
	 	int[] pixel2 = {34, 12, 90};
	 	int[] pixel3 = {20, 234, 56};
	 	
	 	int[] pixel4 = {12, 40, 72};
	 	int[] pixel5 = {10, 54, 69};
	 	int[] pixel6 = {11, 35, 80};
	 	
	 	int[] pixel7 = {15, 50, 79};
	 	int[] pixel8 = {17, 46, 68};
	 	int[] pixel9 = {19, 55, 74};
	 	
	 	// Representation of an Image
	 	int[][][] image = {
	 						{pixel1, pixel2, pixel3},
	 						{pixel4, pixel5, pixel6},
	 						{pixel7, pixel8, pixel9},
	 					};
	 	
	 	for(int i=0;i<image.length;i++)
	 	{
	 		for(int j=0;j<image[i].length;j++)
	 		{
	 			int sum=0;
	 			for(int k=0;k<image[i][j].length;k++)
	 			{
	 				sum+=image[i][j][k];
	 			}
	 			int average=sum/image[i][j].length;
	 			for(int k=0;k<image[j][i].length;k++) image[i][j][k]=average;
	 		}
	 	}
	 	
	 	for(int[][] i:image) {
	 		for(int[] j:i)
	 		{
	 			System.out.print("{");
	 			for(int k=0;k<j.length;k++)
	 			{
	 				if(k!=j.length-1) System.out.print(j[k]+",");
	 				else System.out.print(j[k]+"}    ");
	 			}
	 		}
	 		System.out.println();
	 	}
	 	
	}

}
