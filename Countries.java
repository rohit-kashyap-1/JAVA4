
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
