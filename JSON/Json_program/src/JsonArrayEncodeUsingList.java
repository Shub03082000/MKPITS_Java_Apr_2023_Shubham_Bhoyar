import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.List;

public class JsonArrayEncodeUsingList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("sonu");
        list.add(new Integer[60]);
        list.add(new Double(45000));
        String jsonObj = JSONValue.toJSONString(list);
        System.out.println(jsonObj);
    }
}
