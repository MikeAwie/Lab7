/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fii.pa.lab7;

/**
 *
 * @author mike
 */
public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        Board board = new Board();
        board.addToken(new Token(1));
        board.addToken(new Token(2));
        board.addToken(new Token(3));
        board.addToken(new Token(4));
        board.addToken(new Token(5));
        board.addToken(new Token(6));
        game.setBoard(board);
        game.addPlayer(new Player("Player 1"));
        game.addPlayer(new Player("Player 2"));
        game.addPlayer(new Player("Player 3"));
        game.start();
    }
}
