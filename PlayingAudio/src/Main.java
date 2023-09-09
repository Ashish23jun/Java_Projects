
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc = new Scanner(System.in);

        File file = new File("C:\\Users\\pande\\eclipse-workspace\\Dance.wav");
        
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audiostream);
        String response = "";
        while(!response.equals("Q")){
        	System.out.println("P = play, S = Stop, R = reset,Q = quit");
        	System.out.println("Enter Your Choice: ");
        	response = sc.next();
        	response = response.toUpperCase();
        	switch(response) {
        	case("P"): clip.start();
        	break;
        	case("S"): clip.stop();
        	break;
        	case("R"): clip.setMicrosecondPosition(0);
        	break;
        	case ("Q"): clip.close();
        	break;
        	default: System.out.println("Not valid");
        	
        	}
        	System.out.println("Byeee");
        }
        clip.start();

      
        
    }
}
