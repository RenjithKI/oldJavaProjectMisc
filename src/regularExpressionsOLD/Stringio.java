package regularExpressionsOLD;
import java.util.Scanner;
import java.util.regex.*;
public class Stringio{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String c;
if((c=scan.nextLine())!=null)
 {
Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
Matcher match= pt.matcher(c);
    while(match.find()){
         c=c.replace(Character.toString(c.charAt(match.start())),"");
         }
    System.out.println(c);
      }
   }
}