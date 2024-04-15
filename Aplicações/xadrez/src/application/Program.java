package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMeatch;

public class Program {

    public static void main(String[] args) {

        ChessMeatch teste = new ChessMeatch();
        UI.printBoard(teste.getPieces());
    }
}
