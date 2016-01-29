package jp.ac.chibafjb.x15g000.kd221;

public class AarrayProc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
int score[]=new int[100];

for(int i =0;100>i;i++){
	int random =(int)(Math.random()*999);
	score[i]=random;
}
for(int i:score)
	System.out.println(i);
	}

}
