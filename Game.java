import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game extends JPanel {

    private Board board;
    private Rectangle piece1 = new Rectangle(372, 85, 70, 70);
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
  private Rectangle [] piece = new Rectangle[24];
 int num=14; 
    private Rectangle place1 = new Rectangle(372, 85, 70, 70);
   // private Rectangle place2= new Rectangle(370+202, 85, 70, 70);
    private Rectangle[] place3 = new Rectangle[40];
    private static int position1=-1, position2=-1;
    private static int [] pos= new int[48];
  //  private Piece piece2;
    private static int j,i;
     boolean passed = false, passed1= false;
     boolean []firstMove= new boolean[48];
            int aux2=0;
                int aux=0;
                 int aux3=0;
                int aux4=0;
                int Npiece=-1;
                int Nplace=-1;
                boolean moved=false;
                boolean arrastrando=false;
    public Game() {
        board = new Board();
        
    }
/* 
 public void test() {
    for (int i = 0; i < 12; i++) {
        if (piece[i] == place3[i]) {
           place3[i]=null;
        }
    }
    //return true;
}
*/
public int  positionX(int x) {
 switch (x) {
  case 372:
   return 0;
  
  case 444:
    return 1;
 
      case 516:
    return 2;
    
      case 588:
    return 3;
      case 660:
    return 4;
    
      case 732:
    return 5;
      case 804:
    return 6;
      case 876:
    return 7;
 
  default:
    return -1;
 }
 
}

public int  positionY(int y) {
 switch (y) {
  case 85:
   return 0;
  
  case 157:
    return 1;
 
      case 229:
    return 2;
    
      case 301:
    return 3;
      case 373:
    return 4;
    
      case 445:
    return 5;
      case 517:
    return 6;
      case 589:
    return 7;

  default:
    return -1;
 }
 
}


public void pieces(int p1, int p2, int i1, int j1) {
   i=i1;j=j1;
  if(!firstMove[i1]){
      position1= p1;
     position2=p2;
                 
    }else{
      position1 = pos[i];
      position2 = pos[j];
                
  }
     
     moved=true;
}

public void places(int p1, int p2) {
aux3=pos[i];
aux4=pos[j];  
//aux3=p1;
//aux4=p2;
 pos[i] = p1;
 pos[j] = p2;

                 
  if(board.movePiece()){
     firstMove[i]=true;

     for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
       //   piece1.x =  + i*72;
         // piece1.y = piece1.y + j*72;
            if(j==p1 && i==p2){
              // place3[Nplace]=null;
        place3[Nplace] = new Rectangle(piece[Npiece].x, piece[Npiece].y, place1.width, place1.height);
        piece[Npiece]=new Rectangle(piece1.x + i*72, piece1.y + j*72, piece1.width, piece1.height);
        //place3[Nplace]=new Rectangle(place1.x + i, place1.y + j, place1.width, place1.height);
         //g.fillOval(piece1.x + i*72, piece1.y + j*72, piece1.width, piece1.height);
            }
          }
      } 
    position1=-1;
    position2=-1;
      }else{
          pos[i]=aux3;
          pos[j]=aux4;
      }
   repaint(); 
 //board.setComio(false);
}

    // EVENTOS DEL MOUSE
    public void actions() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Position pices
                 if (piece[0].contains(e.getPoint())) {
                    pieces(0, 0, 0, 1);
                    Npiece=0;
                  }
                  if (piece[1].contains(e.getPoint())) {
                   pieces(2, 0, 2, 3);
                   Npiece=1;
                   arrastrando = true;
                  }
                   if (piece[2].contains(e.getPoint())) {
                    pieces(6, 0, 4, 5);
                    Npiece=2;
                  }
                  if (piece[3].contains(e.getPoint())) {
                   pieces(1, 1, 6, 7);
                   Npiece=3;}
                    if (piece[4].contains(e.getPoint())) {
                    pieces(5, 1, 8, 9);
                    Npiece=4;}
                  if (piece[5].contains(e.getPoint())) {
                   pieces(7, 1, 10, 11);
                   Npiece=5;}
                   if (piece[6].contains(e.getPoint())) {
                    pieces(0, 2, 12, 13);
                    Npiece=6;}
                  if (piece[7].contains(e.getPoint())) {
                   pieces(2, 2, 14, 15);
                   Npiece=7;}
                   if (piece[8].contains(e.getPoint())) {
                    pieces(6, 2, 16, 17);
                    Npiece=8;}
                  if (piece[9].contains(e.getPoint())) {
                   pieces(1, 3, 18, 19);
                   Npiece=9;}
                   if (piece[10].contains(e.getPoint())) {
                    pieces(5, 3, 20, 21);
                    Npiece=10;
                  }
                  if (piece[11].contains(e.getPoint())) {
                   pieces(7, 3, 22, 23);
                   Npiece=11;}
                 
                   if (piece[12].contains(e.getPoint())) {
                    pieces(0, 4, 24, 25);Npiece=12;}
                  if (piece[13].contains(e.getPoint())) {
                   pieces(2, 4, 26, 27);Npiece=13;}
                   if (piece[14].contains(e.getPoint())) {
                    pieces(6, 4, 28, 29);Npiece=14;}
                  if (piece[15].contains(e.getPoint())) {
                   pieces(1, 5, 30, 31);Npiece=15;}
                    if (piece[16].contains(e.getPoint())) {
                   pieces(5, 5, 32, 33);Npiece=16;}
 if (piece[17].contains(e.getPoint())) {
                   pieces(7, 5, 34, 35);Npiece=17;}
 if (piece[18].contains(e.getPoint())) {
                   pieces(0, 6, 36, 37);Npiece=18;}
 if (piece[19].contains(e.getPoint())) {
                   pieces(2, 6, 38, 39);Npiece=19;}
 if (piece[20].contains(e.getPoint())) {
                   pieces(6, 6, 40, 41);Npiece=20;}
 if (piece[21].contains(e.getPoint())) {
                   pieces(1, 7, 42, 43);Npiece=21;}
 if (piece[22].contains(e.getPoint())) {
                   pieces(5, 7, 44, 45);Npiece=22;}
 if (piece[23].contains(e.getPoint())) {
                   pieces(7, 7, 46, 47);Npiece=23;}

                // Position to move
                 if (place3[0].contains(e.getPoint())){
                  Nplace=0;

                    places( positionY(place3[0].y), positionX(place3[0].x));} 

                  if (place3[1].contains(e.getPoint())){
                  Nplace=1;
                    places(positionY(place3[1].y), positionX(place3[1].x));  }    
                    if (place3[2].contains(e.getPoint())){
                       Nplace=2;                   
                      places(positionY(place3[2].y), positionX(place3[2].x));}        
                  if (place3[3].contains(e.getPoint())){
                   Nplace=3;
                    places(positionY(place3[3].y), positionX(place3[3].x));  }   
                     if (place3[4].contains(e.getPoint())){
                    Nplace=4;
                   places(positionY(place3[4].y), positionX(place3[4].x));  }   
                     if (place3[5].contains(e.getPoint())){
                    Nplace=5;
                    places(positionY(place3[5].y), positionX(place3[5].x));}        
                  if (place3[6].contains(e.getPoint())){
                    Nplace=6;
                   places(positionY(place3[6].y), positionX(place3[6].x));  }    
                    if (place3[7].contains(e.getPoint())){
                    Nplace=7;
                    places(positionY(place3[7].y), positionX(place3[7].x));Nplace=7;}        
                  if (place3[8].contains(e.getPoint())){
                    Nplace=8;
                   places(positionY(place3[8].y), positionX(place3[8].x));  }   
                     if (place3[9].contains(e.getPoint())){
                    Nplace=9;
                   places(positionY(place3[9].y), positionX(place3[9].x));  } 
                 if (place3[10].contains(e.getPoint())){

                    places(positionY(place3[10].y), positionX(place3[10].x));}        
                  if (place3[11].contains(e.getPoint())){
                      Nplace=11;
                   places(positionY(place3[11].y), positionX(place3[11].x));  }    
                    if (place3[12].contains(e.getPoint())){
                    Nplace=12;
                    places(positionY(place3[12].y), positionX(place3[12].x));}        
                  if (place3[13].contains(e.getPoint())){
                    Nplace=13;
                   places(positionY(place3[13].y), positionX(place3[13].x));  }   
                     if (place3[14].contains(e.getPoint())){
                    Nplace=14;
                   places(positionY(place3[14].y), positionX(place3[14].x));  }  
                    if (place3[15].contains(e.getPoint())){
                    Nplace=15;
                    places(positionY(place3[15].y), positionX(place3[15].x));}        
                  if (place3[16].contains(e.getPoint())){
                    Nplace=16;
                   places(positionY(place3[16].y), positionX(place3[16].x));  }    
                    if (place3[17].contains(e.getPoint())){
                    Nplace=17;
                    places(positionY(place3[17].y), positionX(place3[17].x));}        
                  if (place3[18].contains(e.getPoint())){
                    Nplace=18;
                   places(positionY(place3[18].y), positionX(place3[18].x));  }   
                     if (place3[19].contains(e.getPoint())){
                    Nplace=19;
                   places(positionY(place3[19].y), positionX(place3[19].x));  } 
                    if (place3[20].contains(e.getPoint())){
                      Nplace=20;
                    places(positionY(place3[20].y), positionX(place3[20].x));}
                    if (place3[21].contains(e.getPoint())){
                      Nplace=21;
                    places(positionY(place3[21].y), positionX(place3[21].x));}
                    if (place3[22].contains(e.getPoint())){
                    Nplace=22;
                    places(positionY(place3[22].y), positionX(place3[22].x));}
                    if (place3[23].contains(e.getPoint())){
                    Nplace=23;
                    places(positionY(place3[23].y), positionX(place3[23].x));}
                    if (place3[24].contains(e.getPoint())){
                    Nplace=24;
                    places(positionY(place3[24].y), positionX(place3[24].x));}
                    if (place3[25].contains(e.getPoint())){
                    Nplace=25;
                    places(positionY(place3[25].y), positionX(place3[25].x));}
                    if (place3[26].contains(e.getPoint())){
                    Nplace=26;
                    places(positionY(place3[26].y), positionX(place3[26].x));}
                    if (place3[27].contains(e.getPoint())){
                    Nplace=27;
                    places(positionY(place3[27].y), positionX(place3[27].x));}
                    if (place3[28].contains(e.getPoint())){
                    Nplace=28;
                    places(positionY(place3[28].y), positionX(place3[28].x));}
                    if (place3[29].contains(e.getPoint())){
                    Nplace=29;
                    places(positionY(place3[29].y), positionX(place3[29].x));}
                    if (place3[30].contains(e.getPoint())){
                    Nplace=30;
                    places(positionY(place3[30].y), positionX(place3[30].x));}
                    if (place3[31].contains(e.getPoint())){
                    Nplace=31;
                    places(positionY(place3[31].y), positionX(place3[31].x));}
                    if (place3[32].contains(e.getPoint())){
                    Nplace=32;
                    places(positionY(place3[32].y), positionX(place3[32].x));}
                    if (place3[33].contains(e.getPoint())){
                    Nplace=33;
                    places(positionY(place3[33].y), positionX(place3[33].x));}
                    if (place3[34].contains(e.getPoint())){
                    Nplace=34;
                    places(positionY(place3[34].y), positionX(place3[34].x));}
                    if (place3[35].contains(e.getPoint())){
                    Nplace=35;
                    places(positionY(place3[35].y), positionX(place3[35].x));}
                    if (place3[36].contains(e.getPoint())){
                    Nplace=36;
                    places(positionY(place3[36].y), positionX(place3[36].x));}
                    if (place3[37].contains(e.getPoint())){
                       Nplace=37;
                      places(positionY(place3[37].y), positionX(place3[37].x));                 
                  }
                    if (place3[38].contains(e.getPoint())){
                    Nplace=38;
                    places(positionY(place3[38].y), positionX(place3[38].x));}
                    if (place3[39].contains(e.getPoint())){
                    Nplace=39;
                    places(positionY(place3[39].y), positionX(place3[39].x));}
               
             }
 
        });
    }
 
    // DIBUJAR EN PANTALLA
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.WHITE);
// solo al inicio

