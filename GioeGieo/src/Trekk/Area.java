package trekk;

import java.awt.Color;
import java.awt.event.WindowEvent;


public class Area{

	public Area(Swing s) {
		
		S = s;
		theme = (int)(Math.random()*2);//randomly decided story
		firstPos = setFirstPos();
		
	}

	int theme; //decides which arc
	/* 0 : Civil War	
	 * 1 : Technology vs Nature 
	 * 2 : Misinterpreted Alieans 
	 * 3 : Catacalysmic Event
	 * 4 : Parasite onboard!
	 * 5 : Planetary Organism
	 * 6 : Gleeons
	 * 7 : The Porgs
	*/
	
	int position; //where the character is in terms of choices
	String nextPos, nextPos1, nextPos2, nextPos3, nextPos4;
	String firstPos;
	Boolean init = false, combat = false;
	Swing S;
	
	
	
	
	
	
	//Brief summary of the game
	
	public void tutorial() {
		
		S.setMainText("Welcome to StartTrek! "
				+ "\nThis is a game designed to simulate the type of galaxy from the Original Series.\n"
				+ "Currently you're the captain of the U.S.S. Interprise exploring uncharted galaxies.\n"
				+ "Let's get you briefed.");
		

		S.updateButtons("Continue","","","");
		nextPos1 = firstPos;
		nextPos2 = "";
		nextPos3 = "";
		nextPos4 = "";
		
		
	}

	//Used to set first position
	public String setFirstPos() {
		switch(theme) {
		case 0:
			return "civilWarShipStart";
		case 1:
			return "gleeonAttackStart";
		default: 
			return "";
		}
	}
	
	
	
	//Beginning of Civil War Arc code
	public void civilWar(String civilPos) {
		
		switch(civilPos) {
		
		
		//beginning of arc || ship section : each case is a different screen
		
			case "civilWarShipStart":
				//Setting the Swing main text area 
			S.setMainText("Navigator: G'morning captain. We've finally reached Planet AE-421"
					+ " It's a planet divided between two nations. From what we've heard over their radio"
					+ "chatter, things seem to be heating up down there.");
				//Updating buttons of the swing panel
			S.updateButtons("Heating up?","Pre-warp?","Nations?","Continue");
				//Updating button pointers
			nextPos1 = "civilWarShipHeat";
			nextPos2 = "civilWarShipWarp";
			nextPos3 = "civilWarShipNations";
			nextPos4 = "civilWarShipContinue1";
			break;
			
			case "civilWarShipHeat":
				S.setMainText("Navigator: From what we've found in public records, the two countries have "
						+ "had skirmishes for the past few years, but an incident involving a tourship has "
						+ "brought enough outrage in the larger to declare war on the other. ");
			
				S.updateButtons("Restart","Pre-warp?","Nations?","Continue");
				nextPos1 = "civilWarShipStart";
				nextPos2 = "civilWarShipWarp";
				nextPos3 = "civilWarShipNations";
				nextPos4 = "civilWarShipContinue1";
				break;
				
			case "civilWarShipWarp":
				S.setMainText("Navigator: Both seem to be capable of warp travel, but fear of the other nation has kept them"
						+ " inside of their planet.");
			
				S.updateButtons("Heating up?","Restart","Nations?","Continue");
				nextPos1 = "civilWarShipHeat";
				nextPos2 = "civilWarShipStart";
				nextPos3 = "civilWarShipNations";
				nextPos4 = "civilWarShipContinue1";
				break;

			case "civilWarShipNations":
				S.setMainText("Navigator: The two nations have roughly dubbed themselves the Empire of the West Seas and the Federation of Northern States"
						+ "in their own language they're called the Ae'kshal and Naafingard. \n"
						+ "The empire seems to resemble 20th century communist and socialist ideas, meanwhile the federation closely follows 20th century capitalist ideals.");
			
				S.updateButtons("Heating up?","Pre-warp?","More","Continue");
				nextPos1 = "civilWarShipHeat";
				nextPos2 = "civilWarShipWarp";
				nextPos3 = "civilWarShipNationsMore";
				nextPos4 = "civilWarShipContinue1";
				break;
				
			case "civilWarShipNationsMore":
				S.setMainText("Navigator: ");
			
				S.updateButtons("Heating up?","Pre-warp?","Restart","Continue");
				nextPos1 = "civilWarShipHeat";
				nextPos2 = "civilWarShipWarp";
				nextPos3 = "civilWarShipStart";
				nextPos4 = "civilWarShipContinue1";
				break;
				
				
				//End of ship section
				
			case "civilWarShipContinue1":
				S.setMainText("Navigator: So what're you planning on captain?");
				
				S.updateButtons("Talk to the Federation","Talk to the Empire","Back","Leave the Planet");
				nextPos1 = "civilWarFederationTalk1";
				nextPos2 = "civilWarEmpireTalk1";
				nextPos3 = "civilWarShipStart";
				nextPos4 = "civilWarShipLeavePlanet1";
				
				
				break;
				
				
			case "civilWarShipLeavePlanet1":
				S.setMainText("Navigator: Are you sure we should leave? I'll begin setting a course to the next node if so.");
				
				S.updateButtons("Yes, plot the course","No","","");
				nextPos1 = "Restart";
				nextPos2 = "civilWarShipContinue1";
				nextPos3 = "";
				nextPos4 = "";
				break;
				
				
			case "civilWarFederationTalk1":
				S.setMainText("Communications: Ok, we were able to open a line to them. They'll be on screen any second now.\n"
							+ "Federation Leader: . . .");
				
				S.updateButtons("This is the Starship Enterprise","Here to help","Who are you?","");
				nextPos1 = "civilWarFederationTalk2";
				nextPos2 = "civilWarFederationTalkHelp";
				nextPos3 = "civilWarFederationTalkWho";
				nextPos4 = "";
				
				
				break;
				
			case "civilWarFederationTalk2":
				S.setMainText("Communications: Ok, we were able to open a line to them. They'll be on screen any second now.\n"
							+ "You: This is Captain "+S.player.name+" of the Starship Enterprise, may I ask who I'm speaking to?\n"
							+ "\nPresident Swarchnov: Greetings Captain! I am Arnold Swarchnov, President of the United Federation. "
							+ "I would welcome you into my abode, but currently we are at war and I'm not sure how safe it would be, hah."
							+ " If you were to offer your help though, I'm sure we could make it happen.");
				
				S.updateButtons("This is the Starship Enterprise","Here to help","Who are you?","");
				nextPos1 = "civilWarFederationTalk2";
				nextPos2 = "civilWarFederationTalkHelp";
				nextPos3 = "civilWarFederationTalkWho";
				nextPos4 = "";
				
				
				break;
				
			case "Restart":
				theme = 1;
				firstPos = setFirstPos();
				restart();
				break;

		
		}
	}
	
