import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
        Predicate<Dog> agePredicate =(dog -> (dog.getAge()>3));
     Map<String , String>  dogMap=
             DogDataBase.getAll().stream().filter(agePredicate).collect(Collectors.toMap(Dog::getName,Dog::getKind));
        System.out.println(dogMap);

        //Map
        List<String> nextYearAgeList = DogDataBase.getAll().stream()
                .map(Dog::getName).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(nextYearAgeList);

    }
}
