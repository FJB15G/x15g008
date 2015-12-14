package jp.ac.chibafjb.x15g008.kd152;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 Scanner sin = new Scanner(System.in);
 System.out.println("半径ｒ-->");
 float s1 = sin.nextFloat();
 sin.close();
 System.out.println("円周　="+(2*3.14*s1));
 System.out.println("面積　="+(3.14*s1*s1));
	}

}
