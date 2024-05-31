import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        Collection<String> nomes = Stream.of("John", "Jane", "Bob").collect(Collectors.toCollection(ArrayList::new));
        nomes.forEach(System.out::println);
        Stream.of("João", "Flávia", "Carina").toList().forEach(System.out::println);




    }
}
