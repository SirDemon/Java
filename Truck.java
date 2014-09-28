import zen.core.Zen;


public class Truck {
	int x;
	int lane;
	int speed;
	public boolean isKilling(Frog f){
		int y = 180 + 50* lane;
		if(Math.abs(f.x-(x+ 80))< 30 && Math.abs(f.y- y) < 30){
			return true;
		}
		return false;
	}
	public void draw() {
		int y = 180 + 50 *lane;
		Zen.fillRect(x, y, 80, 40);
	}
	
	public void move() {
		x = x + speed;
		if(x>800){
			setup();
		}
	 
		
	}
	
	public void setup() {
		x = Zen.getRandomNumber(-500,-100);
		speed = Zen.getRandomNumber(3,0);
		lane = Zen.getRandomNumber(0,5);
	
		
	}
}
