import java.net.URL;
import java.util.Scanner;

public class CheatSheet {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new URL("https://kavi-24.github.io").openStream());
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
        s.close();
    }
}