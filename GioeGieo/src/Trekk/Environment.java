package trekk;

public class Environment {

	Swing S;
	Area currArea;
	//Where the PC is currently
	

	public Environment(Swing s) {
		S = s;
		currArea = new Area(S);
	}


}
