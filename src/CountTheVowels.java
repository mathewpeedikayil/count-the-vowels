/**
 * CountTheVowels.java
 * Created on 01/07/2023
 * Last modified on 01/07/2023
 * No copyright
 * This class represents count the vowels.
 * Version History: 1.0 - only pure code; 2.0 - comments added.
 *
 * @author Mathew Philip Peedikayil
 * @version 2.0
 */

import java.util.Scanner;

public class CountTheVowels {

    Scanner scn = new Scanner(System.in);

    private static final String WELCOME_MSG = "--- Welcome to Vowels Counter ! ---";
    private static final String QUIT_MSG = "--- Type 'quit' to end program at anytime ---";
    private static final String APP_QUIT_MSG = "Thanks for using the vowel counter !";
    private static final String ENTER_STRING_TXT = "Please enter a string: ";
    private static final String HAS_TXT = " has ";
    private static final String VOWELS_TXT = " vowels.";
    private static final String TIMES_TXT = " times.";
    private static final String A_OCCURS_TXT = "A occurs ";
    private static final String E_OCCURS_TXT = "E occurs ";
    private static final String I_OCCURS_TXT = "I occurs ";
    private static final String O_OCCURS_TXT = "O occurs ";
    private static final String U_OCCURS_TXT = "U occurs ";
    private static final String QUIT_TXT = "quit";

    private char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    private char chr;
    private String userInput;
    private String stringToCount;
    private int countOfA;
    private int countOfE;
    private int countOfI;
    private int countOfO;
    private int countOfU;
    private int lengthOfString;
    private int  numberOfVowels;
    private boolean isEnded;

    public void countVowels() {
        System.out.println(WELCOME_MSG);
        System.out.println(QUIT_MSG);
        System.out.println();
        isEnded = false;

        while (isEnded == false) {
            System.out.print(ENTER_STRING_TXT);
            userInput = scn.nextLine();
            stringToCount = userInput.toLowerCase();
            lengthOfString = stringToCount.length();
            numberOfVowels = 0;
            countOfA = 0;
            countOfE = 0;
            countOfI = 0;
            countOfO = 0;
            countOfU = 0;

            if(userInput.equals(QUIT_TXT)) {
                isEnded = true;
            } else {
                // total vowels present in the word
                for (int i = 0; i < lengthOfString; i++) {
                    chr = stringToCount.charAt(i);
                    if (chr == vowels[0] || chr == vowels[1] || chr == vowels[2] || chr == vowels[3] || chr == vowels[4]) {
                        numberOfVowels++;
                    }
                }

                // count of each vowel A,E,I,O and U
                for (int j = 0; j < lengthOfString; j++) {
                    chr = stringToCount.charAt(j);
                    if (chr == vowels[0]) {
                        countOfA++;
                    }
                    if (chr == vowels[1]) {
                        countOfE++;
                    }
                    if (chr == vowels[2]) {
                        countOfI++;
                    }
                    if (chr == vowels[3]) {
                        countOfO++;
                    }
                    if (chr == vowels[4]) {
                        countOfU++;
                    }
                }

                System.out.println(userInput + HAS_TXT + numberOfVowels + VOWELS_TXT);
                System.out.println(A_OCCURS_TXT + countOfA + TIMES_TXT);
                System.out.println(E_OCCURS_TXT + countOfE + TIMES_TXT);
                System.out.println(I_OCCURS_TXT + countOfI + TIMES_TXT);
                System.out.println(O_OCCURS_TXT + countOfO + TIMES_TXT);
                System.out.println(U_OCCURS_TXT + countOfU + TIMES_TXT);
                System.out.println();

            }
        }
        scn.close();
        System.out.println(APP_QUIT_MSG);
    }
}
