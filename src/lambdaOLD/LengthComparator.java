package lambdaOLD;
import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

@Override
public int compare(String first, String second) {
	// TODO Auto-generated method stub
	int ans= Integer.compare(first.length(), second.length());
	//
	
	
	
	
	return ans;
	//
	
	
}
}
