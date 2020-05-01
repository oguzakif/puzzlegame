import enigma.core.Enigma;

import enigma.event.TextMouseEvent;
import enigma.event.TextMouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import enigma.console.TextAttributes;
import java.awt.Color;

public class ScreenCreator {
	private enigma.console.Console cn = Enigma.getConsole("Puzzle");
	private char[][] puzzle = new char[15][15];

	ScreenCreator(LinkedList wordlist) throws Exception {
		ReadFromFile(wordlist);
		CreateScreen();
	}

	public void ReadFromFile(LinkedList wordlist) throws IOException {
		// Read screen matrix
		File file = new File("C:\\puzzle.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		for (int i = 0; i < puzzle.length; i++) {
			String st = br.readLine();
			st = st.replaceAll("\\s", "");
			for (int j = 0; j < puzzle.length; j++) {
				puzzle[j][i] = st.charAt(j);
			}
		}
		try {
			File myObj = new File("C:\\word_list.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
			  String[] data = (myReader.nextLine()).split(",");
			  Word word = new Word(data[0],data[1]);
			  wordlist.add(word);
			  
			}
			myReader.close();
		  } catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		  }

	}

	public void CreateScreen() {
		// Creating the main board
		for (int i = 0; i < puzzle.length; i++) {
			for (int j = 0; j < puzzle.length; j++) {
				if (puzzle[i][j] == '0') {
					cn.getTextWindow().output(i + 2, j + 2, 'X');
				} else if (puzzle[i][j] == '1') {
					cn.getTextWindow().output(i + 2, j + 2, ' ');
				} else {
					cn.getTextWindow().output(i + 2, j + 2, puzzle[i][j]);
				}
			}
		}
		// Creating the borders for puzzle

		cn.getTextWindow().output(1, 1, '╔');
		cn.getTextWindow().output(1, 17, '╚');
		cn.getTextWindow().output(17, 1, '╗');
		cn.getTextWindow().output(17, 17, '╝');
		for (int i = 0; i < puzzle.length; i++) {
			cn.getTextWindow().output(1, i + 2, '║');
			cn.getTextWindow().output(17, i + 2, '║');
			cn.getTextWindow().output(i + 2, 1, '-');
			cn.getTextWindow().output(i + 2, 17, '-');
			String temp = Integer.toString(i % 10);
			cn.getTextWindow().setCursorPosition(0, i + 2);
			cn.getTextWindow().output(temp);
			cn.getTextWindow().setCursorPosition(i + 2, 0);
			cn.getTextWindow().output(temp);
		}
		// Creating the borders for word list

	}
}
