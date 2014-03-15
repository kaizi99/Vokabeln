package com.kaizi99.vokabeln;

public class VokabelManager {

	Vokabel[] vokabeln = new Vokabel[10];
	
	int[] benutzteVokabeln = new int[10];
	int benutzteVokabelnZaehler = 0;
	
	boolean vokabelTestFertig = false;
	
	public VokabelManager()
	{
		vokabeln[0] = new Vokabel(0);
		vokabeln[1] = new Vokabel(1);
		vokabeln[2] = new Vokabel(2);
		vokabeln[3] = new Vokabel(3);
		vokabeln[4] = new Vokabel(4);
		vokabeln[5] = new Vokabel(5);
		vokabeln[6] = new Vokabel(6);
		vokabeln[7] = new Vokabel(7);
		vokabeln[8] = new Vokabel(8);
		vokabeln[9] = new Vokabel(9);
	}
	
	public boolean checkVokabel(Vokabel voc,String english)
	{
		return vokabeln[voc.getID()].TestVoc(english);
	}
	
	public Vokabel getNewRandomVokabel()
	{
		boolean schonGebraucht = false;
		int zufallszahl = (int) (Math.random() * (10 - 0) + 0);
		int i = 0;
		do
		{
			if(zufallszahl == benutzteVokabeln[i])
			{
				schonGebraucht = true;
			}
			i++;
			if(i == 10)
			{
				zufallszahl = (int) (Math.random() * (10 - 0) + 0);
				i = 0;
			}
		} 
		while(!schonGebraucht);
		
		benutzteVokabeln[benutzteVokabelnZaehler] = zufallszahl;
		benutzteVokabelnZaehler++;
		
		return vokabeln[zufallszahl];
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
