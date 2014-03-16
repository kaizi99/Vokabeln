package com.kaizi99.vokabeln;

public class VokabelManager {

	private int anzahlVokabeln;
	
	private Vokabel[] vokabeln;
	
	int[] benutzteVokabeln = new int[10];
	int benutzteVokabelnZaehler = 0;
	
	boolean vokabelTestFertig = false;
	
	public VokabelManager(int AnzahlVokabeln)
	{
		anzahlVokabeln = AnzahlVokabeln;
		
		vokabeln = new Vokabel[anzahlVokabeln];
		
		for(int i = 0; i < AnzahlVokabeln; i++)
		{
			vokabeln[i] = new Vokabel(i);
		}
	}
	
	public boolean checkVokabel(int id,String english)
	{
		return vokabeln[id].TestVoc(english);
	}
	
	public String getDeutsch(int id)
	{
		return vokabeln[id].getDeutsch();
	}
	
	public String getEnglish(int id)
	{
		return vokabeln[id].getEnglish();
	}
	
	public int getRandomVokabelID()
	{		
		int zufallszahl;
		
		do
		{
			zufallszahl = getRandom();
		}
		while(zufallszahl == -1);
		
		benutzteVokabeln[benutzteVokabelnZaehler] = zufallszahl;
		benutzteVokabelnZaehler++;
		
		return zufallszahl;
	}
	
	public Vokabel getVokabel(int id)
	{
		return vokabeln[id];
	}
	
	private int getRandom()
	{
		int zufallszahl = (int) (Math.random() * vokabeln.length + 0);
		
		for(int i = 0; i < 10; i++)
		{
			if(zufallszahl == benutzteVokabeln[i])
			{
				return -1;
			}
		}
		
		return zufallszahl;
	}
}
