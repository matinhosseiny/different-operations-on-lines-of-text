import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class frequency extends worker {

	   HashMap<String, Integer> freq = new HashMap<String, Integer>();

	   void ProcessWord(String word)
		{
			
			if (freq.containsKey(word)){
				freq.put(word, (Integer)freq.get(word)+1);
			}
			else
				freq.put(word, 1);			
		}
	
	   void display(){
		   Iterator it = freq.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }
	   }

	

}




