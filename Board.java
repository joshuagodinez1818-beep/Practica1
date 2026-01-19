public class Board {
   private Piece[][] board= new Piece[8][8];
private Piece piece;
int pos=1;
Board(){

for(int i=0;i<3;i++){
    for(int j=0;j<8;j++){
       if((i==0 || i==2) && j%2 !=0 ){
           board[i][j]=new BlackPiece();
          board[i][j].setPosition(pos);
         } else if(i==1 && j%2 == 0){
           board[i][j]=new BlackPiece();
            board[i][j].setPosition(pos);
         }
         else if((i==5 || i==7) && j%2==0){
           board[i][j]=new WhitePiece();
            board[i][j].setPosition(pos);
         } else if(i==6 && j%2 != 0){
           board[i][j]=new WhitePiece();
            board[i][j].setPosition(pos);
         } else {
           board[i][j]=null;
         }
         pos++;
    }

}

}

public void movePiece(){
    board[2][1].setPosition(board[2][1].move(board[2][1].getPosition()));
    switch (board[2][1].getPosition()) {
        case 26:
            board[3][1]=board[2][1];
            board[2][1]=null;
            break;
    
        default:
         
    }
}
}