import org.json.simple.JSONArray;

public class JsonArrayEncode {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        jsonArray.add("sonu");
        jsonArray.add(new Integer(27));
        jsonArray.add(new Double(25000));
        System.out.println(jsonArray);
    }
}
