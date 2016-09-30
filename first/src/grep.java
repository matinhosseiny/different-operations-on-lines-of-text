
public class grep extends worker{
	int LC;
	
	String line;
	grep(){
		LC=0;
		
		
				
	}
String Word_search;

	grep(String word){
		
		Word_search=word;		
	}
	void ProcessLine(String Line)
	{
		line=Line;
		LC++;
		
		
	}
	void ProcessWord(String word)
	{
		
		if (word.equals(Word_search))
			System.out.println(LC+": "+line);
		
		
	}
	

}


