import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import zen.core.Zen;


public class WordCloud {

	public static void main(String[] args) throws FileNotFoundException {
		Zen.create(800, 800);
		ArrayList <String>		 words = new ArrayList <String>			();
		HashMap <String, Integer> count = new HashMap <String,Integer> () ;
		File f = new File("text");
		Scanner s = new Scanner(f);
		while (s.hasNext()){
			String word = s.next();
			word = word.toLowerCase();
			word = word.replaceAll("[^a-z]", "");
			words.add(s.next());
			
			if( count.containsKey(word)){
				int current = count.get(word);
				count.put(word, current + 1);
			}
			else{
				count.put(word, 1);
			}
			
		}
		
		
		
		
		
		
		
		
		
		words.add("hoola");
		words.add("li");
		words.add("Dipu Raj sucks");
		words.add("die");
		words.add("1 billion keshav points");
		words.add("navaho white");
		
			for(String word : count.keySet()){
				if(count.get(word) > 10){
				Zen.setFont("Times New Roman",Math.log( count.get(word) / 20));
				Zen.setColor(Zen.getRandomNumber(150,250), Zen.getRandomNumber(150,250), Zen.getRandomNumber(150,250));
				Zen.drawText(word, Zen.getRandomNumber(100, 700), Zen.getRandomNumber(100, 700));
			}
	}
	}

}
