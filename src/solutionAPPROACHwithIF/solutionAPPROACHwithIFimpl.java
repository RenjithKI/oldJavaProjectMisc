package solutionAPPROACHwithIF;
import java.util.Iterator;

 class solutionAPPROACHwithIFimpl implements solutionAPPROACHwithIF {
	
	 public void solutionMain(int [] A, int K) {	
		 System.out.println("_______if1______");
		int LENGTH = A.length;
		
		System.out.println("_______if1______");
		
		int MAX_NUM= getMAX(A);		
		int MAXLENGTHHYPHON= getDIGITS(MAX_NUM);// hyphon maximum legth
		String paddedNUMBER = getPADDED_NUM(MAX_NUM, MAXLENGTHHYPHON );// 			
		String borderLINE= getborderLINE(K, MAXLENGTHHYPHON);	
		
		int numROWS= LENGTH/K;		
		if(LENGTH%K!=0){			numROWS++;}
		//System.out.println("__________1___"+numROWS);	
			printME(borderLINE);
			int rowcount=0;
			while (rowcount<numROWS)
			{				
				//printME(borderLINE);
				if (rowcount+1==numROWS) {// last line
					printME(getNUMBLINE2(K, MAXLENGTHHYPHON, A, rowcount, numROWS));
					if (LENGTH%K!=0){printME(getborderLINE(LENGTH%K, MAXLENGTHHYPHON));}
					else printME(borderLINE);
				} else {// regular line
					//System.out.println("__________1___  last line");	
					printME(getNUMBLINE2(K, MAXLENGTHHYPHON, A, rowcount, numROWS));
					printME(borderLINE);
				}
				
				
				rowcount++;
			}
	}
	 public String getNUMBER_LINE(int k, int mAXLENGTHHYPHON, int[] A, int rowcount) {
	String returnSTNG = "";	
	int start = rowcount*k;
	int currNum = A[start];
	int couter=0;
	while (couter<k){
	for (int i=0; i < k; i++) {// k times
		returnSTNG=getPADDED_NUM(currNum, mAXLENGTHHYPHON );
	}
	couter++;
	}
	return returnSTNG;
	}
//____________________________________________________________________
	 public void printME(String borderLINE) {
		System.out.println(borderLINE);		
	}
	 public String getNUMBLINE2(int k, int mAXLENGTHHYPHON, int [] A, int rowcount, int numROWS) {//k times 
		String returnSTNG = "|";
		
		if (rowcount+1 < numROWS){	// regular line			
						for (int i1 = k*rowcount; i1 < k*rowcount+k; i1++) {
						 returnSTNG= returnSTNG+getPADDED_NUM( A[i1],mAXLENGTHHYPHON )+"|";	
						// if (i1+1==k) {returnSTNG= returnSTNG+"|";}
						}					
		}else{				
						for (int i1 = k*rowcount; i1 < A.length; i1++) {   // last line 
						 returnSTNG= returnSTNG+getPADDED_NUM( A[i1],mAXLENGTHHYPHON )+"|";	
						// if (i1+1==k) {returnSTNG= returnSTNG+"|";}
						}
			
		}
		return returnSTNG;
	}
	private static String getborderLINE(int k, int mAXLENGTHHYPHON) {//k times 
		String returnSTNG = "";
		for (int i = 0; i < k; i++) {
			 returnSTNG = returnSTNG+"+";
					for (int i1 = 0; i1 < mAXLENGTHHYPHON; i1++) {
						returnSTNG= returnSTNG+"-";							
					}
					if (i+1==k) {returnSTNG= returnSTNG+"+";}	
		}
		return returnSTNG;
	}

	public void printBORDER(int [] array, int MAXLENGTHHYPHON,  int blocks) {		
		for (int i = 1; i < blocks; i++) {
			System.out.print("+");
			for (int ii = 1; i < MAXLENGTHHYPHON; ii++) {
				System.out.print("-");
				
			}			
		}
		
	}
//______________________------
	public String getPADDED_NUM(int someNUMBER , int MAXLENGTHHYPHON ) {
		int counter = MAXLENGTHHYPHON- getDIGITS(someNUMBER);
		String returnSting = Integer.valueOf(someNUMBER).toString();
		for (int i = 0; i < counter; i++) {
			returnSting= " "+returnSting;
		}
		return returnSting;
		
	}
	public int getDIGITS(int mAX) {
		int ans = (int) Integer.valueOf
				(mAX).toString().length();			
		return ans;
	}
	public int getMAX(int[] a) {
		int temp = a[0];
		for (int i : a) {
			if (i >temp) {
				temp =i;
			} 
		}
		return temp;
	}	
//end 	
}

