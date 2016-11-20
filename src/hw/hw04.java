package hw;
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        System.out.print(fun1(v1,v2));
	}
	public static int fun1(int v1,int v2){
		if(v2 ==0){
			return v1;
		}
		else{
			return fun1(v2,v1%v2);
		}
	}

}
