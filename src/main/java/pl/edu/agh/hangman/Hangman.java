package pl.edu.agh.hangman;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hangman {
	
	//String filePath = "C:\\Users\\student14\\Desktop\\Hangman\\java-hangman\\src\\main\\resources.Slowa.txt";
	
	private static FileReader fileReader;
	private static BufferedReader bufferedReader;
	
	
	public void readFile() throws IOException{
		try {
			File file = new File ("C:\\Users\\student14\\Desktop\\Hangman\\java-hangman\\src\\main\\resourcesSlowa.txt");		
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
    
    public static void main(String[] args) {
    }
}
