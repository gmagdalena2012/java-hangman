package pl.edu.agh.hangman;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Hangman {

    public static final String[] HANGMANPICS = new String[] {
    		
    		
// Grafika, 6 prob. 
    		
public String drawHangMan() {
	int attempt = 6;
	switch(attempt) {
	case 1: return EmpltyDraw();
	break;
	
	case 2: return Head();
	break;
	
	case 3: return Body();
	break;
	
	case 4: return RightHand();
	break;
	
	case 5: return LeftHand();
	break;
	
	case 6: return RightLeg();
	break;
	
	default: return fullDrowing();
	break;
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
}
    
    public static void main(String[] args) {
    }
}