	//Gleeon Attack Arc
	
	public void gleeonAttack(String GleePos) {
		
		switch(GleePos) {
		
		
		//beginning of arc || ship section
		
			case "gleeonAttackStart":
			S.setMainText("Navigator: Captain, we're detecting multiple signs of a Gleeon spacecraft coming through this area earlier."
						+ " Should I stay on course? \n"
						+ "(Gleeons are known as one of the Federation of Astral Objects containing Life's greatest threats to peace. They are doglike"
						+ "humanoids who are more often found in violence than not. Currently you are in the grey zone so both sides would be able to fire on each other.)");
		
			S.updateButtons("Keep going","Yellow Alert","How long ago?","What signs?");
			nextPos1 = "gleeonAttackContinue";
			nextPos2 = "gleeonAttackYellow";
			nextPos3 = "gleeonAttackWhen";
			nextPos4 = "gleeonAttackHow";
			break;
			
			case "gleeonAttackContinue":
				S.setMainText("Navigator: Alright, I'll keep her steady and let you know if we detect anything else.");
				
				S.updateButtons("Wait","","","");
				nextPos1 = "gleeonAttackContinue2";
				nextPos2 = "";
				nextPos3 = "";
				nextPos4 = "";
				break;
				
			case "gleeonAttackYellow":
				S.setMainText("First Officer: Going on yellow alert.");
				S.updateButtons("Continue","","","");
				S.areaPanel.setBackground(Color.yellow);
				nextPos1 = "gleeonAttackContinue";
				nextPos2 = "";
				nextPos3 = "";
				nextPos4 = "";
				break;
			
				
			case "gleeonAttackWhen":
				S.setMainText("Science Officer: Gleeon warp drive frequencies are being read as anywhere from 2 to 5 hours ago.");
			
				S.updateButtons("Keep going","Yellow Alert","Back","What signs?");
				nextPos1 = "gleeonAttackContinue";
				nextPos2 = "gleeonAttackYellow";
				nextPos3 = "gleeonAttackStart";
				nextPos4 = "gleeonAttackHow";
				break;
				
			case "gleeonAttackHow":
				S.setMainText("Science Officer: We're detecting multiple warp drive frequencies, one unknown and one originating from Gleeon warp drives."
						+ " With the size of the residue left, the vessel must be at least a cruiser or larger.");
			
				S.updateButtons("Keep going","Yellow Alert","How long ago?","Back");
				nextPos1 = "gleeonAttackContinue";
				nextPos2 = "gleeonAttackYellow";
				nextPos3 = "gleeonAttackWhen";
				nextPos4 = "gleeonAttackStart";
				break;
				
			case "gleeonAttackContinue2":
				S.setMainText("Navigator: Sir, we're detecting two spacecraft in our vicinity. One has been identified as a Gleeon Battlecruiser and they are"
						+ " currently pulling in a smaller, unknown vessel. What do you want to do?");
				
				S.updateButtons("Hail the Gleeons","Hail the vessel","Fire on the Gleeons","Leave");
				nextPos1 = "gleeonAttackGleeonTalk";
				nextPos2 = "gleeonAttackVesselTalk";
				nextPos3 = "gleeonAttackCombat1";
				nextPos4 = "gleeonAttackLeave";
				break;
				
			case "gleeonAttackGleeonTalk":
				S.setMainText("Communication: Opening a line to the Gleeon Cruiser.\n"
							+ ". . . .\n "
							+ "*You see a fuzzy looking dogman on screen as they accept the line* \n"
							+ "Gleeon Commander: Bork Bark Bawk Bork! (Stay out of this human, this is private Gleeon business!)");
				
				S.updateButtons("What business?","Hail the vessel","Fire on the Gleeons","Leave");
				nextPos1 = "gleeonAttackGleeonTalk2";
				nextPos2 = "gleeonAttackVesselTalk";
				nextPos3 = "gleeonAttackCombat1";
				nextPos4 = "gleeonAttackLeave";
				break;

			case "gleeonAttackGleeonTalk2":
				S.setMainText("Gleeon Commander: Bark bork (That's secret to the Gleeon Empire.)");
				
				S.updateButtons("Back","Hail the vessel","Fire on the Gleeons","Leave");
				nextPos1 = "gleeonAttackContinue2";
				nextPos2 = "gleeonAttackVesselTalk";
				nextPos3 = "gleeonAttackCombat1";
				nextPos4 = "gleeonAttackLeave";
				break;
				
			case "gleeonAttackVesselTalk":
				S.setMainText("Communication: Opening a line to the unknown vessel.\n"
						+ ". . . .\n No response sir.");
				
				S.updateButtons("Hail the Gleeons","Hail the vessel","Fire on the Gleeons","Leave");
				nextPos1 = "gleeonAttackGleeonTalk";
				nextPos2 = "gleeonAttackVesselTalk";
				nextPos3 = "gleeonAttackCombat1";
				nextPos4 = "gleeonAttackLeave";
				break;
				
				//initiaing combat
			case "gleeonAttackCombat1":
				S.setTargetPFP(".//trekkImages//dogPFP.png");
				//swapping to combat switch case
				gleeonCombat();
				
				break;
				
				
			case "gleeonAttackWin":
				S.setMainText("As the last shots hit the Gleeon vessel, you see it glint a few times, then multiple explosions envolope the spacecraft. \n"
						+ "The, now free, smaller ship took that as its queue to escape and warped out the moment after.");
				S.updateButtons("Follow that ship","Where is it going?","Leave it","");
				nextPos1 = "gleeonAttackFollowEnd";
				nextPos2 = "gleeonAttackWhere2";
				nextPos3 = "gleeonAttackLeaveEnd";
				nextPos4 = "";
				break;
				
			case "gleeonAttackFollowEnd":
				S.setMainText("Navigator: Setting in a course to intercept it right now. Ready to engage warp drive on your mark.");
				
				S.updateButtons("Engage","Back","","");
				nextPos1 = "endGame";
				nextPos2 = "gleeonAttackWin";
				nextPos3 = "";
				nextPos4 = "";
				break;

			case "gleeonAttackWhere2":
				S.setMainText("Navigator: It seems to be heading slightly off of our original course sir, straight into uncharted space.");
				
				S.updateButtons("Follow it","Back","Leave it","");
				nextPos1 = "gleeonAttackFollowEnd";
				nextPos2 = "gleeonAttackWin";
				nextPos3 = "gleeonAttackLeaveEnd";
				nextPos4 = "";
				break;
				
			case "gleeonAttackLeaveEnd":
				S.setMainText("First Officer: Sir, should we start repairs or continue on our course?");
				
				S.updateButtons("Repairs (Ends Game)","Continue","Back","");
				nextPos1 = "ExitGame";
				nextPos2 = "continueCivilWar";
				nextPos3 = "gleeonAttackLeaveEnd";
				nextPos4 = "";
				break;
				
				
				
				

				
			case "gleeonAttackLeave":
				S.setMainText("Navigator: Sir, we're detecting two spacecraft in our vicinity. One has been identified as a Gleeon Battlecruiser and they are"
						+ " currently pulling in a smaller, unknown vessel. What do you want to do?");
				
				S.updateButtons("Hail the Gleeons","Hail the vessel","Fire on the Gleeons","Leave");
				nextPos1 = "gleeonAttackGleeonTalk";
				nextPos2 = "gleeonAttackVesselTalk";
				nextPos3 = "gleeonAttackCombat1";
				nextPos4 = "gleeonAttackLeave";
				break;
				
				
				
				
				
			case "continueCivilWar":
				theme = 0;
				firstPos = setFirstPos();
				restart();
				break;
				
				
			case "playerDead":
				S.setMainText("Your spacecraft was destroyed in combat, pieces of it whirl through space, along with the crew that manned it. What do you want to do?");
				combat = false;
				S.updateButtons("Restart","Exit Game","","");
				nextPos1 = "Restart";
				nextPos2 = "ExitGame";
				nextPos3 = "";
				nextPos4 = "";
				break;
				
			case "ExitGame":
				S.gameWindow.dispatchEvent(new WindowEvent(S.gameWindow, WindowEvent.WINDOW_CLOSING));
				break;
				
			case "Restart":
				restart();
				break;
				
				//S.gameWindow.dispatchEvent(new WindowEvent(S.gameWindow, WindowEvent.WINDOW_CLOSING));
		}
}

	
	
	
	//Takes input from Swing.java and translates it into Area.java's nextPos
	public void buttonPress(int p) {
					
		switch(p) {
			case 1: setPos(nextPos1); break;
			case 2: setPos(nextPos2); break;
			case 3: setPos(nextPos3); break;
			case 4: setPos(nextPos4); break;
				
		}
	}
	
