public class BlackPiece extends Piece {
    final private String color = "Black";

    public int move1(int pos){
        pos += 1;
        return pos;
    }
     public int move2(int pos){
        pos += 0;
        return pos;
    }
}