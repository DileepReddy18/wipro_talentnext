package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena veena=new Veena();
		veena.play();
		Saxophone saxophone=new Saxophone();
		saxophone.play();
		Playable p1=veena;
		Playable p2=saxophone;
		p1.play();
		p2.play();
	}

}
