package jp.ac.chibafjb.x15g008.kd153;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner sin = new Scanner(System.in);
		 System.out.println("半径ｒ-->");
		 float s1 = sin.nextFloat();
		 sin.close();
		 
		 System.out.println("円周　="+Math.round(2*3.14*s1*10)/10f);
		 System.out.println("面積　="+Math.round(3.14*s1*s1*10)/10f);
	}

}
