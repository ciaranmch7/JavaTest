package ie.dit;

public class Tune{

private int x;

private String title;

private String altTtitle;

private String notation;

public Tune(int x, String title, String altTitle, String notation)
{
mX= x;
mNotation = notation;
mAltTitle = altTitle;
mNotation = notation;

}

public int getX()
{
	return mX;
}

public void setX(int x)
{
	mX = x;
}

public String getTitle()
{
	return mTitle;
}

public void setTitle(String title)
{
	mTitle = title;
}

public String getAltTitle()
{
	return mAltTitle;
}

public void setAltTitle(String title)
{
	mAltTitle = altTitle;
}

public String getNotation()
{
	return mNotation;
}

public void setNotation(String notation)
{
	mNotation = notation;
}

public static void main(String args[]){
	
	Integer i = x;
	String first = title;
	String second = altTitle;
	String third = notation;
	
	System.out.println(i.toString());
	System.out.println(first.toString());
	System.out.println(second.toString());
	System.out.println(third.toString());
	
	Tunebook obj = new Tunebook();
	obj.addStr();
	
}

interface Player{
	
	void play(){
		
		
		
	}
}


}