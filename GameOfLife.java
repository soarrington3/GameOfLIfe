import java.util.ArrayList;
import java.awt.*;
/*
/ method to draw the cell background
/ method to draw the cell
*/
public class GameOfLife{
    private int[][] states;
    

    public GameOfLife(int[][]input){
        
       this.gameBoard();
        states=new int[input.length][input[0].length];
        for (int row=0;row<input.length;row++){
            for(int col=0;col<input[row].length;col++){
                states[row][col]=input[row][col];

            }            
            
        }
    }
    public void gameBoard(){
        //row anc dollums for rectangles
        // for(int i=0;i<100;i+=10){
        //     Rectangle r1 = new Rectangle(10+i, 10, 10, 20);
        //     Rectangle r2= new Rectangle(10+i,5,10,20);
        // r1.setColor(Color.GRAY);
        // r1.fill();
        // r2.fill();
        // r2.setColor(Color.LIGHT_GRAY); proof of conecpt for drawring grid
        // }
      int setdist=15; // has to be half of x y preset 10
      int x=30; // preste 20
      int y=30; // preset 20
      int width=15; // has to be half of xy preset 10
      int height=15; // has to be half of xy preset 10
        for(int row=0;row<50;row++){
            for(int col=0;col<50;col++){
               Rectangle r1=new Rectangle(x,y,width+(col*setdist),height+(row*setdist)); // x and y can stay preset due to nature of draw
                
            r1.setColor(Color.GRAY);
            
            r1.draw();
            }
           
        }
        
    }
    public void nextState(){ //method to advance state of cell
        for(int row=0;row<states.length;row++){
            for(int col=0;col<states[row].length;col++){
                

            }
        }

    }
    public void random(){
        //Math.random() *100);
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