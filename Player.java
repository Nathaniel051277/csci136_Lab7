package lab7;
/* Nathaniel Snyder
 * Christian Chaiyaphum
 * 10-20-2018
 * Movement Class 
 * this class will control the Player functions in the game
 * 
 * 
 * 
 */

public class Player {

	private String imageFile;
	public double playerLocation;
	public String playerName;
	public double score;
	
	
	
	
	
	
	
	
	
	public Player(String imageFile, double playerLocation, String playerName, double score) {
		super();
		this.imageFile = imageFile;
		this.playerLocation = playerLocation;
		this.playerName = playerName;
		this.score = score;
	}









	public String getImageFile() {
		return imageFile;
	}









	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}









	public double getPlayerLocation() {
		return playerLocation;
	}









	public void setPlayerLocation(double playerLocation) {
		this.playerLocation = playerLocation;
	}









	public String getPlayerName() {
		return playerName;
	}









	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}









	public double getScore() {
		return score;
	}









	public void setScore(double score) {
		this.score = score;
	}


      n







	
	
	
	
	
	
	
	
}
