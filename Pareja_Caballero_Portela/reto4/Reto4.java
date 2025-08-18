import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Reto4 {
    public static Map<String, Integer> hash(List<Map.Entry<String, Integer>> pairs) {

        Map<String, Integer> map = pairs.stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (v1, v2) -> v1, 
                HashMap::new
            ));
        return map;
    }

 



    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> list = Arrays.asList(
            new AbstractMap.SimpleEntry<>("oro", 5),
            new AbstractMap.SimpleEntry<>("plata", 3),
            new AbstractMap.SimpleEntry<>("oro", 7),
            new AbstractMap.SimpleEntry<>("diamante", 10)
    
        );

        Map<String, Integer> result = hash(list);
        System.out.println(result); 
    }
}
