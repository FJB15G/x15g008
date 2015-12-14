package jp.ac.chibafjb.x15g008.kdT21;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sin = new Scanner(System.in);
System.out.print("ハンバーガーの個数-->");
double s1 =sin.nextDouble();
System.out.print("フライドポテトの個数-->");
double s2 = sin.nextDouble();

System.out.println("ハンバーガーの代金 ="+((int)(s1*100)));
System.out.println("フライドポテトの代金 ="+(int)(s2*180));
System.out.println("小計　　　　　　　　="+((int)(s1*100)+(int)(s2*180)));
 double g=(s1*100)+(s2*180);
System.out.println("消費税　　　　　　　　"+(int)(g*0.08));
double g2 =((int)g*0.08);
System.out.println(("合計金額")+(int)(g+g2));
System.out.print("受取金額　　　　　　-->");
double s3 = sin.nextDouble();
System.out.println("つり銭　　　　　　　="+(int)(s3-(int)(g+g2)));
sin.close();
	}

}
