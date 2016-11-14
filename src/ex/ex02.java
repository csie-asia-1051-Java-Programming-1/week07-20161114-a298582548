package ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int[]v2 = new int[v1];
		for(int i = 0;i<v1;i++){
		v2[i] = scn.nextInt();
	    }
	    System.out.println( Math.pow(fun1(v2,v1), 1/2f));
	    }

	public static float fun1(int[]v2,int v1){
		float v3 = 0;
		
		
	    for(int i = 0;i<v2.length;i++){
		v3+=v2[i];
	    }
		float v5 = var1(v3,v2,v1);
		return v5;
	}
	public static float var1(float v3,int[]v2,int v1){
	   float v4 = 0;
		for(int v = 0;v<v2.length;v++){
	    	v4 += Math.pow(v2[v]-v3/v1, 2);
	    }
	    float v5 = v4/v1;
	    
		return v5;	
	}
	

}


