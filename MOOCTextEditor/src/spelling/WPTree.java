/**
 * 
 */
package spelling;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leporter
 *
 */
public class WPTree implements WordPath {

	// this is the root node of the tree being build between the two nodes
	private WPTreeNode root;
	
	public WPTree () {
		this.root = null;
	}
	
	// see method description in WordPath interface
	public List<String> findPath(String word1, String word2) 
	{
	    // TODO: Implement this method.
	    return new LinkedList<String>();
	}
	
	// Method to print a list of WPTreeNodes (useful for debugging)
	private String printQueue(List<WPTreeNode> list) {
		String ret = "[ ";
		
		for (WPTreeNode w : list) {
			ret+= w.getWord()+", ";
		}
		ret+= "]";
		return ret;
	}
	
}

// Tree Node in a WordPath Tree. This is a standard tree with each
// node having any number of possible children.  Each node should only
// contain a word in the dictionary and the relationship between nodes is
// that a child is one character mutation (deletion, insertion, or 
// substitution) away from its parent
class WPTreeNode {
    
    private String word;
    private List<WPTreeNode> children;
    private WPTreeNode parent;
    
    public WPTreeNode(String w, WPTreeNode p) {
        this.word = w;
        this.parent = p;
        this.children = new LinkedList<WPTreeNode>();
    }
    
    // precondition, s is not already a child of parent
    public WPTreeNode addChild(String s){
        WPTreeNode child = new WPTreeNode(s, this);
        this.children.add(child);
        return child;
    }
    
    public List<WPTreeNode> getChildren() {
        return this.children;
    }
    
    public List<String> buildPathToRoot() {
        WPTreeNode curr = this;
        List<String> path = new LinkedList<String>();
        while(curr != null) {
            path.add(0,curr.getWord());
            curr = curr.parent; 
        }
        return path;
    }
    
    public String getWord() {
        return this.word;
    }
    
    public String toString() {
        String ret = "Word: "+word+", parent = ";
        if(this.parent == null) {
           ret+="null.\n";
        }
        else {
           ret += this.parent.getWord()+"\n";
        }
        ret+="[ ";
        for(WPTreeNode curr: children) {
            ret+=curr.getWord() + ", ";
        }
        ret+=(" ]\n");
        return ret;
    }
    

}

