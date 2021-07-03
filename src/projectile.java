import java.awt.Color;
import java.awt.Graphics;

public class projectile extends GameObject{

	public projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	public void update(){
		this.y -= this.speedprojectile;
	 }
	public void draw(Graphics g){
		 g.setColor(Color.YELLOW);
	     g.fillRect(x, y, width, height);
	 }
}
