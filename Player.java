package FallingCoins;

import zen.core.Zen;

public class Player {
	int x, y , dy;
	boolean jumping = false;

	public Player(){
		x = 300;
		y = 400;
		dy = 0;
		
	}

	public void draw() {
		Zen.setColor("purple");
		Zen.fillOval(x-20, y-20, 40, 40);
	}

	public void move(){
		if(Zen.isKeyPressed("up") && jumping == false){
			 dy = -15;
			 jumping = true;
		}
		if(Zen.isKeyPressed("left")){
			x -=5;
		}
		if(Zen.isKeyPressed("right")){
			x+=5;
		}
		if(y>480){
			y = 480;
			dy = 0;
			jumping = true;
		}
		else{
			y  += dy;
			dy ++;
		}
	}

	public boolean collects(Coins coins) {
		if(Math.abs(x - coins.x) < 25 && Math.abs (y - coins.y)< 25){
			return true;
		}
		return false;
	}


}
