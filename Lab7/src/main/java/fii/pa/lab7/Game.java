/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fii.pa.lab7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mike
 */
public class Game {

    private Board board;
    private final List<Player> players = new ArrayList<>();
    private Player winner;

    public void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public synchronized void setWinner(Player winner) {
        this.winner = winner;
    }

    public void start() {
        players.stream().map((player) -> new Thread(player)).forEachOrdered((t) -> {
            t.start();
        });
    }
}
