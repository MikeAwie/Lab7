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
public class Token {

    int value;

    public Token() {
    }

    public Token(int value) {
        this.value = value;
    }

    public boolean isBlank() {
        return value == 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
