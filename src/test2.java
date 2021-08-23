import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test2 {


    public static void main(String[] args) {
        filterTest();
    }

    public static void filterTest() {
        List<String> list = Arrays.asList("java", "react", "angular", "javascript", "vue");

        long count = list.stream().filter(p -> p.startsWith("a")).count();

        System.out.println(count);
    }


    public void mapTest() {
        String[] testStrings = { "java", "react", "angular", "vue" };

        List<String> list = Stream.of(testStrings).map(test -> test.toUpperCase()).collect(Collectors.toList());

        list.forEach(test -> System.out.println(test));
    }

    public static void test(){

    }

}
