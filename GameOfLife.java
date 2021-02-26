import java.util.ArrayList;
import java.awt.*;
/*
/ method to draw the cell background
/ method to draw the cell
*/
public class GameOfLife{
    private int[][] states;

    public GameOfLife(int[][]input){
       // this.board();
        states=new int[input.length][input[0].length];
        for (int row=0;row<input.length;row++){
            for(int col=0;col<input[row].length;col++){
                states[row][col]=input[row][col];

            }            
            
        }
    }
    public void cell(int x,int y){
        this.cell(x, y);
    }
    public void nextState(){ //method to advance state of cell
        for(int row=0;row<states.length;row++){
            for(int col=0;col<states[row].length;col++){
                

            }
        }

    }
    
    public boolean getStatus(int row,int col){ // get curent state of cell
        int temp=states[row][col];
        if(temp==0){
            return false;
        }

        return true;  
    }
    
    public void print(){
        for(int row=0;row<states.length;row++){
            for(int col=0;col<states[row].length;col++){
                System.out.printf("%2d",states[row][col]);
                
            }
            System.out.println();
        }
       
        
    }
}