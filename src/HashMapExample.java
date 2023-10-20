import java.util.HashMap;

public class HashMapExample {
    public static void show() {
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("John", 123456789);
        phonebook.put("Jane", 987654321);
        System.out.println(phonebook.get("John"));
    }
}