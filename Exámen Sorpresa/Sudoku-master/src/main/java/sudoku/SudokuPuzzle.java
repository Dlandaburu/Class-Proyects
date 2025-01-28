package sudoku;

public class SudokuPuzzle {

	
	public SudokuPuzzle(int rows,int columns,int boxWidth,int boxHeight,String [] validValues) {

	}
	
	public SudokuPuzzle(SudokuPuzzle puzzle) {

	}
	
	public int getNumRows() {
		return -1;
	}
	
	public int getNumColumns() {
		return -1;
	}
	
	public int getBoxWidth() {
		return -1;
	}
	
	public int getBoxHeight() {
		return -1;
	}
	
	public String [] getValidValues() {
		return null;
	}

	public void setBoard(String[][] board) {}

	public void setMutable(boolean[][] mutable) {}
	
	public void makeMove(int row,int col,String value,boolean isMutable) {

	}
	
	public boolean isValidMove(int row,int col,String value) {

		return false;
	}
	
	public boolean numInCol(int col,String value) {

		return false;
	}
	
	public boolean numInRow(int row,String value) {

		return false;
	}
	
	public boolean numInBox(int row,int col,String value) {

		return false;
	}
	
	public boolean isSlotAvailable(int row,int col) {
		 return false;
	}
	
	public boolean isSlotMutable(int row,int col) {

		return false;
	}
	
	public String getValue(int row,int col) {

		return "";
	}
	
	public String [][] getBoard() {
		return null;
	}
	
	private boolean isValidValue(String value) {

		return false;
	}
	
	public boolean inRange(int row,int col) {

		return false;
	}
	
	public boolean boardFull() {

		return true;
	}
	
	public void makeSlotEmpty(int row,int col) {

	}
	
	@Override
	public String toString() {

		return null;
	}
	
	private void initializeBoard() {

	}
	
	private void initializeMutableSlots() {

	}
}
