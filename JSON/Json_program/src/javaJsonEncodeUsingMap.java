import org.json.simple.JSONValue;

import java.util.HashMap;
import java.util.Map;

public class javaJsonEncodeUsingMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name","sonu");
        map.put("age",new Integer(25));
        map.put("salary",new Double(65000));
        String jsonObj = JSONValue.toJSONString(map);
        System.out.println(jsonObj);
    }
}
