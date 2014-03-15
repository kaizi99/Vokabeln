package com.kaizi99.vokabeln;

public class Vokabel {

	private int id;
	private String english;
	private String deutsch;
	
	public Vokabel(int id)
	{
		VokabelReader reader = null;
		
		try
		{
			reader = new VokabelReader(new Integer(id).toString());
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		this.id = id;
		english = reader.getEnglish();
		deutsch = reader.getDeutsch();
		
		writeVokabel();
	}
		
	public void writeVokabel()
	{
		System.out.println("ID: " + id);
		System.out.println("Deutsch: " + deutsch);
		System.out.println("Englisch: " + english);
		System.out.println("");	
	}
	
	int getID()
	{
		return id;
	}
	
	String getDeutsch()
	{
		return deutsch;
	}
	
	String getEnglish()
	{
		return english;
	}
	
	boolean TestVoc(String s)
	{
		if(s == english)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
