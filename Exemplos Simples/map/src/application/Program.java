package application;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new HashMap<>();

        cookies.put("user_001", "nick_001");
        cookies.put("user_002", "nick_011");
        cookies.put("user_003", "nick_111");
        cookies.put("user_004", "nick_112");

        System.out.println(cookies.get("user_001"));

        for (String key: cookies.keySet()) {
            System.out.printf("%s : %s %n", key, cookies.get(key));
        }
    }
}
