// conversion from Json to object example

package com.kashyap.json;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
 
public class FromJsonGsonExample {
    public static void main(String[] args) {
 
	Gson gson = new Gson();
 
	try {
 
		BufferedReader br = new BufferedReader(
			new FileReader("c:\\file.json"));
 
		//convert the json string back to object
		DataObject obj = gson.fromJson(br, DataObject.class);
 
		System.out.println(obj);
		
		/*
		*
		*	output :-
		*
		*	DataObject [data1=100, data2=hello, list=[String 1, String 2, String 3]
		*
		*/
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
    }
}
