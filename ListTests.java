import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
public class ListTests {
    @Test 
	public void testfilter() {
        List<String> list1 = new ArrayList<>();
        list1.add("fish");
        list1.add("meat");
        list1.add("juice");
        list1.add("cereal");
        list1.add("meat");

        String s1="fish";

        List<String> list2 = new ArrayList<>();
        list2.add("fish");
        list2.add("meat");
        list2.add("meat");
        // list2.add("juice");
        
        // ListExamples.StringChecker(s1)=true;
        assertEquals(list2, ListExamples.filter(list1, new StringChecker2()));

	}
}
