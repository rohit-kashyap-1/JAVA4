import consolex.Console;
import java.util.Collections;
import java.util.LinkedList;
public class States{
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();
        states.add("Rajasthan");
        states.add("Delhi");
        states.add("West Bengal");
        states.add("Himachal");
        Collections.sort(states);
        Console.log(states);
        Collections.sort(states,Collections.reverseOrder());
        Console.log(states);
    }
}