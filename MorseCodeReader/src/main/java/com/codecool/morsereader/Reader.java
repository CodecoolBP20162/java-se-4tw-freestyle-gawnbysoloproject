package com.codecool.morsereader;


import java.util.Scanner;

public class Reader {


    public String getchoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nCharacter to morse 1 / Morse to Character 2 / Exit 0!");
        String inputChoice = scan.next().toLowerCase();
        return  inputChoice;
    }

    public void start() {
        String choice = getchoice();
        while(!choice.equals("0")){
        switch (choice) {
            case "1":
                Converter charReader = new ConvertToMorse();
                charReader.getInput();
                charReader.checkInput();
                charReader.printResult();
                choice = getchoice();
            case "2":
                Converter codeReader = new ConvertToChar();
                codeReader.getInput();
                codeReader.checkInput();
                codeReader.printResult();
                choice = getchoice();
            case "0":
                break;
            default:
                System.out.println("Please choice 0 or 1 or 2 !!");
            }
        }
    }

    public void restart(){

    }

    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.start();
    }
}
