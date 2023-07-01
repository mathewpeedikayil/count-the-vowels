import java.util.Scanner;

public class CountTheVowels {

    private static final String WELCOME_MSG = "--- Welcome to Vowels Counter ! ---";
    private static final String ENTER_STRING_TXT = "Please enter a string: ";
    private static final String HAS_TXT = " has ";
    private static final String VOWELS_TXT = " vowels.";

    private char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    private char chr;
    private String userInput;
    private String stringToCount;
    private int lengthOfString;
    private int  numberOfVowels;


    public void countVowels() {
        System.out.println(WELCOME_MSG);
        System.out.print(ENTER_STRING_TXT);
        Scanner scn = new Scanner(System.in);

        userInput = scn.nextLine();
        stringToCount = userInput.toLowerCase();
        lengthOfString = stringToCount.length();
        numberOfVowels = 0;

        for(int i = 0; i < lengthOfString; i++) {
            chr = stringToCount.charAt(i);
            if(chr == vowels[0] || chr == vowels[1] || chr == vowels[2] || chr == vowels[3] || chr == vowels[4]) {
                numberOfVowels++;
            }
        }

        System.out.println(userInput + HAS_TXT + numberOfVowels + VOWELS_TXT);
    }
}
