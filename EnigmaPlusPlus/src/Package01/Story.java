package Package01;

import Package02.*;

public class Story {
    Game game;
    UI ui;
    VisibilityManager vm;
    Player player = new Player();
    SuperMonster monster;

    int silverRing;

    public Story(Game g, UI userInterface, VisibilityManager vManager){

        game = g;
        ui = userInterface;
        vm = vManager;
    }

    public void defaultSetUp(){

        player.hp = 20;
        ui.hpLabelNumber.setText("" + player.hp);

        player.currentWeapon = new Weapon_Knife();
        ui.weaponLabelName.setText(player.currentWeapon.name);

        silverRing = 0;
    }
    public void selectPosition(String nextPosition){
        switch(nextPosition){
            case "wakeUp": wakeUp(); break;
            case "funDay": funDay(); break;
            case "tired": tired(); break;
            case "fine": fine(); break;
            case "funDayTwo": funDayTwo(); break;
            case "funDayThree": funDayThree(); break;
            case "bloodyHorse": bloodyHorse(); break;
            case "funDayFour": funDayFour(); break;
            case "funDayFive": funDayFive(); break;
            case "firstNight": firstNight(); break;
            case "nightAlone": nightAlone(); break;

//            case "attackGuard": attackGuard(); break;
            case "talkVillager": talkVillager(); break;
            case "killerTree": killerTree(); break;
            case "crossRoad": crossRoad(); break;
            case "river": river(); break;
            case "sword": sword(); break;
            case "goblin": goblin(); break;
            case "fight": fight(); break;
            case "playerAttack": playerAttack(); break;
            case "win": win(); break;
            case "lose": lose(); break;
            case "monsterAttack": monsterAttack(); break;
            case "ending": ending(); break;
            case "toTitle": toTitle(); break;
            case "randomEncounter": randomEncounter(); break;
            case "forestDad": forestDad(); break;
            case "deathPinetrees": deathPinetrees(); break;
            case "takeSword": takeSword(); break;
            case "lastGoodBye": lastGoodBye(); break;
            case "aloneSmallForest": aloneSmallForest(); break;
            case "smallWolf": smallWolf(); break;
            case "attackSmallWolf": attackSmallWolf(); break;
            case "fightSmallWolf": fightSmallWolf(); break;
            case "arriveVillage": arriveVillage(); break;
            case "runFromWolf": runFromWolf(); break;
            case "arriveCult": arriveCult(); break;
            case "cultIntro": cultIntro(); break;
            case "cultSecondIntro": cultSecondIntro(); break;
            case "cultAccept": cultAccept(); break;
            case "cultDeny": cultDeny(); break;
            case "backToForest": backToForest(); break;
            case "backToForestTwo": backToForestTwo(); break;
            case "wakeUpPond": wakeUpPond(); break;
        }
    }
    public void wakeUp(){
        ui.mainTextArea.setText("You wake up, \n like any morning, your room is full of light. \n Someone is calling your name from downstairs.");
        ui.choice1.setText("Leave bed");
        ui.choice2.setText("");

        game.nextPosition1 = "funDay";
        game.nextPosition2 = "";
    }
//    public void attackGuard(){
//         if(silverRing == 0) {
//            ui.mainTextArea.setText("Yameroo");
//            player.hp = player.hp - 3;
//            ui.hpLabelNumber.setText(""+ player.hp);
//
//            ui.choice1.setText("Go back");
//            ui.choice2.setText("");
//
//            game.nextPosition1 = "townGate";
//            game.nextPosition2 = "crossRoad";
//        }else if(silverRing == 1) {
//            ending();
//        }
//
//    }

    public void funDay(){
        ui.mainTextArea.setText("'How are you doing?', \n your dad greets you making eggs for breakfast \n Outside the window you can see the farmers working, \n and some horses walking around.");
        ui.choice1.setText("Fine");
        ui.choice2.setText("I'm tired");

        game.nextPosition1 = "fine";
        game.nextPosition2 = "tired";
    }
    public void tired(){
        ui.mainTextArea.setText("Well, that sucks. You have a lot of work to do today, \n Eat up, and let's go!");
        ui.choice1.setText("Alright");
        ui.choice2.setText("");

        game.nextPosition1 = "funDayTwo";
        game.nextPosition2 = "";
    }
    public void fine(){
        ui.mainTextArea.setText("That's good to hear \n You better have rested, we have a lot of work to do today!");
        ui.choice1.setText("Alright");
        ui.choice2.setText("");

        game.nextPosition1 = "funDayTwo";
        game.nextPosition2 = "";
    }
    public void funDayTwo(){
        ui.mainTextArea.setText("After feeding the animals and cleaning the barn, \n you pet your favorite horse wondering what destiny has in store for you \n when you grow up");
        ui.choice1.setText("Uh?");
        ui.choice2.setText("");

        game.nextPosition1 = "funDayThree";
        game.nextPosition2 = "tired";
    }
    public void funDayThree(){
        ui.mainTextArea.setText("There's a dark red spot on the side of your horse, \n It looks like... ");
        ui.choice1.setText("Blood!");
        ui.choice2.setText("");

        game.nextPosition1 = "bloodyHorse";
        game.nextPosition2 = "";
    }
    public void bloodyHorse(){
        ui.mainTextArea.setText("You look around and realize several animals are missing, \n This is bad, Dad is going to kill you for not noticing sooner \n You have to warn him \n\n There must be a wolf around town ");
        ui.choice1.setText("Go tell dad");
        ui.choice2.setText("Go to the town");

        game.nextPosition1 = "funDayFour";
        game.nextPosition2 = "funDayFour";
    }

