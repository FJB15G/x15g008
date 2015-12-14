package jp.ac.chibafjb.x15g008.kd151;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sin = new Scanner(System.in);
System.out.println("Aの入力-->");
float s1 = sin.nextFloat();
System.out.println("Bの入力-->");
float s2 = sin.nextFloat();
sin.close();
System.out.format("%.1f+%.1f=%f\n",s1,s2,(s1+s2));
System.out.format("%.1f-%.1f=%f\n",s1,s2,(s1-s2));
System.out.format("%.1f*%.1f=%f\n",s1,s2,(s1*s2));
System.out.format("%.1f/%.1f=%f\n",s1,s2,(s1/s2));
	}

}
