import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game extends JPanel {

    private Board board;
    private Rectangle piece1 = new Rectangle(10, 10, 100, 50);
    private Rectangle piece2 = new Rectangle(100, 100, 100, 50);

    private Rectangle place1 = new Rectangle(10, 100, 100, 50);
    private Rectangle place2 = new Rectangle(100, 200, 100, 50);
    private static int position1, position2;
    private static int [] pos= new int[4];
  //  private Piece piece;
    private static int j,i;
     boolean passed = false, passed1= false;
     boolean []firstMove= new boolean[4];
    public Game() {
        board = new Board();
        
    }

public void pieces(int p1, int p2, int i1, int j1, int fM) {
    if(!firstMove[fM]){
      position1= p1;
     position2=p2;
                 
    }else{
      position1 = pos[i];
      position2 = pos[j];
                
  }
     i=i1;j=j1;
}

public void places(int p1, int p2) {

 pos[i] = p1;
 pos[j] = p2;
                 
  if(board.movePiece()){
     firstMove[i]=true;
  }          
   repaint(); 

}

    // EVENTOS DEL MOUSE
    public void actions() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Position pices
                 if (piece1.contains(e.getPoint())) {
                    pieces(2, 7, 0, 1, 0);}
                  if (piece2.contains(e.getPoint())) {
                   pieces(2, 1, 2, 3, 2);}
                

                // Position to move
                 if (place1.contains(e.getPoint())){
                    places(3,6);}        
                  if (place2.contains(e.getPoint())){
                   places(4,6);  }      
             }

            
        });
    }

    // DIBUJAR EN PANTALLA
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.WHITE);

          g.setColor(Color.BLUE);
         g.fillRect(place1.x, place1.y, place1.width, place1.height);

         g.setColor(Color.BLUE);
         g.fillRect(place2.x, place2.y, place2.width, place2.height);

        // Círculo rojo
        g.setColor(Color.RED);
        g.fillOval(piece1.x, piece1.y, piece1.width, piece1.height);

        g.setColor(Color.RED);
        g.fillOval(piece2.x, piece2.y, piece2.width, piece2.height);


         g.setColor(Color.RED);
        g.drawString(String.valueOf(position1), 120, 30);

          g.setColor(Color.RED);
        g.drawString(String.valueOf(position2), 120, 50);
        

    }

 public void render() {
        JFrame ventana = new JFrame("Juego");
        ventana.add(this);
        ventana.setSize(450, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    public void start() {
        render();
        actions();
        System.out.println("Game started!");
    }
public static int getPosition1() {
        return position1;
    }
    public static int getPosition2() {
        return position2;
    } 
    public static int getI() {
        return i;
    } 
   public static int getJ() {
        return j;
    }   
     public static int getpos1(int i) {
        return pos[i];
    } 
     public static int getpos2(int j) {
        return pos[j];
    } 
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
