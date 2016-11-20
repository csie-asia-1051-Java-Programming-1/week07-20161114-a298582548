package ex;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		System.out.print(fun1(v1));

	}
	public static int fun1(int v1){
		if(v1 == 0){
			return 1;
		}else {
			return v1 * fun1(v1-1);
		}
	}

}
