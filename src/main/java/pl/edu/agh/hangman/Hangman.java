package pl.edu.agh.hangman.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
	
	//String filePath = "C:\\Users\\student14\\Desktop\\Hangman\\java-hangman\\src\\main\\resources.Slowa.txt";
	
	private static FileReader fileReader;
	private static BufferedReader bufferedReader;
	
	
	public void readFile() throws IOException{
		try {
			File file = new File ("C:\\Users\\student18\\Desktop\\Ewa\\java-hangman\\src\\main\\resources.txt");		
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = null;
			line = bufferedReader.readLine();
			}
			
		catch (IOException e) {
	        System.out.println("BŁĄD ODCZYTU Z PLIKU!");
		}
	}
    		
// Grafika, 6 prob. 
    		
public String drawHangMan() {
	int attempt = 6;
	switch(attempt) {
	case 1: return EmpltyDraw();
	
	case 2: return Head();
	
	case 3: return Body();
	
	case 4: return RightHand();
	
	case 5: return LeftHand();
	
	case 6: return RightLeg();
	
	default: return fullDrowing();
	}
}
  
public String EmpltyDraw() {
	         return "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========";
}

public String Head() {
	         return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========";
}

public String Body() {
             return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========";
}

public String RightHand() {
             return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========";
}

public String LeftHand() {
             return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========";
}

public String RightLeg() {
             return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========";
}

public String  fullDrowing() {
             return "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========";
    }
    

// public void scanLetter() {

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

	int tries = 6;
	int currentTries = 0;

	//skanowanie litery
	public void scanLetter() {
		 
		Scanner scanner = new Scanner(System.in);
		String inputLetter = scanner.nextLine();
	}

    //przypisywanie slow z pliku (wczytanie pliku w innej klasie) do Listy
    public ArrayList<String> getListOfWords(BufferedReader bufferedReader) {
    	ArrayList<String> words = new ArrayList<>();
    	String line = null;
    	while((line = bufferedReader.readLine()) != null) {
    		words.add(line);
    	}
    	return words;
    }
    
    //pobieranie losowego slowa z Listy
    public String getRandomWord(ArrayList<String> words) {
    	Random random = new Random();
    	int wordsSize = words.length();
    	String randomIndex = random.nextInt(0,wordsSize);	
    	String word = words.get(randomIndex);
    	return word;
    }
    
    //ile liter ma slowo
    public int countLeters(String word) {
    	return word.length();
    }
    
    //przypisanie kresek do dlugosci slowa
    public void printDashes(String word) {
    	for (int i=0; i<word.length(); i++) {
    		System.out.println("_");
    	}
    }
    
    //sprawdzenie litery
    public boolean checkLetter(String inputLetter, String word) {
    	boolean check = false;
    	ArrayList<String> letterList = new ArrayList<>();
    	for (int i=0; i<word.length(); i++) {
    		letterList.add(word.get(i));
    	}
    	if (letterList.contains(inputLetter)) {
    		return true;
    	}
    }
    
    //zastapienie kreski trafiona litera
    public void printDashesWithLetter(ArrayList<String> letterList, String inputLetter) {
    	 for (int i=0; i<letterList.size(); i++) {
    		 if (inputLetter.equals(letterList.get(i)) {
    			 System.out.println(inputLetter);
    		 }
    		 else {
    			 System.out.println("_");
    			 drawHangMan();
    		 }
    	 }
    }


    public static void main(String[] args) {
    	readFile();
    	printDashes(getRandomWord(getListOfWords(bufferedReader)));
    }
}
