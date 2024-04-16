package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("E necessário ter mais de uma linha e coluna");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    //exist in board
    private boolean positionExist(int row, int col) {
        return row >=0 && row <= rows && col >= 0 && col <= columns;
    }

    //exist in board with "Position"
    public boolean positionExist(Position position) {
        return  positionExist(position.getRow(), position.getColumn());
    }

    public boolean therelsAPiece(Position position) {
        if (!positionExist(position)) {
            throw new BoardException("Poscao não existe");
        }
        return piece(position) != null;
    }

    public void placePiece(Piece piece, Position position) {
        if (therelsAPiece(position)) {
            throw new BoardException("Ja existe um peça na posição " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Piece piece(int row, int columns) {
        if (!positionExist(row, columns)) {
            throw new BoardException("Posição não existe");
        }
        return pieces[row][columns];
    }

    public Piece piece(Position position) {
        if (!positionExist(position)) {
            throw new BoardException("Poscao não existe");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }
}
