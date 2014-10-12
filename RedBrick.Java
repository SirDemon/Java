package BrickBreaker;

import zen.core.Zen;

public class RedBrick extends Brick{

	
	
		
	
	
	public RedBrick(int newX, int newY) {
		super(newX, newY);
		// TODO Auto-generated constructor stub
	}
	public void draw(){
		Zen.setColor("red");
		Zen.fillRect(x-20, y-10, 40, 20);
	}
	public void move() {
		
		if (y > 0){
			
			x = x + 1;
			
		}
		if(y < 100){
			
			x--;
		}
	}
	


}

