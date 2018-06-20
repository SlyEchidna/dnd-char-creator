import java.util.Arrays;

public class CharGuide {
	
	public String[] setRaceBox() {
		String racename[] = {"Select", "Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", 
				"Half-Elf", "Half-Orc", "Tiefling"};
		return racename;
	}
	
	public String[] setSubraceBox(String race) {
		String charRace[] = new String[3];
		if (race == "Dwarf") {
			charRace[0] = "Select";
			charRace[1] = "Hill Dwarf";
			charRace[2] = "Mountain Dwarf";
		}else if (race == "Elf") {
			charRace = Arrays.copyOf(charRace, charRace.length+1);
			charRace[0] = "Select";
			charRace[1] = "High Elf";
			charRace[2] = "Wood Elf";
			charRace[3] = "Dark Elf (Drow)";
		}else if (race == "Halfling") {
			charRace[0] = "Select";
			charRace[1] = "Lightfoot";
			charRace[2] = "Stout";
		}else if (race == "Gnome") {
			charRace[0] = "Select";
			charRace[1] = "Forest Gnome";
			charRace[2] = "Rock Gnome";
		}
		return charRace;
	}
	
	public String[] setClassBox() {
		String classname[] = {"Select", "Barbarian", "Bard", "Cleric", "Fighter", "Monk", "Paladin", 
				"Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
		return classname;
	}
	
	public String[] setLevelBox() {
		String level[] = new String[20];
		for (int a = 0; a < 20; a++) {
			int b = a+1;
			level[a] = ""+b;
		}
		return level;
	}
	
	public String raceDescriptor(String raceName) {
		String desc = "";
		if (raceName == "Hill Dwarf") {
			desc = "As a hill dwarf, you have keen senses, deep intuition, and remarkable resilience.";
			
		}else if (raceName == "Mountain Dwarf") {
			desc = "As a mountain dwarf, you're strong and hardy, accustomed to a difficult life in rugged terrain. You're"
					+ "probably on the tall side (for a dwarf), and tend toward lighter coloration.";
			
		}else if (raceName == "High Elf") {
			desc = "As a high elf, you have a keen mind and a mastery of at least the basics of magic.";
			
		}else if (raceName == "Wood Elf") {
			desc = "As a wood elf, you have keen senses and intuition, and your fleet feet carry you quickly and slealthily through your native forests.";
			
		}else if (raceName == "Dark Elf (Drow)") {
			desc = "Descended from an earlier subrace of dark-skinned elves; the drow were banished from the surface world"
					+ "for following the goddess Lolth down the path to evil and corruption.";
			
		}else if (raceName == "Lightfoot") {
			desc = "As a lightfoot halfling, you can easily hide from notice, even using other people as cover. You're inclined to be"
					+ "affable and get along well with others. In the Forgotten Realms, lightfoot halflings have spread the farthest and"
					+ "thus are the most common variety.";
			
		}else if (raceName == "Stout") {
			desc = "As a stout halfling. you're hardier than average and have some resistance to poison. Some say that stouts have "
					+ "dwarven blood.";
			
		}else if (raceName == "Human") {
			desc = "With their penchant for migration and conquest. Humans are more physically diverse than other common races.";
			
		}else if (raceName == "Dragonborn") {
			desc = "Born of dragons, as their name proclaims, the dragonborn walk proudly through a world that greets"
					+ "them with fearful incomprehension.";
			
		}else if (raceName == "Forest Gnome") {
			desc = "As a forest gnome, you have a natural knack for iIlusion and inherent quickness and stealth.";
			
		}else if (raceName == "Rock Gnome") {
			desc = "As a rock gnome, you have a natural inventiveness and hardiness beyond that of other gnomes.";
			
		}else if (raceName == "Half-Elf") {
			desc = "Walking in two worlds but truly belonging to neither, half-elves combine what some say are the best qualities"
					+ "of their elf and human parents: human curiosity, inventiveness, and ambition tempered by the refined"
					+ "senses, love of nature, and artistic tastes of the elves.";
			
		}else if (raceName == "Half-Orc") {
			desc = "Half-ores' grayish pigmenlation, sloping foreheads, juttingjaws, prominenl leelh, and lowering builds make"
					+ "their orcish herilage plain for ali lo see.";
			
		}else if (raceName == "Tiefling") {
			desc = "Tieflings are derived fram human bloodlines, and in the broadest possible sense, they still look human. However,"
					+ "their infernal heritage has left a elear imprint on their appearance.";
		}else {
			desc = "Please select a Subrace.";
		}
		
		return desc;
	}
	
	public String classDescriptor(String className) {
		String desc = "";
		if (className == "Barbarian") {
			desc = "A fierce warrior of primitive background who can enter a battle rage.";
			
		}else if (className == "Bard") {
			desc = "An inspiring magician whose power echoes the music of creation.";
			
		}else if (className == "Cleric") {
			desc = "A priestly champion who wields divine magic in service of a higher power.";
			
		}else if (className == "Druid") {
			desc = "A priest of the Old Faith, wielding the powers of nature-moonlight and"
					+ " plant growth, fire and lightning-and adopting animal forms.";
			
		}else if (className == "Fighter") {
			desc = "A master of martial combat, skilled with a variety of weapons and armor.";
			
		}else if (className == "Monk") {
			desc = "An master of martial arts, harnessing the power of the body in pursuit of"
					+ " physical and spiritual perfection.";
			
		}else if (className == "Paladin") {
			desc = "A holy warrior bound to a sacred oath.";
			
		}else if (className == "Ranger") {
			desc = "A warrior who uses martial prowess and nature magic to combat threats on the"
					+ " edges of civilization.";
			
		}else if (className == "Rogue") {
			desc = "A scoundrel who uses slealth and trickery to overcome obstacles and enemies.";
			
		}else if (className == "Sorcerer") {
			desc = "A spellcaster who draws on inherent magic from a gift or bloodline.";
			
		}else if (className == "Warlock") {
			desc = "A wielder of magic that is derived from a bargain with an extraplanar entity.";
			
		}else if (className == "Wizard") {
			desc = "A scholarly magic-user capable of manipulaling the structures of reality.";
			
		}else desc = "Please select a Class.";
		return desc;
	}
	
	public String[] setSubclassBox(String clas) {
		String charClass[] = new String[3];
		if (clas == "Barbarian") {
			charClass[0] = "Select";
			charClass[1] = "Path of the Berserker";
			charClass[2] = "Path of the Totem Warrior";
		}else if (clas == "Bard") {
			charClass[0] = "Select";
			charClass[1] = "College of Lore";
			charClass[2] = "College of Valor";
		}else if (clas == "Cleric") {
			charClass = Arrays.copyOf(charClass, charClass.length+5);
			charClass[0] = "Select";
			charClass[1] = "Knowledge Domain";
			charClass[2] = "Life Domain";
			charClass[3] = "Light Domain";
			charClass[4] = "Nature Domain";
			charClass[5] = "Tempest Domain";
			charClass[6] = "Trickery Domain";
			charClass[7] = "War Domain";
		}else if (clas == "Druid") {
			charClass[0] = "Select";
			charClass[1] = "Circle of the Land";
			charClass[2] = "Circle of the Moon";
		}else if (clas == "Fighter") {
			charClass = Arrays.copyOf(charClass, charClass.length+1);
			charClass[0] = "Select";
			charClass[1] = "Champion";
			charClass[2] = "Battle Master";
			charClass[3] = "Eldritch Knight";
		}else if (clas == "Monk") {
			charClass = Arrays.copyOf(charClass, charClass.length+1);
			charClass[0] = "Select";
			charClass[1] = "Way of the Open Hand";
			charClass[2] = "Way of Shadow";
			charClass[3] = "Way of the Four Elements";
		}else if (clas == "Paladin") {
			charClass = Arrays.copyOf(charClass, charClass.length+1);
			charClass[0] = "Select";
			charClass[1] = "Oath of Devotion";
			charClass[2] = "Oath of the Ancients";
			charClass[3] = "Oath of Vengeance";
		}else if (clas == "Ranger") {
			charClass[0] = "Select";
			charClass[1] = "Hunter";
			charClass[2] = "Beast Master";
		}else if (clas == "Rogue") {
			charClass = Arrays.copyOf(charClass, charClass.length+1);
			charClass[0] = "Select";
			charClass[1] = "Thief";
			charClass[2] = "Assassin";
			charClass[3] = "Arcane Trickster";
		}else if (clas == "Sorcerer") {
			charClass[0] = "Select";
			charClass[1] = "Draconic Bloodline";
			charClass[2] = "Wild Magic";
		}else if (clas == "Warlock") {
			charClass = Arrays.copyOf(charClass, charClass.length+1);
			charClass[0] = "Select";
			charClass[1] = "The Archfey";
			charClass[2] = "The Fiend";
			charClass[3] = "The Great Old One";
		}else if (clas == "Wizard") {
			charClass = Arrays.copyOf(charClass, charClass.length+6);
			charClass[0] = "Select";
			charClass[1] = "School of Abjuration";
			charClass[2] = "School of Conjuration";
			charClass[3] = "School of Divination";
			charClass[4] = "School of Enchantment";
			charClass[5] = "School of Evocation";
			charClass[6] = "School of Illusion";
			charClass[7] = "School of Necromancy";
			charClass[8] = "School of Transmutation";
		}
		
		return charClass;
	}
	
	public boolean checkSubraceIndex(int raceindex) {
		boolean srcheck = false;
		if(raceindex == 1 || raceindex == 2 || raceindex == 3 || raceindex == 6) {
			srcheck = true;
		}
		return srcheck;
	}
	
	public int checkRaceHPBonus(String subrace) {
		int HPBonus = 0;
		if(subrace == "Hill Dwarf") {
			HPBonus = 1;
		}
		return HPBonus;
	}
	
}