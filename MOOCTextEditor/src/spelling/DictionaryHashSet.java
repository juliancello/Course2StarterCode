/**
 * 
 */
package spelling;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;


/**
 * A class that implements the Dictionary interface with a HashSet
 */
public class DictionaryHashSet implements Dictionary 
{
	
    // TODO: Add member variables and a constructor
    
    /** Add this word to the dictionary.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
	@Override
	public boolean addWord(String word) 
	{
	    //TODO: Implement this method
	    return false;
	}

	/** Return the number of words in the dictionary */
    @Override
	public int size()
	{
	    // TODO: Implemement this method
	    return 0;
	}
	
	/** Is this a word according to this dictionary? */
    @Override
	public boolean isWord(String s) {
	    // TODO: Implement this method
	    return false;
	}
	
}
