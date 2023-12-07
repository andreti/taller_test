import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        String word = "ABDEFGABEF";//ABDEFGABEF  , BBBB , GEEKSFORGEEKS
        List<String> split = Arrays.stream(word.split("")).toList();
        int longest = 0;
        for (int i = 0; i < split.size(); i++) {
            Set<String> longestTemp = new HashSet();
            longestTemp.add(split.get(i));
            for (int j = (i + 1); j < split.size(); j++) {
                if (longestTemp.contains(split.get(j))) break;
                longestTemp.add(split.get(j));

            }

            longest = Math.max(longestTemp.size(), longest);
        }

        System.out.println("the longest substring has " + longest + " characters");

    }
}
