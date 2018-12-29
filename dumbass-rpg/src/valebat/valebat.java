package valebat;
/**
NOTES:
- 

TODO:
- add something called a witch of Maria Agnesi. anything. its a math thing

**/




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
class Valebat {
	static String yn;
	static boolean fren;
	static Character p1;
	static Character comp;
	static String genRes;
	static Random rand = new Random();
	static Scanner scanner = new Scanner(System.in);
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

	//main startup script
	public static void main(String[] args) {
		type("Welcome to Diu-Valebat");
		type("Please create your identity card.");
		createMC();
		type("\n\nNow that you've populated your card, you are ready to enter the land of Diu-Valebat.");
		type("**Type 'id' when prompted during the game to review your identity and supplies.**\n\n\n");
		type("You are a recently arrived contractor who is searching for a job in this unfamiliar land."
				+ "\nYou only have respect for the rules when they'll help you achieve your goals and you've always had a soft spot for the little guy.");
		type("\nYou've been traveling by yourself for most of the journey, but as you cross the border you come across another traveler, headed in the same direction as you.\n"
				+ "You normally like to travel alone, but for some reason this person seems like someone you could get along with. Do you approach them and try to strike up a conversation? (y/n)");
		yn = scanner.nextLine();
		if(yn.equals("y")) {
			makeFren();
			fren = true;
		}else {
			fren = false;
			type("You nod at the traveler in passing before continuing along the road.");
		}
		type("Soon, you reach a crossroads. You can go in one of six directions:");
		chooseLoc();
		
	}
  
  
  	//companion first conversation
  	public static void makeFren() {
  		int g = rand.nextInt(3)+1;
  		String gen = "f";
  		String nF = "Daina";
  		String nL = "McCloud";
  		switch(g) {
	  		case 1:
	  			gen = "f";
	  			nF = "Daina";
	  			nL = "McCloud";
	  		case 2:
	  			gen = "m";
	  			nF = "Rolf";
	  			nL = "Squires";
	  		case 3:
	  			gen = "o";
	  			nF = "Temple";
	  			nL = "Morin";
  		}
  		int a = rand.nextInt(30)+1;
  		int pv = rand.nextInt(100)+1;
  		comp = new Character(nF, nL, a, pv, gen);
  		type("You walk up to "+comp.pn("ob")+" and try to start up a conversation.\n"
  				+"What do you say?");
  		type("	(a) 'Hello. Fancy meeting another traveller on this lonely road. Where are you coming from?'");
  		type("	(b) 'Hello friend. You look like you could use some company. Where are you headed?'");
  		if (p1.percep >= 14) {
  			type("	(c)  'Hey. You seem like you're in the same sort of situation I am. I'm headed to find work. Do you want to walk with me for a while?'");
  		}
  		genRes = scanner.nextLine();
  		type("The "+comp.pn("noun")+" slows "+comp.pn("possA")+" pace slightly to match yours and turns towards you, revealing a face that is both beautiful and indiscripable.");
  		switch (genRes) {
  		case "a":
  			String gr;
  			type("'It is lonely out here, wouldn't you say?' "+comp.pn("sub")+" says, gazing off into the distance. 'But it's beautiful. So peaceful.' "+comp.pn("sub")+" continues to stare off towards the horizon.");
  			type("You watch "+comp.pn("ob")+" for a moment. Do you the beauty in the barren landscape as "+comp.pn("sub")+" does? (y/n)");
  			gr = scanner.nextLine();
  			switch(gr) {
  			case "y":
  				type("You walk together for a while, both admiring the landscape. Eventually the traveller speaks again.");
  				type("'");
  			case "n":
  				type("You watch "+comp.pn("ob")+" for a moment more. Neither of you speak. Eventually, a smaller path breaks off the main road. The "+comp.pn("noun")+" takes it. You do not.");
  				fren = false;
  				comp = null;
  			}
  		case "b":
  			
  		case "c":
  			
  		}
  		
  	}
	//character creation
	public static void createMC(){
		type("Name:");
		String nF = scanner.nextLine();
		type("Would you like to choose a last name? (y/n)");
		genRes = scanner.nextLine();
		String nL="Winters";
		switch(genRes) {
		case "y":
			type("What last name would you like?");
			nL = scanner.nextLine();
		case "n":
			nL = "Winters"; //TODO change
		}
		
		type("Age:");
		int a = Integer.parseInt(scanner.nextLine());
		type("Gender -- Male (m), Female (f), or Other (o):");
		String gen = scanner.nextLine();
		type("Thank you.");
		int pv = rand.nextInt(100)+1;
		p1 = new Character(nF, nL, a, pv, gen);
		p1.addPoss("Candle", 1);
		p1.addPoss("Rope", 1);
		p1.addPoss("Crossbow", 1);
		p1.addPoss("Crossbow Bolts", 1);
		p1.addPoss("Health Potion", 1);
		type("Your current character profile is:");
		p1.idCard();
	}

	

	//module functions
	public static void ironNexus(){
		type("Welcome to The Iron Nexus.");
		type("This is the main city of Diu-Valebat. It is located at nearly the exact center of the land, and has a population of nearly a million. "
				+ "The glistening Centeral Tower rises out of the tangle of several-hundred storey buildings, overlapping rail lines, and soaring sky roads.");
		type("On the outskirts of the city lie the slums, where thousands of people live in squalor, overlooked by the people of the inner city. "
				+ "These people can only afford to travel by means of the surface-level streets, dangerous, fitlhy passages wroght with crime. The government has ");
		//description of location
		//module start prompt
		//module
		//prompt for next module
	}
	
	public static void dreamLands(){
		type("Welcom to The Dream Lands.");
		//description of location
	}

	public static void blackVale(){
		Scanner scanner = new Scanner(System.in);
		type("Welcom to The Black Vale.");
		//description of location
	}

	public static void elderSea(){
		Scanner scanner = new Scanner(System.in);
		type("Welcom to The Elder Sea.");
		//description of location
	}

	public static void edgeRealms(){
		Scanner scanner = new Scanner(System.in);
		type("Welcom to The Edge Realms.");
		//description of location
	}

	public static void agelessValley(){
		Scanner scanner = new Scanner(System.in);
		type("Welcom to The Ageless Valley.");
		//description of location
	}

	//location selection
	public static void chooseLoc(){
		Scanner scanner = new Scanner(System.in);
		type("	(a) The Iron Nexus");
		type("	(b) The Dream Lands");
		type("	(c) The Black Vale");
		type("	(d) The Elder Sea");
		type("	(e) The Edge Realms");
		type("	(f) The Ageless Valley");
		String loc = scanner.nextLine();
		//type(p1.nameF);

		if (loc.equals("a")){
			ironNexus();
		}else if (loc.equals("b")){
			dreamLands();
		}else if (loc.equals("c")){
			blackVale();
		}else if (loc.equals("d")){
			elderSea();
		}else if (loc.equals("e")){
			edgeRealms();
		}else if (loc.equals("f")){
			agelessValley();
		}else{
			type("You absolute idiot its not that hard.");
		}
	}
}