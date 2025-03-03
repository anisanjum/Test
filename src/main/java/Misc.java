import java.util.HashMap;

public class Misc {
    public static void main(String[] args) {
        String key=null;
        HashMap<String, String> map=new HashMap<>();
        map.put(key, "anis");
        System.out.println(map.get(key));

        System.out.println(map.get(key.toString()));
    }
}
