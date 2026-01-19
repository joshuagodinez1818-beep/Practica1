public class Game {
    private Board board;
   // private Piece[] pieces;
public Game() {
        board = new Board();

    }
    public void start() {
       board.movePiece();
        // Game logic would go here
        System.out.println("Game started!");
    }
    public static void main(String[] args) {
        Game game = new Game();

        game.start();
    }
}
