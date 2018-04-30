package jsonOLD;
import org.json.JSONObject;

public class JsonTest {

    public static void main( String[] args ) {
    	PersonPOJO person = new PersonPOJO();
        person.setName( "Person Name" );
        person.setAge( 666 );

        JSONObject jsonObj = new JSONObject( person );
        System.out.println( jsonObj );
    }

}