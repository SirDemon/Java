import zen.core.Zen;


public class BouncingBalls {

	public static void main(String[] args) {
		Zen.create(500, 500);
		
		Ball[] list = new Ball[100000];
		
		int index = 0;
		while (index < 100000){
			list[index] = new Ball();
			list[index].create();
			index++;
			
		}
		
		
		
		
	
		while(1<2){
			Zen.setBackground("white");
			index = 0;
			while (index<100000){
				list[index].move();
				list[index].draw();
				index++;
			}
			
			
			
			Zen.buffer(39);
			
		}

	}

}
