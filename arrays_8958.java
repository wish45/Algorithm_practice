package arrays;

import java.util.Scanner;

public class arrays_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String[] array = new String[N];


		sc.nextLine();//이걸 쓰는 이유: N을 입력한 후 엔터누르면 \r\n이라는 개행문자가 남게되는 
		//이걸 nextLine이 읽어들여서 그런다. 그래서 .sc.nextLine(); 
		//을 넣어서 개행문자를 미리 읽어버린다. ㅇㅋ		

		for(int i=0; i<N;i++) {
			array[i] = sc.nextLine();	

		}
		
		for(int i=0; i<array.length; i++) {
			char[] arraypoint = array[i].toCharArray();

			int count=0;
			int att=0;
			for(int j=0; j<arraypoint.length; j++) {
				
				if(arraypoint[j] == 'O') {
					count=count+1;
					att=att+count;				
					
				} else if(arraypoint[j] == 'X') {				
					count=0;
					att=att+count;							
				}							
				
			}
			System.out.println(att);
			
		}
	}
}
