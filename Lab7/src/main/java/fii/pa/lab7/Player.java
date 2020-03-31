package fii.pa.lab7;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mike
 */
public class Player implements Runnable {

    private String name;
    private Game game;
    List<Token> tokens = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    private boolean won() {
        return false;
    }

    private void play() throws InterruptedException {
        tokens.add(game.getBoard().extract());
        if (this.won()) {
            game.setWinner(this);
        }
    }

    @Override
    public void run() {
        while (!game.getBoard().isEmpty()) {
            try {
                System.out.println(this.name);
                play();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
