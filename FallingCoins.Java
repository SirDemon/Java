package FallingCoins;

import java.util.ArrayList;

import zen.core.Zen;

public class FallingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zen.create(600,600);
		Player p = new Player();
		ArrayList<Coins> coinlist = new ArrayList <Coins>();
		Coins c = new Coins();
		coinlist.add(c);
		int score = 0;
		boolean gameOver = false;

		while(true){
			if(gameOver){
				Zen.setColor("black");
				Zen.drawText("GAME OVER", 200, 200);
				
				
			}
			else{
			Zen.setBackground("light blue");
			Zen.setColor("green");
			Zen.fillRect(0, 500, 600, 100);

			p.draw();
			p.move();

			if(coinlist.get(coinlist.size() - 1).y >40){
				spawncoin(coinlist);
			}
			for(int i = 0; i < coinlist.size(); i++){
				coinlist.get(i).move();
				coinlist.get(i).draw();
				if(coinlist.get(i).isBrick){
					if(p.collects(coinlist.get(i))){
				}

				if(p.collects(coinlist.get(i))){
					score += coinlist.get(i).value;

					coinlist.remove(coinlist.get(i));



				}
				if(coinlist.get(i).y >495) {
					coinlist.remove(i);
					i--;
				}

			}

			String scoreboard  = "Score "+ score;
			Zen.setColor("white");
			Zen.drawText(scoreboard, 100, 500);
			Zen.buffer(33);
		}



	}

	private static void spawncoin(ArrayList<Coins> coinlist) {
		int random = Zen.getRandomNumber(1, 10);
		if(random < 9){
			Coins c = new Coins();
			coinlist.add(c);
		}
		else{
			Brick b = new Brick();
			coinlist.add(b);
		}



	}

}
