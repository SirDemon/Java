import java.util.ArrayList;

import zen.core.Zen;


public class Frogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zen.create(800, 500);
		Frog f = new Frog();
		
		ArrayList<Truck>list = new ArrayList<Truck>();
		
		
		int count = 0;
		while (count < 50){
		
		Truck t = new Truck();
		t.setup();
		list.add(t);
		
		count++;
		
		
		
		}		
		while(true){
			drawStuff();
			f.move();
			f.draw();
						
			
			
			for (Truck t: list){
				t.draw();
				t.move();
				if(t.isKilling(f)){
					f.setup();
				}
			}
			
			

			Zen.buffer(33);
		}


	}


	private static void drawFrog() {


	}

	private static void drawStuff() {
		Zen.setBackground("gray");		
		Zen.setColor("green");
		Zen.fillRect(0, 0, 800, 25);
		Zen.fillRect(0, 475, 800, 25);
		Zen.setColor("cyan");
		Zen.fillRect(0,25, 800, 150);
		Zen.setColor("yellow");
		int x;
		int y;
		y = 225;
		while(y< 450) {
			x = 10;
			while(x < 800) {
				Zen.fillRect(x, y, 10, 3);
				x = x + 20;
			}
			y = y + 50;
		}

	}

}
