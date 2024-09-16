package consolex;
import colors.ConsoleColors;
public class Console{
    public static void log(Object msg){
        
        System.out.println(ConsoleColors.GREEN + msg + ConsoleColors.RESET);
    }
}