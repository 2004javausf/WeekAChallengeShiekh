package revature.beans;

public class Player {
	private double minutesPlayed;  
	private String playerName,teamName;
	public double getMinutesPlayed() {
		return minutesPlayed;
	}
	public void setMinutesPlayed(double minutesPlayed) {
		this.minutesPlayed = minutesPlayed;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
}