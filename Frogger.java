import java.util.ArrayList;

import zen.core.Zen;


public class Frogger {

	public static void main(String[] args) {
		Zen.create(800, 500);
		
		Frog f = new Frog();
		f.setup();
		
		ArrayList<Truck> list = new ArrayList<Truck>();
		
		int count = 0;
		while (count < 50) {
			Truck t = new Truck();
			t.setup();
			list.add(t);
			
			count = count + 1;
		}
		
		while (1 < 2) {
			// draw stuff
			drawBackground();
			f.draw();
			f.move();
			// Tell every truck to draw and move.
			for (Truck t : list) {
				t.draw();
				t.move();
				// If the truck is killing the frog.
				if (t.isKilling(f)) {
					f.setup();
				}
			}
			
			Zen.buffer(33);
		}
	}
	
	private static void drawBackground() {
		Zen.setBackground("gray");
		Zen.setColor("green");
		Zen.fillRect(0, 0, 800, 25);
		Zen.fillRect(0, 475, 800, 25);
		Zen.setColor("turquoise");
		Zen.fillRect(0, 25, 800, 150);

		Zen.setColor("yellow");
		Zen.fillRect(10, 225, 10, 3);
		Zen.fillRect(30, 225, 10, 3);
		Zen.fillRect(50, 225, 10, 3);

		int x;
		int y;
		
		y = 225;
		while (y < 450) {
			// Start x at 10
			x = 10;
			// While x is still valid (less than 800)
			while (x < 800) {
				// Make a rectangle using x
				Zen.fillRect(x, y, 10, 3);
				// Make x bigger by 20, and try again
				x = x + 20;
			}
			y = y + 50;
		}
	}

}
