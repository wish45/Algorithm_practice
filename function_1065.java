package function;

import java.util.*;

public class function_1065 {

	public static int han_number(int N) {
		int a,b,c;
		int count=0;
		
		if(N<100) {
			count=N;
		}
		else {
			for(int i=100; i<=N; i++) {
				a=i/100;
				b=(i%100)/10;
				c=i%10;
				if((a==b && b==c && a==c)) {
					count=count+1;
				}else if(a==b+1 && b==c+1) {
					count=count+1;
				}else if(a==b+2 && b==c+2) {
					count=count+1;
				}else if(a==b+3 && b==c+3) {
					count=count+1;
				}else if(a==b+4 && b==c+4) {
					count=count+1;
				}else if(a+1==b && b+1==c) {
					count=count+1;
				}else if(a+2==b && b+2==c) {
					count=count+1;
				}else if(a+3==b && b+3==c) {
					count=count+1;
				}else if(a+4==b && b+4==c) {
					count=count+1;
				}
			
			}	
			count=count+99;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();

		if(N>1000 || N<1) {
			System.out.println("입력값 에러");
		}else {
			System.out.println(han_number(N));
		}
	}
}
