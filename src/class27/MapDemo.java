package class27;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> data = new HashMap<>();
        data.put("UserNamne","Rimma");// This is how we staote info inside the map
        data.put("Password","Rimma123");
        System.out.println(data);
        System.out.println(data.get("Password"));
        System.out.println(data.get("UserName"));

    }
}
