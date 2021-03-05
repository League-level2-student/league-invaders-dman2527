import javax.swing.JFrame;

public class LeagueInvaders {
	GamePanel gamepanel = new GamePanel();
	JFrame frame;
	public static final int HEIGHT = 800;
	public static final int WIDTH = 500;
	
 public LeagueInvaders() {
	frame = new JFrame(); 
 }
	public static void main(String[] args) {
		LeagueInvaders leagueinvaders = new LeagueInvaders();
		leagueinvaders.setup();
}
	public void setup() {
		frame.add(gamepanel);
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(gamepanel);
	}
}

