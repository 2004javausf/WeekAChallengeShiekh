package revature.beans;

public class Career {
	private int gamesPlayed,goalsScored,trophiesWon;

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	public int getTrophiesWon() {
		return trophiesWon;
	}

	public void setTrophiesWon(int trophiesWon) {
		this.trophiesWon = trophiesWon;
	}

	@Override
	public String toString() {
		return "Career [gamesPlayed=" + gamesPlayed + ", goalsScored=" + goalsScored + ", trophiesWon=" + trophiesWon
				+ "]";
	}
	
}
