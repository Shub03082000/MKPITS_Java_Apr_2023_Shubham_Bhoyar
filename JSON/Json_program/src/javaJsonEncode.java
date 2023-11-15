import org.json.simple.JSONObject;

public class javaJsonEncode {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","sonu");
        jsonObject.put("age",new Integer(30));
        jsonObject.put("salary", new Integer(50000));
        System.out.println(jsonObject);
    }
}
