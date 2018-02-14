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

public void setTitle(String title)
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


}