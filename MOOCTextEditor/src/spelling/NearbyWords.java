/**
 * 
 */
package spelling;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author UC San Diego Intermediate MOOC team
 *
 */
public class NearbyWords implements SpellingSuggest{
    
    Dictionary dict;
   
   public NearbyWords (Dictionary dict) 
   {
      this.dict = dict;
   }
   
   /** Return the list of Strings that are one modification away
    * from the input string.  
    * @param s
    * @param wordsOnly controls whether to return only words or any String
    * @return
    */
   public List<String> distanceOne(String s, boolean wordsOnly ) 
   {
	   // TODO: Implement this method
	   return null;
   }

   public void insertions(String s, List<String> currentList, boolean wordsOnly ) 
   {
	   // TODO: Implement this method  
   }

   public void changeChar(String s, List<String> currentList, boolean wordsOnly ) {
	   // TODO: Implement this method
   }
   public void deletions(String s, List<String> currentList, boolean wordsOnly ) 
   {
	   // TODO: Implement this method
   }

   @Override
   public List<String> suggestions(String word, int numSuggestions) {
	   // remove when ready to test working code below
	   return new LinkedList<String>();
	   /*
	   
	   // this method creates and calls your NearbyWords class for
	   // words nearby
	   List<String> queue = new LinkedList<String>();
	   HashSet<String> visited = new HashSet<String>();
	   List<String> retList = new LinkedList<String>();

	   // insert first node
	   queue.add(word);
	   visited.add(word);

	   // If you want to add the original word before starting, uncomment
	   // the line below
	   // retList.add(curr);

	   // perform BFS while dynamically building the tree
	   // pop from the queue, get all String permutations 1 away
	   // if not already visited, add those Strings to the queue
	   // if the String is a word in the dictionary, add it to the return list
	   int count = 0;  // only used for debugging
	   while(!queue.isEmpty() && retList.size() < numSuggestions) {
		     // Uncomment below for DEBUGGING SUPPORT, beware - large output
			 // System.out.println("****** ITERATION "+count+"*********");
		     // System.out.println(queue);
		    
		   // remove head
		   String curr = queue.remove(0);
		   // find neighboring Strings (not necessarily words)
		   List<String> neighbors = distanceOne(curr, false);
		   for(String n : neighbors) {
			   if(!visited.contains(n)) {
				   // mark visited
				   visited.add(n);
				   // add to the exploration queue
				   queue.add(n);
				   // if a word (and we need more suggestions), add to suggestion list
				   if(retList.size() < numSuggestions && dict.isWord(n)) {
					   retList.add(n);
				   }
			   }
		   }
		   count++;
	   }
	   return retList;
	   */
   }	

   public static void main(String[] args) {
	   /* testing code
	   String word = "i";
	   NearbyWords w = new NearbyWords(new DictionaryHashSet("data/dict.txt"));
	   List<String> l = w.distanceOne(word, true);
	   System.out.println("One away Strings for for \""+word+"\" are:");
	   System.out.println(l+"\n");

	   word = "tailo";
	   List<String> suggest = w.suggestions(word, 10);
	   System.out.println("Spelling Suggestions for \""+word+"\" are:");
	   System.out.println(suggest);
	   */
   }

}
