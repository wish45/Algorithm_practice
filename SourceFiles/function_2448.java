package function;

import java.util.*;
 
public class function_2448{
	
	static void tri(int n,int x,int y){
	        
	        if(n==3){ //�ϳ��� �ﰢ�� �׸���
	            arr[x][y]='*';
	            arr[x+1][y+1]='*';
	            arr[x+1][y-1]='*';
	            arr[x+2][y+2]='*';
	            arr[x+2][y+1]='*';
	            arr[x+2][y]='*';
	            arr[x+2][y-1]='*';
	            arr[x+2][y-2]='*';
	            
	           
	            return;
	        }
	        
	        int tmp=n/2;
	        
	        tri(tmp,x,y);
	        tri(tmp,x+tmp,y+tmp);
	        
	        tri(tmp,x+tmp,y-tmp);
	        
	    }
	 
    static char[][] arr;


    public static void main(String[] args){
        
        Scanner kbd=new Scanner(System.in);
        
        int n=kbd.nextInt();
                
        arr=new char[n][n*2]; //����,���� ���� ���� ����
        
        for(int i=0;i<n;i++)
            Arrays.fill(arr[i],' '); //�������� �ʱ�ȭ
  

        tri(n,0,n-1); //(0,n-1)�ﰢ���� �� �� ������ ��ǥ
        
        
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
             
        

    }
    
}

