import zen.core.Zen;


public class Frog {
	int x;
	int y;
	boolean upKeyPressed= false;
	
	public void draw() {
	Zen.setColor("red");
	Zen.fillOval(x-15, y-15, 30, 30);
	}
	
	
	
	public void move() {
		if(Zen.isKeyPressed("left")) {
			x = x-5;
		} 
		if(Zen.isKeyPressed("right")) {
			x = x+5;
		}
		if(Zen.isKeyPressed("up")&& upKeyPressed ==false) {
			y= y-50;
		}
		if(Zen.isKeyPressed("up")==false) {
			upKeyPressed = false;
		}
		if(Zen.isKeyPressed("down")) {
			y = y+50;
			upKeyPressed = true;
		}
		
	}
	public void setup(){
		x = 400;
		y = 520;
	}





}
