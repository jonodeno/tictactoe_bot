/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Jonathan
 */
public class Position {
    private String posNumber;//the unchangeable position number, enter as a word
    public String value;//what the player sees, enter as a number
    public boolean visited;//shows whether or not a player has moved to this space
    
    public Position(String p, String v){
        posNumber = p;
        value = v;
        visited = false;
    }
    
    public void ChangeValue(String v){
        //changes an open space to a played upon space for the game board
        value = v;
    }
    
    public String printVal(){
        return value;
    }
    
}
