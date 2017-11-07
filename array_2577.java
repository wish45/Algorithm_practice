package arrays;

import java.util.Scanner;

public class array_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int gop=1;
		int number;
		for(int i=0; i<3; i++) {
			number = sc.nextInt();
			gop=gop*number; 
		}
		
		String str = String.valueOf(gop);
		//System.out.println(str);
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		int[] count = new int[10];
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == '0') {
				zero=zero+1;
				count[0]=zero;
				
			}else if(str.charAt(i) == '1') {
				one=one+1;
				count[1]=one;
				
			}else if(str.charAt(i) == '2') {
				two=two+1;
				count[2]=two;
				
			}else if(str.charAt(i) == '3') {
				three=three+1;
				count[3]=three;
				
			}else if(str.charAt(i) == '4') {
				four=four+1;
				count[4]=four;
				
			}else if(str.charAt(i) == '5') {
				five=five+1;
				count[5]=five;
				
			}else if(str.charAt(i) == '6') {
				six=six+1;
				count[6]=six;
				
			}else if(str.charAt(i) == '7') {
				seven=seven+1;
				count[7]=seven;
				
			}else if(str.charAt(i) == '8') {
				eight=eight+1;
				count[8]=eight;
				
			}else if(str.charAt(i) == '9') {
				nine=nine+1;
				count[9]=nine;
				
			}
		}

		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}
}

class Main {
    public static void main(String[] args) {
 
 
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int result= num1* num2* num3;
        int[] number= new int[10];
        while(result>0)
        {
            number[result%10]++;
            result/=10;
        }
 
        for(int a: number)
        {//각 숫자 갯수 출력
            System.out.println(a);
        }
 
    }
}



