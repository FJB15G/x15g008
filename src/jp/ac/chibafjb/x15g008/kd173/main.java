package jp.ac.chibafjb.x15g008.kd173;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int	k=3;
int data[] = new int[k+1];
Scanner sin = new Scanner(System.in);
System.out.print("data[0]="); 
data[0] = sin.nextInt();
System.out.print("data[1]="); 
data[1] = sin.nextInt();
System.out.print("data[2]=");
data[2] = sin.nextInt();
System.out.print("data[3]=");
data[3] = sin.nextInt();
sin.close();
for(int a=0;a<data.length;a++){
System.out.println("data["+a+"]="+data[a]);
}

}
	}


