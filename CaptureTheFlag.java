package CTF;

import zen.core.Zen;

public class CaptureTheFlag {

	public static void main(String[] args) {
		Zen.connect("capture the flag");
		Zen.write("rishix", 750);
		Zen.write("rishiy", 250);
		Zen.write("rishiteam", "blue");
		Zen.create(1000, 500);
		Player me = new Player("rishi");
		
		Game g = new Game();
		Team redTeam = new Team("red");
		redTeam.addPLayer(new Player("keshav") );
		redTeam.addPLayer(new Player("divya") );
		redTeam.addPLayer(new Player("ruchi") );
		redTeam.addPLayer(new Player("alejandro") );
		redTeam.addPLayer(new Player("nathan") );
		redTeam.addPLayer(new Player("aakash") );
		g.addTeam(redTeam);
		
		Team blueTeam = new Team("blue");
		blueTeam.addPLayer( new Player("nicolas") );
		blueTeam.addPLayer( new Player("anoop") );
		blueTeam.addPLayer( new Player("amogh") );
		blueTeam.addPLayer( new Player("me") );
		blueTeam.addPLayer( new Player("rohan") );
		g.addTeam(blueTeam);
		
		
		
		while(true){
			Zen.setBackground("green");
			Zen.setColor("white");
			Zen.drawLine(500, 0, 500, 500);
			if(Zen.isKeyPressed("left") && getX() > 0){
				Zen.write("rishix", Zen.readInt("rishix") - 10);
			}
			if(Zen.isKeyPressed("right") && getX() < 1000){
				Zen.write("rishix", Zen.readInt("rishix") + 10);
			}
			if(Zen.isKeyPressed("up") && getY() > 0){
				Zen.write("rishiy", Zen.readInt("rishiy") - 10);
			}
			if(Zen.isKeyPressed("down") && getY()< 1000){
				Zen.write("rishiy", Zen.readInt("rishiy")  + 10);
			}
			
			if(getX() < 500 && redTeam.isTouching(me)){
				Zen.write("rishix", 750);
				Zen.write("rishiy", 250);
			}
			g.draw();
			g.move();
			Zen.buffer(33);
		}

	}

	private static int getY() {
		return Zen.readInt("rishiy");
	}

	private static int getX() {
		return Zen.readInt("rishix");
	}

}
