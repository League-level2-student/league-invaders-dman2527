import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer frameDraw ;
	Font titleFont = new Font("Arial",Font.PLAIN,48);
	Font subFont = new Font("Arial",Font.PLAIN,24);
	Rocketship rocketship = new Rocketship(250,750,50,50);
	@Override
	
	public void paintComponent(Graphics g){


		if(currentState == MENU){
    	drawMenuState(g);
	}else if(currentState == GAME){
    	drawGameState(g);
	}else if(currentState == END){
    	drawEndState(g);
	}
	}
	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
   public void updateMenuState() {  
    	
    }
    public void updateGameState() { 
    	
    }
   public void updateEndState()  {  
    	
    }
   public void drawMenuState(Graphics g) { 
	   g.setColor(Color.BLUE);
	   g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	   g.setFont(titleFont);
	   g.setColor(Color.YELLOW);
	   g.drawString("LEAGUE INVADERS", 25, 100);
	   g.setFont(subFont);
	   g.drawString("Press ENTER to Start", 130, 300);
	   g.drawString("Press SPACE for Instructions", 85, 500);
   }
   public void drawGameState(Graphics g) { 
	   rocketship.draw(g);
   }
   public void drawEndState(Graphics g)  {  
	   g.setColor(Color.BLUE);
	   g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	   g.setFont(titleFont);
	   g.setColor(Color.YELLOW);
	   g.drawString("HAHA YOU LOSE, YOU SUCK!", 25, 100);
   }
   public GamePanel() {
	   frameDraw = new Timer(1000/60, this);
	   frameDraw = new Timer(1000/60,this);
	   frameDraw.start();
   }
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
    if(currentState == MENU){
        updateMenuState();
    }else if(currentState == GAME){
        updateGameState();
    }else if(currentState == END){
        updateEndState();
    }
    System.out.println("action");
    repaint();
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	    if (currentState == END) {
	        currentState = MENU;
	    } else {
	        currentState++;
	    }
	}   
	if (e.getKeyCode()==KeyEvent.VK_UP) {
	    System.out.println("UP");
	}
	if (e.getKeyCode()==KeyEvent.VK_LEFT) {
	    System.out.println("LEFT");
	}
	if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
	    System.out.println("RIGHT");
	}
	if (e.getKeyCode()==KeyEvent.VK_DOWN) {
	    System.out.println("DOWN");
	}
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
