
public class WordCount extends worker   {

	int LC;
	int WC;
	int CC;
	WordCount(){
		LC=0;
		CC=0;
		WC=0;
				
	}
	void ProcessLine(String Line)
	{
		LC++;
		CC+=Line.length();
		System.out.println("im here!");
	}
	void ProcessWord(String word)
	{
		WC++;
		
		
	}
	void display()
	{
		System.out.println("word count:"+WC);
	}
}
