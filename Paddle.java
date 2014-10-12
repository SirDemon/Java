package BrickBreaker;

import zen.core.Zen;

public class Paddle {

	int x;
	int y;


	public Paddle(){
		x = 250;
		y = 700;
	}

	public void draw() {
		Zen.setColor("red");
		Zen.fillRect(x-50,y, 100, 10);

	}

	public void move() {
		if(Zen.isKeyPressed("left")){
			x = x-5;


		}
		if(Zen.isKeyPressed("right")){
			x = x +5;
		}


	}

	
}
