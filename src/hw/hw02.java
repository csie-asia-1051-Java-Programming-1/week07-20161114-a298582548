package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
        int v2 = 0;
        System.out.print(fun1(v1,v2));
	}
    public static int fun1(int v1,int v2){
    	if(v1 == 0){
    		return v2;
    	}
    	else{
			return (v2+1)+fun1(v1/10, v2);
    	}
    	
    }
    
}
