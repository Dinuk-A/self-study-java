package org.example.utils.jsonnnn;

//cant do with jackson , needed a new dependancy
import org.json.JSONArray;
import org.json.JSONObject;

//dont need to rely on a class

public class JSONObjectExm {

    //########### from json #############

    // 01 === for a single object
    public static void fromJObject() {

        String jsonString = "{\"name\":\"John Doe\",\"age\":30}";

        JSONObject jObj = new JSONObject(jsonString);

        String name = jObj.getString("name");
        int age = jObj.getInt("age");

        System.out.println(name);
        System.out.println(age);

    }

    // 02 === for array of json objs
    public static void jsonArrayConvert() {

        String jsonArrayString = "[{\"name\":\"John Doe\",\"age\":30}, {\"name\":\"Dinuka\",\"age\":27}]";

        JSONArray jArray = new JSONArray(jsonArrayString);

        System.out.println("jArray" + jArray);

        // loop through the array
        for (int i = 0; i < jArray.length(); i++) {

            // JSONObject jObj = new JSONObject(i);

            JSONObject jObj = jArray.getJSONObject(i);

            String name = jObj.getString("name");
            int age = jObj.getInt("age");

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        }

    }

    /*
     * [
    {
        "name": "John Doe",
        "age": 30,
        "contact": {
            "phone": "1234567890",
            "email": "john@example.com"
        },
        "address": {
            "city": "New York",
            "zipcode": "10001",
            "street": {
                "name": "5th Ave",
                "number": "100"
            }
        }
    },
    {
        "name": "Dinuka",
        "age": 27,
        "contact": {
            "phone": "0987654321",
            "email": "dinuka@example.com"
        },
        "address": {
            "city": "Colombo",
            "zipcode": "10100",
            "street": {
                "name": "Main Street",
                "number": "200"
            }
        }
    }
]

     */

    // 03 === for deep nested objects by chatgpt
    public static void nestedJObjects() {
        String jsonArrayString = "[{\"name\":\"John Doe\",\"age\":30,\"contact\":{\"phone\":\"1234567890\",\"email\":\"john@example.com\"},\"address\":{\"city\":\"New York\",\"zipcode\":\"10001\",\"street\":{\"name\":\"5th Ave\",\"number\":\"100\"}}}, {\"name\":\"Dinuka\",\"age\":27,\"contact\":{\"phone\":\"0987654321\",\"email\":\"dinuka@example.com\"},\"address\":{\"city\":\"Colombo\",\"zipcode\":\"10100\",\"street\":{\"name\":\"Main Street\",\"number\":\"200\"}}}]";

        // Parse the JSON string into a JSONArray
        JSONArray jArray = new JSONArray(jsonArrayString);

        // Loop through the array
        for (int i = 0; i < jArray.length(); i++) {
            // Get the current JSONObject
            JSONObject jObj = jArray.getJSONObject(i);

            // Extract properties from the JSON object
            String name = jObj.getString("name");
            int age = jObj.getInt("age");

            // Handling nested objects (contact)
            JSONObject contactObj = jObj.getJSONObject("contact");
            String phone = contactObj.getString("phone");
            String email = contactObj.getString("email");

            // Handling deeply nested objects (address > street)
            JSONObject addressObj = jObj.getJSONObject("address");
            String city = addressObj.getString("city");
            String zipcode = addressObj.getString("zipcode");

            JSONObject streetObj = addressObj.getJSONObject("street");
            String streetName = streetObj.getString("name");
            String streetNumber = streetObj.getString("number");

            // Output the results
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Phone: " + phone);
            System.out.println("Email: " + email);
            System.out.println("City: " + city);
            System.out.println("Zipcode: " + zipcode);
            System.out.println("Street Name: " + streetName);
            System.out.println("Street Number: " + streetNumber);
            System.out.println("-----");
        }
    }

     //########### to json #############

     //04 === create a json array
     public static void createJsonArray() {
         
        //create an empty json array
        JSONArray jsonArray = new JSONArray();

        //create Json objects
        JSONObject p1 = new JSONObject();
        p1.put("name", "dinuka");
        p1.put("age", 27);

        //create another obj for nested JsonObjs
        JSONObject address = new JSONObject();
        address.put("code", 001);
        address.put("city", "col");

        //combine that new object to main obj( address-> person)
        p1.put("address", address);

        //create person 2 and his address
        JSONObject p2 = new JSONObject();
        p2.put("name", "prampd");
        p2.put("age", 25);

        JSONObject address2 = new JSONObject();
        address.put("code", 001);
        address.put("city", "col");

        p2.put("address", address2);

        //add these completed objects to array
        jsonArray.put(p1);
        jsonArray.put(p2);

        System.out.println(jsonArray.toString());
        System.out.println();
        System.out.println(jsonArray.toString(4)); //indentation level when formatting the JSON output.

     }
}
