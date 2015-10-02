package spelling;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class SpellingSuggestNW implements SpellingSuggest {

	private NearbyWords nw;
	
	public SpellingSuggestNW(NearbyWords w) {
	  this.nw = w;
	}
	
	@Override
	public List<String> suggestions(String word, int numSuggestions) {
		//TODO: Implement this method
	    return new LinkedList<String>();
	}	



}
