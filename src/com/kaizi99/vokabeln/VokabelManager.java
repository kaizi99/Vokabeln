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
	
	public boolean checkVokabel(Vokabel voc,String english)
	{
		return vokabeln[voc.getID()].TestVoc(english);
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
	
	public int getRandom()
	{
		int zufallszahl = (int) (Math.random() *vokabeln.length+0);
		
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
