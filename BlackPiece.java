public class BlackPiece extends Piece {
    final private String color = "Black";

    public int move(int pos){
        pos += 8;
        return pos;
    }
}