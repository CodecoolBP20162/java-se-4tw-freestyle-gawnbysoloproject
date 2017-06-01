package com.codecool.morsereader;


import java.util.Scanner;

public class Reader {


    public String getchoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choice convert direction!");
        System.out.println("Character to morse (1)/ Morse to Character(2)!");
        String inputChoice = scan.next().toLowerCase();
        return  inputChoice;
    }

    public void start() {
        switch (getchoice()) {
            case "1":
                Converter charReader = new ConvertToMorse();
                charReader.getInput();
                charReader.checkInput();
                charReader.printResult();
                break;
            case "2":
                Converter codeReader = new ConvertToChar();
                codeReader.getInput();
                codeReader.checkInput();
                codeReader.printResult();
                break;
            default:
                System.out.println("Please choice 1/2 !!");
        }
    }

    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.start();
    }
}
