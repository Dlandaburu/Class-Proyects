package sudoku;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class SudokuFrame extends JFrame {

	private JPanel buttonSelectionPanel;
	private SudokuPanel sPanel;
	
	public SudokuFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Sudoku");
		this.setMinimumSize(new Dimension(800,600));
		
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("Game");
		JMenu newGame = new JMenu("New Game");
		JMenuItem sixBySixGame = new JMenuItem("6 By 6 Game");
		sixBySixGame.addActionListener(new NewGameListener(SudokuPuzzleType.SIXBYSIX,30));
		JMenuItem nineByNineGame = new JMenuItem("9 By 9 Game");
		nineByNineGame.addActionListener(new NewGameListener(SudokuPuzzleType.NINEBYNINE,26));
		JMenuItem twelveByTwelveGame = new JMenuItem("12 By 12 Game");
		twelveByTwelveGame.addActionListener(new NewGameListener(SudokuPuzzleType.TWELVEBYTWELVE,20));
		
		/*
		 * need to include this when solving algorithm is improved
		 JMenuItem sixteenBySizteenGame = new JMenuItem("16 By 16 Game");
		sixteenBySizteenGame.addActionListener(new NewGameListener(SudokuPuzzleType.SIXTEENBYSIXTEEN,16));
		*/
		newGame.add(sixBySixGame);
		newGame.add(nineByNineGame);
		newGame.add(twelveByTwelveGame);
		//newGame.add(sixteenBySizteenGame);
		file.add(newGame);
		menuBar.add(file);
		this.setJMenuBar(menuBar);
		
		JPanel windowPanel = new JPanel();
		windowPanel.setLayout(new FlowLayout());
		windowPanel.setPreferredSize(new Dimension(800,600));
		
		buttonSelectionPanel = new JPanel();
		buttonSelectionPanel.setPreferredSize(new Dimension(90,500));

		sPanel = new SudokuPanel();
		
		windowPanel.add(sPanel);
		windowPanel.add(buttonSelectionPanel);
		this.add(windowPanel);
		
		rebuildInterface(SudokuPuzzleType.NINEBYNINE, 26);
	}
	
	public void rebuildInterface(SudokuPuzzleType puzzleType,int fontSize) {
		// Descomentar el siguiente código y comentar las líneas siguientes si se
		// quiere desarrollar la clase SudokuGenerator
		//SudokuPuzzle generatedPuzzle = new SudokuGenerator().generateRandomSudoku(puzzleType);


		// Código si no se desarrolla la clase SudokuGenerator
		SudokuPuzzle generatedPuzzle = new SudokuPuzzle(puzzleType.getRows(), puzzleType.getColumns(), puzzleType.getBoxWidth(), puzzleType.getBoxHeight(), puzzleType.getValidValues());
		if (puzzleType.name().equalsIgnoreCase("NINEBYNINE")) {
			String[][] board = new String[][]{
					{"", "", "8", "3", "4", "2", "9", "", ""},
					{"", "", "9", "", "", "", "7", "", ""},
					{"4", "", "", "", "", "", "", "", "3"},
					{"", "", "6", "4", "7", "3", "2", "", ""},
					{"", "3", "", "", "", "", "", "1", ""},
					{"", "", "2", "8", "5", "1", "6", "", ""},
					{"7", "", "", "", "", "", "", "", "8"},
					{"", "", "4", "", "", "", "1", "", ""},
					{"", "", "3", "6", "9", "7", "5", "", ""}
			};
			generatedPuzzle.setBoard(board);
			boolean[][] mutable = new boolean[][]{
					{true, true, false, false, false, false, false, true, true},
					{true, true, false, true, true, true, false, true, true},
					{false, true, true, true, true, true, true, true, false},
					{true, true, false, false, false, false, false, true, true},
					{true, false, true, true, true, true, true, false, true},
					{true, true, false, false, false, false, false, true, true},
					{false, true, true, true, true, true, true, true, false},
					{true, true, false, true, true, true, false, true, true},
					{true, true, false, false, false, false, false, true, true}
			};
			generatedPuzzle.setMutable(mutable);
		} else{
			//Desarrollar aquí posibles sudokus de 6x6 o de 12x12
		}

		//A partir de aquí dejar el código como está
		sPanel.newSudokuPuzzle(generatedPuzzle);
		sPanel.setFontSize(fontSize);
		buttonSelectionPanel.removeAll();
		for(String value : generatedPuzzle.getValidValues()) {
			JButton b = new JButton(value);
			b.setPreferredSize(new Dimension(40,40));
			b.addActionListener(sPanel.new NumActionListener());
			buttonSelectionPanel.add(b);
		}
		sPanel.repaint();
		buttonSelectionPanel.revalidate();
		buttonSelectionPanel.repaint();
	}
	
	private class NewGameListener implements ActionListener {

		private SudokuPuzzleType puzzleType;
		private int fontSize;
		
		public NewGameListener(SudokuPuzzleType puzzleType,int fontSize) {
			this.puzzleType = puzzleType;
			this.fontSize = fontSize;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			rebuildInterface(puzzleType,fontSize);
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				SudokuFrame frame = new SudokuFrame();
				frame.setVisible(true);
			}
		});
	}
}
