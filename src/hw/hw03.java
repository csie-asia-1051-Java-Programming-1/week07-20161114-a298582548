package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        int v3 = v1-v2;
        System.out.print(fun1(v1)/(fun1(v2)*fun1(v3)));
		
	}
	public static int fun1(int v1){
		if(v1 == 0){
			return 1;
		}
		else{
			return v1*fun1(v1-1);
		}
		
	
	}
}
