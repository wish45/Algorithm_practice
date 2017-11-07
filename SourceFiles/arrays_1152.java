package arrays;

import java.util.Scanner;
import java.util.StringTokenizer;


public class arrays_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());

		//String[] array = new String[st.countTokens()]; 
		int array= st.countTokens();
		
		System.out.println(array);
		
		
		
		
		
//		String[] array = new String[1000002];
//
//		String asd = sc.nextLine();
//		asd = asd.trim();
//		int count=0;
//		
////		for(int i = 0; i < asd.length(); i++)  {
//            //String c = String.valueOf(asd.charAt(i));
////			char s= asd.charAt(i);
////				if(s == ' ' ) {
////					count=count+1;
////				}
//					array = asd.split(" ");
//					for(int i=0; i<array.length; i++) {
//						count=count+1;		
//					}
//				
////		}
//		System.out.println(count);
//            if(c.equals(" "))   {
//                word = "";
//            }else   {
//                if(word.length() == 0)  {
//                    rslt++;
//                }
//                word = c;
//            }
//        }
//		str.charAt(0) // 0번째있는 문자 하나를 반환 
////	str.valueOf() 는 다른 타입의 변수를 스트링형으로 변환.
		
//		정수형을 문자열로 변환 (int to String)
//
//		- String str = Integer.toString(int i);
//
//		- String str = String.valueOf(int i);  



//			
//			if(array[i] == " ") {
//				blank=blank+1;				
//			}
//			
//			else if(array[0] == " " && array[i] == " ") {
//				blank=blank+1;
//			}
//			
//			else if(array[i] == " " && array[array.length-1] == " ") {
//				blank = blank+1;
//			}
//			else if(array[0] == " " && array[i] == " " && array[array.length-1] == " ") {
//				blank = blank+1;
//			}
//			
//		}
//		System.out.println(blank);
//		//		array=arrays.split(" ");
		//		
		//		int count=0;
		//		
		//		for(int i=0; i<array.length; i++) {
		//				count+=1;		
		//			
		//		}
		//		System.out.println(count);

	}
}

// 문자열을 입력받아서 " "가 있으면 단어로 인식해서 단어수만큼 출력이니까
// 근데 어제한거는 맨첨음이랑 끝에 스페이스가 들어갈수가 있으니까
//그 문제점을 해결하려면  ㅇㄴㅁㅇ  ㅇㄴㅁ 
