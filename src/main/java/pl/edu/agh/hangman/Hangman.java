package pl.edu.agh.hangman;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
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
    };

    public static void main(String[] args) {
    }
}
