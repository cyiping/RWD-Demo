package course.c11.ajax;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class JsonUtility {

	static JsonObject data(String teacher) {		
		JsonObject json = new JsonObject();
		json.add("teacher", new JsonPrimitive(teacher));
		json.add("price", new JsonPrimitive(2000));
		JsonArray courses = new JsonArray();
		courses.add("OCAJP");
		courses.add("OCPJP");
		json.add("courses", courses);
		return json;
	}
	
	public static void main(String[] args) {
		System.out.println(JsonUtility.data("Jim"));

	}

}
