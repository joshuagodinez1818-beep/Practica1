public class Board {
   private Piece[][] board= new Piece[8][8];
private Piece piece;
int pos1=0;
int pos2=0;
Board(){

for(int i=0;i<3;i++){
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

public void movePiece(){
    board[0][5].setPosition(board[0][5].move1(board[0][5].getPosition1()),board[0][5].move2(board[0][5].getPosition2()));
   
   board[0+1][5]=board[0][5];
   board[0][5]=null;
   
 
}
}