	//Restarts whole game
	public void restart() {
		if(combat == false)
			if(theme == 0)
				setPos("civilWarShipStart");
			else 
				setPos("gleeonAttackStart");
		S.areaPanel.setBackground(Color.black);
		enemy = null;
		player.health = 100;
	}
	
	//Quest Guider
	public void setPos(String x) {
		if(combat == false)
			if(theme == 0)
				civilWar(x);
			else
				gleeonAttack(x);
		if(combat == true)
		combat(player,enemy,x);
		
	}	
	
	public void changeStart() {
			if(theme == 1) {
				setPos("civilWarShipStart");
				theme = 0;
			}
			else {
				setPos("gleeonAttackStart");
				theme = 1;
			}
		S.areaPanel.setBackground(Color.black);
		enemy = null;
		player.health = 100;
	}
	
	/*if(!x.equals(""))
			switch(x) {
			case "ship": ship();
			
			
			}
			
	*/
	
	
	
	
	//Combat Section

	int torpedoCD = 0; //if above 0 the torpedos have a cooldown
	int enemyState, playerState; //0 - attack || 1 - dodge || 2 - torpedo || used to tell whether each are dodging or firing. and what they are firing 
	NPC enemy; 
	PC player;
	boolean scan = false; //to make sure the AI doesn't change their plans after a scan. True makes it so that they dont change
	
