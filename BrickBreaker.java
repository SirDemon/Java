package BrickBreaker;

import java.util.ArrayList;

import zen.core.Zen;

public class BrickBreaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zen.create(500, 800);

		Ball b = new Ball();
		Paddle p = new Paddle();
		RedBrick rb = new RedBrick(250, 50);
		ArrayList<Brick> bricks = new ArrayList<Brick>();
		


		int brickX = 50;
		while(brickX < 500) {
			Brick br = new Brick(brickX,200);
			bricks.add(br);
			brickX = brickX + 50;
		
		
		}

	

		

		




		while(true){
			drawBackground();
			p.draw();
			b.draw();
			p.move();
			b.move();
			rb.draw();
			rb.move();
			for(Brick br : bricks){
				br.draw();
			}


			if(b.isTouching(p)){
				b.dy = -b.dy;
			}
			for(int i = 0;i < bricks.size(); i++){
				if(bricks.get(i).istouching(b)){
					bricks.remove(i);
					b.dy= -b.dy;
					i--;
					}

					else if(bricks.get(i).istouching(b)){
						b.dy= -b.dy;


					}
					else {
						bricks.get(i).draw();
						bricks.get(i).move();


					}
			}
			
			Zen.buffer(33);
		}

	}




	private static void drawBackground() {
		Zen.setBackground("light green");

	}

}
