package notes;// Working with strings in Java

public class Notes {
    public static int hasLetter(String word, char letter) {
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == letter) {return i;}
        }
        return -1;
    }
}
