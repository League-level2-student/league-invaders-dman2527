import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject  {

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	public void draw( Graphics g) {
		 g.setColor(Color.BLUE);
	     g.fillRect(x, y, width, height);
	}
	public void right() {
        x+=speedrocket;
    }
	public void up() {
        y-=speedrocket;
    }
	public void left() {
        x-=speedrocket;
    }
	public void down() {
        y+=speedrocket;
    }
}
