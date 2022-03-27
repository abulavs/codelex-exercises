package io.codelex.arrays.practice;

import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<String>();
        wordList.add("lighthouse");
        wordList.add("motherboard");
        wordList.add("warehouse");
        wordList.add("mitsubishi");
        wordList.add("garbage");
        wordList.add("laptop");
        wordList.add("codelex");

        Random random = new Random();
        int myRand = random.nextInt(wordList.size());

        String word = wordList.get(myRand);
        char[] wordArray = new char[word.length()];
        for (int j = 0; j < word.length(); j++) {
            wordArray[j] = word.charAt(j);
        }

        char[] emptyWordArray = new char[wordArray.length];
        Arrays.fill(emptyWordArray, '_');

        Scanner input = new Scanner(System.in);
        int countForMisses = 0;
        int countForFinish = 0;
        String str = "";
        System.out.println("You have " + (word.length() + 1) + " moves to guess word.");
        boolean inputValidate = false;
        do {
            printOutWordMissesAndGuess(emptyWordArray, str);
            String letter = "";
            do {
                letter = input.nextLine().toLowerCase();
                if ((letter.length() > 1)) {
                    System.out.println("Only one letter allowed");
                } else {
                    inputValidate = true;
                }
            } while (!(inputValidate));

            for (int i = 0; i < word.length(); i++) {
                if (wordArray[i] == letter.charAt(0)) {
                    emptyWordArray[i] = letter.charAt(0);
                    countForMisses++;
                }
            }
            if (countForMisses <= 0) {
                str += letter;
            }
            countForMisses = 0;
            countForFinish++;
        } while (countForFinish != word.length() + 1);
        printOutWord(emptyWordArray);
        System.out.println();
        System.out.println("Game Over");
    }

    private static void printOutWordMissesAndGuess(char[] emptyWordArray, String str) {
        printOutWord(emptyWordArray);
        System.out.println();
        System.out.println("Misses : " + str);
        System.out.println();
        System.out.print("Guess :   ");
    }

    private static void printOutWord(char[] emptyWordArray) {
        System.out.println("Word :   " + Arrays.toString(emptyWordArray).replaceAll("\\[", "")
                .replaceAll("\\]", "").replaceAll(",", ""));
    }


}





