package function;


public class function_4673 {
	
	public static int selfNum(int N) {
		int total=0; 
		
		if(N>=1 && N<=9) {
			total=N+N;
		}else if(N>=10 && 99>=N) {
			total=N+N/10+N%10;
		}else if(N>=100 && N<=999) {
			total=N+N%10+(N/10)%10+(N/10)/10;
		}else if(N>=1000 && N<=9999) {
			total=N+N%10+((N/10)%10)+((N/10)/10)%10+(((N/10)/10)/10)%10;
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		int[] array = new int[10036];//�����ѹ��� ������ �迭�� �ʱ�ȭ ���� 0���� �����ִ�.
		for(int i=1; i<=10000;i++) {
			array[selfNum(i)]=1;
			if(array[i]!=1) {
				System.out.println(i);
			}
		}
		
	}

}








