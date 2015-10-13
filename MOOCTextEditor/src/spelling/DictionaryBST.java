package spelling;

import java.util.TreeSet;

/**
 * @author UC San Diego Intermediate MOOC team
 *
 */
public class DictionaryBST implements Dictionary 
{
    // TODO: Implement the dictionary interface using a TreeSet.  
	// You'll need a constructor here and at least one member variable.
	private TreeSet<String> dict;
	
	public DictionaryBST()
	{
		dict = new TreeSet<String>();
	}
    
	
    
    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
        String toAdd = word.toLowerCase();
        if (dict.contains(toAdd)) return false;
        dict.add(toAdd);
        return true;
    	// TODO: Implement this method
        //return false;
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
    	return dict.size();
        // TODO: Implement this method
        //return 0;
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
    	String toCheck = s.toLowerCase();
    	return dict.contains(toCheck);
    	
        //TODO: Implement this method
        //return false;
    }

}
