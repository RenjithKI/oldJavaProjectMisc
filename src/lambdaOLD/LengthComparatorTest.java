package lambdaOLD;
import java.util.Arrays;
import java.util.Iterator;

public class LengthComparatorTest {
public static void main(String[] args) {

String[] strings= {"Renjith", "Neethuuuuuuuuuuuuuuuuuuu", "Antoniooooo"};
Arrays.sort(strings , new LengthComparator());

for (String st : strings) {
	System.out.println(st);
	
}
	
}
}
