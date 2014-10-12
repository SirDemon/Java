package BrickBreaker;

import zen.core.Zen;

public class Brick {
	int x;
	int y;
	int health;

	public Brick(int newX, int newY){
		x = newX;
		y= newY;
		health = 1;
	}

	public void draw(){

		Zen.setColor("black");
		Zen.fillRect(x-20, y-10, 40, 20);

	}

	public void move() {
		// TODO Auto-generated method stub

	}

	public boolean istouching(Ball b) {
		if(Math.abs(b.x - x)< 20 && Math.abs(b.y - y) < 20){
			return true;
		}
		return false;
	}


}
