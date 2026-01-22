import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game extends JPanel {

    private Board board;
    private Rectangle piece1 = new Rectangle(373, 85, 65, 65);
    private Rectangle piece2 = new Rectangle(piece1.x+200, piece1.y, 65, 65);
    private Rectangle piece3 = new Rectangle(200, 200, 100, 50);
    private Rectangle piece4 = new Rectangle(300, 300, 100, 50);
    private Rectangle piece5 = new Rectangle(10, 10, 100, 50);
    private Rectangle piece6 = new Rectangle(100, 100, 100, 50);
    private Rectangle piece7 = new Rectangle(200, 200, 100, 50);
    private Rectangle piece8 = new Rectangle(300, 300, 100, 50);
    private Rectangle piece9 = new Rectangle(10, 10, 100, 50);
    private Rectangle piece10 = new Rectangle(100, 100, 100, 50);
    private Rectangle piece11 = new Rectangle(200, 200, 100, 50);
    private Rectangle piece12 = new Rectangle(300, 300, 100, 50);
    private Rectangle piece13 = new Rectangle(10, 10, 100, 50);
    private Rectangle piece14 = new Rectangle(100, 100, 100, 50);
    private Rectangle piece15 = new Rectangle(200, 200, 100, 50);
    private Rectangle piece16 = new Rectangle(300, 300, 100, 50);



    private Rectangle place1 = new Rectangle(370, 85, 70, 70);
    private Rectangle place2= new Rectangle(370+202, 85, 70, 70);
    private Rectangle[] place3 = new Rectangle[100];
    private static int position1, position2;
    private static int [] pos= new int[31];
  //  private Piece piece;
    private static int j,i,x,y;
     boolean passed = false, passed1= false;
     boolean []firstMove= new boolean[4];
    public Game() {
        board = new Board();
        
    }

public void pieces(int p1, int p2, int i1, int j1) {
    if(!firstMove[i1]){
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
                    pieces(0, 1, 0, 1);}
                  if (piece2.contains(e.getPoint())) {
                   pieces(0, 3, 2, 3);}
                   if (piece3.contains(e.getPoint())) {
                    pieces(0, 5, 4, 5);}
                  if (piece4.contains(e.getPoint())) {
                   pieces(0, 7, 6, 7);}
                       if (piece5.contains(e.getPoint())) {
                    pieces(1, 0, 8, 9);}
                  if (piece6.contains(e.getPoint())) {
                   pieces(1, 2, 10, 11);}
                   if (piece7.contains(e.getPoint())) {
                    pieces(1, 4, 12, 13);}
                  if (piece8.contains(e.getPoint())) {
                   pieces(1, 6, 14, 15);}
                   if (piece9.contains(e.getPoint())) {
                    pieces(2, 1, 16, 17);}
                  if (piece10.contains(e.getPoint())) {
                   pieces(2, 3, 18, 19);}
                   if (piece11.contains(e.getPoint())) {
                    pieces(2, 5, 20, 21);}
                  if (piece12.contains(e.getPoint())) {
                   pieces(2, 7, 22, 23);}
                   if (piece13.contains(e.getPoint())) {
                    pieces(3, 0, 24, 25);}
                  if (piece14.contains(e.getPoint())) {
                   pieces(3, 2, 26, 27);}
                   if (piece15.contains(e.getPoint())) {
                    pieces(3, 4, 28, 29);}
                  if (piece16.contains(e.getPoint())) {
                   pieces(3, 6, 30, 31);}

                // Position to move
                 if (place3[5].contains(e.getPoint())){
                    places(3,6);}        
                  if (place3[1].contains(e.getPoint())){
                   places(3,1);  }      
             }

            
        });
    }

    // DIBUJAR EN PANTALLA
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.WHITE);

       // Círculo rojo
       
       for(int i=0;i<8;i++){
        for(int j=0;j<1;j++){
            if((j==0 && i%2==0) || (j==1 && i%2!=0) || (j==2 && i%2==0)){
         g.setColor(Color.RED);
         g.fillOval(piece1.x + i*72, piece1.y + j*72, piece1.width, piece1.height);
            }
        }
    }
      // g.setColor(Color.RED);
       // g.fillOval(piece1.x, piece1.y, piece1.width, piece1.height);

        //g.setColor(Color.RED);
        //g.fillOval(piece2.x, piece2.y, piece2.width, piece2.height);







int aux=0;
 for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
           if((j==0 && i%2!=0) || (j==1 ) || (j==2 && i%2!=0) || (j==3 && i%2==0) || (j==4 && i%2!=0) || (j==5 && i%2==0) || (j==6 && i%2!=0) || (j==7 && i%2==0)){ {
         g.setColor(Color.RED);
         g.setColor(new Color(100, 149, 237,100));
         g.fillRect(place1.x + i*72, place1.y + j*72, place1.width, place1.height);
        place3[aux]=new Rectangle(place1.x + i*72, place1.y + j*72, place1.width, place1.height);
        aux++;
        }
        }
    }
    }
 //   place1=new Rectangle(place1.x + 0*72, place1.y + 1*72, place1.width, place1.height);
    /*
        g.setColor(Color.BLUE);
         g.fillRect(place1.x, place1.y, place1.width, place1.height);

         g.setColor(Color.BLUE);
         g.fillRect(place2.x, place2.y, place2.width, place2.height);
 */
 

    }

 public void render() {
        JFrame ventana = new JFrame("Juego");
        ventana.add(this);
        ventana.setSize(450, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
