import java.util.ArrayList;

public class ObjectManager {
	Rocketship rocket = new Rocketship(0, 0, 0, 0);
	ArrayList projectiles = new ArrayList();
	public ObjectManager(Rocketship rocketship){
		this.rocket = rocketship;
	}
	
}
