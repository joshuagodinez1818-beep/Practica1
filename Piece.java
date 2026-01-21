//import java.util.Scanner;
public class Piece {
private int position1,position2;
//Board board = new Board();
Piece() {
   
   // this.position += 1;
}

public void setPosition(int position1, int position2) {
    this.position1 = position1;
    this.position2 = position2;
}
public void setPosition2(int position2) {
    this.position2 = position2;
}
public int getPosition1() {
    return position1;
}
public int getPosition2() {
    return position2;
}
public String getColor() {
    return "Piece";
}
public int move1(int pos) {
    //position += 1;
    //System.out.println("Game started!");
    return pos;
}
public int move2(int pos) {
    //position += 0;
    return pos;
}
}







