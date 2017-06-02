package com.codecool.morsereader;


import java.util.Map;
import java.util.Scanner;

public class ConvertToChar extends Converter {

    String characters = " ";
    String inputCode;

    @Override
    public void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter a your morse code: ");
        inputCode = scan.nextLine();
    }

    @Override
    public void checkInput() {
        Morse morse = new Morse();
        Map<String, String> morses = morse.getMorses();
        String[] splitToCodes = inputCode.split("\\s+");
        for (int i = 0; i < splitToCodes.length; i++) {
            for (Map.Entry<String, String> morse1 : morses.entrySet()) {
                if(splitToCodes[i].equals(morse1.getValue())){
                    characters += morse1.getKey();
                }
            }
        }
    }

    @Override
    public void printResult() {
            System.out.print(characters);
        }

 }

