import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game extends JPanel {

    private Board board;
    private Rectangle boton1 = new Rectangle(10, 10, 100, 50);
    private Rectangle boton2 = new Rectangle(10, 100, 100, 50);
    private Rectangle boton3 = new Rectangle(100, 100, 100, 50);
    private Rectangle boton4 = new Rectangle(100, 200, 100, 50);
    private static int position1, position2, positionF1, positionF2, positionF3, positionF4;
    private Piece piece;
     boolean passed = false, passed1= false;
    public Game() {
        board = new Board();
        
    }


    // EVENTOS DEL MOUSE
    public void actions() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (boton1.contains(e.getPoint())) {
                  
                   if(passed==false){
                    position1= 2;
                    position2=7;
                      passed=true;
                   }else{
                    position1 = positionF1;
                    position2 = positionF2;
                   }
                 
                   


             
                

                }
              
                 if (boton2.contains(e.getPoint())){
                    positionF1 = 3;
                    positionF2= 6;
                  //  positionF1++;
                   // positionF2--;
                    board.movePiece();
                     repaint(); // Vuelve a dibujar
                  
                 }
                    if (boton3.contains(e.getPoint())) {
                  
                   if(passed1==false){
                    position1= 2;
                    position2=1;
                      passed1=true;
                   }else{
                    position1 = positionF3;
                    position2 = positionF4;
                   }


             
                

                }
                if (boton4.contains(e.getPoint())){
                    positionF1 = 4;
                    positionF2= 5;
                  //  positionF1++;
                   // positionF2--;
                    board.movePiece();
                     repaint(); // Vuelve a dibujar

                  
                 }

            }
        });
    }

    // DIBUJAR EN PANTALLA
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.WHITE);

          g.setColor(Color.BLUE);
         g.fillRect(boton2.x, boton2.y, boton2.width, boton2.height);

              g.setColor(Color.BLUE);
         g.fillRect(boton4.x, boton4.y, boton4.width, boton4.height);

        // Círculo rojo
        g.setColor(Color.RED);
        g.fillOval(boton1.x, boton1.y, boton1.width, boton1.height);

 g.setColor(Color.RED);
        g.fillOval(boton3.x, boton3.y, boton3.width, boton3.height);


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
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
