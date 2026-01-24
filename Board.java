public class Board {
   private Piece[][] board= new Piece[8][8];
//private Piece piece;
//private Game game;
int pos1=0;
int pos2=0;
Board(){

for(int i=0;i<8;i++){
    for(int j=0;j<8;j++){
       if((i==0 && j%2 == 0)){ //|| (i==2 && j%2 ==0) || (i==1 && j%2 != 0) ){
            board[i][j]=new BlackPiece();
            board[i][j].setPosition(pos2,pos1);
         }
         else if((i==5 && j%2 != 0)||( i==7 && j%2 != 0) || (i==6 && j%2 == 0)){
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
public boolean movePiece(){
   /*  board[Game.getPosition1()][Game.getPosition2()].setPosition(board[Game.getPosition1()][Game.getPosition2()].move1(board[Game.getPosition1()][Game.getPosition2()].getPosition1()),board[Game.getPosition1()][Game.getPosition2()].move2(board[Game.getPosition1()][Game.getPosition2()].getPosition2()));
   
   board[Game.getPosition1()+1][Game.getPosition2()-1]=board[Game.getPosition1()][Game.getPosition2()];
   board[Game.getPosition1()][Game.getPosition2()]=null;
   */

try{
if(board[Game.getpos1(Game.getI())][Game.getpos2(Game.getJ())]!=null){
    throw new Exception("Invalid Move - Position Occupied");}
    else if(Game.getpos1(Game.getI()) == Game.getPosition1() || Game.getpos2(Game.getJ()) == Game.getPosition2()){
throw new Exception("Invalid Move - Pieces must move diagonally");}
    else if(board[Game.getPosition1()][Game.getPosition2()].getColor() == "White" && Game.getpos1(Game.getI()) > Game.getPosition1()){
        throw new Exception("Invalid Move - White pieces can only move upwards");
    }///else if(board[Game.getPosition1()][Game.getPosition2()].getColor() == "Black" && Game.getpos1(Game.getI()) < Game.getPosition1()){
       // throw new Exception("Invalid Move - Black pieces can only move downwards");}
        else if(board[Game.getPosition1()][Game.getPosition2()].getColor() == null){
        throw new Exception("Invalid Move - No piece selected");}
          else if(Game.getpos1(Game.getI()) - Game.getPosition1() > 1 || Game.getpos1(Game.getI()) - Game.getPosition1() < -1 || Game.getpos2(Game.getJ()) - Game.getPosition2() > 1 || Game.getpos2(Game.getJ()) - Game.getPosition2() < -1){
        throw new Exception("Invalid Move - Only one square diagonally");}
    else{
board[Game.getpos1(Game.getI())][Game.getpos2(Game.getJ())]=board[Game.getPosition1()][Game.getPosition2()];
 board[Game.getpos1(Game.getI())][Game.getpos2(Game.getJ())].setPosition(Game.getpos1(Game.getI()), Game.getpos2(Game.getJ()));


   
board[Game.getPosition1()][Game.getPosition2()]=null;
return true;
    }
}catch(Exception e){
    System.out.println(e.getMessage());
    return false;
}



 
}
}