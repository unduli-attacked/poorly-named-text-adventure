package valebat;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Character{
	public Character(String nameF, String nameL, int age, int purse, String gender){
		this.nameF = nameF;
		this.nameL = nameL;
		this.age = age;
		this.purse = purse;
		this.gender = gender;
	}
	
	//tangible
	String nameF;
	String nameL;
	int age;
	int purse;
	String gender;
	List<String> poss = new ArrayList<String>();
	double hp = 100;
	
	Random rand = new Random();
	//personality
	int str = rand.nextInt(20)+1; //strength base
	int dex = rand.nextInt(20)+1; //dexterity base
	int consti = rand.nextInt(20)+1; //constitution base
	int intl = rand.nextInt(20)+1; //intelligence base
	int wis = rand.nextInt(20)+1; //wisdom base
	int cha = rand.nextInt(20)+1; //charisma base
	
	int acro = dex+rand.nextInt(6); //acrobatics
	int anHan = wis+rand.nextInt(6); //animal handling
	int aracna = intl+rand.nextInt(6); //aracna
	int ath = str+rand.nextInt(6); //athletics
	int decp = cha+rand.nextInt(6); //deception
	int his = intl+rand.nextInt(6); //history
	int insi = wis+rand.nextInt(6); //insight
	int intimi = cha+rand.nextInt(6); //intimidation
	int investi = intl+rand.nextInt(6); //investigation
	int med = wis+rand.nextInt(6); //medicine
	int nat = intl+rand.nextInt(6); //nature
	int percep = wis+rand.nextInt(6); //perception
	int perfor = cha+rand.nextInt(6); //performance
	int persua = cha+rand.nextInt(6); //persuasion
	int relig = intl+rand.nextInt(6); //religion
	int soh = dex+rand.nextInt(6); //slight of hand
	int stel = dex+rand.nextInt(6); //stealth
	int sur = wis+rand.nextInt(6); //survival
	
	//methods
	void addPoss(String item, int number){
		int n = 0;
		while (n < number){
			poss.add(item);
			n++;
		}
	}
	
	String pn(String tense) {
		String pro = "they";
		switch (gender) {
			case "m":
				switch (tense) {
					case "sub":
						return "he";
					case "ob":
						return "him";
					case "possA":
						return "his";
					case "poss":
						return "his";
					case "rex":
						return "himself";
					case "noun":
						return "man";
				}
			case "f":
				switch (tense) {
				case "sub":
					return "she";
				case "ob":
					return "her";
				case "possA":
					return "her";
				case "poss":
					return "hers";
				case "rex":
					return "herself";
				case "noun":
					return "woman";
			}
			case "o":
				switch (tense) {
				case "sub":
					return "they";
				case "ob":
					return "them";
				case "possA":
					return "their";
				case "poss":
					return "theirs";
				case "rex":
					return "themself";
				case "noun":
					return "person";
			}
		}
		return pro;
	}
	
	void idCard() {
		Scanner scanner = new Scanner(System.in);
		type("Name: " + this.nameF);
		type("Age: " + Integer.valueOf(this.age));
		type("Gender: "+this.gender);
		type("Purse: " + Integer.valueOf(this.purse));
		type("HP: " + Double.valueOf(this.hp));
		type("Knapsack: ");
		System.out.println(this.poss);
		type("\nPersonality:");
		type("	Strength: "+Integer.valueOf(this.str));
		type("	Dexterity: "+Integer.valueOf(this.dex));
		type("	Constitution: "+Integer.valueOf(this.consti));
		type("	Inteligence: "+Integer.valueOf(this.intl));
		type("	Wisdom: "+Integer.valueOf(this.wis));
		type("	Charisma: "+Integer.valueOf(this.cha));
		
		type("Would you like to view your skills? (y/n)");
		String vs = scanner.nextLine();
		if (vs.equals("y")) {
			type("\nSkills:");
			type("	Athletics: "+Integer.valueOf(this.ath));
			type("	Acrobatics: "+Integer.valueOf(this.acro));
			type("	Sleight of Hand: "+Integer.valueOf(this.soh));
			type("	Stealth: "+Integer.valueOf(this.stel));
			type("	Arcana: "+Integer.valueOf(this.aracna));
			type("	History: "+Integer.valueOf(this.his));
			type("	Investigation: "+Integer.valueOf(this.investi));
			type("	Nature: "+Integer.valueOf(this.nat));
			type("	Religion: "+Integer.valueOf(this.relig));
			type("	Animal Handling: "+Integer.valueOf(this.anHan));
			type("	Insight: "+Integer.valueOf(this.insi));
			type("	Medicine: "+Integer.valueOf(this.med));
			type("	Perception: "+Integer.valueOf(this.percep));
			type("	Survival: "+Integer.valueOf(this.sur));
			type("	Deception: "+Integer.valueOf(this.decp));
			type("	Intimidation: "+Integer.valueOf(this.intimi));
			type("	Performance: "+Integer.valueOf(this.perfor));
			type("	Persuasion: "+Integer.valueOf(this.persua));
		}
	}

	public class Gender{
		public Gender(char code){
			switch(code){
				case 'm': case 'M':

			}
		}
	}
	
	//tipity typity function
	public static void type(String input){
		char[] letters = input.toCharArray();
		for (char x : letters){
			System.out.print(x);
			try{
				Thread.sleep(45);
			}catch(Exception e){
				System.out.print("o fuk it broke");
			}
		}
		try{
				Thread.sleep(300);
		}catch(Exception e){
				System.out.print("o fuk it broke");
			}
		System.out.print("\n");
	}
}