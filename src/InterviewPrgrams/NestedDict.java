package InterviewPrgrams;

import org.json.JSONArray;
import org.json.JSONObject;

public class NestedDict {
	public static void main(String[] args) {
		
	//String s = "{\"type\":\"donut\",\"batters\":{“batter”:[{\"id\":\"1001\",\"type\":\"Regular\"},{\"id\":\"1002\",\"type\":\"Chocolate\"},{\"id\":\"1003\",\"type\":\"Blueberry\"},{\"id\":\"1004\",\"type\":\"Devil'sFood\"}]}}";
	
      // Parse the JSON string into a JSONObject
		String jsonString = "{\"type\":\"donut\",\"batters\":{\"batter\":[{\"{\"batterid\":\"1001\",\"type\":\"Regular\"},{\"id\":\"1002\",\"type\":\"Chocolate\"},{\"id\":\"1003\",\"type\":\"Blueberry\"},{\"id\":\"1004\",\"type\":\"Devil'sFood\"}]}}";
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

    // String data ="{\"book\\\":{\\\"name\\\":\\\"HarryPotterandtheGobletofFire\\\",\\\"author\\\":\\\"J.K.Rowling\\\",\\\"year\\\":2000,\\\"characters\\\":[\\\"HarryPotter\\\",\\\"HermioneGranger\\\",\\\"RonWeasley\\\"],\\\"genre\\\":\\\"FantasyFiction\\\",\\\"price\\\":{\\\"paperback\\\":\\\"$10.40\\\",\\\"hardcover\\\":\\\"$20.32\\\",\\\"kindle\\\":\\\"$4.11\\\"}}}\"";
    // String data = "{\"book\":{\"name\":\"HarryPotterandtheGobletofFire\",\"author\":\"J.K.Rowling\",\"year\":2000,\"characters\":[\"HarryPotter\",\"HermioneGranger\",\"RonWeasley\"],\"genre\":\"FantasyFiction\",\"price\":{\"paperback\":\"$10.40\",\"hardcover\":\"$20.32\",\"kindle\":\"$4.11\"}}}";

   
     String data = "{\"employee\":[{\"id\":\"01\",\"name\":\"Amit\",\"department\":\"Sales\"},{\"id\":\"04\",\"name\":\"sunil\",\"department\":\"HR\"}]}";
     
     JSONObject js = new JSONObject(data);
    // System.out.println(js);
     JSONObject emp = js.getJSONObject("employee");
     System.out.println("JSONObject ==>" + emp);
    
   
     
}
}