if(moved==false){
  
       // Círculo rojo

       for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            if((j==0 && i%2==0)|| (j==1 && i%2!=0) || (j==2 && i%2==0) || (j==5 && i%2!=0) || (j==6 && i%2==0) || (j==7 && i%2!=0)){ 
        if(j<3){
              g.setColor(Color.RED);
         
        }else{
            g.setColor(Color.BLUE);}
            g.fillOval(piece1.x + i*72, piece1.y + j*72, piece1.width, piece1.height);
          
         if(aux2<24){
            piece[aux2]=new Rectangle(piece1.x + i*72, piece1.y + j*72, piece1.width, piece1.height);
            aux2++;}

            }

        }
    }




 for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
       
             if((j==0 && i%2!=0) || (j==1&& i%2==0) || (j==2 && i%2!=0) || (j==3 /*&& i%2==0*/) || (j==4 /*&& i%2!=0*/) || (j==5 && i%2==0) || (j==6 && i%2!=0) || (j==7 && i%2==0)){ {
         g.setColor(Color.RED);
         g.setColor(new Color(100, 149, 237,100));
         g.fillRect(place1.x + i*72, place1.y + j*72, place1.width, place1.height);
         
         if(aux<40){
       place3[aux]=new Rectangle(place1.x + i*72, place1.y + j*72, place1.width, place1.height);
        aux++;
        }
      }
    }
   /// test();
}
}
}



else{




        // Círculo rojo
  
        for(int k=0;k<24;k++){
          if(k==2 || k==4|| k==5|| k==8 || k==10 || k==11 || k==14 || k==16 || k==17 || k==20 || k==22 || k==23 ){
            g.setColor(Color.BLUE);
          }else{
            g.setColor(Color.RED);
          }
        //  g.setColor(Color.RED);
        
        if(!board.getComio()){
            //piece[k]=null;
          g.fillOval(piece[k].x, piece[k].y, piece[k].width, piece[k].height);
        }else{

              //piece[k]=null;
            //board.setComio(false);
if(num== board.getPieceNumber(pos[i]-1, pos[j]-1)){
num++;

}else{
g.fillOval(piece[k].x, piece[k].y, piece[k].width,piece[k].height);
}

         }
          }
  for(int l=0;l<40;l++){
          g.setColor(Color.RED);
          g.setColor(new Color(100, 149, 237,100));
          g.fillRect(place3[l].x, place3[l].y, place3[l].width, place3[l].height);
          
          
      }
}
//
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
     public  int getAux3() {
        return aux3;
    } 
     public  int getAux4() {
         return aux4;
    }
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
