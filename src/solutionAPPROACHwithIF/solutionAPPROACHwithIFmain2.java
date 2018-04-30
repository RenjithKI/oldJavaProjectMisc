package solutionAPPROACHwithIF;
import java.util.Iterator;

public class solutionAPPROACHwithIFmain2 {
	//***** with interface in java 8
	static solutionAPPROACHwithINFjava8 solinf;
		
	public static void main(String[] args) {
	//	System.out.println("_______ends______1");
		int[] A= {0,123456789,2,3,    4,5,6,0,    0,0,7,99, 1,2};
		int K= 4;
		int ans = 0;
		try {
			//solinf.solutionMain(A, K);
			//ans = solutionAPPROACHwithINFjava8.getMAX(A);//  working7
			ans = solutionAPPROACHwithINFjava8.getMAX(A);//  working
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				System.out.println("_______ans______2"+  ans);
	}
}
	