    public void funDayFour(){
        ui.mainTextArea.setText("'Monsters!!!', \n Some villager screams as you get out of the barn, \n he is running towards your Dad and the rest of the workers  \n in the field . \n 'I've seen monsters in the forest, they are coming for us at night'");
        ui.choice1.setText("Next");
        ui.choice2.setText("");

        game.nextPosition1 = "funDayFive";
        game.nextPosition2 = "funDayFive";
    }
    public void funDayFive(){
        ui.mainTextArea.setText("After talking to the man your Dad looks serious \n He and the workers seem to be gathering pointy farming tools \n 'Listen son, there's something me and the guys have to take care of '. \n Aye!, a few of the workers agreed in unison. \n You must stay here and not get out of the House \n \n Do you understand? ");
        ui.choice1.setText("Yes");
        ui.choice2.setText("Aye!");

        game.nextPosition1 = "firstNight";
        game.nextPosition2 = "firstNight";
    }
    public void firstNight(){
        ui.mainTextArea.setText("The sun is setting, and the golden wheat fields you were raised in, \n have turned red. \n \n 'Listen son, it will be fine, we are tough as mules here in the Northeast' \n Your dad seems confident. 'Besides, monsters don't exist'. \n \n 'See you tonight, kiddo'");
        ui.choice1.setText("See you tonight");
        ui.choice2.setText("");

        game.nextPosition1 = "nightAlone";
        game.nextPosition2 = "nightAlone";
    }
    public void nightAlone(){
        ui.mainTextArea.setText("It's way past midnight, they left a long time ago. \n \n \n Something is wrong. \n \n No sound from outside.");
        ui.choice1.setText("Go find Dad");
        ui.choice2.setText("Stay home");

        game.nextPosition1 = "forestDad";
        game.nextPosition2 = "waitMoreHome";
    }
    public void forestDad(){
        ui.mainTextArea.setText("You can barely see anything, you walk to the forest, \n  a long time passes until you reach the first pine trees. \n 'To rescue my friends and family!' \n \n \n Like a hero from a prophecy you begin your journey!'");
        ui.choice1.setText("TO THE RESCUE");
        ui.choice2.setText("LET'S GO!");

        game.nextPosition1 = "deathPinetrees";
        game.nextPosition2 = "deathPinetrees";
    }
    public void deathPinetrees(){
        ui.mainTextArea.setText("You found your dad and the rest of the people from the town \n They don't look too good \n \n 'Son, you shouldn't be here. This place is dangerous! \n \n 'Take this, it isn't much'");
        ui.choice1.setText("Take sword");
        ui.choice2.setText("");

        game.nextPosition1 = "takeSword";
        game.nextPosition2 = "takeSword";
    }
    public void takeSword(){
        ui.mainTextArea.setText("'One last piece of advice' \n \n ' remember to be good to others, that's a hero's duty'   \n 'Go to the next village south of here' \n \n \n 'That's your only chance'");
        player.currentWeapon = new Weapon_SmallSword();
        ui.weaponLabelName.setText(player.currentWeapon.name);

        ui.choice1.setText("To the village");
        ui.choice2.setText("Stay");

        game.nextPosition1 = "lastGoodBye";
        game.nextPosition2 = "lastGoodBye";
    }
    public void lastGoodBye(){
        ui.mainTextArea.setText("Dad: 'You must leave NOW! \n More monsters are coming, we'll distract them' \n  'Aye!', everyone agrees. \n 'Get to safety' \n \n \n You start running as terrible creatures come close to the villagers'");
        ui.choice1.setText("GoodBye dad");
        ui.choice2.setText("AYE");

        game.nextPosition1 = "aloneSmallForest";
        game.nextPosition2 = "aloneSmallForest";
    }
    public void aloneSmallForest(){
        ui.mainTextArea.setText("You stopped hearing the battle a while ago \n You can barely see where you are. \nYou keep hearing growling noises from the trees, but can't stop running\n No matter what");
        ui.choice1.setText("Run faster");
        ui.choice2.setText("Stop and listen");

        game.nextPosition1 = "smallWolf";
        game.nextPosition2 = "smallWolf";
    }
    public void smallWolf(){
        ui.mainTextArea.setText("A small wolf jumps in front of you, it looks pretty vicious, \n You may not make it alive out of this \n \n You have a sword tho, and are brave");
        ui.choice1.setText("Swing sword");
        ui.choice2.setText("Direct attack");

        game.nextPosition1 = "attackSmallWolf";
        game.nextPosition2 = "attackSmallWolf";
    }
    public void attackSmallWolf(){
        ui.mainTextArea.setText("The wolf dodges you, easily  \n \n It bites back and makes you drop your sword. \n You get 17 Damage! \n \n You are in danger!");
        player.hp -= 17;
        ui.hpLabelNumber.setText(""+player.hp);
        player.currentWeapon = new Weapon_Knife();
        ui.weaponLabelName.setText(player.currentWeapon.name);

        ui.choice1.setText("Fight back");
        ui.choice2.setText("Run away");

        game.nextPosition1 = "fightSmallWolf";
        game.nextPosition2 = "runFromWolf";
    }
    public void fightSmallWolf(){
        ui.mainTextArea.setText("You grab a rock and throw it at the wolf who dodges it.\n You are badly injured \n \n Suddenly a monster appears! The wolf gets scared and escapes \n \n You do the same");
        ui.choice1.setText("Run");
        ui.choice2.setText("Run");

        game.nextPosition1 = "arriveVillage";
        game.nextPosition2 = "arriveVillage";
    }
    public void arriveVillage(){
        ui.mainTextArea.setText("You run like you've never ran before. \n \n You can feel creatures moving around you in the darkness \n Far away you see a light, you go there");
        ui.choice1.setText("To the light");
        ui.choice2.setText("");

        game.nextPosition1 = "arriveVillage";
        game.nextPosition2 = "arriveVillage";
    }
    public void runFromWolf(){
        ui.mainTextArea.setText("You make a wise choice and run \n Somehow it seems you left the wolf behind \n You are bleeding a lot, in the distance you see \n a couple of houses and a big church");
        ui.choice1.setText("Go there");
        ui.choice2.setText("");

        game.nextPosition1 = "arriveCult";
        game.nextPosition2 = "aloneSmallForest";
    }
    public void arriveCult(){
        ui.mainTextArea.setText("An elder man awaits at the gate of \n a small community of houses. \n 'Help!' You shout");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "cultIntro";
        game.nextPosition2 = "";
    }
        public void cultIntro(){
        ui.mainTextArea.setText("You introduce yourself and ask for help with \n  your wounds. \n The old man asks you if you'd like to join his religion in exchange \n for medicine and food.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "cultSecondIntro";
        game.nextPosition2 = "";
    }
    public void cultSecondIntro(){
        ui.mainTextArea.setText("The people that live here, answer to only one god \n 'No blasphemers will be allowed in!' \n You must join us if you want asylum. \n\n Will you join this town's religion?");
        ui.choice1.setText("Yes");
        ui.choice2.setText("No");

        game.nextPosition1 = "cultAccept";
        game.nextPosition2 = "cultDeny";
    }
    public void cultAccept(){
        ui.mainTextArea.setText("'Welcome, welcome! \n\n Everybody will be pleased with your arrival. \n Let me help you' The elder walks you inside the town.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "cultTown";
        game.nextPosition2 = "";
    }
    public void cultDeny(){
        ui.mainTextArea.setText("Well, may you rot then. \n You got what you deserve, for blasphemy \n \n Leave already!");
        ui.choice1.setText("Back to forest");
        ui.choice2.setText("");

        game.nextPosition1 = "backToForest";
        game.nextPosition2 = "";
    }
    public void backToForest(){
        ui.mainTextArea.setText("The night is almost over, you keep going forward \n but you have lost too much blood. You can \n barely keep going. \n You lose more health as you walk");
        player.hp -= 2;
        ui.hpLabelNumber.setText(""+player.hp);
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "backToForestTwo";
        game.nextPosition2 = "";
    }
    public void backToForestTwo(){
        ui.mainTextArea.setText("You can't keep walking. You are falling asleep\n\n Finally, exhausted, you fall to the ground in front of a small pond \n Hopefully no monster finds you here");
        ui.choice1.setText("Zzzzzz");
        ui.choice2.setText("");

        game.nextPosition1 = "sleepForest";
        game.nextPosition2 = "";
    }
    public void wakeUpPond(){
        ui.mainTextArea.setText("Next morning a swarm of flies wakes you up. \n Your wounds seemed to have sealed \n It's a miracle! \n \n You have to be more careful from now on. You look \n at the pond");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "SeeBigFish";
        game.nextPosition2 = "";
    }







    public void crossRoad(){
        ui.mainTextArea.setText("There are two ways to go");
        ui.choice1.setText("Go to the goblin");
        ui.choice2.setText("Go river");

        game.nextPosition1 = "goblin";
        game.nextPosition2 = "river";
    }
    public void river(){
        ui.mainTextArea.setText("There s a river over here");
        player.hp += 3;
        ui.hpLabelNumber.setText(""+player.hp);
        ui.choice1.setText("Go sword");
        ui.choice2.setText("Go back");

        game.nextPosition1 = "sword";
        game.nextPosition2 = "crossRoad";
    }
    public void sword(){
        ui.mainTextArea.setText("You found a sword, wooooww");
        player.currentWeapon = new Weapon_SmallSword();
        ui.weaponLabelName.setText(player.currentWeapon.name);
        ui.choice1.setText("Continue");
        ui.choice2.setText("Go back");

        game.nextPosition1 = "talkVillager";
        game.nextPosition2 = "crossRoad";
    }
    public void talkVillager(){
            ui.mainTextArea.setText("Villager: So where are you headed? \n There are things in these woods \n You wouldn't survive alone. \n Get a crew    ");
            ui.choice1.setText("go forth");
            ui.choice2.setText("crossRoad");
            game.nextPosition1 = "killerTree";
            game.nextPosition2 = "crossRoad";
    }

    public void killerTree(){
        monster = new Monster_KillerTree();

        ui.mainTextArea.setText("The trees have eyes, you feel watched. \n A far thunder lights the path, \n in front of you, a tree with claws like a lion! " + monster.name + "!" );
        ui.choice1.setText("I'll defeat \n it!");
        ui.choice2.setText("Go back");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "crossRoad";
    }
    public void giantLizard(){
        monster = new Monster_KillerTree();

        ui.mainTextArea.setText("A giant lizard appears, it won't \n attack first, but " + monster.name + "!" );
        ui.choice1.setText("I'll defeat \n it!");
        ui.choice2.setText("Go back");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "crossRoad";
    }

    public void goblin(){
        monster = new Monster_Goblin();

        ui.mainTextArea.setText("You encountered" + monster.name + "!" );
        ui.choice1.setText("Kill");
        ui.choice2.setText("Go back");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "crossRoad";
    }
    public void fight(){
        ui.mainTextArea.setText(monster.name + ": " + monster.hp + "\n \n an attack is imminent" );
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run like a coward");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "crossRoad";
    }
    public void playerAttack(){
        int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage);
        ui.mainTextArea.setText("You attacked the " + monster.name + " and gave " + playerDamage + " Damage!");
        monster.hp -= playerDamage;
        ui.choice1.setText("Next");
        ui.choice2.setText("");


        if(monster.hp>0){
            game.nextPosition1 = "monsterAttack";
            game.nextPosition2 = "";
        }
        else if(monster.hp<1){
            game.nextPosition1 = "win";
            game.nextPosition2 = "";
        }
    }
    public void monsterAttack(){
        int i = new java.util.Random().nextInt(4);
        int monsterDamage = new java.util.Random().nextInt(4) + monster.attacks[i];
        player.hp -= monsterDamage;
        ui.hpLabelNumber.setText("" + player.hp);

        ui.mainTextArea.setText(monster.attackMessages[i] + "\n You received " + monsterDamage + " Damage!");

        ui.choice1.setText("Next");
        ui.choice1.setText("");

        if(player.hp>0){
            game.nextPosition1 = "fight";
            game.nextPosition2 = "";
        }else if(player.hp<1){
            game.nextPosition1 = "lose";
            game.nextPosition2 = "";
        }
    }
    public void win(){
        ui.mainTextArea.setText("You've defeated the " + monster.name + "! \n The monster dropped a silver Ring" );
        silverRing = 1;

        ui.choice1.setText("Next");
        ui.choice2.setText("");

        game.nextPosition1 = "randomEncounter";
        game.nextPosition2 = "";
    }
    public void lose(){
        ui.mainTextArea.setText("You got killed!" );

        ui.choice1.setText("To the title screen");
        ui.choice1.setText("");

        game.nextPosition1 = "toTitle";
        game.nextPosition2 = "";
    }
    public void randomEncounter(){

        int i = new java.util.Random().nextInt(100)+1;

        if(i<90){
            monster = new Monster_Goblin();
        }else{
            monster = new Monster_KillerTree();
        }
        ui.mainTextArea.setText(monster.name);

    }
    public void ending(){
        ui.mainTextArea.setText("You did it!!! You killed the monster \n You are our hero!" );
        ui.choice1.setVisible(false);
        ui.choice1.setVisible(false);
    }
    public void toTitle(){
        defaultSetUp();
        vm.showTitleScreen();
    }

}
