import java.util.Scanner;

public class ReverseOrder { // public class [filename]
    public static void main(String[] args)
    {
        Scanner sentenceinput = new Scanner(System.in); //scans for user input for 'sentenceinput'
        System.out.print("Input your sentence: ");
        String sentence = sentenceinput.nextLine();

    
        char[] letters = new char[sentence.length()]; //copy on internet
        for(int i=sentence.length()-1; i>-1; i--) {
            letters[i] = sentence.charAt(i);  
        }
        for(int i=letters.length-1; i>-1; i--) {
            System.out.print(letters[i]);
        }
        System.out.println();
        System.out.println("--------------");
        String[]sent = sentence.split(" "); //use sentence split, copy on Internet
        String[]reversesentence = new String[sent.length];
        
        for(int i=0; i<=sent.length-1; i++) {
            int k = sent.length-1-i;
            String a = sent[k];
            reversesentence[i] = a;
        }
        String joinedString = String.join(" ", reversesentence);
        System.out.println(joinedString);
        System.out.println("--------------");
        int lastchar = (sentence.length()-1); //reverse sentences
        for(int i=(sentence.length()-1); i>-1; i--) {
            if (i == 0 || sentence.charAt(i-1) ==' ' ) //if i=0 or i meets a space
            {
                if(lastchar != sentence.length()-1) {System.out.print(" ");}  
                for (int k = i; k<=lastchar; k++)
                {
                    System.out.print(sentence.charAt(k));
                }
                lastchar = i-2;
            }
          }
        System.out.println();
        System.out.println("--------------"); //reverse words
        String wordreverse = ""; //start with an empty string
        for(int i=(sentence.length()-1); i>-1; i--) {
        //'sentence.length()-1' why have a '-1'? See below
        //index are 0 based, range of index is from 0 to length. Try delete '-1' and run code to see error
        //example: 'i like choco' has length of 12 if we start counting from 1. (sentence.length)
        //but indexes starts counting from 0 (0 based), so max index is just 11 => length-1.
            wordreverse = wordreverse + sentence.charAt(i);
            }
        System.out.print(wordreverse);
        System.out.print(sentence.length());
    }
}