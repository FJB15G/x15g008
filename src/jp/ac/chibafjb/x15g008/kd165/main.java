package jp.ac.chibafjb.x15g008.kd165;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int m = 3;
		int a[] = new int[m];
		int b[] = new int[m];
		int c =0;
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		for (; m-1>=0;m--) {
			b[c]=a[m-1];
			System.out.println("b["+c+"] = "+b[c]);
		c++;
		}

	}
}