	//torpedo CD check
	public boolean torpedoOnCD() {
		if(torpedoCD > 0)
			return true;
		return false;
	}
	
	
	//
	public void gleeonCombat() {
	
			player = new PC("Interprise");
			enemy = new NPC("Gleeon Battlecruiser");
			S.setMainText("*Red Alert is announced ship-wide as you open fire on the " + enemy.name+ "*");
			updateStats(); 
			S.areaPanel.setBackground(Color.red);
			combat = true;
			combat(player, enemy, "combatStart");
			
		
	
	}
	

	public void updateStats() {
		S.setStats(player.name,player.health+"",enemy.name,enemy.health+"");
	}
	
	public void combat(PC p, NPC e, String comPos) {
		if(e.health < 0) {
			combat = false;
			setPos("gleeonAttackWin");
			return;
		}
		
		
		if(e.health > 0) {
			if(p.health > 0) {
				//Update buttons /  xx
				//Update stats xx 
				//update picture xx
				//Set new positions (attacking, dodging, photons) xx
				//Create enemy AI xx
				//Subtract health based off of actions xx 
				//win 
				
				updateStats();
				
				switch(comPos) {
					case "combatStart":
						S.updateButtons("Fire phasers!","Fire torpedos!","Evasive manuevers!","Scan them!");
						nextPos1 = "combatPhaser";
						nextPos2 = "combatTorpedo";
						nextPos3 = "combatDodge";
						nextPos4 = "combatScan";
						break;
						
					case "combatDodge":
						playerState = 1;
						playerTurn();
						enemyTurn();
						S.updateButtons("Fire phasers!",torpedoCD(),"Evasive manuevers!","Scan them!");
						nextPos1 = "combatPhaser";
						nextPos2 = "combatTorpedo";
						nextPos3 = "combatDodge";
						nextPos4 = "combatScan";
						updateStats();
						scan = false;
						break;
						
					case "combatPhaser":
						playerState = 0;
						playerTurn();
						enemyTurn();
						S.updateButtons("Fire phasers!",torpedoCD(),"Evasive manuevers!","Scan them!");
						nextPos1 = "combatPhaser";
						nextPos2 = "combatTorpedo";
						nextPos3 = "combatDodge";
						nextPos4 = "combatScan";
						updateStats();
						scan = false;
						break;
						
					case "combatTorpedo":
						playerState = 2;
						if(torpedoCD > 0)
							S.setMainText("Engines: We're still trying to load more in captain! We're going as fast as we can.");
						else {
							playerTurn();
							enemyTurn();
							torpedoCD = 5;
						}
						
						S.updateButtons("Fire phasers!",torpedoCD(),"Evasive manuevers!","Scan them!");
						nextPos1 = "combatPhaser";
						nextPos2 = "combatTorpedo";
						nextPos3 = "combatDodge";
						nextPos4 = "combatScan";
						updateStats();
						scan = false;
						
						break;
						
					case "combatScan":
						S.setMainText(enemyShipMovement());
						scan = true;
						S.updateButtons("Fire phasers!",torpedoCD(),"Evasive manuevers!","");
						nextPos1 = "combatPhaser";
						nextPos2 = "combatTorpedo";
						nextPos3 = "combatDodge";
						nextPos4 = "";
						updateStats();
						break;
				}
				
				
				
			}else {
				combat = false;
				setPos("playerDead");
				
			}
			
			
			
		}
		
		
	}
	
