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
    /* 
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
    */
  private Rectangle [] piece = new Rectangle[12];

    private Rectangle place1 = new Rectangle(370, 85, 70, 70);
   // private Rectangle place2= new Rectangle(370+202, 85, 70, 70);
    private Rectangle[] place3 = new Rectangle[40];
    private static int position1, position2;
    private static int [] pos= new int[31];
  //  private Piece piece;
    private static int j,i;
     boolean passed = false, passed1= false;
     boolean []firstMove= new boolean[31];
            int aux2=0;
                int aux=0;
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
                 if (piece[0].contains(e.getPoint())) {
                    pieces(0, 0, 0, 1);}
                  if (piece[1].contains(e.getPoint())) {
                   pieces(2, 0, 2, 3);}
                   if (piece[2].contains(e.getPoint())) {
                    pieces(1, 1, 4, 5);}
                  if (piece[3].contains(e.getPoint())) {
                   pieces(0, 2, 6, 7);}
                   if (piece[4].contains(e.getPoint())) {
                    pieces(2, 2, 8, 9);}
                  if (piece[5].contains(e.getPoint())) {
                   pieces(1, 3, 10, 11);}
                   if (piece[6].contains(e.getPoint())) {
                    pieces(0, 4, 12, 13);}
                  if (piece[7].contains(e.getPoint())) {
                   pieces(2, 4, 14, 15);}
                   if (piece[8].contains(e.getPoint())) {
                    pieces(1, 5, 16, 17);}
                  if (piece[9].contains(e.getPoint())) {
                   pieces(0, 6, 18, 19);}
                   if (piece[10].contains(e.getPoint())) {
                    pieces(2, 6, 20, 21);}
                  if (piece[11].contains(e.getPoint())) {
                   pieces(1, 7, 22, 23);}
                 /* 
                   if (piece[12].contains(e.getPoint())) {
                    pieces(3, 0, 24, 25);}
                  if (piece[13].contains(e.getPoint())) {
                   pieces(3, 2, 26, 27);}
                   if (piece[14].contains(e.getPoint())) {
                    pieces(3, 4, 28, 29);}
                  if (piece[15].contains(e.getPoint())) {
                   pieces(3, 6, 30, 31);}
 */
                // Position to move
                 if (place3[0].contains(e.getPoint())){
                    places(1, 0);}        
                  if (place3[1].contains(e.getPoint())){
                   places(3, 0);  }    
                    if (place3[2].contains(e.getPoint())){
                    places(4, 0);}        
                  if (place3[3].contains(e.getPoint())){
                   places(5, 0);  }   
                     if (place3[4].contains(e.getPoint())){
                   places(7, 0);  }   
                     if (place3[5].contains(e.getPoint())){
                    places(0, 1);}        
                  if (place3[6].contains(e.getPoint())){
                   places(2, 1);  }    
                    if (place3[7].contains(e.getPoint())){
                    places(3, 1);}        
                  if (place3[8].contains(e.getPoint())){
                   places(4, 1);  }   
                     if (place3[9].contains(e.getPoint())){
                   places(6, 1);  } 
                 if (place3[10].contains(e.getPoint())){
                    places(1, 2);}        
                  if (place3[11].contains(e.getPoint())){
                   places(3, 2);  }    
                    if (place3[12].contains(e.getPoint())){
                    places(4, 2);}        
                  if (place3[13].contains(e.getPoint())){
                   places(5, 2);  }   
                     if (place3[14].contains(e.getPoint())){
                   places(7, 2);  }  
                    if (place3[15].contains(e.getPoint())){
                    places(0, 3);}        
                  if (place3[16].contains(e.getPoint())){
                   places(2, 3);  }    
                    if (place3[17].contains(e.getPoint())){
                    places(3, 3);}        
                  if (place3[18].contains(e.getPoint())){
                   places(4, 3);  }   
                     if (place3[19].contains(e.getPoint())){
                   places(6, 3);  } 
                    if (place3[20].contains(e.getPoint())){
                    places(1, 4);}
                    if (place3[21].contains(e.getPoint())){
                    places(3, 4);}
                    if (place3[22].contains(e.getPoint())){
                    places(4, 4);}
                    if (place3[23].contains(e.getPoint())){
                    places(5, 4);}
                    if (place3[24].contains(e.getPoint())){
                    places(7, 4);}
                    if (place3[25].contains(e.getPoint())){
                    places(0, 5);}
                    if (place3[26].contains(e.getPoint())){
                    places(2, 5);}
                    if (place3[27].contains(e.getPoint())){
                    places(3, 5);}
                    if (place3[28].contains(e.getPoint())){
                    places(4, 5);}
                    if (place3[29].contains(e.getPoint())){
                    places(6, 5);}
                    if (place3[30].contains(e.getPoint())){
                    places(1, 6);}
                    if (place3[31].contains(e.getPoint())){
                    places(3, 6);}
                    if (place3[32].contains(e.getPoint())){
                    places(4, 6);}
                    if (place3[33].contains(e.getPoint())){
                    places(5, 6);}
                    if (place3[34].contains(e.getPoint())){
                    places(7, 6);}
                    if (place3[35].contains(e.getPoint())){
                    places(0, 7);}
                    if (place3[36].contains(e.getPoint())){
                    places(2, 7);}
                    if (place3[37].contains(e.getPoint())){
                    places(3, 7);}
                    if (place3[38].contains(e.getPoint())){
                    places(4, 7);}
                    if (place3[39].contains(e.getPoint())){
                    places(6, 7);}
                    
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
        for(int j=0;j<8;j++){
            if((j==0 && i%2==0) || (j==1 && i%2!=0) || (j==2 && i%2==0)){
         g.setColor(Color.RED);
         g.fillOval(piece1.x + i*72, piece1.y + j*72, piece1.width, piece1.height);
         
          
         if(aux2<12){
            piece[aux2]=new Rectangle(piece1.x + i*72, piece1.y + j*72, piece1.width, piece1.height);
            aux2++;}

            }

        }
    }
      // g.setColor(Color.RED);
       // g.fillOval(piece1.x, piece1.y, piece1.width, piece1.height);

        //g.setColor(Color.RED);
        //g.fillOval(piece2.x, piece2.y, piece2.width, piece2.height);







//int aux=0;
 for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
           if((j==0 && i%2!=0) || (j==1 && i%2==0) || (j==2 && i%2!=0) || (j==3 /*&& i%2==0*/) || (j==4 /*&& i%2!=0*/) || (j==5 && i%2==0) || (j==6 && i%2!=0) || (j==7 && i%2==0)){ {
         g.setColor(Color.RED);
         g.setColor(new Color(100, 149, 237,100));
         g.fillRect(place1.x + i*72, place1.y + j*72, place1.width, place1.height);
         
         if(aux<40){
       place3[aux]=new Rectangle(place1.x + i*72, place1.y + j*72, place1.width, place1.height);
        aux++;
        }
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
