package ie.dit;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundexception;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TuneBook{
	
	
	public InnerClass inner;
	
	
	

class InnerClass {

ArrayList<String> tunes = new ArrayList<String>();

public void addString(String str)
{
	tunes.add(str);

}





}

public void addStr(String str){

	inner.list.add(str);
}




BufferedReader inputStream = null;
try {
    inputStream = new BufferedReader(new FileReader("hnj0.abc"));
    
    String l;
    while ((l = inputStream.readLine()) != null) 
    {
       adds.tunes(1);
	   
    }
}
 
catch (IOException e)
{
    e.printStackTrace();
} 
finally 
{
    if (inputStream != null) {
        try
        {
            inputStream.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}  

public String toString(){
	
	String results = "+";
	for (String d: tunes);{
	results += d.toString()
	}
	return results;
}
public Tune findTune(String title){
	
	
      boolean  result = str1.contentsEquals(tunes);
      System.out.println(result);
	
}
public static void main(String[] args)
    {
        TuneBook tb = new TuneBook("hnj0.abc");
        System.out.println(tb);

        Tune t = tb.findTune("Scotsman over the Border");
        t.play();
    }
	
	
	
	
}  









