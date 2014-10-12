package BrickBreaker;

import zen.core.Zen;

public class Ball {

	int x;
	int y;
	int dx;
	int dy;

	public Ball(){
		x = 250;
		y = 650;
		dx = Zen.getRandomNumber(-8, 8);
		dy = Zen.getRandomNumber(-10, -8);




	}
	public void draw() {
		Zen.setColor("white");
		Zen.fillOval(x-10, y-10, 20, 20);

	}

	public void move() {
		x = x + dx;
		y = y + dy;
		if(x > 490 ){
			dx= -dx;
			x = 490;

		}
		if( x <10){
			dx= -dx;
			x = 10;
		}
		if(y< 10){
			dy = -dy;
			y = 10;

		}
	}
	public boolean isTouching(Paddle p) {
		if(Math.abs(p.x-x) < 50 && Math.abs(p.y - y)< 20 ){
			return true;
		}
		return false;
	}


}
