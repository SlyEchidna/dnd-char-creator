
public class StatCalculation {
	
	public int setHPMax(int hitdiemax, int racebonus, int lvl, int conmod) {
		int maxhp = 0;
		maxhp = hitdiemax + (lvl *racebonus) + (lvl * conmod);
		return maxhp;
	}
	
	public int setProfBonus(int lvl) {
		int profBonus = 0;
		if(lvl <= 4) {
			profBonus = 2;
		}else if(lvl <= 8) {
			profBonus = 3;
		}else if(lvl <= 12) {
			profBonus = 4;
		}else if(lvl <= 16) {
			profBonus = 5;
		}else if(lvl <= 20) {
			profBonus = 6;
		}
		return profBonus;
	}
	
	public int setModNum(int abilityscore) {
		double temp1 = abilityscore;
		double temp2 = Math.floor((temp1-10)/2);
		int modnum = (int) temp2;
		System.out.println(modnum);
		return modnum;
	}
}
