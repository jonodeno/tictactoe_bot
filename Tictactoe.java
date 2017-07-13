/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Jonathan
 */
public class Tictactoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //make the spaces, there will be 9 spaces as follows:
        
        //gameboard
        /* 1 2 3
           4 5 6
           7 8 9
        */
        
       /* String pos1 = "1";
        String pos2 = "2";
        String pos3 = "3";
        String pos4 = "4";
        String pos5 = "5";
        String pos6 = "6";
        String pos7 = "7";
        String pos8 = "8";
        String pos9 = "9";*/
        
        Scanner in = new Scanner(System.in);
        
        Random r = new Random();
        
        int compMove;//a random variable that holds the computers move
        String comp;//the string for the computers move
        System.out.println("Welcome to tic tac toe. Choose if you would like to be"
                + "'x' or 'o'");
        
        String player = in.next();
        String computer;
        if(player.equals("x")){
            computer = "o";
        }else{
            computer = "x";
        }
        
        System.out.println("OK, then I will be "+computer);
       
        GameBoard gb = new GameBoard();
        System.out.println("Here is your board.");
        
        gb.printBoard();
        
        System.out.println("To take your turn, enter the number of the space where "
                + "you would like to move.");
        
        System.out.println(" ");
        
        System.out.println("Type in the number of the space where you would like to play.");

        String move;//the variable which stores the place where the player will move
        
        move = in.next();
        
        gb.printBoard();
        while(gb.CheckWin(player, computer)==0){
            System.out.println("It's your move!");
            while(gb.takeTurn(move, player)==0){
                 //System.out.println("Please try again. Type the number of the space"
                   //  + "where you would like to move");
                     move=in.next();
            }
            //now the computer needs to take it's turn
            compMove = r.nextInt(9)+1;
            comp = Integer.toString(compMove);
            
            while(gb.takeTurn(comp, computer)==0){
                compMove = r.nextInt(9)+1;
                comp = Integer.toString(compMove);
            }
            gb.printBoard();
           //move = in.next();
           //gb.takeTurn(move, player);
        }
        System.out.println("WINNER!!!");
        switch(gb.winner){
            case 0: System.out.println("womp womp. I win :p");
                    break;
            case 1: System.out.println("You beat me!");
                    break;
            case 2: System.out.println("I guess this is a draw");
                    break;
        }
        /*if(gb.winner==0){
            System.out.println("womp womp. I win :p");
        }
        else if(gb.winner==2){
            System.out.println("I guess this is a draw.");
        }else{
            System.out.println("You beat me!");
        }*/
    }
    
}
