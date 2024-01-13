package io.katho;

import java.io.IOException;

public class Anagram {

    public static void main(String[] args) throws IOException {
        
            AnagramService service = new AnagramService();
            service.anagramService(args);
            System.out.println("Anagream: ");        
    }
}
