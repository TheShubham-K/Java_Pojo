package finalProject;

interface Animatable {
	 public void animate();
	} 

class GameShape {
	public void shape() {
		System.out.println("Shape of the game board");
	}
	
}

class PlayerPiece extends GameShape implements Animatable {
	 public void movePiece() {
	 System.out.println("moving game piece");
	 }
	 public void animate() {
	 System.out.println("animating...");
	 }
	 // more code
	}  

class tilepiece extends GameShape {
	
}



public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerPiece player = new PlayerPiece();
		Object o = player;
		GameShape shape = player;
		Animatable mover = player;
		player.animate();
		player.shape();
		player.movePiece();
		player.animate();
	}

}
