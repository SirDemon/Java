import zen.core.Zen;


public class SnakeGame {

	public static void main(String[] args) {
		Zen.create(500, 500);
		
		Snake s = new Snake();
		while(true) {
			Zen.setBackground("black");
			s.draw();
			s.move();
			s.grow();
			s.check();
			Zen.buffer( 30);
		}
			
		}
	}



