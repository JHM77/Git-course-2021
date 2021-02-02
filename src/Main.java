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
        String longest = longestString(series);
        System.out.println(shortest);
        System.out.println(longest);

    }

    public static String compareLength(List<String> series){

        String result = "";
        int currentLength = 0;
        int index = 1;

        for (String serie : series){
            if (index == 1){
                currentLength = serie.length();
            index = 2;
            }

            if (serie.length() < currentLength) {
                currentLength = serie.length();
                result = serie;
            }
        }

        return result;
    }

    public static String longestString(List<String> series){

        String result = "";
        int currentLength = 0;
        int index = 1;

        for (String serie : series){
            if (index == 1){
                currentLength = serie.length();
                index = 2;
            }

            if (serie.length() > currentLength) {
                currentLength = serie.length();
                result = serie;
            }
        }

        return result;
    }

}
