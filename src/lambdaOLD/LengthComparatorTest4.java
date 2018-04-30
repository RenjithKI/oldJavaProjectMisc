package lambdaOLD;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class LengthComparatorTest4 {
private static Comparator<String> comp 
	= (first, second)
	->Integer.compare(first.length(), second.length());

public static void main(String[] args) {

String[] strings= {"Renjith", "Neethuuuuuuuuuuuuuuuuuuu", "Antoniooooo"};
//Arrays.sort(strings , new LengthComparator());


Arrays.sort(strings , comp);




for (String st : strings) {
	System.out.println(st);
	
}
	
}
}
