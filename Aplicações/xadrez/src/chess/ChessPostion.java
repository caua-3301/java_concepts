package chess;

import boardgame.Position;

public class ChessPostion {
    private char column;
    private int row;

    public ChessPostion(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Posicao invalida");
        }
        this.column = column;
        this.row = row;
    }

    //matrix to chess
    protected Position toPosition() {
         return new Position(8 - row, column - 'a');
    }

    //chess to matrix
    protected static ChessPostion fromPostion(Position position) {
        return new ChessPostion((char)('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

}
