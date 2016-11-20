package ex;
import java.util.Scanner;
public class ex03 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int[][]v2=new int[v1][v1];
		for(int i = 0;i<v1;i++){
			for(int j = 0;j<v1;j++){
				v2[i][j] = scn.nextInt();
			}
		}
				System.out.print(fun1(v2,v1)+"\n"+Math.pow(fun1(v2,v1), 1/2f));
			
			}
	public static float fun1(int v2[][],int v1){
		float v3 = 0;
		float v4 = 0;
		for(int i = 0;i<v1;i++){
			for(int j = 0;j<v1;j++){
			v3+=v2[i][j];
		}
		}
	 for(int v = 0;v<v1;v++){
		 for(int h = 0;h<v1;h++){
	    	
			v4 = (float) Math.pow(v2[v][h]-(v3/v1), 2);
	    }
	 }
	    float v5 = v4/(v1*v1);
	
		return  v5;	
		}
	
	
	

	}	

