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
public class GameBoard{
    
    
    
    public Position one = new Position("1","1");
    public Position two = new Position("2","2");
    public Position three = new Position("3","3");
    public Position four = new Position("4","4");
    public Position five = new Position("5","5");
    public Position six = new Position("6","6");
    public Position seven = new Position("7","7");
    public Position eight = new Position("8","8");
    public Position nine = new Position("9","9");
    public Position ten = new Position("10","10");
    
    public boolean win=false;
    int winner;//1 for player, 0 for computer *changed this to 5 to begin with
    int spacesPlayed = 0;//keeps track of how many spaces have been played on the board
    
   /* public String one = "1";
    public String two = "2";
    public String three = "3";
    public String four = "4";
    public String five = "5";
    public String six = "6";
    public String seven = "7";
    public String eight = "8";
    public String nine = "9";*/
    //make position object which holds position value (number or player character)
    //and also a boolean visited field which tells if player or computer has
    //played there
    public void printBoard(){
        System.out.println(one.printVal()+" "+two.printVal()+" "+three.printVal());
        System.out.println(four.printVal()+" "+five.printVal()+" "+six.printVal());
        System.out.println(seven.printVal()+" "+eight.printVal()+" "+nine.printVal());
    }
    
    public int takeTurn(String m,String p){
        //m is the place the player is moving to, p is the player's character
       //returns 1 if the move was successful or the board is full, 0 otherwise
        if(spacesPlayed==9){
            return 1;
        }
        if(m.equals("1")&&one.visited==false){
            one.ChangeValue(p);
            one.visited = true;
            spacesPlayed++;
            return 1;
        }
        if(m.equals("2")&&two.visited==false){
            two.ChangeValue(p);
            two.visited = true;
            spacesPlayed++;
            return 1;
        }
        if(m.equals("3")&&three.visited==false){
            three.ChangeValue(p);
            three.visited = true;
            spacesPlayed++;
            return 1;
        }
        if(m.equals("4")&&four.visited==false){
            four.ChangeValue(p);
            four.visited = true;
            spacesPlayed++;
            return 1;
        }
        if(m.equals("5")&&five.visited==false){
            five.ChangeValue(p);
            five.visited = true;
            spacesPlayed++;
            return 1;
        }
        if(m.equals("6")&&six.visited==false){
            six.ChangeValue(p);
            six.visited = true;
            spacesPlayed++;
            return 1;
        }
        if(m.equals("7")&&seven.visited==false){
            seven.ChangeValue(p);
            seven.visited = true;
            spacesPlayed++;
            return 1;
        }
        if(m.equals("8")&&eight.visited==false){
            eight.ChangeValue(p);
            eight.visited = true;
            spacesPlayed++;
            return 1;
        }
        if(m.equals("9")&&nine.visited==false){
            nine.ChangeValue(p);
            nine.visited = true;
            spacesPlayed++;
            return 1;
        }else{
            return 0;
        }
    }
    
    //gameboard
        /* 1 2 3
           4 5 6
           7 8 9
        */
    public int CheckWin(String p, String c){
        //p is the players character, c is the computer's character
        //checks if the win condition is met
        //returns 1 if there is a winner, zero otherwise, 2 if the board is full 

        if((one.value.equals(p))&&(two.value.equals(p))&&(three.value.equals(p))){
            win=true;
            winner=1;
            return 1;
        }
        
        else if((one.value.equals(p))&&(four.value.equals(p))&&(seven.value.equals(p))){
            win=true;
            winner=1;
            return 1;
        }
        
        else if((one.value.equals(p))&&(five.value.equals(p))&&(nine.value.equals(p))){
            win=true;
            winner=1;
            return 1;
        }
        else if((nine.value.equals(p))&&(six.value.equals(p))&&(three.value.equals(p))){
            win=true;
            winner=1;
            return 1;
        }
        else if((nine.value.equals(p))&&(eight.value.equals(p))&&(seven.value.equals(p))){
            win=true;
            winner=1;
            return 1;
        }
        else if((seven.value.equals(p))&&(five.value.equals(p))&&(three.value.equals(p))){
            win=true;
            winner=1;
            return 1;
        }
        else if((four.value.equals(p))&&(five.value.equals(p))&&(six.value.equals(p))){
            win=true;
            winner=1;
            return 1;
        }
        else if((two.value.equals(p))&&(five.value.equals(p))&&(eight.value.equals(p))){
            win=true;
            winner=1;
            return 1;
        }
        
        ////check if computer has won
        
        else if((one.value.equals(c))&&(two.value.equals(c))&&(three.value.equals(c))){
            win=true;
            winner=0;
            return 1;
        }
        else if((one.value.equals(c))&&(four.value.equals(c))&&(seven.value.equals(c))){
            win=true;
            winner=0;
            return 1;
        }
        else if((one.value.equals(c))&&(five.value.equals(c))&&(nine.value.equals(c))){
            win=true;
            winner=0;
            return 1;
        }
        else if((nine.value.equals(c))&&(six.value.equals(c))&&(three.value.equals(c))){
            win=true;
            winner=0;
            return 1;
        }
        else if((nine.value.equals(c))&&(eight.value.equals(c))&&(seven.value.equals(c))){
            win=true;
            winner=0;
            return 1;
        }
        else if((seven.value.equals(c))&&(five.value.equals(c))&&(three.value.equals(c))){
            win=true;
            winner=0;
            return 1;
        }
        else if((four.value.equals(c))&&(five.value.equals(c))&&(six.value.equals(c))){
            win=true;
            winner=0;
            return 1;
        }
        else if((two.value.equals(c))&&(five.value.equals(c))&&(eight.value.equals(c))){
            win=true;
            winner=0;
            return 1;
        }
        else if(spacesPlayed==9){
            winner=2;
            win=true;
            return 1;
        }
        /*else if((one.visited==true)&&(two.visited==true)&&(three.visited==true)
                &&(four.visited==true)&&(five.visited==true)&&(six.visited==true)
                &&(seven.visited==true)&&(eight.visited==true)&&(nine.visited==true)){
            win=true;
            winner=2;
            return 1;
        }*/
        return 0;
    }
    
    public void ClearBoard(){
        one.value = "1";
        one.visited = false;
        
        two.value = "2";
        two.visited = false;
        
        three.value = "3";
        three.visited = false;
        
        four.value = "four";
        four.visited = false;
        
        five.value = "5";
        five.visited = false;
        
        six.value = "6";
        six.visited = false;
        
        seven.value = "7";
        seven.visited = false;
        
        eight.value = "8";
        eight.visited = false;
        
        nine.value = "9";
        nine.visited = false;
    }
}
