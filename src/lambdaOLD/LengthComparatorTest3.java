package lambdaOLD;
import java.util.Arrays;
import java.util.Iterator;

public class LengthComparatorTest3 {
public static void main(String[] args) {

String[] strings= {"Renjith", "Neethuuuuuuuuuuuuuuuuuuu", "Antoniooooo"};
for (String st : strings) {	
	System.out.println(st);
}
System.out.println("*****************************************************");
//Arrays.sort(strings , new LengthComparator());
//
//**************************1functional interface here
//Arrays.sort(strings , 
//		(String first, String second ) -> Integer.compare(first.length(), second.length())
//				);


//**************************1functional interface here    2
Arrays.sort(strings , 
		(String first, String second ) -> {
			if (first.length()< second.length()) return -1;
			else if (first.length()> second.length()) return  1;
			else return 0;
			}
);

//**************************1functional interface here  5

	/*int a = 	() ->{
			for  (int i = 0; i < strings.length; i++) {
				System.out.println("@@@@@@@@@@@@@@@@@''''''");
			}
		};*/

for (String st : strings) {
	System.out.println(st);
	
}
	
}
}
