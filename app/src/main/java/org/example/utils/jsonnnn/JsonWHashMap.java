package org.example.utils.jsonnnn;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;

//dont need a predefined class for this

//BUT ONLY USEFUL WHEN JSON Object HAS ONLY 2 PROPERTIES

//but we cant convert directly into a map without firsly converted into a list
//bcz json doesnt know what are keys and what are values
public class JsonWHashMap {

    // 01
    public static void convertTohMap() {

        String jsonArray = "[{\"name\":\"John Doe\",\"age\":30}, {\"name\":\"Jane Doe\",\"age\":50}]";

        try {

            ObjectMapper mapper = new ObjectMapper();

            // Step 1: Deserialize JSON Array into List of Maps
            List<Map<String, Object>> list = mapper.readValue(jsonArray,
                    new TypeReference<List<Map<String, Object>>>() {
                    });

            // Step 2: Convert List of Maps into a single Map
            Map<String, Object> resultMap = new LinkedHashMap<>();

            for (Map<String, Object> obj : list) {
                resultMap.put((String) obj.get("name"), obj.get("age"));
            }

            // Print the final map
            System.out.println(resultMap);

            // System.out.println(pplMap);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // why linkedhmap?

    /*
     * Maintains the insertion order of keys.
     * If the order of JSON objects matters (e.g., John Doe appears before Jane
     * Doe), LinkedHashMap ensures the order is preserved.
     */

}
