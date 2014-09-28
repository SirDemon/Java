import zen.core.Zen;


public class Ball {	
	int x;
	int y;
	int dx;
	int dy;
	int color = Zen.dice(6);
	
	public void create() {
		x = Zen.dice(400)+50;
		y = Zen.dice(400) +50;
		dx = Zen.getRandomNumber(-5, 5);
		dy = Zen.getRandomNumber(-5, 5);
		
	}
	public void move() {
		x = x + dx;
		y = y + dy;
		if(x > 495 ||x<5){
			dx= -dx;
			
		}
		if(y> 495 || y<5){
			dy= -dy;
		}
		
	
		
	}
	public void draw() {
		if(color==1){
			Zen.setColor("red");
		}
		if(color==2){
			Zen.setColor("green");
		}
		if(color==3){
			Zen.setColor("blue");
		}
		if(color==4){
			Zen.setColor("yellow");
		}
		if(color==5){
			Zen.setColor("purple");
		}
		if(color==6){
			Zen.setColor("orange");
		}
		
		Zen.fillOval(x-10, y-10, 10, 10);
	
	
	
}
	
	
}
