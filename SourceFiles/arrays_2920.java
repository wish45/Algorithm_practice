package arrays;

import java.util.Scanner;

public class arrays_2920 {
	public static void main(String[] args) {
		
//		int[] array = new int[8];
		
		Scanner sc = new Scanner(System.in);
			String asd = sc.nextLine();
//		String answer="";
//		
//		for(int i=0; i<8; i++) {
//			array[i] = sc.nextInt();
//		}
//
//		for(int i=0; i<array.length-1;i++) {
//			if(array[i] == array[i+1]-1) {
//				answer = "ascending"; 
//				
//			}else if(array[i]==array[i+1]+1) {
//				answer = "descending";
//			}else {
//				answer = "mixed";
//			}		
//		}
//			System.out.println(answer);			
		if(asd == "1 2 3 4 5 6 7 8") {
			System.out.println("ascending");
		}else if(asd.equals("8 7 6 5 4 3 2 1")) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}
