package arrays;

import java.util.Scanner;

public class arrays_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String[] array = new String[N];


		sc.nextLine();//�̰� ���� ����: N�� �Է��� �� ���ʹ����� \r\n�̶�� ���๮�ڰ� ���ԵǴ� 
		//�̰� nextLine�� �о�鿩�� �׷���. �׷��� .sc.nextLine(); 
		//�� �־ ���๮�ڸ� �̸� �о������. ����		

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
