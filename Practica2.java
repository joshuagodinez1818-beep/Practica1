// hoimvnunnafvadñhsiokdhnfvsfs
//vefsaefvewsfvsefdc
//ervwfevewfvwefvwsfv


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Practica2 extends JPanel {

    // Área del botón (el cuadrado púrpura)
    Rectangle boton1 = new Rectangle(25, 50, 50, 50);
 Rectangle boton2 = new Rectangle(95, 50, 50, 50);
 Rectangle boton3 = new Rectangle(160, 50, 50, 50);
 Rectangle boton4 = new Rectangle(25, 110, 50, 50);
 Rectangle boton5 = new Rectangle(95, 110, 50, 50);
 Rectangle boton6 = new Rectangle(160, 110, 50, 50);
 Rectangle boton7 = new Rectangle(25, 175, 50, 50);
 Rectangle boton8 = new Rectangle(95, 175, 50, 50);
 Rectangle boton9 = new Rectangle(160, 175, 50, 50);
 Rectangle boton10 = new Rectangle(250, 110, 50, 50);
 Rectangle boton11 = new Rectangle(250, 55, 50, 50);
boolean pos1 = false;
boolean pos2 = false;
boolean pos3 = false;
boolean pos4 = false;
boolean pos5 = false;
boolean pos6 = false;
boolean pos7 = false;
boolean pos8 = false;
boolean pos9 = false;
//int empate=0;
int board[][] = new int[3][3];
   int juagador=0;
   boolean ganador= false;
   int fila=0;
   int animY = 0;
boolean animando = false;

    public Practica2() {
     
       

      
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (boton1.contains(e.getPoint())&& pos1==false && ganador==false) {
                        if(juagador%2==0){
                        board[0][0] = 1;
                        }else{
                         board[0][0] = 2;}
                            pos1=true;
                            juagador++;
               repaint();
               Reglas();   
                    System.out.println("¡Botón presionado! EN LA POSICION ARRIBA IZQUIERDA");
                }
                if (boton2.contains(e.getPoint())&& pos2==false && ganador==false) {
                       if(juagador%2==0){
                        board[0][1] = 1;}else{
                         board[0][1] = 2;}
                            pos2=true;
                               juagador++;
 repaint();
Reglas();   
                    System.out.println("¡Botón presionado! EN LA POSICION ARRIBA CENTRO");
                }
                if (boton3.contains(e.getPoint())&& pos3==false && ganador==false) {
                      if(juagador%2==0){
                        board[0][2] = 1;}else{
                         board[0][2] = 2;}
                            pos3=true;
                               juagador++;
 repaint();
Reglas();   
                    System.out.println("¡Botón presionado! EN LA POSICION ARRIBA DERECHA");
                }

                if (boton4.contains(e.getPoint())&& pos4==false && ganador==false) {

                         if(juagador%2==0){
                        board[1][0] = 1;}else{
                         board[1][0] = 2;}
                            pos4=true;
                               juagador++;
 repaint();Reglas();   
                    System.out.println("¡Botón presionado! EN LA POSICION CENTRO IZQUIERDA");
                }
                if (boton5.contains(e.getPoint())   && pos5==false && ganador==false) {

                         if(juagador%2==0){
                        board[1][1] = 1;}else{
                         board[1][1] = 2;}
                            pos5=true;
                               juagador++;
 repaint();Reglas();   
                    System.out.println("¡Botón presionado! EN LA POSICION CENTRO CENTRO");
                }
                if (boton6.contains(e.getPoint()) && pos6==false    && ganador==false) {

                        if(juagador%2==0){
                        board[1][2] = 1;}else{
                         board[1][2] = 2;}
                            pos6=true;
                               juagador++;
 repaint();Reglas();   
                    System.out.println("¡Botón presionado! EN LA POSICION CENTRO DERECHA");
                }
                if (boton7.contains(e.getPoint()) && pos7==false && ganador==false) {

                        if(juagador%2==0){
                        board[2][0] = 1;}else{
                         board[2][0] = 2;}
                            pos7=true;
                               juagador++;
 repaint();Reglas();   
                    System.out.println("¡Botón presionado! EN LA POSICION ABAJO IZQUIERDA");
                }
                if (boton8.contains(e.getPoint()) && pos8==false && ganador==false) {

                         if(juagador%2==0){
                        board[2][1] = 1;}else{
                         board[2][1] = 2;}
                            pos8=true;
                               juagador++;
 repaint();Reglas();   
                    System.out.println("¡Botón presionado! EN LA POSICION ABAJO CENTRO");
                }
                if (boton9.contains(e.getPoint()) && pos9==false && ganador==false) {

                        if(juagador%2==0){
                        board[2][2] = 1;}else{
                         board[2][2] = 2;}
                            pos9=true;
                               juagador++;
 repaint();Reglas();   
                    System.out.println("¡Botón presionado! EN LA POSICION ABAJO DERECHA");
                }
                 if (boton10.contains(e.getPoint())) {

           System.exit(0);

                    System.out.println("Se ha terminado el juego");


                }
                 if (boton11.contains(e.getPoint())&& ganador==true) {
 pos1 = false;
 pos2 = false;
  pos3 = false;
 pos4 = false;
 pos5 = false;
 pos6 = false;
 pos7 = false;
 pos8 = false;
 pos9 = false;


for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        board[i][j]=0;
    }
}

   juagador=0;
   ganador= false;
                    





                    System.out.println("¡Reiniciando juego!");
                }
                System.out.println(juagador);
            }
         
        });

         new javax.swing.Timer(80, e -> {
        if (animando) {
            animY += 5;

            if (animY >= 75) {
                animY = 75;
                animando = false;
            }
            repaint();
        }
    }).start();
   
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 

        // Fondo
        setBackground(Color.WHITE);

        // Líneas negras
        g.setColor(Color.BLACK);
        g.fillRect(80, 50, 5, 180);
        g.fillRect(150, 50, 5, 180);
        g.fillRect(30, 100, 180, 5);
        g.fillRect(30, 170, 180, 5);

        // BOTÓN (cuadrado púrpura)
        g.setColor(new Color(128, 0, 128, 0));
        g.fillRect(boton1.x, boton1.y, boton1.width, boton1.height);

         g.setColor(new Color(128, 0, 128, 0));
        g.fillRect(boton2.x, boton2.y, boton2.width, boton2.height);

         g.setColor(new Color(128, 0, 128, 0));
        g.fillRect(boton3.x, boton3.y, boton3.width, boton3.height);

      g.setColor(new Color(128, 0, 128, 0));
        g.fillRect(boton4.x, boton4.y, boton4.width, boton4.height);

         g.setColor(new Color(128, 0, 128, 0));
        g.fillRect(boton5.x, boton5.y, boton5.width, boton5.height);

          g.setColor(new Color(128, 0, 128, 0));
        g.fillRect(boton6.x, boton6.y, boton6.width, boton6.height);

         g.setColor(new Color(128, 0, 128, 0));
        g.fillRect(boton7.x, boton7.y, boton7.width, boton7.height);

 g.setColor(new Color(128, 0, 128, 0));
        g.fillRect(boton8.x, boton8.y, boton8.width, boton8.height);

 g.setColor(new Color(128, 0, 128, 0));
        g.fillRect(boton9.x, boton9.y, boton9.width, boton9.height);

        // Texto del botón
       // g.setColor(Color.BLACK);
      //  g.drawString("Click", 40, 205);

        // Círculo
        if(board[0][0]==1 ){
        g.setColor(Color.RED);
        g.fillOval(25, 50, 50, 50);  }
       
        if(board[0][0]==2){
        g.setColor(Color.BLUE);
        g.fillOval(25, 50, 50, 50);}
    if(board[0][1]==1 ){
        g.setColor(Color.RED);
        g.fillOval(93, 50, 50, 50);  }

        if(board[0][1]==2){
        g.setColor(Color.BLUE);
        g.fillOval(93, 50, 50, 50);}
    if(board[0][2]==1 ){
        g.setColor(Color.RED);
        g.fillOval(160, 50, 50, 50);  }

        if(board[0][2]==2){
        g.setColor(Color.BLUE);
        g.fillOval(160, 50, 50, 50);}
        if(board[1][0]==1 ){
        g.setColor(Color.RED);
        g.fillOval(25, 110, 50, 50);  }

        if(board[1][0]==2){
        g.setColor(Color.BLUE);
        g.fillOval(25, 110, 50, 50);}
        if(board[1][1]==1 ){
        g.setColor(Color.RED);
        g.fillOval(93, 110, 50, 50);  }

        if(board[1][1]==2){
        g.setColor(Color.BLUE);
        g.fillOval(93, 110, 50, 50);}
        if(board[1][2]==1 ){
        g.setColor(Color.RED);
        g.fillOval(160, 110, 50, 50);  }

        if(board[1][2]==2){
        g.setColor(Color.BLUE);
        g.fillOval(160, 110, 50, 50);}
        if(board[2][0]==1 ){
        g.setColor(Color.RED);
        g.fillOval(25, 175, 50, 50);  }

        if(board[2][0]==2){
        g.setColor(Color.BLUE);
        g.fillOval(25, 175 , 50, 50);}
        if(board[2][1]==1 ){
        g.setColor(Color.RED);
        g.fillOval(93, 175, 50, 50);  }

        if(board[2][1]==2){
        g.setColor(Color.BLUE);
        g.fillOval(93, 175, 50, 50);}
        if(board[2][2]==1 ){
        g.setColor(Color.RED);
        g.fillOval(160, 175, 50, 50);  }

        if(board[2][2]==2){
        g.setColor(Color.BLUE);
        g.fillOval(160, 175, 50, 50);}
       
        


       
