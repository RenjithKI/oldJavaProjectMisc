package lambdaOLD;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class forEachAAA
 {
public static void main(String[] args) {

String[] strings= {"Renjith", "Neethuuuuuuuuuuuuuuuuuuu", "Antoniooooo"};
Arrays.sort(strings , new LengthComparator());
//
//for (String st : strings) {
//	System.out.println(st);	
//}

List list1 = Arrays.asList(strings);

list1.forEach(System.out::println);
	
}
}