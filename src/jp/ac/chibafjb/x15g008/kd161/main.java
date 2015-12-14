package jp.ac.chibafjb.x15g008.kd161;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int a[] ={10,20};
int work[]={0};
work[0]=a[0];
a[0]=a[1];
a[1]=work[0];
System.out.println("test[0]"+ a[0]);
System.out.println("test[1]"+a[1]);
	}

}
