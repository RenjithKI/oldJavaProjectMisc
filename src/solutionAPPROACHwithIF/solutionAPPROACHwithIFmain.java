package solutionAPPROACHwithIF;
import java.util.Iterator;

public class solutionAPPROACHwithIFmain {
	//**** with utility class
	static solutionAPPROACHwithIFimpl sol = new solutionAPPROACHwithIFimpl();
	//solutionAPPROACHwithIFimpl();
	public static void main(String[] args) {		
		int[] A= {0,123456789,2,3,    4,5,6,0,    0,0,7,99, 1,2};
		int K= 4;
		sol.solutionMain(A, K);
				//System.out.println("_______ends______");
	}
}
	