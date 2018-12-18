import java.util.Arrays;
import java.util.List;

public class Hello3 {


    public static void main(String[] args) {
        List<String> strings = createList();
        strings.forEach(System.out::println);
    }

    private static List<String> createList() {
        return Arrays.asList("one", "two", "three", "four", "five", "six", "seven");
    }

}
