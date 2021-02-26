public class GameOfLifeRunner {
    public static void main(String[] args){
    int[][]input={
        {0,1,1,0,1},
        {0,1,1,0,1},
        {0,1,1,0,1},
        {0,1,1,0,1},
    };
    GameOfLife p1= new GameOfLife(input);
    p1.print();
}
}
