package arrays;

import java.util.Scanner;

public class arrays_10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int avg=0;
		int sum=0;
		
		for(int i=0; i<5; i++) {
			array[i] = sc.nextInt();   	

			if(array[i]<40) {
				array[i]=40;
			}
			sum = sum + array[i];
		}
		avg=sum/5;	
		System.out.println(avg);
	}
}
