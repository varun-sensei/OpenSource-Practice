import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int [][]numbers = new int[rows][cols];
		// //INPUT
		// for(int i=0;i<rows;i++) {
		// 	for(int j=0;j<cols;j++) {
		// 		numbers[i][j] = sc.nextInt();
		// 	}
		// }
		// //OUTPUT
		// for(int i=0;i<rows;i++) {
		// 	for(int j=0;j<cols;j++) {
		// 		System.out.print(numbers[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				numbers[i][j] = sc.nextInt();
			}
		}
		//Finding x value
		int x = sc.nextInt();

		//OUTPUT
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++){
				if(numbers[i][j] == x){
				System.out.print("x found at location ("+i+ ","+j+")");
				}
			}
		}
	}

}
