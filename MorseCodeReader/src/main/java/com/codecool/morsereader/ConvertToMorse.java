package com.codecool.morsereader;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ConvertToMorse extends Converter {

    ArrayList<String> codes = new ArrayList<>();
    String inputWord;

    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a your char(s)/word(s): ");
        inputWord = scan.next().toLowerCase();
    }

    public void checkInput() {
        Morse morse = new Morse();
        Map<String, String> morses = morse.getMorses();
        for (int i = 0; i < inputWord.length(); i++) {
            for (String key : morses.keySet()) {
                String value = morses.get(key);
                char keyChar = key.toString().charAt(0);
                if (inputWord.charAt(i) == keyChar) {
                    codes.add(value);
                }
            }

        }
    }
    public void printResult(){
            for(String code : codes){
                System.out.print(code + "  ");
            }
    }
}
