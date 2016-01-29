package jp.ac.chibafjb.x15g000.kd211;

public class ArrayProc {

	public int maxFind1(int num[],int a){ 
		int m=0;
		int i=0;
		while(i<a){
			if(num[i]>m){
				m=num[i++]; 
		
			}
		}
		return m;
	}
	public int maxFind2(int num[],int a){
		int  m = Integer.MIN_VALUE;
		int  i=0;
		for(;i<a;i++){
			if(num[i]>m){
		m=num[i];		
			}
		}
		return m;
	}
}