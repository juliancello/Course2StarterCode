/**
 * 
 */
package spelling;

import java.util.ArrayList;
import java.util.List;


/**
 * @author leporter
 *
 * XXX: We (Leo, Mia, Christine) need to talk about this implementation 
 */
public class NearbyWords {
    
    Dictionary dict;
   
   public NearbyWords (Dictionary dict) 
   {
      this.dict = dict;
   }
   
   /** Return the list of Strings that are one modification away
    * from the input string.  They may not actually be words.
    * @param s
    * @return
    */
   public List<String> distanceOne(String s) 
   {
	   // TODO: Implement this method
	   return null;
   }
   
   public void insertions(String s, List<String> currentList) 
   {
       // TODO: Implement this method  
   }
   
   public void changeChar(String s, List<String> currentList) {
       // TODO: Implement this method
   }
   public void deletions(String s, List<String> currentList) 
   {
       // TODO: Implement this method
   }
   
}
