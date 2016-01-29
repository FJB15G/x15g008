package jp.ac.chibafjb.x15g008.kd172;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int m=3; 
int n=2;
int c=5;
int g=3;
int x[] = new int[m];
int y[] = new int[n];
x[0]=1; x[1]=2; x[2]=3;
y[0]=7; y[1]=8;
int z[]= new int[c];
for(int i=0;i<x.length;i++){
	z[i] = x[i];
}
for(int i=0;i<y.length;i++){
	z[g] = y[i];
	g++;
}
System.out.print("z[]={");
for(int hairetu:z){
	System.out.print(hairetu);
	if(hairetu!=8){
		System.out.print(",");
	}
}
System.out.print("}");
	}

}