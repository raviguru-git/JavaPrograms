package IntrPrograms;

import org.json.JSONArray;
import org.json.JSONObject;

public class NestedDict {
	public static void main(String[] args) {
		
	//String s = "{\"type\":\"donut\",\"batters\":{“batter”:[{\"id\":\"1001\",\"type\":\"Regular\"},{\"id\":\"1002\",\"type\":\"Chocolate\"},{\"id\":\"1003\",\"type\":\"Blueberry\"},{\"id\":\"1004\",\"type\":\"Devil'sFood\"}]}}";
	
      // Parse the JSON string into a JSONObject
		String jsonString = "{\"type\":\"donut\",\"batters\":{\"batter\":[{\"id\":\"1001\",\"type\":\"Regular\"},{\"id\":\"1002\",\"type\":\"Chocolate\"},{\"id\":\"1003\",\"type\":\"Blueberry\"},{\"id\":\"1004\",\"type\":\"Devil'sFood\"}]}}";
      JSONObject jsonObject = new JSONObject(jsonString);

      // Access nested elements
      String type = jsonObject.getString("type");
      JSONObject batters = jsonObject.getJSONObject("batters");
      JSONArray batterArray = batters.getJSONArray("batter");

      // Print the nested elements
      System.out.println("Type: " + type);

      for (int i = 0; i < batterArray.length(); i++) {
          JSONObject batter = batterArray.getJSONObject(i);
          String id = batter.getString("id");
          String batterType = batter.getString("type");
          System.out.println("Batter " + (i+1) + " - ID: " + id + ", Type: " + batterType);
      }

		
}
}

