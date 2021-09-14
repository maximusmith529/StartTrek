package trekk;

public class Game {
	
	
	//Base classes
	
	Swing S = new Swing();
	Environment E = new Environment(S);


	
	public Game() {	
		S.setEnvironment(E);
	
	}
	
	
	public static void main(String[] args) {
		
		new Game();
		
	}
	
	
	
	
	
}
