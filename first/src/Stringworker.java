import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Stringworker{
	public static void main(String[] args) {
		worker wk=new worker();
		  String[] arg = {"freq", ""};
		String FileName="D:/cloudsim/test.txt";
		switch(arg[0])
		{
		case "WC":
			{
			wk=new WordCount();
			readFile(wk,FileName);
			wk.display();

			break;
			}
		case "grep":
		{
			wk=new grep(arg[1]);
			readFile(wk,FileName);
			wk.display();

			break;
		}
		case "freq":
		{
			wk=new frequency();
			readFile(wk,FileName);
			wk.display();

			break;
		}
		default:
			{
				System.out.println("error in line 13 main");
				System.exit(0);
			}
			readFile(wk,FileName);
			wk.display();
		
		}
  }
 public  static void readFile(worker w,String Filename){
	 try{
		FileReader fileReader = new FileReader(Filename);
		BufferedReader sc = new BufferedReader(fileReader);
		String line=sc.readLine();
		
		String[] words;
		
			while (line!=null)
			{ w.OpenLine();
				w.ProcessLine(line);
				w.OpenWord();
				words=line.split(" ");
				for(String word:words){
					w.ProcessWord(word);
					}
				w.CloseWord();
				line=sc.readLine();
			}
				w.closeLine();
		fileReader.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
		
		
	
 }
 }


 