package JavaConcepts;

public class Array2D {

	public static void main(String[] args) {

		int i[][] = new int[3][4];
		
		System.out.println("Size of rows:  "+i.length);
		
		System.out.println("Size of column: "+i[0].length);
		
		//Row 0 --- all 4 columns
		i[0][0] = 10;
		i[0][1] = 50;
		i[0][2] = 60;
		i[0][3] = 70;
		
		//Row 1 --- all 4 columns
		i[1][0] = 20;
		i[1][1] = 80;
		i[1][2] = 90;
		i[1][3] = 100;
		
		//Row 2 --- all 4 columns
		i[2][0] = 30;
		i[2][1] = 110;
		i[2][2] = 100;
		i[2][3] = 200;
		
		System.out.println(i[1][2]);
		
		System.out.println("***Printing all the values of 2D Array***");
		
		for(int row=0; row<i.length; row++) //row=0 //row=1
		{
			for(int col=0; col<i[0].length; col++)//col=0 //col=1 //col=2
			{
				System.out.println(i[row][col]); // i[1][0] //i[1][1] //i[1][2] //i[1][3]
			}
		}
		
	}

}
