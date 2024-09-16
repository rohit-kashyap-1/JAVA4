### Console Colors

make a package colors and defined your own method to print in colors

```jsx
package consolex;
import colors.ConsoleColors;
public class Console{
    public static void log(Object msg){
        
        System.out.println(ConsoleColors.GREEN + msg + ConsoleColors.RESET);
    }
}
```

```java
package colors;
public class ConsoleColors {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
}
```

### Java Array List and Linked List

```jsx

import consolex.Console;
import java.util.ArrayList;

public class Countries {

    public static void main(String[] args) {
        Console console = new Console();
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("India");
        countries.add("Myammar");
        countries.add("Bangladesh");
        countries.add("China");

        System.out.println(countries);
        countries.remove(2);
        System.out.println(countries);
        countries.add(2,"USA");
        System.out.println(countries);
        countries.add(2,"Canada");
        System.out.println(countries);
        System.out.println(countries.get(0));
        System.out.println("Size of Countries: "+countries.size());
        System.out.println("Looping through the countries");
        for(String i: countries){
            System.out.println(i);
        }
        console.log("Addin elements to arrayList");
        //countries.addAll({})
        
        console.log(countries.contains("Russia"));
    }

}

```

Performanace Analysis between **ArrayList** vs **LinkedList**

| Feature | ArrayList | LinkedList |
| --- | --- | --- |
| **Data Structure** | Resizable Array | Doubly Linked List |
| **Access Time** | Fast (`O(1)`) | Slow (`O(n)`) |
| **Insert/Delete (Beginning/End)** | Slow (`O(n)`) | Fast (`O(1)`) |
| **Memory Usage** | Less memory overhead | More memory overhead |
| **Use Case** | Random access is frequent | Frequent insertion/removal |

### Array (LinkedList and ArrayList) Sort

```java
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
        Collections.sort(states); //sort in ascending order
        Console.log(states);
        Collections.sort(states,Collections.reverseOrder()); //sort in reverse
        Console.log(states);
    }
}
```

test