int resultado = Reglas();
if(resultado != 0){
    ganador = true;
    if(resultado==1){
        g.setColor(Color.BLACK);
        g.drawString("Empate", 100, 30);
    } 
    else if(resultado==2){
         g.setColor(Color.RED);
        g.drawString("Gana el jugador Rojo", 60, 30);
        if(fila==1){
            g.setColor(Color.black);
           g.fillRect(25, animY, 185, 5);

        }
    } else {
           g.setColor(Color.BLUE);
        g.drawString("Gana el jugador Azul", 60, 30);
     
    }
}


      //  g.setColor(Color.BLACK);
       // g.drawString(Reglas(), 40, 205);




    g.setColor(new Color(128, 0, 128, 255));
        g.fillRect(boton10.x, boton10.y, boton10.width, boton10.height);
         
       g.setColor(Color.BLACK);
       g.drawString("Salir", 260, 140);

if(ganador==true){
    g.setColor(new Color(128, 0, 128, 255));
        g.fillRect(boton11.x, boton11.y, boton11.width, boton11.height);
         
       g.setColor(Color.BLACK);
       g.drawString("Reiniciar", 250, 85);
        repaint();
}


//doahoifhoiahsfohia
//dasdadasdadasda/
//dasdadadadasdsa
             
               
       
    }
 public int Reglas() {

if(board[0][0]==1 && board[0][1]==1 && board[0][2]==1){
  //  System.out.println("Gana el jugador Rojo");
fila=1;
animando = true;

   return 2; 
 }
    if(board[1][0]==1 && board[1][1]==1 && board[1][2]==1){
    return 2; }
     if(board[2][0]==1 && board[2][1]==1 && board[2][2]==1){
   return 2; }
      if(board[0][0]==1 && board[1][0]==1 && board[2][0]==1){
   return 2; }
       if(board[0][1]==1 && board[1][1]==1 && board[2][1]==1){
 return 2; }
    if(board[0][2]==1 && board[1][2]==1 && board[2][2]==1){
 return 2; }
        if(board[0][0]==1 && board[1][1]==1 && board[2][2]==1){
  return 2; }
         if(board[0][2]==1 && board[1][1]==1 && board[2][0]==1){
 return 2; }
        //Jugador Azul
        if(board[0][0]==2 && board[0][1]==2 && board[0][2]==2){
    return 1; }
     if(board[1][0]==2 && board[1][1]==2 && board[1][2]==2){
    return 1; }
     if(board[2][0]==2 && board[2][1]==2 && board[2][2]==2){
    return 1; }
      if(board[0][0]==2 && board[1][0]==2 && board[2][0]==2){
    return 1; }
       if(board[0][1]==2 && board[1][1]==2 && board[2][1]==2){
    return 1; }
    if(board[0][2]==2 && board[1][2]==2 && board[2][2]==2){
    return 1; }
        if(board[0][0]==2 && board[1][1]==2 && board[2][2]==2){
     return 1; }
         if(board[0][2]==2 && board[1][1]==2 && board[2][0]==2){
    return 1; }


//Empate
int contador=-1;
for(int i=0;i<3;i++){
    for(int j=0;j<2;j++){

         contador=contador * (board[i][j] * board[i][j+1]);

         }
        }
if(contador==0){
    return 0;
} else{
    return 1;
}
     
    }
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo Gráfico en Java");

        Practica2 panel = new Practica2();
        ventana.add(panel);
   
   


        ventana.setSize(450, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
     
  
    }
}
