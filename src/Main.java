import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> series = new ArrayList<>();
        series.add("Rick and Morty");
        series.add("South park");
        series.add("The Mandalorian");
        series.add("Breaking Bad");
        series.add("Alternated Carbon");

        String shortest = compareLength(series);
        System.out.println(shortest);
    }

    public static String compareLength(List<String> series){

        String result = "";

        for (String serie : series){
            // Jämför Strings och spara Undan
            result = serie;
        }

        return result;
    }
}
