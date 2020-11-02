package com.ansh;

import java.util.HashMap;
import java.util.Map;

public class innerclass 
{

	public static void main(String args[]) 
	{
	  Map<String,String> map = new HashMap<>();
	  map.put("myname", "ansh");
	  map.put("class" ,"BCA" );
	  map.put("hobby","don'tknew");
	 System.out.println(map.get("class"));
	
	}
}
