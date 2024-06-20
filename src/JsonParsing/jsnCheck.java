package JsonParsing;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsnCheck {
	
	public static void parseObject(JSONObject json, String key)
	{
		System.out.println(json.get(key)); // will return the value of the key here.
	}
	
	public static void getKey(JSONObject json, String key)
	{
		boolean exists = json.has(key);
		Iterator<?> keys;
		String nextKeys;
		
		if(!exists)
		{
			//When you call json.keys() on this JSON object,
			//it will return an Iterator over the keys "name", "age", "city", and "info".
			
			keys = json.keys(); // Getting the keys iterator, returns an Iterator over the keys.
			while(keys.hasNext())
			{
				nextKeys = (String) keys.next();
				try {
					     Object value = json.get(nextKeys);
					if ( value instanceof JSONObject)
					{
						if(exists == false) // checking if reqd key exists or not.
						{
							getKey(json.getJSONObject(nextKeys), key); // Traversing nested JSONObject.
						}else if( value instanceof JSONArray){
							 JSONArray jsonArray = json.getJSONArray(nextKeys);
							 for ( int i=0; i< jsonArray.length(); i++)
							 {
								 String jsonArrayString = jsonArray.get(i).toString();
								 JSONObject innerJson = new JSONObject(jsonArrayString);
								 if(exists == false) 
								 {
									 getKey(innerJson,key);
								 }
								 
								 
							 }
							
						}


					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}else
		{
			parseObject(json, key);
			
		}
	}
	
	public static void main(String[] args) {
		
		String s = "{\n"
				+ "    \"claim_loss_type_cd\": \"TEL\",\n"
				+ "    \"claim_type\": \"002\",\n"
				+ "    \"claim_reason\": \"002\",\n"
				+ "    \"policy_number\": \"1234kkk3f002\",\n"
				+ "    \"info\": {\n"
				+ "        \"ApplicationContext\": {\n"
				+ "            \"country\": \"US\"\n"
				+ "        }\n"
				+ "    }\n"
				+ "}";
		String s2 ="{\"id\":123,\"name\":\"PankajKumar\",\"permanent\":true,\"address\":{\"street\":\"ElCaminoReal\",\"city\":\"SanJose\",\"zipcode\":95014},\"phoneNumbers\":[9988664422,1234567890],\"role\":\"Developer\"}";
		
		
		
		JSONObject js = new JSONObject(s2);
		
		getKey(js, "phoneNumbers");
		
		
	}
	

}
