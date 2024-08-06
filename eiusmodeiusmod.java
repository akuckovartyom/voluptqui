import java.util.HashMap;
import java.util.Map;

public class FieldDefParser {

    /**
     * Parses the field definition string into a Map.
     * 
     * @param fieldDef the field definition string in the form "field1:type1,field2:type2"
     * @return a Map where keys are field names and values are field types
     */
    public Map<String, String> parse(String fieldDef) {
        Map<String, String> resultMap = new HashMap<>();
        
        if (fieldDef == null || fieldDef.isEmpty()) {
            return resultMap;
        }
        
        String[] pairs = fieldDef.split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            if (keyValue.length == 2) { // Ensure that the pair contains both field and type
                String field = keyValue[0].trim();
                String type = keyValue[1].trim();
                resultMap.put(field, type);
            }
        }
        
        return resultMap;
    }

    public static void main(String[] args) {
        FieldDefParser parser = new FieldDefParser();
        String fieldDef = "username:String,age:Int,salary:Float";
        
        Map<String, String> parsedFieldDef = parser.parse(fieldDef);
        
        // Output the parsed map
        for (Map.Entry<String, String> entry : parsedFieldDef.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
