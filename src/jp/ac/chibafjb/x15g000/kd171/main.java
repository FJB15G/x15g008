package jp.ac.chibafjb.x15g000.kd171;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	int	k=3;
int data[] = new int[k+1];
data[0]=100;
data[1]=200;
data[2]=300;
for(int a=2;a>=0;a--){
	data[a+1]=data[a];
	System.out.println(data[a]);
	if(a==0){
		data[a]=data[a+1];
		System.out.println(data[a]);
	}
	}
}
}