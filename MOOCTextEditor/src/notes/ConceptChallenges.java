package notes;

import document.BasicDocument;
import document.Document;
import document.EfficientDocument;

public class ConceptChallenges {

//    public Document d = new EfficientDocument("Splitting a string, it's as easy as 1 2 33!  Right?");
    public Document d = new EfficientDocument("this is a test.23,54,390.");

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

    public static void main(String... args) {
        ConceptChallenges pt = new ConceptChallenges();
        pt.string_challenge();
    }
}
