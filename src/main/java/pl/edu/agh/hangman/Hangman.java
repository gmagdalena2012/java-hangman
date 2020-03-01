package pl.edu.agh.hangman;

import java.util.HashSet;

public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    }
    
// public void runGame() {
//    	
//    	ArrayList<String> words = new ArrayList<>();
//    	for (int i=0; i<word.length(); i++) {
//    		
//    	}
//    
//    	Scanner scanner = new Scanner(System.in);
//    	String letter = scanner.nextLine();
//    	
//    	for (Words w: words) {
//    		if w.contains(letter) {
//    			
//    		}
//    	}
//    }
    
    //przypisywanie slow z pliku (wczytanie pliku w innej klasie) do Listy
    public ArrayList<String> getListOfWords() {
    	ArrayList<String> words = new ArrayList<>();
    	String line = null;
    	while((line = bufferedReader.readLine()) != null) {
    		words.add(line);
    	}
    }
    
    //pobieranie losowego slowa z Listy
    public String getRandomWord() {
    	Random random = new Random();
    	String randomIndex = random.nextInt(words.size());	
    	String word = words.get(randomIndex);
    	return word;
    }
    
    //ile liter ma slowo
    public int countLeters() {
    	return word.length();
    }
    
    //przypisanie kresek do dlugosci slowa
    public void printDashes() {
    	for (int i=0; i<word.length(); i++) {
    		System.out.println("_");
    	}
    }

    public boolean checkLetter() {
    	HashSet<String> letterSet = new HashSet<>();
    	for (int i=0; i<word.length(); i++) {
    		letterSet.add(word[i]);
    	}
    	if (letterSet.contains(inputLetter)) {
    		
    	}
    	
    
    }

    public static void main(String[] args) {
    }
}
