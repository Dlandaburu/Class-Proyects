package sudoku;

public enum SudokuPuzzleType {
	SIXBYSIX,NINEBYNINE,TWELVEBYTWELVE, SIXTEENBYSIXTEEN;


	public int getRows() {
		return -1;
	}
	
	public int getColumns() {
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
	
	public String toString() {
		return null;
	}
}
