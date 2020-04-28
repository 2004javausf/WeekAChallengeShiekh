package revature.drivers;
import revature.beans.Career;
import revature.beans.Player;
import java.util.Scanner;


public class Sports {
	
	public static void main(String[] args) {
		Career c= new Career();
		Player p= new Player();
		
		Scanner takeInput= new Scanner(System.in);

		Integer gamesPlayed;
		Integer goalsScored;
		Integer trophiesWon;
		String playerName;
		String teamName;
		Double minutesPlayed;
		Integer gamesPlayed2;
		Integer goalsScored2;
		Integer trophiesWon2;
		String playerName2;
		String teamName2;
		Double minutesPlayed2;
		String compare,compare2,minutes,minutes2;
		int i=0;
		System.out.println("Enter how many times you want compare two players");
		int number=takeInput.nextInt();
		do {
			switch(i){
			case 0:
				System.out.println("1st Comparison");
				break;
			case 1:
				System.out.println("2nt Comparison");
				break;
			case 2:
				System.out.println("3rd Comparison");
				break;
			case 3:
				System.out.println("4th Comparison");
				break;
			case 4:
				System.out.println("5th Comparison");
				break;
			case 5:
				System.out.println("6th Comparison");
				break;
			case 6:
				System.out.println("7th Comparison");
				break;
				default:
					System.out.println("Comparison has exceeded over 7 times");
					break;
			}
		System.out.println("Enter Information of Player 1");
		System.out.println("Enter Player 1 played games");
		gamesPlayed=takeInput.nextInt();
		System.out.println("Enter Player 1 goals scored");
		goalsScored=takeInput.nextInt();
		System.out.println("Enter Player 1 trophies won");
		trophiesWon=takeInput.nextInt();
		System.out.println("Enter Player 1 minutes played");
		minutesPlayed=takeInput.nextDouble();
		System.out.println("Enter Player 1 Name");
		takeInput.nextLine();
		playerName=takeInput.nextLine();
		System.out.println("Enter Player 1 team Name");
		teamName=takeInput.nextLine();
		compare=gamesPlayed.toString();
		
		System.out.println("Enter Information of Player 2");
		System.out.println("Enter Player 2 played games");
		gamesPlayed2=takeInput.nextInt();
		System.out.println("Enter Player 2 goals scored");
		goalsScored2=takeInput.nextInt();
		System.out.println("Enter Player 2 trophies won");
		trophiesWon2=takeInput.nextInt();
		System.out.println("Enter Player 2 minutes played");
		minutesPlayed2=takeInput.nextDouble();
		System.out.println("Enter Player 2 Name");
		takeInput.nextLine();
		playerName2=takeInput.nextLine();
		System.out.println("Enter Player 2 team Name");
		teamName2=takeInput.nextLine();
		compare2=gamesPlayed2.toString();
		
		p.setTeamName(teamName);	
		p.setPlayerName(playerName);
	 	p.setMinutesPlayed(minutesPlayed);
		c.setGamesPlayed(gamesPlayed);
		c.setGoalsScored(goalsScored);
		c.setTrophiesWon(trophiesWon);
		
		if(compare.length()>2) {
			System.out.println("Player 1 is experience player with "+c.getGamesPlayed()+ "games played");
		}
		else {
			System.out.println("Player 1 is not an experience player with "+c.getGamesPlayed()+ "games played");
		}
		
		p.setTeamName(teamName2);	
	 	p.setPlayerName(playerName2);
		p.setMinutesPlayed(minutesPlayed2);
		c.setGamesPlayed(gamesPlayed2);
		c.setGoalsScored(goalsScored2);
		c.setTrophiesWon(trophiesWon2);
		if(compare2.length()>2) {
			System.out.println("Player 2 is experience player with "+c.getGamesPlayed()+ "games played");
		}
		else {
			System.out.println("Player 2 is not an experience player with "+c.getGamesPlayed()+ "games played");
		}
		i++;
		}while(i<number);
		add(minutesPlayed,minutesPlayed2);
		add(gamesPlayed,gamesPlayed2);
		System.out.println("Switch code");

	}	
	static int add(int a, int b) {
		System.out.println("Addition of total Number of games played by both players combined");
		System.out.println(a+b);
		return a+b;
	}
	static double add(double a, double b) {
		System.out.println("Addition of total Number of minutes played by both players combined");
		return a+b;
	}
}