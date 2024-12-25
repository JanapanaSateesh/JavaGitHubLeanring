package com.astec.collectionscls;

import java.util.HashMap;

public class MapExm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"1":"Padhma", "2", "Sateesh" -> Map=> Key value pair
	    //to add values we have to use PUT method
		//It has unique keys
		//It allow only one null key
		//It allows multiple null values
		//It doesn't follow insertion order
		//access values => .get(key)
		
		HashMap<String, String> hashmapvalues=new HashMap<String, String>();
		hashmapvalues.put("1", "Padhma");
		hashmapvalues.put("2", "Sateesh");
		hashmapvalues.put("1", "Sai");
		hashmapvalues.put(null, "Sai");
		hashmapvalues.put(null, "Sai");
		hashmapvalues.put("3", null);
		hashmapvalues.put("4", null);
		
		//System.out.println(hashmapvalues);
		
		for(String key:hashmapvalues.keySet()) {
			System.out.println(key+" "+hashmapvalues.get(key));
		}
		
		
	}

}
