import java.util.Random;

public class AbilityScoreRoller {
	
	public int[] ScoreRolls() {
		int roll[] = new int[4], score[] = new int[6];
		Random dice = new Random();
		
		// First for loop for cycling through the score array
		for(int a = 1; a <= 6; a++) {
			
			// Second for loop to cycle and create rolls per score array
			for(int b = 1; b <= 4; b++) {
				roll[b-1] = 1+dice.nextInt(6);
			}
			
			// Bubble Sort rolls from small to big and add 
			// together three largest die rolls into score array
			int n = roll.length;
	        for (int c = 0; c < n-1; c++) {
	            for (int d = 0; d < n-c-1; d++) {
	                if (roll[d] > roll[d+1])
	                {
	                    // swap temp and roll[c]
	                    int temp = roll[d];
	                    roll[d] = roll[d+1];
	                    roll[d+1] = temp;
	                }
	            }
	        }
	        
	        //Add all but lowest die roll into score array
	        score[a-1] = roll[1] + roll[2] + roll[3];
			
		}
		return score;
	}
	
	public int setHitDie(String charclass) {
		int hitDie = 0;
		if(charclass == "Bard" || charclass == "Cleric" || charclass == "Druid" || charclass == "Monk" || charclass == "Rogue" || charclass == "Warlock") {
			hitDie = 8;
		}else if(charclass == "Fighter" || charclass == "Paladin" || charclass == "Ranger") {
			hitDie = 10;
		}else if(charclass == "Sorcerer" || charclass == "Wizard") {
			hitDie = 6;
		}else if(charclass == "Barbarian") {
			hitDie = 12;
		}
		return hitDie;
	}
}
