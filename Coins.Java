package FallingCoins;

import zen.core.Zen;

public class Coins {
	int x, y , speed , value;
	boolean isBrick;
	public Coins(){
		x = Zen.getRandomNumber(5, 595);
		y = 5;
		speed = 5;
		value = 1;
	}
	public void draw() {
		Zen.setColor("brown");
		Zen.fillOval(x,y,10,10);
	}
	public void move(){
		y += speed;
	}
}
