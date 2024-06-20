package JsonParsing;

import org.json.JSONObject;

public class Jsoon {
	public static void main(String[] args) {
		String data = "{\n" +
			    "    \"book\": {\n" +
			    "        \"name\": \"Harry Potter and the Goblet of Fire\",\n" +
			    "        \"author\": \"J. K. Rowling\",\n" +
			    "        \"year\": 2000,\n" +
			    "        \"characters\": [\"Harry Potter\", \"Hermione Granger\", \"Ron Weasley\"],\n" +
			    "        \"genre\": \"Fantasy Fiction\",\n" +
			    "        \"price\": {\n" +
			    "            \"paperback\": \"$10.40\", \"hardcover\": \"$20.32\", \"kindle\": \"$4.11\"\n" +
			    "        }\n" +
			    "    }\n" +
			    "}";
		JSONObject js = new JSONObject(data);
		js.getJSONObject(data);
		
	}

}
