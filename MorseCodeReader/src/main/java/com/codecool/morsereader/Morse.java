package com.codecool.morsereader;


import java.util.HashMap;
import java.util.Map;

public class Morse {

    Map<String, String> morses = new HashMap<String, String>()
            {{put("a", ".-"); put("b", "-..."); put("c", "-.-."); put("d", "..");
            put("e", "."); put("f", "..-."); put("g", "--."); put("h", "....");
            put("j", ".---"); put("k", "-.-"); put("l", ".-.."); put("m", "--");
            put("n", "-."); put("o", "---"); put("p", ".--."); put("q", "--.-");
            put("r", ".-."); put("t", "-"); put("u", "..-"); put("v", "..-");
            put("w", ".--"); put("x", "-..-"); put("y", "-.--"); put("z", "--..");
            }};

    public Map<String, String> getMorses(){
        return morses;
    }
}