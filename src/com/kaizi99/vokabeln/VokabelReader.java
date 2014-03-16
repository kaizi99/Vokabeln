package com.kaizi99.vokabeln;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.kaizi99.utils.Statics;

public class VokabelReader {

	private static final String FILE_DIR = Statics.FILE_DIR();
	
	private int id;
	private String deutsch;
	private String english;
	
	public VokabelReader(int id) throws IOException
	{	
		String file = FILE_DIR + id + ".voc";
		
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		this.id = id;
		deutsch = reader.readLine();
		english = reader.readLine();
		
		reader.close();
		fr.close();
	}
	
	public String getDeutsch()
	{
		return deutsch;
	}
	
	public String getEnglish()
	{
		return english;
	}
	
	public int id()
	{
		return id;
	}
	
}
