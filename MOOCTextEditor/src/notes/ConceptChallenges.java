package notes;

import document.BasicDocument;
import document.Document;
import document.EfficientDocument;

public class ConceptChallenges {

//    public Document d = new EfficientDocument("Splitting a string, it's as easy as 1 2 33!  Right?");
    public Document d = new EfficientDocument("this is a test.23,54,390.");

    public static String s = "Neanderthall";
    private final char[] vowels = "aeiouy".toCharArray();

    public void string_challenge() {
//        System.out.println("A"+ d.getTokens("[1233]"));
//        System.out.println("B"+ d.getTokens("[1, 2, 33]"));
//        System.out.println("C"+ d.getTokens("[0-9]+")); // correct
//        System.out.println("D"+ d.getTokens("[1-3]*"));
//        System.out.println("E"+ d.getTokens("1|2|33")); // correct

        System.out.println("A"+ d.getTokens("[a-z0-9 ]+"));
        System.out.println("B"+ d.getTokens("[^.,]+"));
        System.out.println("C"+ d.getTokens("[a-z0-9]+")); // correct
        System.out.println("D"+ d.getTokens("[^ ]+"));
        System.out.println("E"+ d.getTokens("[a-z ]+|[0-9]+")); // correct
//        String s1 = new String("String 1");
//        String s2 = new String("String 1");
//        if (s1 == s2) {
//            System.out.println("Equal");
//        }
//        else {
//            System.out.println("Not equal");
//        }
//        String string1 = new String("Coursera");
//        System.out.println(string1.charAt(4));
//        System.out.println(string1.charAt(5));
//        System.out.println(string1[4]);
//        String s = "Hello";
//        s.concat(" World!");
//        System.out.println(s);
//        String text = "Practice, practice, practice!";
//        System.out.println(text.indexOf("prac"));
//        String text = "Hurray!!#! It's Friday! finally...";
//        String[] words = text.split("!+");

        String s1 = "This is a string";
        String s2 = new String("This is a string");
        String s3 = s2;
        String s4 = "This is a string";

        System.out.println("end");

    }

    protected int devCountSyllables(String word)
    {
        // TODO: Implement this method so that you can call it from the
        // getNumSyllables method in BasicDocument (module 2) and
        // EfficientDocument (module 3).

        // 1. Iterate through each character. If
        //
        // convert string to `char[]` array
        char[] chars = word.toCharArray();
        int count = 0;
        boolean isConsonant = false;
        // iterate over `char[]` array using enhanced for-loop
        for (char ch: chars) {
            System.out.print("current char: " + ch + " "); // debug
            for (char v: vowels) {
                if (ch == v) { // if ch is vowel
                    System.out.print("Vowel found. Count = " + count + " ");
                    if (word.indexOf(ch) == word.length() - 1) { // if ch is last
                        if (ch != vowels[1]) { // if ch is not 'e'
                            count++;
                        }
                        return count;
                    }
                    else { // if ch is not last
                        // if next char is a consonant
                        isConsonant = !(chars[word.indexOf(ch) + 1] == vowels[0] | chars[word.indexOf(ch) + 1] == vowels[1] | chars[word.indexOf(ch) + 1] == vowels[2] | chars[word.indexOf(ch) + 1] == vowels[3] | chars[word.indexOf(ch) + 1] == vowels[4] | chars[word.indexOf(ch) + 1] == vowels[5]);
                    }
                }
            }
            if (isConsonant) {
                count++;
                isConsonant = false;
            }
        }
        System.out.print("Count = " + count);
        return count;
    }

    public static void main(String... args) {
        ConceptChallenges pt = new ConceptChallenges();
        pt.devCountSyllables(s);
    }
}