	public void playerTurn() {
		int damage = (int)(Math.random()*30)+11;
		System.out.println(damage+"p");
		if(enemyState == 1) {
			damage = (int) (.5*damage);
			
		}
		if (torpedoCD > 0)
			torpedoCD--;
		switch(playerState) {
		case 0:
			damage = (int) (.5*damage);
			S.setMainText("You fire upon the "+enemy.name+ " with your phasers, dealing "+damage+".");
			enemy.health -= damage;
			break;
		case 1:
			S.setMainText("Navigator: Aye aye captain! \n*The navigator continues to fling the Interprise from place to place, trying his best to dodge oncoming fire*");break;
		case 2:
			damage = (int)(Math.random()*35)+10;
			S.setMainText("Locked on to the "+enemy.name+ ". Firing photon torpedos! \nThey dealt "+damage+".");
			enemy.health -= damage;
			break;
		}
		
	}
	
	public String torpedoCD() {
		if (torpedoCD > 0)
			return torpedoCD+ " turn cooldown";
		return "Fire torpedos!";
	}
	
	public void enemyTurn() {
		int state = (int)Math.random()*3;
		int damage = (int)(Math.random()*50)+1;
		System.out.println(damage);
		if(playerState == 1) {
			damage = (int) (.5*damage);
		}
		if(scan == true) {
			state = enemyState;
			}
		switch(state) {
		case 0:
			damage = (int) (.5*damage);
			S.setMainText(S.mainTextArea.getText()+" \n The "+enemy.name+ " fired their phasers at you! \nThey dealt "+damage+"."); 
			player.health -= damage;
			break;
		case 1:
			S.setMainText(S.mainTextArea.getText()+" \n The "+enemy.name+ " is taking evasive manuevers!");break;
		case 2:
			S.setMainText(S.mainTextArea.getText()+" \n The "+enemy.name+ " fired their photon torpedos at you! \nThey dealt "+damage+".");
			player.health -= damage;
			break;
		}
		
	}
	
	public String enemyShipMovement() {
		String x = "";
		int random = (int) (Math.random()*3);
		
		switch(random) {
			case 0:
				x = "The "+enemy.name+" seems to be charging their weapons!";
				enemyState = 0;
				break;
				
			case 1:
				x = ""+enemy.name+" is taking evasive maneuvers.";
				enemyState = 1;
				break;
				
			case 2:
				x = "The "+enemy.name+" seems to be charging their weapons!";
				enemyState = 2;
				break;
				
		}
		
		
		return x;
	}
	
	

	
}
