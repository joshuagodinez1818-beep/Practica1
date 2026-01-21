public class Board {
   private Piece[][] board= new Piece[8][8];
private Piece piece;
private Game game;
int pos1=0;
int pos2=0;
Board(){

for(int i=0;i<8;i++){
    for(int j=0;j<8;j++){
       if((i==0 || i==2) && j%2 !=0 ){
           board[i][j]=new BlackPiece();
          board[i][j].setPosition(pos2,pos1);
         } else if(i==1 && j%2 == 0){
           board[i][j]=new BlackPiece();
            board[i][j].setPosition(pos2,pos1);
         }
         else if((i==5 || i==7) && j%2==0){
           board[i][j]=new WhitePiece();
            board[i][j].setPosition(pos2,pos1);
         } else if(i==6 && j%2 != 0){
           board[i][j]=new WhitePiece();
            board[i][j].setPosition(pos2,pos1);
         } else {
           board[i][j]=null;
         }
         pos1++;
    }
    pos2++;
    pos1=0;
}

}
public int getPosition1(int x, int y){
    return board[x][y].getPosition1();

}
public int getPosition2(int x, int y){
    return board[x][y].getPosition2();

}
public void movePiece(){
   /*  board[Game.getPosition1()][Game.getPosition2()].setPosition(board[Game.getPosition1()][Game.getPosition2()].move1(board[Game.getPosition1()][Game.getPosition2()].getPosition1()),board[Game.getPosition1()][Game.getPosition2()].move2(board[Game.getPosition1()][Game.getPosition2()].getPosition2()));
   
   board[Game.getPosition1()+1][Game.getPosition2()-1]=board[Game.getPosition1()][Game.getPosition2()];
   board[Game.getPosition1()][Game.getPosition2()]=null;
   */
board[game.getpos1(game.getI())][game.getpos2(game.getJ())]=board[game.getPosition1()][game.getPosition2()];
 board[game.getpos1(game.getI())][game.getpos2(game.getJ())].setPosition(game.getpos1(game.getI()), game.getpos2(game.getJ()));


   
board[game.getPosition1()][game.getPosition2()]=null;

 
}
}