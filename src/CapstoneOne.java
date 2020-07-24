import java.util.Scanner;

public class CapstoneOne {

	public static void main(String[] args) {
		System.out.println("Welcome to the piglatin translator");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter one or more words that you would like to translate to Pig Latin: ");
        final String userInput = scan.nextLine();
        scan.close();

        String[] word = userInput.split(" ");
        String output = "";

        for (int i = 0; i < word.length; i++) {
            String pigLatinWord = translateWord(word[i]);
            output += pigLatinWord + " ";
        }

        System.out.println("Original Word(s): " + userInput);
        System.out.println("Translation: " + output );
   }

    public static String translateWord(String word) {
        String lowerCaseWord = word.toLowerCase();
        int pos = -1; 
        char ch;

        for (int i = 0; i < lowerCaseWord.length(); i++) {
            ch = lowerCaseWord.charAt(i);

            if (isVowel(ch)) {
                pos = i;
                break;
            }
        }

        if (pos == 0) {
            return lowerCaseWord + "way"; 
        } else {
            String a = lowerCaseWord.substring(pos);
            String b = lowerCaseWord.substring(0, pos);
            return a + b + "ay"; 
        }
   }

    public static Boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            return true;
        }
        return false;
   }


}


