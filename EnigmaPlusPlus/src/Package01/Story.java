package Package01;

import Package02.*;

import javax.swing.*;
import java.awt.*;

public class Story {
    Game game;
    UI ui;
    VisibilityManager vm;
    Player player = new Player();
    SuperMonster monster;

    int silverRing;
    String positionAfterBattle;
    String positionIfKilled;
    String secondPositionAfter;
    public Story(Game g, UI userInterface, VisibilityManager vManager){

        game = g;
        ui = userInterface;
        vm = vManager;
    }

    public void defaultSetUp(){

        player.hp = 20;
        player.level = 1;
        player.exp = 0;
        ui.hpLabelNumber.setText("" + player.hp);
        ui.levelLabel.setText("Level "+ player.level );
        ui.expLabelNumber.setText( player.exp + " exp");
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
            case "forestDadPicture": forestDadPicture(); break;
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
            case "secondPondScene": secondPondScene(); break;
            case "thirdPondScene": thirdPondScene(); break;
            case "swimInThePond": swimInThePond(); break;
            case "seeFishPond": seeFishPond(); break;
            case "followFishPond": followFishPond(); break;
            case "caveUnderPond": caveUnderPond(); break;
            case "pondCaveOpening": pondCaveOpening(); break;
            case "pondCaveSurface": pondCaveSurface(); break;
            case "deeperPondCave": deeperPondCave(); break;
            case "lamiaLair": lamiaLair(); break;
            case "meetLamia": meetLamia(); break;
            case "lamiaIntro": lamiaIntro(); break;
            case "lamiaHome": lamiaHome(); break;
            case "lamiaStory": lamiaStory(); break;
            case "lamiaSecondStory": lamiaSecondStory(); break;
            case "lamiaStoryEnding": lamiaStoryEnding(); break;
            case "lamiaRevealCurse": lamiaRevealCurse(); break;
            case "lamiaRevealCursePic": lamiaRevealCursePic(); break;
            case "lamiaFight": lamiaFight(); break;
            case "throwGoldLamia": throwGoldLamia(); break;
            case "findSmallAxe": findSmallAxe(); break;
            case "attackLamia": attackLamia(); break;
            case "killLamia": killLamia(); break;
            case "lamiaDeath": lamiaDeath(); break;
            case "asleepInLamias": asleepInLamias(); break;
            case "helpFullRedFish": helpFullRedFish(); break;
            case "talkingFish": talkingFish(); break;
            case "crawlToFish": crawlToFish(); break;
            case "thanksFish": thanksFish(); break;
            case "gnPondSleep": gnPondSleep(); break;
            case "wakeUpCave": wakeUpCave(); break;
            case "callFish": callFish(); break;
            case "getGoldAndLeave": getGoldAndLeave(); break;
            case "myBadFish": myBadFish(); break;
            case "outCaveWFish": outCaveWFish(); break;
            case "tellFishStory": tellFishStory(); break;
            case "whatAboutFish": whatAboutFish(); break;
            case "fishConversation": fishConversation(); break;
            case "greatWaterPond": greatWaterPond(); break;
            case "fishWay": fishWay(); break;
            case "goodByeFish": goodByeFish(); break;
            case "toTheShed": toTheShed(); break;
            case "backWoodsFromFish": backWoodsFromFish(); break;
            case "firstScorpionDeath": firstScorpionDeath(); break;
            case "closerToShed": closerToShed(); break;
            case "secondScorpionDeath": secondScorpionDeath(); break;
            case "knockMonkeyShed": knockMonkeyShed(); break;
            case "meetMonkeyKing": meetMonkeyKing(); break;
            case "askMonkeyHelp": askMonkeyHelp(); break;
            case "askAboutVillage": askAboutVillage(); break;
            case "monkeyYaluRiver": monkeyYaluRiver(); break;
            case "monkeyMedicine": monkeyMedicine(); break;
            case "takeMonkeyMedicine": takeMonkeyMedicine(); break;
            case "thanksMonkey": thanksMonkey(); break;
            case "giantSpiderAppears": giantSpiderAppears(); break;
            case "defeatGiantSpider": defeatGiantSpider(); break;
            case "forestAfterSpider": forestAfterSpider(); break;
            case "walkPastSpider": walkPastSpider(); break;
            case "monkeyKingHelps": monkeyKingHelps(); break;
            case "swampOfDeath": swampOfDeath(); break;
            case "waitMoreHome": waitMoreHome(); break;
            case "itIsntThem": itIsntThem(); break;
            case "goBackHome": goBackHome(); break;
            case "arriveCultPicture": arriveCultPicture(); break;
            case "cultTown": cultTown(); break;
            case "cultChurch": cultChurch(); break;
            case "theyAreFine": theyAreFine(); break;
            case "sleepCultTown": sleepCultTown(); break;
            case "stayAwakeCult": stayAwakeCult(); break;
            case "nightmareFirstNight": nightmareFirstNight(); break;
            case "secondPartNightmare": secondPartNightmare(); break;
            case "lastPartNightmare": lastPartNightmare(); break;
            case "awakeCultTown": awakeCultTown(); break;
            case "topWizard": topWizard(); break;
            case "niceTopWizard": niceTopWizard(); break;
            case "helpTopWizard": helpTopWizard(); break;
            case "whatsTheSpell": whatsTheSpell(); break;
            case "letsDoTheSpell": letsDoTheSpell(); break;
            case "heresAWand": heresAWand(); break;
            case "getPurpleWand": getPurpleWand(); break;
            case "laiFu": laiFu(); break;
            case "sayLaiFu": sayLaiFu(); break;
            case "practiceMagic": practiceMagic(); break;
            case "crystalTiger": crystalTiger(); break;
            case "goCemetery": goCemetery(); break;
            case "mistyPath": mistyPath(); break;
            case "passingTheCemetery": passingTheCemetery(); break;
            case "secondZombie": secondZombie(); break;
            case "mutantZombie": mutantZombie(); break;
            case "threeSkulls": threeSkulls(); break;
            case "runFromSwamp": runFromSwamp(); break;
            case "cultTownComeback": cultTownComeback(); break;
            case "iKilledTheZombies": iKilledTheZombies(); break;
            case "whatsMonolith": whatsMonolith(); break;
            case "wheresMonolith": wheresMonolith(); break;
            case "whyMonolithPower": whyMonolithPower(); break;
            case "letsGoMonolith": letsGoMonolith(); break;
            case "howDarkMagic": howDarkMagic(); break;
            case "learnMoreSpells": learnMoreSpells(); break;
            case "oroExecuted": oroExecuted(); break;
            case "monsterHandClaw": monsterHandClaw(); break;
            case "goingToMonolith": goingToMonolith(); break;
            case "goWoodsMonolith": goWoodsMonolith(); break;
            case "arriveMonolith": arriveMonolith(); break;
            case "arriveMonolithPicture": arriveMonolithPicture(); break;
            case "walkUpToMonolith": walkUpToMonolith(); break;
            case "creepyCultScene": creepyCultScene(); break;
            case "creepyCultApprentice": creepyCultApprentice(); break;
            case "sacrificeGirl": sacrificeGirl(); break;
            case "attackChiefWizard": attackChiefWizard(); break;
            case "fightChiefWizard": fightChiefWizard(); break;
            case "secondAttackWizard": secondAttackWizard(); break;
            case "thirdAttackWizard": thirdAttackWizard(); break;
            case "freeGirl": freeGirl(); break;
            case "faceMonolithFire": faceMonolithFire(); break;
            case "monolithFireExpands": monolithFireExpands(); break;
            case "destroyCultMembers": destroyCultMembers(); break;
            case "giantToadMonster": giantToadMonster(); break;
            case "fleeToadMonster": fleeToadMonster(); break;
            case "escapeFromMonolith": escapeFromMonolith(); break;
            case "escapeMonolithTwo": escapeMonolithTwo(); break;
            case "thirdEscapeMonolith": thirdEscapeMonolith(); break;
            case "restEscapeMonolith": restEscapeMonolith(); break;
            case "continueEscapeMonolith": continueEscapeMonolith(); break;
            case "afterMutantBearBattle": afterMutantBearBattle(); break;
            case "defeatTwoMutantBear": defeatTwoMutantBear(); break;
            case "monkeyKingMonolith": monkeyKingMonolith(); break;
            case "shedAfterMonolith": shedAfterMonolith(); break;
            case "passOutMonkeyShed": passOutMonkeyShed(); break;
            case "wakeUpMonkeyShed": wakeUpMonkeyShed(); break;
            case "drinkTeaAndLeave": drinkTeaAndLeave(); break;
            case "lookAroundShed": lookAroundShed(); break;
            case "goFindShedsOwner": goFindShedsOwner(); break;
            case "greetUndead": greetUndead(); break;
            case "waitForGhouls": waitForGhouls(); break;
            case "whatDoZombiesWant": whatDoZombiesWant(); break;
            case "hideFromZombies": hideFromZombies(); break;
            case "hideInBasement": hideInBasement(); break;
            case "zombieNight": zombieNight(); break;
            case "lightACandle": lightACandle(); break;
            case "openClayBox": openClayBox(); break;
            case "readCandleLetter": readCandleLetter(); break;
            case "readSecretLetter": readSecretLetter(); break;
            case "lookRoundBasement": lookRoundBasement(); break;
            case "grabWeirdApple": grabWeirdApple(); break;
            case "fuckItsZombies": fuckItsZombies(); break;
            case "fightVillagerZombies": fightVillagerZombies(); break;
            case "mustKillZombies": mustKillZombies(); break;
            case "jumpSlashZombie": jumpSlashZombie(); break;
            case "crouchStabZombie": crouchStabZombie(); break;
            case "goRoomZombies": goRoomZombies(); break;
            case "afterNightmareRoom": afterNightmareRoom(); break;
            case "zombieVirusRoom": zombieVirusRoom(); break;
            case "goBackBasement": goBackBasement(); break;
            case "catchMeOusside": catchMeOusside(); break;
            case "kickedZombiesAss": kickedZombiesAss(); break;
            case "checkTownSquare": checkTownSquare(); break;
            case "killMutandZombshe": killMutandZombshe(); break;
            case "firstHouseZombies": firstHouseZombies(); break;
            case "outFirstHouse": outFirstHouse(); break;
            case "secondHouseZombies": secondHouseZombies(); break;
            case "outSecondHouse": outSecondHouse(); break;
            case "goHomeToPack": goHomeToPack(); break;
            case "goOutsideZombies": goOutsideZombies(); break;
            case "checkMirrorUZombie": checkMirrorUZombie(); break;
            case "youAreZombie": youAreZombie(); break;
            case "iAmAMonster": iAmAMonster(); break;
            case "helpBlindMan": helpBlindMan(); break;
            case "useMetalApple": useMetalApple(); break;
            case "woahMetalApple": woahMetalApple(); break;
            case "fightTwoUndead": fightTwoUndead(); break;
            case "upwardCutZombie": upwardCutZombie(); break;
            case "whoIsBlindMan": whoIsBlindMan(); break;
            case "helpWifeBlind": helpWifeBlind(); break;
            case "toWoodsWBlind": toWoodsWBlind(); break;
            case "remainsDadBattle": remainsDadBattle(); break;
            case "checkTreeBattle": checkTreeBattle(); break;
            case "paperTreeTrunk": paperTreeTrunk(); break;
            case "walkToBlindsHouse": walkToBlindsHouse(); break;
            case "openBlindsHouse": openBlindsHouse(); break;
            case "blindGetsBitten": blindGetsBitten(); break;
            case "insideBlindsHouse": insideBlindsHouse(); break;
            case "blindsWifeRoom": blindsWifeRoom(); break;
            case "blindsWifeOk": blindsWifeOk(); break;
            case "takebackBlindsHome": takebackBlindsHome(); break;
            case "enemyAtBlinds": enemyAtBlinds(); break;
            case "blindsEnemySlash": blindsEnemySlash(); break;
            case "blindsHelpYou": blindsHelpYou(); break;
            case "blueBeamMonster": blueBeamMonster(); break;
            case "thanksGris": thanksGris(); break;
            case "whatsForbiddenMagic": whatsForbiddenMagic(); break;
            case "favorFromGris": favorFromGris(); break;
            case "whatDestinyGris": whatDestinyGris(); break;
            case "whatDoorGris": whatDoorGris(); break;
            case "thanksSwordGris": thanksSwordGris(); break;
            case "blindTurnsZombie": blindTurnsZombie(); break;
            case "blindAttacks": blindAttacks(); break;
            case "defeatBlindZombie": defeatBlindZombie(); break;
            case "backFindVillage": backFindVillage(); break;
            case "continueFindVillage": continueFindVillage(); break;
            case "takeRightPath": takeRightPath(); break;
            case "fasterRightPath": fasterRightPath(); break;
            case "reachGhostVillage": reachGhostVillage(); break;
            case "knockDoorVillage": knockDoorVillage(); break;
            case "silenceInVillage": silenceInVillage(); break;
            case "lookRoundEmpty": lookRoundEmpty(); break;
            case "tasteFoodEmpty": tasteFoodEmpty(); break;
            case "stayRestEmpty": stayRestEmpty(); break;
            case "houseIntact": houseIntact(); break;
            case "windowVillage": windowVillage(); break;
            case "checkCloseHouse": checkCloseHouse(); break;
            case "checkFarHouse": checkFarHouse(); break;
            case "goNextHouse": goNextHouse(); break;
            case "getCloseHouse": getCloseHouse(); break;
            case "getFarHouse": getFarHouse(); break;
            case "checkCentipedeHouse": checkCentipedeHouse(); break;
            case "stayWithBoy": stayWithBoy(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;
            case "boyWakesUp": boyWakesUp(); break;



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
        game.nextPosition2 = "";
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
        ui.choice1.setForeground(Color.ORANGE);
        ui.choice2.setForeground(Color.GREEN);
        ui.choice1.setText("Go find Dad");
        ui.choice2.setText("Stay home");
        game.nextPosition1 = "forestDad";
        game.nextPosition2 = "waitMoreHome";
    }
    public void waitMoreHome(){
        ui.mainTextArea.setText("Another couple of hours go by \n still no sounds from outside \n you decide to open the door and take a look at the street. \n \n There's no one around, but far away you can see a group\n of people walking back. \n It must be them, you await.");
        ui.choice1.setForeground(Color.white);
        ui.choice2.setForeground(Color.white);
        ui.choice1.setText("Finally");
        ui.choice2.setText("");

        game.nextPosition1 = "itIsntThem";
        game.nextPosition2 = "";
    }
    public void itIsntThem(){
        ui.mainTextArea.setText("As the group gets closer, you notice they are very skinny. \n \n The group of villagers is barely bones and skin. \n \n Something isn't right. ");
        ui.choice1.setText("Go inside");
        ui.choice2.setText("Greet them");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "greetUndead";
    }
    public void greetUndead(){
        ui.mainTextArea.setText("You get closer to them, shouting. \n 'What happened?!?'- \n \n They start walking towards you at the same pace as before. \nOnce they get closer you see their faces, blank with no emotion,\neyes white as if they were... dead.");
        ui.choice1.setText("goBackHome");
        ui.choice2.setText("");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "";
    }

    //zombies invade town- try to break in- You look round the house and find strange stuff - a sword, a letter from the king and an artifact.-The artifact is a bomb- you use it along with your sword to escape town. -
    //You gotta save a blind man that stayed behind-You get infected with the zombie virus.-you flee thru the forest and kick some zombie ass
    //you get to house w blinds wife, she a witch-she gives you cursed blade and dies-blind goes zombie-you flee and get to village
    //nobody on village, only one boy fucked up by centipede-He tells u story of centipede taking ppl, says the mayor knows more
    //you decide to save the town.-In the towns cityhall you find prisoner-prisoner tells you if you get artifact back from the centipede
    //he can help you find your dad. you go on centipede cave to find town ppl and artifact4

    public void goBackHome(){
        ui.mainTextArea.setText("You shut the door closed after getting back home.\n They didn't look familiar, and the way they walked wasn't normal at all. \n\nSomething was terribly wrong with those villagers. \nBut you have no idea what could it be. \n\nYou lock the door just in case, and wait.  ");
        ui.choice1.setText("wait");
        ui.choice2.setText("");

        game.nextPosition1 = "waitForGhouls";
        game.nextPosition2 = "";
    }

    public void waitForGhouls(){
        ui.mainTextArea.setText("A while goes by, you turn all the candles off \nand look out the window, awaiting their arrival. \n\n\n Paft, bam! They start banging on the door, as if they knew\n u are hiding here. \nThe wooden door shakes everytime it get beaten.  ");
        ui.choice1.setText("What do you want?");
        ui.choice2.setText("Stay quiet");

        game.nextPosition1 = "whatDoZombiesWant";
        game.nextPosition2 = "";
    }    public void whatDoZombiesWant(){
        ui.mainTextArea.setText("No answer, just 'blergh' and 'aaaaaah'. \nThe villagers keep shouting things you can't understand, \nand beating the door. \n\nThey seem very angry and anxious.");
        ui.choice1.setText("Go hide");
        ui.choice2.setText("");

        game.nextPosition1 = "hideFromZombies";
        game.nextPosition2 = "";
    }    public void hideFromZombies(){
        ui.mainTextArea.setText("The beating and the shouts continue. \n They will get in soon. The door can't hold forever. \n\n You make a run for it. To the basement!!!\nYou get to the basement, and lock its door too. Its cold\nand humid. ");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "hideInBasement";
        game.nextPosition2 = "";
    }    public void hideInBasement(){
        ui.mainTextArea.setText("PAAAAAFT!!!\n\nThey are in the house, that sounded like the door being destroyed.\n\nYou stay quiet, crouched behind some boxes and old furniture.\nYou can hear them upstairs, shouting like demons.\nWhy are they so angry? You hear them tear the house apart.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "zombieNight";
        game.nextPosition2 = "";
    }    public void zombieNight(){
        ui.mainTextArea.setText("After a while, the sounds become fainter. As if they'd stopped looking for you. \nYou are scared to turn any light, but need to find something to protect \nyourself \nwhat should you do?");
        ui.choice1.setText("Light a candle");
        ui.choice2.setText("Remain in darkness");

        game.nextPosition1 = "lightACandle";
        game.nextPosition2 = "";
    }
    public void lightACandle(){
        ui.mainTextArea.setText("You remember where the candles and matches are. \nYou grab one, and light it up. \n\nYou see the door to upstairs is still locked, and a lot of old \nfurniture around you.\nThere's a small metal box in the corner, and a clay box on top of a table.");
        ui.choice1.setText("Open clay box");
        ui.choice2.setText("Open metal box");

        game.nextPosition1 = "openClayBox";
        game.nextPosition2 = "";
    }
    public void openClayBox(){
        ui.mainTextArea.setText("You approach the clay box without making a noise. \nIts long and rectangular.\n\nAfter removing the top, you find a curved golden sword\n and a piece of paper.\nThe paper is blank, but when placed in front of the candle, \nsome letters appear.");
        player.currentWeapon = new Weapon_GoldenSword();
        ui.weaponLabelName.setText(player.currentWeapon.name);

        ui.choice1.setText("Read");
        ui.choice2.setText("");

        game.nextPosition1 = "readCandleLetter";
        game.nextPosition2 = "";
    }    public void readCandleLetter(){
        ui.mainTextArea.setText("To my truest ally, \ndangerous times are near.\n\nIt isn't safe for my heir to stay in the capital.\nYou must take care of my child, until this great evil \nis defeated.\n\nOnce the kid comes of age, this royal sword will help the child,\n fulfill the prophecy.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "readSecretLetter";
        game.nextPosition2 = "";
    }

    public void readSecretLetter(){
        ui.mainTextArea.setText("You placed the letter too close to the candle. \nAnd before you could read it again, it lit on fire. \n\nYou almost shout, when it burned your hand.\nWhat is the meaning of this? The child? It can't be me.\n\nWas this letter for my dad?");
        ui.choice1.setText("Look around basement");
        ui.choice2.setText("");

        game.nextPosition1 = "lookRoundBasement";
        game.nextPosition2 = "";
    }
    public void lookRoundBasement(){
        ui.mainTextArea.setText("You look around the basement and find nothing \nOnly the metal box in the corner of the room.\n\n You put it on the table, next to the clay one, and open it. \n\n The outside of the box says: 'Careful, deadly artifact inside'.\nInside, there's a metal apple, with a ring as a leaf\nhanging on top of it.");
        ui.choice1.setText("Grab it");
        ui.choice2.setText("");

        game.nextPosition1 = "grabWeirdApple";
        game.nextPosition2 = "";
    }    public void grabWeirdApple(){
        ui.mainTextArea.setText("Under the apple there's a note. \n 'Pull from the ring, and throw at enemy' \n'Count to ten, and a big fire will consume enemy'\n\nYou put the metal apple in your pocket, as you are doing this\nyou hear the door to the basement being rattled.");
        ui.choice1.setText("Fuck");
        ui.choice2.setText("");

        game.nextPosition1 = "fuckItsZombies";
        game.nextPosition2 = "";
    }    public void fuckItsZombies(){
        ui.mainTextArea.setText("They found you. The rattling gets stronger and violent. \nYou drop the candle to the floor and it gets dark again. \nHolding the golden sword with both hands you prepare \nfor a battle to death.\n\n\nPAAAFT, a sound too familiar lets you know the villagers are\n in the basement.");
        ui.choice1.setText("Fight them");
        ui.choice2.setText("");

        game.nextPosition1 = "fightVillagerZombies";
        game.nextPosition2 = "";
    }
    public void fightVillagerZombies(){
        ui.mainTextArea.setText("Like rabid dogs, you see their white eyes shine in the darkness. \n\nThey come to you showing their teeth and shouting.\n\nOne bites your hand, you cut its head off. \nYou are crying your eyes out, but keep swinging your sword in the dark. \nAnother bite, in your back, in your leg, in your face, in your shoulder...");
        ui.choice1.setText("AAAAAAAAH!!!");
        ui.choice2.setText("");

        game.nextPosition1 = "mustKillZombies";
        game.nextPosition2 = "";
    }    public void mustKillZombies(){
        ui.mainTextArea.setText("The pain of your flesh being bit off drowns your screams.\nThere in the dark you hear their bodies drop to the floor, \nafter you cut thru them with your sword.\nbut they keep standing back up, why do they keep coming back?");
        ui.choice1.setText("Jump and slash");
        ui.choice2.setText("Crouch and stab");

        game.nextPosition1 = "jumpSlashZombie";
        game.nextPosition2 = "";
    }    public void jumpSlashZombie(){
        ui.mainTextArea.setText("You jump and slash all around you\nsome of their body parts fall to the floor. \n\nSome of them aren't standing back up. \n\nSoon enough, all your enemies are sliced in pieces on the floor.\nYou are badly injured however.");
        ui.choice1.setText("Go upstairs");
        ui.choice2.setText("");

        game.nextPosition1 = "goRoomZombies";
        game.nextPosition2 = "";
    }    public void crouchStabZombie(){
        ui.mainTextArea.setText("You crouch and start stabbing everyone around you\nyou hear skulls and ribs cracking to your blade.\n Some of your enemies stopped coming back. \n\nSoon enough, all your enemies are in the floor dead,\nYou are badly injured tho.");
        ui.choice1.setText("Go upstairs");
        ui.choice2.setText("");

        game.nextPosition1 = "goRoomZombies";
        game.nextPosition2 = "";
    }
    public void goRoomZombies(){
        ui.mainTextArea.setText("You get to your room, barely alive. \n\nYou can't move anymore, and fall on the floor. \nIt feels like you have a fever, your body burns but its cold at the same\ntime.\n\n.......................\n\nIt doesn't look like you'll make it.");
        positionAfterBattle = "afterNightmareRoom";
        ui.choice1.setText("Sorry, dad");
        ui.choice2.setText("Shit");

        game.nextPosition1 = "nightmareFirstNight";
        game.nextPosition2 = "nightmareFirstNight";
    }    public void afterNightmareRoom(){
        ui.mainTextArea.setText("Uhhhh?\nYou wake up drenched in sweat.\n\nYou can't remember where you are, what was that nightmare about?\nA trail of blood leads to you from your room's door.");
        ui.choice1.setText("Stand up");
        ui.choice2.setText("");

        game.nextPosition1 = "zombieVirusRoom";
        game.nextPosition2 = "";
    }    public void zombieVirusRoom(){
        ui.mainTextArea.setText("Your nails are black, and your vision blurry.\nWhen looking at yourself in your rooms mirror,\nyou see the bite marks around your body and remember.\n\nIt's daytime, but you aren't sure how many days went by \nwhile you were unconscious.");
        ui.choice1.setText("Check basement");
        ui.choice2.setText("Go outside");

        game.nextPosition1 = "goBackBasement";
        game.nextPosition2 = "";
    }    public void goBackBasement(){
        ui.mainTextArea.setText("As if you wanted to make sure what happened was real.\nYou head back to the basement, and there\nthe sliced corpses of your enemies lay.\n\nHow the hell am I alive? you think");
        ui.choice1.setText("Go outside");
        ui.choice2.setText("");

        game.nextPosition1 = "goOutsideZombies";
        game.nextPosition2 = "";
    }    public void goOutsideZombies(){
        ui.mainTextArea.setText("The events from the other night\nwere extremely traumatic, but you seem to not care.\n\nYou head to the street, feeling nothing\nnot anger nor anxiety or fear. You walk out, \ncaring about nothing at all.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "catchMeOusside";
        game.nextPosition2 = "";
    }    public void catchMeOusside(){
        ui.mainTextArea.setText("An undead villager stands in the middle of the street.\n\n\nEyes blank as mine, we both look and run towards each other.");
        monster = new Monster_Undead();
        positionAfterBattle = "kickedZombiesAss";
        ui.choice1.setText("Attack");
        ui.choice2.setText("Meh...");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }
    public void kickedZombiesAss(){
        ui.mainTextArea.setText("With a swing of my sword I decapitate the monster. \n\nStill not feeling a single emotion,\nI must be still in shock or something.\n\nThe town looks empty, but there's screams coming from the market.");
        ui.choice1.setText("Check it out");
        ui.choice2.setText("Pass");

        game.nextPosition1 = "checkTownSquare";
        game.nextPosition2 = "";
    }
    public void checkTownSquare(){
        ui.mainTextArea.setText("On the way there you encounter another undead.\nBlood dripping from her mouth.\n\nThis woman is different, her eyes are red and looks more dangerous.\n\nShe barks like a crazy dog, and runs towards you like an animal.");
        monster = new Monster_MutantZombie();
        positionAfterBattle = "killMutandZombshe";
        ui.choice1.setText("Defend yourself");
        ui.choice2.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }    public void killMutandZombshe(){
        ui.mainTextArea.setText("This woman scared you a bit.\n\nUntil you cracked her skull she wouldn't stop shouting.\n\nShe looked possessed by evil, and ferociously tried to kill you.\nYou get to the town's square and see more like her.\nYou can't defeat so many, so you turn around.");
        ui.choice1.setText("Check houses");
        ui.choice2.setText("Go back home");

        game.nextPosition1 = "firstHouseZombies";
        game.nextPosition2 = "";
    }    public void firstHouseZombies(){
        ui.mainTextArea.setText("You check the house closest to you.\n\nHere used to live a couple of farmers.\nAll the furniture is shredded. \n\nIn the main room, you find a friend.\nAn undead, looks at you silently from across the room.");
        monster = new Monster_Undead();
        positionAfterBattle = "outFirstHouse";
        ui.choice1.setText("Fight");
        ui.choice2.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }
    public void outFirstHouse(){
        ui.mainTextArea.setText("You get out of the house with nothing of value.\nThere's no sign of your neighbors, only dead ones.\n\nUp ahead there's two more houses.\nYou noticed fighting this last undead, that you've become way stronger.");
        ui.choice1.setText("House on the right");
        ui.choice2.setText("House on the left");

        game.nextPosition1 = "secondHouseZombies";
        game.nextPosition2 = "secondHouseZombies";
    }    public void secondHouseZombies(){
        ui.mainTextArea.setText("You head for the next house,\nhow strange. You could swear that in the battle with the crazed woman\nyou got a deep cut on your arm,\nbut now, you have no blood, just a scar.\n\nInside this house, another foe awaits you.");
        monster = new Monster_Undead();
        positionAfterBattle = "outSecondHouse";
        ui.choice1.setText("Fight!!!");
        ui.choice2.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }    public void outSecondHouse(){
        player.hp = 20;
        ui.hpLabelNumber.setText(""+player.hp);
        ui.mainTextArea.setText("You found some heart potato.\nFarmers use this rare vegetable as a medicine.\nYou take a bite of the root and your health recovers.\n\nEnough scouting, you have to get back home and come up with a plan");
        ui.choice1.setText("Go home again");
        ui.choice2.setText("");

        game.nextPosition1 = "goHomeToPack";
        game.nextPosition2 = "";
    }

    public void goHomeToPack(){
        ui.mainTextArea.setText("You get back to the your house \nfeeling an uncontrollable urge to vomit.\n\nYou can't exactly describe the sensation you've had\nsince you woke up.\nBut you know there's something different about you\nyou transformed overnight.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "checkMirrorUZombie";
        game.nextPosition2 = "";
    }

    public void checkMirrorUZombie(){
        ui.mainTextArea.setText("You go back to your room once again\nface the mirror and check with more detail your body.\n\nYou are pale, and can see your veins thru your skin.\nYour eyes changed color, to a reddish hue.\nYou look like the mutant undead lady.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "youAreZombie";
        game.nextPosition2 = "";
    }
    public void youAreZombie(){
        ui.mainTextArea.setText("Unbelievable, as if the curse that tormented these monsters\nhad infected you too.\n\nYou are one of them now, and crave blood and violence.\nBut your transformation hasn't completed, you aren't crazy like them.");
        ui.choice1.setText("I am a monster");
        ui.choice2.setText("It can't be");

        game.nextPosition1 = "iAmAMonster";
        game.nextPosition2 = "";
    }
    public void iAmAMonster(){
        ui.mainTextArea.setText("Your emotions have faded away\nlike the color of your skin.\n\nBefore you can further check yourself, a voice shouts:\n'HEEEELP, SOMEONE HELP'-\n\nSomeone is in trouble, it comes from outside.");
        ui.choice1.setText("Help");
        ui.choice2.setText("Ignore");

        game.nextPosition1 = "helpBlindMan";
        game.nextPosition2 = "";
    }
    public void helpBlindMan(){
        ui.mainTextArea.setText("No time to think.\nYou follow the voice back to the town's square.\nOn the roof of one of the buildings, you can see the man shouting.\n\nUnder him, piling up, there's a dozen of undead villagers,\n trying to climb up and get a snack.");
        ui.choice1.setText("Use metal apple");
        ui.choice2.setText("Fight w sword");

        game.nextPosition1 = "useMetalApple";
        game.nextPosition2 = "";
    }



    public void useMetalApple(){
        ui.mainTextArea.setText("You remove the ring from the top\n of the metal apple and throw it to the undead.\n\n1, 2, 3, 4, 5, 6, 7, 8 , 9...\n\n\nBOOOOOMM!, a sphere of fire swallows the group of monsters.");
        ui.choice1.setText("Woah!");
        ui.choice2.setText("");

        game.nextPosition1 = "woahMetalApple";
        game.nextPosition2 = "";
    }
    public void woahMetalApple(){
        ui.mainTextArea.setText("The blast lifts you from the ground and makes you fall back.\n\nA couple undead mutants escaped the blast and come towards you.");
        ui.choice1.setText("Fight them!");
        ui.choice2.setText("");

        game.nextPosition1 = "fightTwoUndead";
        game.nextPosition2 = "";
    }
    public void fightTwoUndead(){
        ui.mainTextArea.setText("Their eyes shine bright red. \nThe one on the right tries to grab you.\nYou bash his brains out.\n\nThe other one scratches your face.");
        ui.choice1.setText("Upward cut");
        ui.choice2.setText("Sideway swing");

        game.nextPosition1 = "upwardCutZombie";
        game.nextPosition2 = "";
    }
    public void upwardCutZombie(){
        ui.mainTextArea.setText("With an upward cut, you knock the creature's head off.\n\nThe apple's explosion started a fire, and one by one\nthe buildings of your hometown catch fire.\n\nYou rescue the man on the roof of the market, and learn he is blind.");
        ui.choice1.setText("Who are you?");
        ui.choice2.setText("Where to go now?");

        game.nextPosition1 = "whoIsBlindMan";
        game.nextPosition2 = "";
    }
    public void whoIsBlindMan(){
        ui.mainTextArea.setText("I'm just a humble craftsman\nI lived in the woods nearby.\n\nI escaped from my house while my wife fought the creatures.\nI came looking for help, but this town was already deserted.");
        ui.choice1.setText("Help wife");
        ui.choice2.setText("Leave alone");

        game.nextPosition1 = "helpWifeBlind";
        game.nextPosition2 = "";
    }
    public void helpWifeBlind(){
        ui.mainTextArea.setText("You head for the blind man's house\nwondering how he's able to remember the way without seeing.\n\nLeaving your town behind in flames.");
        ui.choice1.setText("To the forest");
        ui.choice2.setText("");

        game.nextPosition1 = "toWoodsWBlind";
        game.nextPosition2 = "";
    }
    public void toWoodsWBlind(){
        ui.mainTextArea.setText("You arrive to the woods\nyour dad and neighbors should be here too.\n\nBoth you and the blind man stay silent,\nyou know you aren't alone...");
        ui.choice1.setText("Uh?");
        ui.choice2.setText("");

        game.nextPosition1 = "remainsDadBattle";
        game.nextPosition2 = "";
    }
    public void remainsDadBattle(){
        ui.mainTextArea.setText("You find the remains of a battle\nmany of your neighbors lay on the floor dead\n next to the monsters they defeated.\n\nNo sign of your dad or any of his things.");
        ui.choice1.setText("Check tree");
        ui.choice2.setText("Check floor");

        game.nextPosition1 = "checkTreeBattle";
        game.nextPosition2 = "";
    }
    public void checkTreeBattle(){
        ui.mainTextArea.setText("On a tree near the bodies\na piece of paper written in red\nstapled to the trunk with an arrow.\n\n'Keep moving forward to the village south of here, kid.'-");
        ui.choice1.setText("Is it for me?");
        ui.choice2.setText("Is it dad's?");

        game.nextPosition1 = "paperTreeTrunk";
        game.nextPosition2 = "";
    }

    public void paperTreeTrunk(){
        ui.mainTextArea.setText("It looks written by your dad.\nHe must be in that village waiting for you.\n\nHe must have escaped, so you continue moving forward.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "walkToBlindsHouse";
        game.nextPosition2 = "";
    }
    public void walkToBlindsHouse(){
        ui.mainTextArea.setText("You continue following your companion.\nDeeper in the woods, you arrive to the blind man's house.");
        ui.choice1.setText("Open door");
        ui.choice2.setText("Let him open door");

        game.nextPosition1 = "openBlindsHouse";
        game.nextPosition2 = "";
    }
    public void openBlindsHouse(){
        ui.mainTextArea.setText("You open the old house's door. \nBehind it, a mutant undead appears. \n\nIt looks hungry.");
        monster = new Monster_MutantZombie();
        positionAfterBattle = "blindGetsBitten";
        ui.choice1.setText("fight");
        ui.choice2.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }
    public void blindGetsBitten(){
        ui.mainTextArea.setText("The monster is dead, but before dying it bit\nyour companion.\n\n'I'm ok, don't worry about it'- The blind man looks fine. \nBoth of you go in, looking for his wife.\nIt's dark inside.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "insideBlindsHouse";
        game.nextPosition2 = "";
    }
    public void insideBlindsHouse(){
        ui.mainTextArea.setText("There's many dead zombies inside.\n\nThe trail of bodies leads to a closed room.");
        ui.choice1.setText("Open");
        ui.choice2.setText("Knock");

        game.nextPosition1 = "blindsWifeRoom";
        game.nextPosition2 = "";
    }

    public void blindsWifeRoom(){
        ui.mainTextArea.setText("Inside of the room, there's an old woman with grey hair\nand blue spots painted under her eyes.\n\nShe looks as if she had fought a lot.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "blindsWifeOk";
        game.nextPosition2 = "";
    }
    public void blindsWifeOk(){
        ui.mainTextArea.setText("'Are you ok, Gris?'- The old man helps her up.\n\n'I'm fine, I'm fine. Just tired'- She answers.\n\n\n'Who's this kid you brought here?'-");
        ui.choice1.setText("I came to help");
        ui.choice2.setText("I'm a friend");

        game.nextPosition1 = "takebackBlindsHome";
        game.nextPosition2 = "";
    }
    public void takebackBlindsHome(){
        ui.mainTextArea.setText("'Well, there's another enemy upstairs'\n'I can hear its footsteps'\n'Think you can take care of him?'- The old woman leans toward you.");
        ui.choice1.setText("For sure");
        ui.choice2.setText("Not really");

        game.nextPosition1 = "enemyAtBlinds";
        game.nextPosition2 = "";
    }
    public void enemyAtBlinds(){
        ui.mainTextArea.setText("You run to the second floor.\nThe tiles of the stairs bending at every step you take.\n\nAt the end of the stairs, the biggest mutant zombie\nyou have seen yet, waits for you.");
        ui.choice1.setText("Jump and slash");
        ui.choice2.setText("Kick and stab");

        game.nextPosition1 = "blindsEnemySlash";
        game.nextPosition2 = "";
    }
    public void blindsEnemySlash(){
        ui.mainTextArea.setText("'Ching!'- You sword bounces off the mutant's thick skin.\nYou didn't even make a scratch on it.\n\nThe zombie jumps on you, trying to eat your face off.\nThe impact makes you both fall down the stairs.");
        player.hp -= 4;
        ui.hpLabelNumber.setText(""+player.hp);
        ui.choice1.setText("Stab side");
        ui.choice2.setText("Punch head");

        game.nextPosition1 = "blindsHelpYou";
        game.nextPosition2 = "";
    }
    public void blindsMutantRage(){
        ui.mainTextArea.setText("Once again, your swords edge slides off\nthe enemy's impenetrable skin, without even scratching it.\n\n\nThe crazy mutant gets on top of you trying\nto bite off your flesh.");
        ui.choice1.setText("Push off");
        ui.choice2.setText("Stab again");

        game.nextPosition1 = "pushBlindsEnemy";
        game.nextPosition2 = "";
    }
    public void pushBlindsEnemy(){
        ui.mainTextArea.setText("It doesn't matter what you try.\nYou can't harm the mutant with your sword, nor push him off.\n\nYour muscles bend to the pressure of the crazed cannibal.\nIt's teeth getting closer to your face.\nThe monster is about to feast on your meat.");
        ui.choice1.setText("HELP!!!!!");
        ui.choice2.setText("");

        game.nextPosition1 = "blindsHelpYou";
        game.nextPosition2 = "";
    }
    public void blindsHelpYou(){
        ui.mainTextArea.setText("The blind man and Gris, come to your rescue.\nGris's painted dots under her eyes, shine blue.\nThe zombie gets pretty close\nbut before he can bite you, Gris's hands start \nshinning blue too, and from the tip of her fingers she\n shoots a deathly beam of the same color.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "blueBeamMonster";
        game.nextPosition2 = "";
    }
    public void blueBeamMonster(){
        ui.mainTextArea.setText("The monster stops and stares at the beam\ncoming towards its face.\n\nWhen the beam reaches the zombie, its body melts and becomes only bones.");
        ui.choice1.setText("Thanks!");
        ui.choice2.setText("");

        game.nextPosition1 = "thanksGris";
        game.nextPosition2 = "";
    }
    public void thanksGris(){
        ui.mainTextArea.setText("Gris falls to the floor.\n\n'I've used too much forbidden magic today'\n'I'm done'- She whispers.\n\nThe blind man doesn't say a word, he seems very sick all of a sudden.");
        ui.choice1.setText("What do you mean?");
        ui.choice2.setText("What's forbidden magic?");

        game.nextPosition1 = "whatsForbiddenMagic";
        game.nextPosition2 = "";
    }
    public void whatsForbiddenMagic(){
        ui.mainTextArea.setText("'It's magic than can alter this reality'\n'defying the natural laws of the world'\n'but if you overuse it, you can inflict harm on yourself'\n\n'I'm dying, small hero, allow me to grant you a favor'\n'before my end'- she mutters.");
        ui.choice1.setText("What favor?");
        ui.choice2.setText("");

        game.nextPosition1 = "favorFromGris";
        game.nextPosition2 = "";
    }

    public void favorFromGris(){
        ui.mainTextArea.setText("'You tried to help us'\n'So its my way of saying thanks'\n'Your sword is weak, its purpose is not fighting'\n\n'So put it away, until you need it to fulfill your destiny.'");
        ui.choice1.setText("What destiny?");
        ui.choice2.setText("");

        game.nextPosition1 = "whatDestinyGris";
        game.nextPosition2 = "";
    }
    public void whatDestinyGris(){
        ui.mainTextArea.setText("'The sword is a key, for a door you are destined to open'\n'I will give you a better weapon for now.'\nGris hands turn blue once again, and from thin air,\na shinny sword appears.");
        ui.choice1.setText("What door?");
        ui.choice2.setText("");

        game.nextPosition1 = "whatDoorGris";
        game.nextPosition2 = "";
    }
    public void whatDoorGris(){
        ui.mainTextArea.setText("'It's your destiny, you'll find out'\n'without my help.'-\nShe hands you the shinny sword, warning you\nthe blade is cursed.\n\n\nYou receive 1 Cursed Blade");
        player.currentWeapon = new Weapon_CursedBlade();
        ui.weaponLabelName.setText(player.currentWeapon.name);
        ui.choice1.setText("Thank you");
        ui.choice2.setText("");

        game.nextPosition1 = "thanksSwordGris";
        game.nextPosition2 = "";
    }
    public void thanksSwordGris(){
        ui.mainTextArea.setText("You ask her if you can help her anymore\nperhaps you can find a way to heal her.\nBut it's no use, she just tells you to leave.");
        ui.choice1.setText("Go find help");
        ui.choice2.setText("Stay");

        game.nextPosition1 = "blindTurnsZombie";
        game.nextPosition2 = "";
    }
    public void blindTurnsZombie(){
        ui.mainTextArea.setText("There's no way you are leaving them behind here\nyou ask them to stand up and come with you.\n\nBut there's something wrong with the blind man.\nHe starts grinding his teeth, and growling.");
        ui.choice1.setText("Sir?");
        ui.choice2.setText("");

        game.nextPosition1 = "blindAttacks";
        game.nextPosition2 = "";
    }
    public void blindAttacks(){
        ui.mainTextArea.setText("Before you can stop him\nhe bites Gris neck, killing her.\n\nFuck, fuck, fuck! That poor old lady didn't deserve this.\nThe blind man faces you, screaming like crazy.");
        monster = new Monster_BlindZombieMutant();
        positionAfterBattle = "defeatBlindZombie";
        ui.choice1.setText("Fight");
        ui.choice2.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }
    public void defeatBlindZombie(){
        ui.mainTextArea.setText("With a hit of your cursed blade,\nyou finish the mutated old man.\n\nHe must have gotten infected when he got bit.\nYou run from the house, back to the woods.");
        ui.choice1.setText("Find village");
        ui.choice2.setText("Cry");

        game.nextPosition1 = "backFindVillage";
        game.nextPosition2 = "";
    }
    public void backFindVillage(){
        ui.mainTextArea.setText("You run through the dark woods, badly injured.\nYou can see shadows creep between the trees.\n\nWhat's all this nonsense about your destiny.\nA day ago, you were living a normal life.\nNow, nothing makes sense anymore.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "continueFindVillage";
        game.nextPosition2 = "";
    }
    public void continueFindVillage(){
        ui.mainTextArea.setText("You find a path and start following it.\n\nBut before long, the path turns into two,\nwhich one should you continue following?");
        ui.choice1.setText("Left path");
        ui.choice2.setText("Right path");

        game.nextPosition1 = "takeRightPath";
        game.nextPosition2 = "";
    }

    public void takeRightPath(){
        ui.mainTextArea.setText("You follow the right path.\nFrom the corner of your eye\nyou see someone running behind you.\n\nMore mutants are closing on you, with\n their red eyes shinning.");
        ui.choice1.setText("Faster");
        ui.choice2.setText("");

        game.nextPosition1 = "fasterRightPath";
        game.nextPosition2 = "";
    }
    public void fasterRightPath(){
        ui.mainTextArea.setText("Perhaps this wasn't the correct path\nyou run for a while, with the deathly creatures chasing you.\n\n\nBut wait!, there's a light up ahead!");
        ui.choice1.setText("Go there");
        ui.choice2.setText("");

        game.nextPosition1 = "reachGhostVillage";
        game.nextPosition2 = "";
    }
    public void reachGhostVillage(){
        ui.mainTextArea.setText("You get to a village, there's no one on the street\nbut there's a few houses with the lights on.\n\nYou reach the closest one, and start pounding the door.\n\n\nNo response.");
        ui.choice1.setText("Knock door down");
        ui.choice2.setText("Try other house");

        game.nextPosition1 = "knockDoorVillage";
        game.nextPosition2 = "";
    }

    public void knockDoorVillage(){
        ui.mainTextArea.setText("You kick the door down\nand get inside.\n\nThere's a big cabinet near at the house's entrance,\nyou move it to block the door frame.\n\nYou start blowing off all the candles\n and leave the house dark.");
        ui.choice1.setText("Wait in silence");
        ui.choice2.setText("Look around");
        game.nextPosition1 = "silenceInVillage";
        game.nextPosition2 = "";
    }
    public void silenceInVillage(){
        ui.mainTextArea.setText("Outside you hear them.\nBut they pass the house you are in\nand go to the other houses.\n\n\nYou were quick enough, and tricked them.\nBut they'll be back");
        ui.choice1.setText("Look around");
        ui.choice2.setText("");

        game.nextPosition1 = "lookRoundEmpty";
        game.nextPosition2 = "";
    }
    public void lookRoundEmpty(){
        ui.mainTextArea.setText("You check the rooms one by one\nthe house is empty.\nWhoever lived here left everything behind\n\nThere's food on top of the kitchen's table");
        ui.choice1.setText("Taste it");
        ui.choice2.setText("Leave it");

        game.nextPosition1 = "tasteFoodEmpty";
        game.nextPosition2 = "";
    }
    public void tasteFoodEmpty(){
        ui.mainTextArea.setText("It's cold, but still good\nit isn't spoiled, which means it wasn't long since\n the owners of the house left.");
        ui.choice1.setText("Stay and rest");
        ui.choice2.setText("");

        game.nextPosition1 = "stayRestEmpty";
        game.nextPosition2 = "";
    }
    public void stayRestEmpty(){
        ui.mainTextArea.setText("You decide to wait a bit\nfor the zombies to leave.\n\nEverything in the house seems intact\nno sign of struggle.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "houseIntact";
        game.nextPosition2 = "";
    }
    public void houseIntact(){
        ui.mainTextArea.setText("From the window you check the rest of the village\n\n\nThere's a big building in the middle of it,\nthe rest of it are houses.");
        ui.choice1.setText("Check houses");
        ui.choice2.setText("");

        game.nextPosition1 = "windowVillage";
        game.nextPosition2 = "";
    }
    public void windowVillage(){
        ui.mainTextArea.setText("There are three houses with the light on\ncounting the one you are in.\n\nYou decide to inspect them next.\nIt's been a while since you heard a sound from outside.");
        ui.choice1.setText("Check house 2");
        ui.choice2.setText("Check house 3");

        game.nextPosition1 = "checkCloseHouse";
        game.nextPosition2 = "checkFarHouse";
    }
    public void checkCloseHouse(){
        ui.mainTextArea.setText("Your wounds closed while you rested. Hp +20.\n\n\nLet's do this!!!!\nTo the house closest from here");
        positionAfterBattle = "getCloseHouse";
        player.hp = 20;
        ui.hpLabelNumber.setText(""+player.hp);
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "checkHouse2";
        game.nextPosition2 = "";
    }

    public void checkFarHouse(){
        ui.mainTextArea.setText("Your wounds closed while you rested. Hp +20.\n\n\nLet's do this!\nTo the house furthest away.");
        positionAfterBattle = "getFarHouse";
        player.hp = 20;
        ui.hpLabelNumber.setText(""+player.hp);
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "checkHouse3";
        game.nextPosition2 = "";
    }
    public void goNextHouse(){
        ui.mainTextArea.setText("You move the cabinet out of the way\nand exit the house.\nLooking both ways down the street, you see no sign of the undead. ");
        ui.choice1.setText("Get to the house");
        ui.choice2.setText("");

        game.nextPosition1 = positionAfterBattle;
        game.nextPosition2 = "";
    }
    public void getCloseHouse(){
        ui.mainTextArea.setText("Bam! You kick down the door of the closest house from you.\n\n'Anybody here???'- No response.\nEverything looks as if someone had just left.\n\nA cup of coffee rests on the living room table.");
        ui.choice1.setText("Shout again");
        ui.choice2.setText("Move on");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "";
    }
    public void getFarHouse(){
        ui.mainTextArea.setText("The door of the house furthest from you is not locked.\nYou open it and see a short and long shadow crawl from the \nentrance's floor to a window, and jump out.\nWhatever it was it left.\nThe house smells musty and sweet.");
        ui.choice1.setText("Look around");
        ui.choice2.setText("");

        game.nextPosition1 = "checkCentipedeHouse";
        game.nextPosition2 = "";

    }

    public void checkCentipedeHouse(){
        ui.mainTextArea.setText("Right where the shadow was\nthere's a young boy laying on the floor.\n\nHe seems paralyzed, but his heart still beats.\n\nYou shout at him and slap him, but he doesn't wake up.");
        ui.choice1.setText("Let him be");
        ui.choice2.setText("Stay with him");

        game.nextPosition1 = "stayWithBoy";
        game.nextPosition2 = "";
    }
    public void stayWithBoy(){
        ui.mainTextArea.setText("You stay with the boy.\nThe sky is turning pink, soon it will be night.\n\nYou guard the door silently, hoping that\nwhatever has the boy paralyzed will go away.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "boyWakesUp";
        game.nextPosition2 = "";
    }
    public void boyWakesUp(){
        ui.mainTextArea.setText("After a while, the boy starts twitching.\nSoftly, at first, but then he starts convulsing.\nEyes white, and a viscous substance, dark like tar, flowing down his nose.\n\n'Find the bug, Mama, I saw the bug come thru the window.'- The kid \nkeeps calling his mom.");
        ui.choice1.setText("Wake up!");
        ui.choice2.setText("What bug?");

        game.nextPosition1 = "boySpitsTar";
        game.nextPosition2 = "";
    }

    public void boySpitsTar(){
        ui.mainTextArea.setText("It's no use talking to the boy\nhe isn't fully awake.\n\nYou clean up the dark liquid from his ears, eyes and nose.\nIt keeps flowing out as the child mutters.\n\n'Behind you, Mom, the bug with many legs.'");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "boyBackToSleep";
        game.nextPosition2 = "";
    }

    public void boyBackToSleep(){
        ui.mainTextArea.setText("'I'll save you, Mom' \n'I won't let it take you away, like Papa'- The kid\nwent back to sleep, coughing up more black tar.\n");
        ui.choice1.setText("What the...?");
        ui.choice2.setText("");

        game.nextPosition1 = "leaveBoyHouse";
        game.nextPosition2 = "";
    }
    public void leaveBoyHouse(){
        ui.mainTextArea.setText("The shadow you saw, might be the bug\nhe's talking about.\n\nYou take him to a bed upstairs, and close all windows.\n\nWhile he recovers, you decide to take a look at the\nvillage's main building.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "toMainVBuilding";
        game.nextPosition2 = "";
    }
    boyWakesUp boySpitsTar boyBackToSleep leaveBoyHouse toMainVBuilding openVillageHall

    public void toMainVBuilding(){
        ui.mainTextArea.setText("It's getting darker, but there's no sign of mutants.\n\nYou head out of the boy's house, and walk\n to what you assume is the town hall.");
        ui.choice1.setText("Open door");
        ui.choice2.setText("Knock on door");

        game.nextPosition1 = "openVillageHall";
        game.nextPosition2 = "";
    }
    public void openVillageHall(){
        ui.mainTextArea.setText("The door is open.\nPast the entrance, there's a big room full of desks.\n\nThere's writing utensils on top of the desks, and bottles of ink\nyou walk past them to the next room.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "pastDeskRoom";
        game.nextPosition2 = "";
    }
    public void pastDeskRoom(){
        ui.mainTextArea.setText("There's no candles lit inside.\nOnly the bright moonlight coming thru the windows, guides you.\n\nIt seems like this building was a place for gathering\nwith plenty of chairs and tables\nto fit the whole town.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "intoHallsHall";
        game.nextPosition2 = "";
    }
    public void intoHallsHall(){
        ui.mainTextArea.setText("Past the big gathering room\nthere's a hallway, leading to a smaller room.\n\nNo sound, other than the wind howling outside.");
        ui.choice1.setText("Follow hallway");
        ui.choice2.setText("Leave");

        game.nextPosition1 = "followHallway";
        game.nextPosition2 = "";
    }
    public void followHallway(){
        ui.mainTextArea.setText("You get to the small room\nit has 6 cells made of iron bars.\nThis must be the town's jail.\n\nThere's only one prisoner, he isn't moving.");
        ui.choice1.setText("Hello?");
        ui.choice2.setText("Leave");

        game.nextPosition1 = "prisonerCentipede";
        game.nextPosition2 = "";
    }
    public void prisonerCentipede(){
        ui.mainTextArea.setText("'Uh?, who goes there?'\n'Oh, its you!!!'\n\n'Come closer, kid'\n'Let me out of here!'");
        ui.choice1.setText("Why are you here?");
        ui.choice2.setText("");

        game.nextPosition1 = "prisonExplain";
        game.nextPosition2 = "";
    }
    public void prisonExplain(){
        ui.mainTextArea.setText("'I didn't do anything'\n'I just helped a prisoner escape'\n'I used to be the guard of this jail'\n\n'The old man I helped was a sorcerer, and cursed the town'\n'everyone blamed me for letting him go'");
        ui.choice1.setText("How can I trust you?");
        ui.choice2.setText("");

        game.nextPosition1 = "prisonRecords";
        game.nextPosition2 = "";
    }
    public void prisonRecords(){
        ui.mainTextArea.setText("'Check those papers on the wall'\n'they have a list of the prisoners and their crimes'\n'Those are the prison's records'");
        ui.choice1.setText("Read Prison records");
        ui.choice2.setText("");

        game.nextPosition1 = "readPrisonRecords";
        game.nextPosition2 = "";
    }
    public void readPrisonRecords(){
        ui.mainTextArea.setText("Hanged in the wall there's 6 written\nrecords.");
        ui.choice1.setText("Read first record");
        ui.choice2.setText("");

        game.nextPosition1 = "recordsFirst";
        game.nextPosition2 = "";
    }
    public void recordsFirst(){
        ui.mainTextArea.setText("'Canelo Spring'\n'Crimes: Plotting to overthrow city council.'\n'Hoarding weapons, for using against the council.'- The paper says.\n\n'Sentence: 1 year on cell number one.'\nThere's no one on that cell.");
        ui.choice1.setText("Next");
        ui.choice2.setText("");

        game.nextPosition1 = "recordsSecond";
        game.nextPosition2 = "";
    }
    public void recordsSecond(){
        ui.mainTextArea.setText("There's nothing written on the record\nfor cell two.\n\nThere's no one there anyways.");
        ui.choice1.setText("Next");
        ui.choice2.setText("");

        game.nextPosition1 = "recordsThird";
        game.nextPosition2 = "";
    }
    public void recordsThird(){
        ui.mainTextArea.setText("'Rubio Icos'\n'Crimes: Defecating on the street, during daytime hours.'\n\n'Sentence: 1 week on cell number three.'\nHis cell is right next to the Guard's cell.\nIn the third cell there's a dead person, must be him.");
        ui.choice1.setText("Next one");
        ui.choice2.setText("");

        game.nextPosition1 = "recordsFourth";
        game.nextPosition2 = "";
    }
    public void recordsFourth(){
        ui.mainTextArea.setText("'Cornelio No-Last-Name'\n'Crimes: Dark sorcery with intent of harming.'\n'Cursing the town with witchcraft.'\n\nSentence: Death. Cell number four.\nThe iron bars of that cell melted, leaving the cell open..");
        ui.choice1.setText("Cell five");
        ui.choice2.setText("");

        game.nextPosition1 = "recordsFifth";
        game.nextPosition2 = "";
    }
    public void recordsFifth(){
        ui.mainTextArea.setText("'Tom River'\n'Crimes: Letting a dangerous prisoner escape while on guard'\n'Sentence: 1 month on cell number five.'\n\nThis is the cell where the guard should be at.\nBut it's empty, the guard is on the cell number 6");
        ui.choice1.setText("Cell number six");
        ui.choice2.setText("");

        game.nextPosition1 = "recordsSixth";
        game.nextPosition2 = "";
    }
    public void recordsSixth(){
        ui.mainTextArea.setText("'Jonah 'The builder''\n'Crimes: Murder by strangulation of 3 villagers.'\n'Killing for no reason, just madness.'\n'Sentence: Death. Cell number six.'\n\n'In cell number six, the man that said was the guard, smiles at you.'");
        ui.choice1.setText("Talk to him");
        ui.choice2.setText("");

        game.nextPosition1 = "talkPossibleMurderer";
        game.nextPosition2 = "";
    }
    public void talkPossibleMurderer(){
        ui.mainTextArea.setText("'Hey'- you go back to the prisoner.\n'What was your name again?' -You ask\n'My name is Tom, last name is River'- He answers smiling.");
        ui.choice1.setText("What happened here?");
        ui.choice2.setText("Where's everyone?");

        game.nextPosition1 = "";
        game.nextPosition2 = "";
    }
    public void freePrisoner(){
        ui.mainTextArea.setText("");
        ui.choice1.setText("Wake up!");
        ui.choice2.setText("What bug?");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "";
    }
    public void freePrisoner(){
        ui.mainTextArea.setText("");
        ui.choice1.setText("Wake up!");
        ui.choice2.setText("What bug?");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "";
    }
    public void talkPossibleMurderer(){
        ui.mainTextArea.setText("'Hey'- you go back to the prisoner.\n'What was your name again?' -You ask.\n'My name is Tom, last name is River'- He answers smiling.");
        ui.choice1.setText("What happened here?");
        ui.choice2.setText("Where's everyone?");

        game.nextPosition1 = "happenedVillage";
        game.nextPosition2 = "wheresVillagePPL";
    }
    public void happenedVillage(){
        ui.mainTextArea.setText("'You mean the town?'\n'After the wizard escaped, people started seeing a creature'\n'co");
        ui.choice1.setText("Wake up!");
        ui.choice2.setText("What bug?");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "";
    }
    public void leavePrisoner(){
        ui.mainTextArea.setText("");
        ui.choice1.setText("Wake up!");
        ui.choice2.setText("What bug?");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "";
    }
    public void boyWakesUp(){
        ui.mainTextArea.setText("");
        ui.choice1.setText("Wake up!");
        ui.choice2.setText("What bug?");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "";
    }
    public void boyWakesUp(){
        ui.mainTextArea.setText("");
        ui.choice1.setText("Wake up!");
        ui.choice2.setText("What bug?");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "";
    }
    public void boyWakesUp(){
        ui.mainTextArea.setText("");
        ui.choice1.setText("Wake up!");
        ui.choice2.setText("What bug?");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "";
    }
    public void boyWakesUp(){
        ui.mainTextArea.setText("");
        ui.choice1.setText("Wake up!");
        ui.choice2.setText("What bug?");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "";
    }
    public void boyWakesUp(){
        ui.mainTextArea.setText("");
        ui.choice1.setText("Wake up!");
        ui.choice2.setText("What bug?");

        game.nextPosition1 = "goBackHome";
        game.nextPosition2 = "";
    }
//    public void enemyAtBlinds(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("goBackHome");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "goBackHome";
//        game.nextPosition2 = "";
//    }
//    public void enemyAtBlinds(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("goBackHome");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "goBackHome";
//        game.nextPosition2 = "";
//    }
//    public void enemyAtBlinds(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("goBackHome");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "goBackHome";
//        game.nextPosition2 = "";
//    }
//    public void enemyAtBlinds(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("goBackHome");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "goBackHome";
//        game.nextPosition2 = "";
//    }











    public void forestDad(){
        ui.choice1.setForeground(Color.white);
        ui.choice2.setForeground(Color.white);
        ui.mainTextArea.setText("You can barely see anything, you walk to the forest, \n  a long time passes until you reach the first pine trees. \n 'To rescue my friends and family!'-You shout \n \n \n Like a hero from a prophecy you begin your journey!'");
        ui.choice1.setText("TO THE RESCUE");
        ui.choice2.setText("LET'S GO!");

        game.nextPosition1 = "forestDadPicture";
        game.nextPosition2 = "forestDadPicture";
    }
    public void forestDadPicture(){
        vm.showPicture();
        ui.image = new ImageIcon(".//res//darkForest.jpg");
        ui.pictureLabel.setIcon(ui.image);

        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "deathPinetrees";
        game.nextPosition2 = "";
    }
    public void deathPinetrees(){
        vm.showGameScreen();
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

        ui.mainTextArea.setText("'You must leave NOW! \n More monsters are coming, we'll distract them' \n  'Aye!', everyone agrees. \n 'Get to safety' \n \n \n You start running as terrible creatures come close to the villagers'");
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

        game.nextPosition1 = "arriveCultPicture";
        game.nextPosition2 = "";
    }
    public void arriveCultPicture(){
        vm.showPicture();
        ui.image = new ImageIcon(".//res//cultTown.jpg");
        ui.pictureLabel.setIcon(ui.image);

        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "arriveCult";
        game.nextPosition2 = "";
    }
    public void arriveCult(){
        vm.showGameScreen();
        ui.mainTextArea.setText("An elder man awaits at the gate of \n a small community of houses. \n 'Help!' You shout");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "cultIntro";
        game.nextPosition2 = "";
    }
        public void cultIntro(){
        ui.mainTextArea.setText("You introduce yourself and ask for help with \n  your wounds. \n The old man asks you if you'd like to join his religion in exchange \n for medicine and food. \n\n\nWhat a strange request. \n This religion doesn't seem like the normal kind");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "cultSecondIntro";
        game.nextPosition2 = "";
    }
    public void cultSecondIntro(){
        ui.mainTextArea.setText("'The people that live here, answer to only one god' \n 'No blasphemers will be allowed in!' \n 'You must join us if you want asylum.'- The elder continues \n\n Will you join this town's religion?");
        ui.choice1.setText("Yes");
        ui.choice2.setText("No");

        game.nextPosition1 = "cultAccept";
        game.nextPosition2 = "cultDeny";
    }
    public void cultAccept(){
        ui.mainTextArea.setText("'Welcome, welcome!' \n\n 'Everybody will be pleased with your arrival.' \n 'Let me help you'- The elder walks you inside the town. \n\n The darkness that was chasing you, stayed at the town's gate \n but you wonder if there's a worse kind of darkness in this town.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "cultTown";
        game.nextPosition2 = "";
    }
    public void cultTown(){
        ui.mainTextArea.setText("You get to the church. \n Inside, a group of women and men greet you in long robes.\n \n They are dressed like wizards, and are chanting something. \n You get to a room where the elder instructs you to \n spend the night.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "cultChurch";
        game.nextPosition2 = "";
    }

    public void cultChurch(){
        ui.mainTextArea.setText("It's so dark in here. \n\n Outside the elders keep chanting. \n\n What must have happened to dad and the others?\n You lay on the floor.");
        ui.choice1.setText("They are fine");
        ui.choice2.setText("They died");

        game.nextPosition1 = "theyAreFine";
        game.nextPosition2 = "theyAreNotFine";
    }

    public void theyAreFine(){
        ui.mainTextArea.setText("You are right. \n They must be fine. \n You gotta get this weird people to help you kill the monsters \n in your hometown and save everyone. \n\n You feel sleepy.");
        ui.choice1.setText("sleep");
        ui.choice2.setText("stay awake");

        game.nextPosition2 = "stayAwakeCult";
    }
    public void stayAwakeCult(){
        ui.mainTextArea.setText("You try to stay awake. \n But you are too tired. \n\n After a while passes, you start catching \n yourself with your eyes closed.");
        ui.choice1.setText("sleep");
        ui.choice2.setText("");

        game.nextPosition1 = "sleepCultTown";
        game.nextPosition2 = "";
    }
    public void sleepCultTown(){
        ui.mainTextArea.setText("It might be too late already. \n There were a lot of bizarre creatures on that forest. \n \n You start to fall asleep remembering the terrible events.");
        positionAfterBattle = "awakeCultTown";
        ui.choice1.setText("Zzzzzzz");
        ui.choice2.setText("");

        game.nextPosition1 = "nightmareFirstNight";
        game.nextPosition2 = "";
    }

    public void nightmareFirstNight(){
        ui.mainTextArea.setText("      .................................................... \n a creature that looks like a hairless green tiger, \n a fire breathing salamander and \n a giant of one eye, all surround your family.\n           ....................................................");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "secondPartNightmare";
        game.nextPosition2 = "";
    }
    public void secondPartNightmare(){
        ui.mainTextArea.setText("      .................................................... \n you are certain those were three of the many\n monsters surrounding them, \n you hope they can hold up a bit longer. \n \n You will save your family.\n       .................................................... ");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "lastPartNightmare";
        game.nextPosition2 = "";
    }
    public void lastPartNightmare(){
        ui.mainTextArea.setText("      .................................................... \n Then you see it. \n \n Behind the trees, a white lizard the size of a house\nwith shinning red eyes. \n The ultimate monster, one you can't possibly defeat.\n It's about to maul them like a lion.\n       .................................................... ");
        ui.choice1.setText("Fight");
        ui.choice2.setText("");

        game.nextPosition1 = positionAfterBattle;
        game.nextPosition2 = "";
    }
    public void awakeCultTown(){
        ui.mainTextArea.setText("-AAAAAAAAAH!- You awake shouting.\n \n Someone knocks on the room door to check on you. \n It's an elder woman with a kind face.");
        ui.choice1.setText("Sorry");
        ui.choice2.setText("");

        game.nextPosition1 = "topWizard";
        game.nextPosition2 = "";
    }
  public void topWizard(){
        ui.mainTextArea.setText("'What happened? You had a nightmare?'- \n The lady introduces herself as the chief wizard \n of this town. \n \n She promises to teach you magic.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "niceTopWizard";
        game.nextPosition2 = "";
    }
    public void niceTopWizard(){
        ui.mainTextArea.setText("She seems alright. \n You follow her to the church's kitchen. \n You have some breakfast there and tell her what happened.");
        ui.choice1.setText("Can you help me?");
        ui.choice2.setText("");

        game.nextPosition1 = "helpTopWizard";
        game.nextPosition2 = "";
    }

    public void helpTopWizard(){
        ui.mainTextArea.setText("'Of course we'll help you take back your town \nfrom those monsters. \n \n \n We need to make a spell tonight that help us defeat them.");
        ui.choice1.setText("Let's do it");
        ui.choice2.setText("What's the spell?");

        game.nextPosition1 = "letsDoTheSpell";
        game.nextPosition2 = "whatsTheSpell";
    }    public void whatsTheSpell(){
        ui.mainTextArea.setText("'Oh, it's a spell of strength. It will make us strong for battle'- \n\n But I need some ingrediants for the spell.");
        ui.choice1.setText("I can get them");
        ui.choice2.setText("What do you need?");

        game.nextPosition1 = "letsDoTheSpell";
        game.nextPosition2 = "letsDoTheSpell";
    }
    public void letsDoTheSpell(){
        ui.mainTextArea.setText("'Alright, I need three human skulls to make the spell'-\n You look at her very serious, what did she say?. \n \n 'But you won't get them from actual humans' \n 'There's a swamp near here. In there, human bones walk by themselves \n without a soul.'- \n\nPeople call them zombies.'");
        ui.choice1.setText("I can't do that");
        ui.choice2.setText("I can't fight");

        game.nextPosition1 = "heresAWand";
        game.nextPosition2 = "";
    }    public void heresAWand(){
        ui.mainTextArea.setText("Nonsense, I'll show you something. \n \n From a box made of metal \n she gets what looks like a  wand. \n \n The wand glows purple.\n She hands it to me!");
        ui.choice1.setText("For me?");
        ui.choice2.setText("Grab it");

        game.nextPosition1 = "getPurpleWand";
        game.nextPosition2 = "";
    }    public void getPurpleWand(){
        player.currentWeapon = new Weapon_SmallWand();
        player.hp = 100;
        ui.hpLabelNumber.setText(""+player.hp);
        ui.weaponLabelName.setText(player.currentWeapon.name);
        ui.mainTextArea.setText("I hold it in my hand firmly. \n \n 'Say Hei Hu'- The elder tells me. \n I repeat the words, and from the tip of the wand \n a tiger small like a fist comes out \n\n It's made of smoke and smelled like incense. ");
        ui.choice1.setText("woah");
        ui.choice2.setText("");

        game.nextPosition1 = "laiFu";
        game.nextPosition2 = "";
    }    public void laiFu(){
        ui.mainTextArea.setText("'Now say: lai fu'- She instructs.");
        ui.choice1.setText("Lai Fu");
        ui.choice2.setText("LAI FU!");

        game.nextPosition1 = "sayLaiFu";
        game.nextPosition2 = "";
    }    public void sayLaiFu(){
        ui.mainTextArea.setText("A smoke dragon no bigger than a cat flied away \n from the tip of your wand. \n \n \n The wizard tells you to practice until \n the creatures that appear aren't made of smoke. \n \n Then you can go get the skulls.");
        ui.choice1.setText("Practice");
        ui.choice2.setText("Go fight");

        game.nextPosition1 = "practiceMagic";
        game.nextPosition2 = "";
    }    public void practiceMagic(){
        ui.mainTextArea.setText("You try and try again. \n 'Lai fu, hei hu. Lai fu, hei hu'- \n After an hour you shout. \n 'HEI HU!!!'- \n \n This time it works. And a tiger made of glass \n shatters against the room's wall.");
        ui.choice1.setText("Holy shit!");
        ui.choice2.setText("");
        game.nextPosition1 = "crystalTiger";
        game.nextPosition2 = "";
    }
  public void crystalTiger(){
        ui.mainTextArea.setText("'Congratulations, you are ready.' \n 'Follow the path to the cemetery.' \n 'Once you pass it, you'll be in the swamp' \n \n 'Bring me what I ask, and we'll help you \n rescue your family.'");
        ui.choice1.setText("Yes");
        ui.choice2.setText("AYE");

        game.nextPosition1 = "goCemetery";
        game.nextPosition2 = "goCemetery";
    }
    public void goCemetery(){
        ui.mainTextArea.setText("You go outside of the church, towards the town's gate \n \n And just like the elder said, there's a path leading down a hill\n You follow it, only armed with your wand");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "mistyPath";
        game.nextPosition2 = "";
    }
    public void mistyPath(){
        ui.mainTextArea.setText("Mist starts building up around the path. \n \n It's a sauna in here. \n\n You get to the cemetery. \nThere's only a couple headstones for the tombs.\n There's a few dug out holes with nothing inside. ");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "passingTheCemetery";
        game.nextPosition2 = "";
    }
    public void passingTheCemetery(){
        monster = new Monster_ZombieSkeleton();
        positionAfterBattle = "secondZombie";
        ui.mainTextArea.setText("The ground beneath you starts \n getting muddier as you advance. \n \n You can barely see in this mist. \n But you see a human silhouette up ahead.");
        ui.choice1.setText("Yell at it");
        ui.choice2.setText("Attack it");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "fight";
    }

    public void secondZombie(){
        monster = new Monster_ZombieSkeleton();
        positionAfterBattle = "mutantZombie";
        ui.mainTextArea.setText("You did it! You are unstoppable with a wand! \n One is down, two to go. \n On the distance you see another one. \n \n Prepare for another fight!!! ");
        ui.choice1.setText("Let's go!");
        ui.choice2.setText("Attack");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }
    public void mutantZombie(){
        monster = new Monster_MutantZombie();
        positionAfterBattle = "threeSkulls";
        ui.mainTextArea.setText("That second one went down faster. \n \n This is easy, you got two skulls. \n Zombies don't seem scary anymore. \n In the distance, a third shadow approaches. \n This one is very tall. ");
        ui.choice1.setText("For Dad!");
        ui.choice2.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }

    public void threeSkulls(){
        ui.mainTextArea.setText("You got the three skulls! \n That last one was a bit more complicated to get... \n \n \n Deeper in the swamp you see three more zombies. \n No, wait. Four more zombies. \n More are coming, 6, 7, 8, 9 zombies...");
        ui.choice1.setText("Run!");
        ui.choice2.setText("Fight!");

        game.nextPosition1 = "runFromSwamp";
        game.nextPosition2 = "fightInSwamp";
    }
    public void runFromSwamp(){
        ui.mainTextArea.setText("Time to go! \n You speed up and leave the swamp behind, going uphill. \n\n You past the cemetery and find the path. \n\n\n The gate is  just ahead. You barely made it.");
        ui.choice1.setText("Open up!");
        ui.choice2.setText("");

        game.nextPosition1 = "cultTownComeback";
        game.nextPosition2 = "";
    }
    public void cultTownComeback(){
        ui.mainTextArea.setText("For a second time you get to the gate \n exhausted and wounded. \n\n Everyone smiles seeing you brought the skulls. \n You meet up with the chief inside the church.");
        ui.choice1.setText("I did it!");
        ui.choice2.setText("Hand skulls to her");

        game.nextPosition1 = "iKilledTheZombies";
        game.nextPosition2 = "";
    }
    public void iKilledTheZombies(){
        ui.mainTextArea.setText("The chief smiles. \n \n'Excellent, we must go to the monolith now!' \n\n 'Before we go, would you like to learn more magic?' \n 'I must warn you, this other kind is a bit more dark...'-");
        ui.choice1.setText("What's a monolith?");
        ui.choice2.setText("How dark?");

        game.nextPosition1 = "whatsMonolith";
        game.nextPosition2 = "howDarkMagic";
    }
    public void whatsMonolith(){
        ui.mainTextArea.setText("'A monolith is an old giant rock, its close to our town' \n\n\n 'It was in this land way before humans got here' \n 'It has great power, and we'll use it to complete the spell.'- ");
        ui.choice1.setText("Why is it special?");
        ui.choice2.setText("Where is it?");

        game.nextPosition1 = "whyMonolithPower";
        game.nextPosition2 = "wheresMonolith";
    }
    public void wheresMonolith(){
        ui.mainTextArea.setText("'The monolith is just outside of our town'\n'in the woods' \n\n 'It taught us how to do magic.' \n'And will know how to finish the spell.'- The wizard says.");
        ui.choice1.setText("Let's go");
        ui.choice2.setText("");

        game.nextPosition1 = "letsGoMonolith";
        game.nextPosition2 = "";
    }

    public void whyMonolithPower(){
        ui.mainTextArea.setText("'We walked upon it, while walking around the woods.' \n\n'We found what could be described as a giant stone pillar.' \n 'A stone rectangle glowing purple'\n'It gave us the knowledge to build magical items'.\n 'and make magic'.-\n'");
        ui.choice1.setText("Let's go");
        ui.choice2.setText("");

        game.nextPosition1 = "letsGoMonolith";
        game.nextPosition2 = "";
    }
    public void letsGoMonolith(){
        ui.mainTextArea.setText("'Right, but before we go. \n Would you like to learn more magic? \n \n It will change you, but you'll gain great power...");
        ui.choice1.setText("How dark is it?");
        ui.choice2.setText("");

        game.nextPosition1 = "howDarkMagic";
        game.nextPosition2 = "";
    }
     public void howDarkMagic(){
        ui.mainTextArea.setText("The wizard looks at you in the eyes. \n 'Listen kid, you have potential.' \n 'I can teach you more, but it will change who you are.' \n\n 'You'll gain great power, but are you ready to make the necessary sacrifices?'.");
        ui.choice1.setText("Teach me");
        ui.choice2.setText("No, thanks");

        game.nextPosition1 = "learnMoreSpells";
        game.nextPosition2 = "";
    }    public void learnMoreSpells(){
        ui.mainTextArea.setText("'Say with me: kayu!'- The wizard yells. \n You repeat it, and your wand shoots an blue cross forward. \n\n 'This spell will cause insufferable pain to your enemies.'- \n The wizard clarifies.\n\n 'Now say: oro!'- ");
        ui.choice1.setText("oro");
        ui.choice2.setText("ORO!");

        game.nextPosition1 = "oroExecuted";
        game.nextPosition2 = "";
    }

    public void oroExecuted(){
        ui.mainTextArea.setText("You say the magic word. \n And nothing comes out of the wand. \n\n But your left hand started to feel weird. \nIt turned dark purple, and your fingers and nails grew very long. \n\n Now it looks like a monster's claw.");
        ui.choice1.setText("Shit");
        ui.choice2.setText("What the hell is this?");

        game.nextPosition1 = "monsterHandClaw";
        game.nextPosition2 = "";
    }
    public void monsterHandClaw(){
        ui.mainTextArea.setText("The wizard looks at you entertained. \n She shows you her left hand which she always kept in her robe's\n pocket. \n \n \nIt's a claw identical to yours. \n\n 'I told you it was dark, now you can attack monsters as if you were one.'-");
        ui.choice1.setText("Shit");
        ui.choice2.setText("");

        game.nextPosition1 = "goingToMonolith";
        game.nextPosition2 = "";
    }
    public void goingToMonolith(){
        ui.mainTextArea.setText("'Let's go!'- The wizard starts walking without giving much importance to what happened.\n\n You follow the wizard and the rest of the people into the woods. \n\n It doesn't matter what it costs you, you will make them\n rescue your family.");
        ui.choice1.setText("Go into woods");
        ui.choice2.setText("");

        game.nextPosition1 = "goWoodsMonolith";
        game.nextPosition2 = "";
    }




    public void goWoodsMonolith(){
        ui.mainTextArea.setText("This dark forest is in the opposite direction from your hometown. \n You follow in silence.\n\n\n Up ahead, very far away you start seeing a giant stone rectangle.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "arriveMonolith";
        game.nextPosition2 = "";
    }


    public void arriveMonolith(){
        ui.mainTextArea.setText("You walk until you are in front of it. \n\n On the rock there are symbols carved.\n They look very strange and old. \n\n The chief wizard lights a fire in front of it.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "arriveMonolithPicture";
        game.nextPosition2 = "";
    }
    public void arriveMonolithPicture(){
        vm.showPicture();
        ui.image = new ImageIcon(".//res//mononlith.jpg");
        ui.pictureLabel.setIcon(ui.image);

        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "walkUpToMonolith";
        game.nextPosition2 = "";
    }

    public void walkUpToMonolith(){
        vm.showGameScreen();
        ui.mainTextArea.setText("'The carvings are in an old language.' \n 'The same you use for spells with your wand.'- The chief explains. \n The woman puts the skulls on the fire in front of the stone.\n\n\n The fire turns green. and the stone starts emitting light. \n Everybody from the town is gathered in a circle around the 4-meter stone");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "creepyCultScene";
        game.nextPosition2 = "";
    }
    public void creepyCultScene(){
        ui.mainTextArea.setText("'Now child, I'll let you become my apprentice.' \n 'You only have to complete one task first.' \n\n 'Bring her here!'- She shouts. \n And a couple of villagers in dark clothes and masks,\n bring by the arm an almost adult girl.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "creepyCultApprentice";
        game.nextPosition2 = "";
    }
    public void creepyCultApprentice(){
        ui.choice1.setForeground(Color.red);
        ui.choice2.setForeground(Color.green);

        ui.mainTextArea.setText("'If you want ultimate power to save your family' \n 'You must make an offering to Bathmeth, our god.' \n \n 'Use your claw to sacrifice her, feed her to the flames, \nand you'll be more than powerful enough\n to take your hometown back from the monsters!.-'");
        ui.choice1.setText("Sacrifice girl");

        ui.choice2.setText("Attack the wizard");


        game.nextPosition1 = "sacrificeGirl";
        game.nextPosition2 = "attackChiefWizard";
    }
    public void sacrificeGirl(){
        ui.mainTextArea.setText("You walk towards the girl. \n You don't know why you decided this.\n \n ");
        ui.choice1.setText("");
        ui.choice1.setText("");
        game.nextPosition1 = "";
        game.nextPosition1 = "";


    }


    public void attackChiefWizard(){
        ui.mainTextArea.setText("You stand in front of the green fire \n\n the girl is sobbing silently, with a blank look in her face \n\nShe is terrified of your claw. \n\n\n The chief wizard is standing next to you.");
        ui.choice1.setText("Let's do this!");
        ui.choice2.setText("");

        game.nextPosition1 = "fightChiefWizard";
        game.nextPosition2 = "";
    }
    public void fightChiefWizard(){
        ui.mainTextArea.setText("To her surprise you lift your wand in the chief's direction. \n\n 'CAYU!'- A red cross shoots at the chief's head, and makes a cross \n shaped burn in her face.\n\n  'Aaah'- The chief falls to the ground.");
        ui.choice1.setText("CAYU!");
        ui.choice2.setText("LAIFU!");

        game.nextPosition1 = "secondAttackWizard";
        game.nextPosition2 = "";
    }
    public void secondAttackWizard(){
        ui.mainTextArea.setText("She dodges your spell by jumping to the side. \n\n She stands up and shouts. 'LAIFU!'-\n\n A dragon made of jade comes out of her wand. \nWith sharp jade teeth.\n\n It bites off a chunk of meat from your arm.");
        ui.choice1.setText("CAYUUU!!!!");
        ui.choice2.setText("LAIFUUUU!!!");

        game.nextPosition1 = "thirdAttackWizard";
        game.nextPosition2 = "";
    }
    public void thirdAttackWizard(){
        ui.mainTextArea.setText("A green fire ball shoots out in direction of your opponent \n the wizard is talking the old language. \n\n But your spell is special. \n It resists, whatever spell the wizard sent its way.\nThe fireball continues its course and impacts on the chief's side.");
        ui.choice1.setText("Free girl");
        ui.choice2.setText("Attack again");

        game.nextPosition1 = "freeGirl";
        game.nextPosition2 = "";
    }

    public void freeGirl(){
        ui.mainTextArea.setText("You head towards the girl\n \n Shooting green blasts in every direction. \n Your power is vast. \n\n You don't know what's creepier, the sketchy mask wearing \n cult members, surrounding you, or the fact that you've noticed the green \n fire acts as an eye for whatever is sealed \n inside the monolith.");
        ui.choice1.setText("Face the fire");
        ui.choice2.setText("Face the cult");

        game.nextPosition1 = "faceMonolithFire";
        game.nextPosition2 = "";
    }
    public void faceMonolithFire(){
        ui.mainTextArea.setText("The green flames in front of the monolith follow your movements. \n The fire leans in whatever direction you are moving. \n\n It has started to expand towards the body of the chief. \nBurning the grass on its path.\n\nIn the center of the fire, you think you can see an eye floating.\nThe cult members get closer.");
        ui.choice1.setText("Shoot at it");
        ui.choice2.setText("Fight cult");

        game.nextPosition1 = "monolithFireExpands";
        game.nextPosition2 = "";
    }
    public void monolithFireExpands(){
        ui.mainTextArea.setText("You shoot a blast to it. \n Nothing happens. \n\n\nThe flames are getting bigger and tuned hotter. \n The cult members stay silent, hypnotized by it.");
        ui.choice1.setText("Attack them");
        ui.choice2.setText("Flee without girl");

        game.nextPosition1 = "destroyCultMembers";
        game.nextPosition2 = "";
    }    public void destroyCultMembers(){
        ui.mainTextArea.setText("The cult members start talking the language. \n\nThe green fire devours whoever is close to it, growing wider and wider. \n\n\n A very large cloud of smoke is coming out of the Monolith now. \n And the night's sky is witness to the birth \nof a giant dark purple toad that crawls out of the Monolith's top.");
        ui.choice1.setText("What the...?");
        ui.choice2.setText("Shoot at it");

        game.nextPosition1 = "giantToadMonster";
        game.nextPosition2 = "";
    }    public void giantToadMonster(){
        ui.mainTextArea.setText("You try moving. \n But the size of this monster from a different dimension is so terrifying. \n You remain paralyzed.\n\n It swallows with only one bite a whole cult member.\nIt makes the most terrible sound while it chews. \n\n BATHMETH, RISES FROM THE GREAT MONOLITH.");
        ui.choice1.setText("I have to move...");
        ui.choice2.setText("");

        game.nextPosition1 = "fleeToadMonster";
        game.nextPosition2 = "";
    }
    public void fleeToadMonster(){
        ui.mainTextArea.setText("The giant toad monster rips another cultist to pieces.\n \nTime to go, you see the toad devour the girl they were about to sacrifice to him. \nShe seemed like the only innocent person in the whole town.\n\nYou run as fast as your feet can run from that terrible monster. ");
        ui.choice1.setText("This sucks");
        ui.choice2.setText("Shit");

        game.nextPosition1 = "escapeFromMonolith";
        game.nextPosition2 = "";
    }
    public void escapeFromMonolith(){
        ui.mainTextArea.setText("You run away hoping you aren't followed.\n\n What was that nonsense?. \n\nWhy would these people do this? \n\n");
        ui.choice1.setText("They went crazy");
        ui.choice2.setText("The stone controlled them");

        game.nextPosition1 = "escapeMonolithTwo";
        game.nextPosition2 = "";
    }
    public void escapeMonolithTwo(){
        ui.mainTextArea.setText("That was the worst. \n And now you have to look for someone else to help you rescue your dad.\n\n You are tired of feeling lost and running without knowing \n where you are going.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "thirdEscapeMonolith";
        game.nextPosition2 = "";
    }
    public void thirdEscapeMonolith(){
        ui.mainTextArea.setText("You start feeling a sharp pain in your heart.\n\n 'Aaaagh'- You slow down because of the pain. \n\n Somehow you know the toad finished eating the cult.\n\nIt must be on its way to capture you.");
        ui.choice1.setText("Stop and rest");
        ui.choice2.setText("Continue running");

        game.nextPosition1 = "restEscapeMonolith";
        game.nextPosition2 = "";
    }
    public void restEscapeMonolith(){
        ui.mainTextArea.setText("You stop to catch your breath and try to relax. \n The sharp pain in your chest continues. \n \nAnd as if that wasn't enough bad luck, you hear footsteps approaching from deeper in the woods.");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");

        game.nextPosition1 = "continueEscapeMonolith";
        game.nextPosition2 = "";
    }
    public void continueEscapeMonolith(){
        ui.mainTextArea.setText("You continue going, but a mutant bear appears.\n\n It looks as dead as the zombies you fought. \nYet, it stills moves, and with green fangs and nails, it looks more\n menacing that a regular bear.\n\nThe white empty eyes of the zombie bear lock with yours.");
        monster = new Monster_MutantDeathBear();
        positionAfterBattle = "afterMutantBearBattle";
        ui.choice1.setText("ATTACK!");
        ui.choice2.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }
    public void afterMutantBearBattle(){
        ui.mainTextArea.setText("You defeated the mutant creature with help of your \n wand. \n\n\n You venture deeper in the forest, looking for someone than can help you. \n\n\n From behind a tree another mutated bear appears. \n\n");
        positionAfterBattle = "defeatTwoMutantBear";
        monster = new Monster_MutantDeathBear();
        ui.choice1.setText("En garde!");
        ui.choice2.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }

    public void defeatTwoMutantBear(){
        ui.mainTextArea.setText("You blast the creature. At the last minute tho, \n before it goes down, the bear sinks it teeth on your neck. \n\nYou push him away with a spell. \n\n You continue walking now that its dead. \n Hopefully no other enemy appears, your hp is very low.");
        player.hp = 3;
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "monkeyKingMonolith";
        game.nextPosition2 = "";
    }
    public void monkeyKingMonolith(){
        ui.mainTextArea.setText("You look behind you, you are hearing tree branches shake \n just a few meters from where you stand. \n\n You fear is the toad from the Monolith.\n\n That outer dimensional creature seemed thirsty for more blood. \n You run faster, even tho your legs can't go on much longer. ");
        ui.choice1.setText("Come on!");
        ui.choice2.setText("Stay and rest");

        game.nextPosition1 = "shedAfterMonolith";
        game.nextPosition2 = "";
    }
    public void shedAfterMonolith(){
        ui.mainTextArea.setText("You arrive to a shed right before passing out from exhaustion. \n\n You open the door without knocking and go in, closing it behind you. \nInside there's a small bed, a table and a wardrobe. \nThe pain in your chest is unbearable. You feel like vomiting. \n\nThe toad would have no problem breaking into the shed if it was coming for you.");
        ui.choice1.setText("Lay in bed");
        ui.choice2.setText("Throw up");

        game.nextPosition1 = "passOutMonkeyShed";
        game.nextPosition2 = "";
    }
    public void passOutMonkeyShed(){
        ui.mainTextArea.setText("You lay on the bed, your chest about to burst. \n \nThe demonic creature that came out of the rock hunts your thoughts. \n\n All you can think about is the sound it made,\n chewing up the cult members bodies. \n\n The terror makes you pass out. ");
        ui.choice1.setText("Oh man... Zzzz");
        ui.choice2.setText("");

        game.nextPosition1 = "wakeUpMonkeyShed";
        game.nextPosition2 = "";
    }
    public void wakeUpMonkeyShed(){
        ui.mainTextArea.setText("The next morning, you awake to the smell of tea. \n\n Your wounds have been treated. \n\n In the center of the shed, on top of a small table, there's a note. \nIt reads: 'Drink tee, an leave. Monzters is neard.'");
        ui.choice1.setText("Drink Tea");
        ui.choice2.setText("Don't drink tea");

        game.nextPosition1 = "drinkTeaAndLeave";
        game.nextPosition2 = "";
    }
    public void drinkTeaAndLeave(){
        ui.mainTextArea.setText("Who wrote this note? \n\n Whoever it was, also cured most of your wounds. \n\n And why did this mysterious person leave you here alone? \n\n You have a sip of the green tea on top of the table.");
        ui.choice1.setText("Look around");
        ui.choice2.setText("Head out");

        game.nextPosition1 = "lookAroundShed";
        game.nextPosition2 = "goFindShedsOwner";
    }
    public void lookAroundShed(){
        ui.mainTextArea.setText("The note is written in terrible handwriting. \n\n Whoever lives didn't learn how to write properly. \n\n\nYou look around and see a bunch of weapons hanging from the walls. \nThe homeowner must be a warrior, surely \nmust be fighting monsters outside of the shed.");
        ui.choice1.setText("Go find owner");
        ui.choice2.setText("");

        game.nextPosition1 = "goFindShedsOwner";
        game.nextPosition2 = "";
    }
    public void goFindShedsOwner(){
        ui.mainTextArea.setText("Armed only with your wand, \n you go out in search of the person that cured you. \n\n Hopefully, this person's personality is better than its handwriting. \n\n Where the sun is rising, you hear a battle.");
        ui.choice1.setText("Go there");
        ui.choice2.setText("");

        game.nextPosition1 = "goFindMonkeyKing";
        game.nextPosition2 = "";
    }
    public void goFindMonkeyKing(){
        ui.mainTextArea.setText("'Paff!', 'Pooff!' You arrive at the sound of someone being kicked. \n\n A monkey dressed as a warrior beats a couple of zombies with ease.\nThe monkey uses a wood stick to bash their brains out.\n\n");
        ui.choice1.setText("Hey, you!");
        ui.choice2.setText("");

        game.nextPosition1 = "heyMonkeyKing";
        game.nextPosition2 = "";
    }
    public void heyMonkeyKing(){
        ui.mainTextArea.setText("The monkey wears a golden crown, is he a monster himself?\n He swings his staff beating whoever stands in front of him. \nGreen bodies start piling up around him. \n\nHe seems to be invincible. \n\n");
        ui.choice1.setText("Hello?");
        ui.choice2.setText("Hey!");

        game.nextPosition1 = "monkeyKingGetsHurt";
        game.nextPosition2 = "";
    }
    public void monkeyKingGetsHurt(){
        ui.mainTextArea.setText("'UH?'- The warrior turns around and faces the voice calling him. \n\n You can't believe it, but he seems to understand you. \n 'Look who woke up!'- He smiles at you. But as he was distracted by you\na zombie sneaks behind him and bites him.");
        monster = new Monster_ZombieSkeleton();
        positionAfterBattle = "afterMonkeyHurt";
        ui.choice1.setText("Help him");
        ui.choice2.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }
    public void afterMonkeyHurt(){
        ui.mainTextArea.setText("You explode the head of the zombie that was biting the monkey \nand the zombie's rotten brains splash you and him.\n\n'This is just perfect'-Your ally complains, covered in green matter. \n\n Another zombie comes for you.");
        monster = new Monster_MutantZombie();
        positionAfterBattle = "destroyEnemiesMK";
        ui.choice1.setText("Fight");
        ui.choice2.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }
    public void destroyEnemiesMK(){
        ui.mainTextArea.setText("'You did it!'\n'I'm the Monkey King, kid'- The primate introduces himself.\n'I own the shed you stayed in last night.'-\n\nThe king seems severely wounded, you must get back to the shed.");
        ui.choice1.setText("Shed");
        ui.choice2.setText("");

        game.nextPosition1 = "backShedInjured";
        game.nextPosition2 = "";
    }
    public void backShedInjured(){
        ui.mainTextArea.setText("'We can't go back, monsters keep appearing.' \n'I've been fighting for three days straight to protect my home.'\n'But all is lost now, I can't keep fighting.'- He laments \n\n\nYou hear footsteps coming from the trees. ");
        ui.choice1.setText("Where to go?");
        ui.choice2.setText("");

        game.nextPosition1 = "mkWhereNoDanger";
        game.nextPosition2 = "";
    }
    public void mkWhereNoDanger(){
        ui.mainTextArea.setText("'We have to get to the yalu river, kiddo.' \n 'There's a village there with tall walls, should be fine.' \n\n 'But first we have to get through these woods, and they are full of enemies.'\n'Are you ready to kick some ass?'-");
        ui.choice1.setText("Let's go!");
        ui.choice2.setText("Nah, I'm good");

        game.nextPosition1 = "toYaluRiverMK";
        game.nextPosition2 = "";
    }
    public void toYaluRiverMK(){
        ui.mainTextArea.setText("You and the monkey start walking, you don't know him, but something\n about him makes you feel you can trust him.\n\n Green tress of triangle leaves surround you. \n\n Perhaps in this village by the yalu river you'll find help.\n\nHopefully...");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "forestBeforeYaluOne";
        game.nextPosition2 = "";
    }
    public void forestBeforeYaluOne(){
        ui.mainTextArea.setText("You walk with the monkey in silence. \n");

        ui.choice1.setText("...");//
        ui.choice2.setText("");

        game.nextPosition1 = "cultTown";
        game.nextPosition2 = "";
    }
//    public void afterMutantBearBattle(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("...");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "cultTown";
//        game.nextPosition2 = "";
//    }
//    public void afterMutantBearBattle(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("...");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "cultTown";
//        game.nextPosition2 = "";
//    }
//    public void afterMutantBearBattle(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("...");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "cultTown";
//        game.nextPosition2 = "";
//    }
//    public void afterMutantBearBattle(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("...");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "cultTown";
//        game.nextPosition2 = "";
//    }
//    public void afterMutantBearBattle(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("...");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "cultTown";
//        game.nextPosition2 = "";
//    }
//    public void afterMutantBearBattle(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("...");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "cultTown";
//        game.nextPosition2 = "";
//    }
//    public void afterMutantBearBattle(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("...");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "cultTown";
//        game.nextPosition2 = "";
//    }
//    public void afterMutantBearBattle(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("...");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "cultTown";
//        game.nextPosition2 = "";
//    }
//    public void afterMutantBearBattle(){
//        ui.mainTextArea.setText("");
//        ui.choice1.setText("...");
//        ui.choice2.setText("");
//
//        game.nextPosition1 = "cultTown";
//        game.nextPosition2 = "";
//    }




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
        ui.mainTextArea.setText("You can't keep walking. You are falling asleep\n\n Finally, exhausted, you fall to the ground in front of a small pond \n Hopefully no monster finds you here. \n The mud you lay in makes your skin burn.");
        positionAfterBattle = "wakeUpPond";
        ui.choice1.setText("Zzzzzz");
        ui.choice2.setText("");

        game.nextPosition1 = "nightmareFirstNight";
        game.nextPosition2 = "";
    }
    public void wakeUpPond(){
        ui.mainTextArea.setText("Next morning a swarm of flies wakes you up. \n Your wounds seemed to have sealed \n It's a miracle! \n \n You have to be more careful from now on. You look \n at the pond \n \n still terrified by your dream.");
        player.hp += 5;
        ui.hpLabelNumber.setText(""+ player.hp);
        ui.choice1.setText("Where am I?");
        ui.choice2.setText("");

        game.nextPosition1 = "secondPondScene";
        game.nextPosition2 = "";
    }
    public void secondPondScene(){
        ui.mainTextArea.setText("In front of you a shallow pond shines under the sun \n \n It's full of frogs and mosquitoes. You have never \n seen it before. \n\n\n\n You are lost");
        ui.choice1.setText("Shit");
        ui.choice2.setText("");

        game.nextPosition1 = "thirdPondScene";
        game.nextPosition2 = "";
    }
    public void thirdPondScene(){
        ui.mainTextArea.setText("Everything around you looks strange. \n \n The trees around the pond look nothing like the ones on your hometown. \n And nothing can be seen other than the pond and the forest around it");
        ui.choice1.setText("Go for a swim");
        ui.choice2.setText("Back to the forest");

        game.nextPosition1 = "swimInThePond";
        game.nextPosition2 = "forestAroundThePond";
    }
    public void swimInThePond(){
        ui.mainTextArea.setText("A quick splash may help cleaning the dirt and blood \n off you. \n\n It's nice in the water, crystal clear. \n You notice a red blur swimming beneath you.");
        ui.choice1.setText("What");
        ui.choice2.setText("");

        game.nextPosition1 = "seeFishPond";
        game.nextPosition2 = "";
    }
    public void seeFishPond(){
        ui.mainTextArea.setText("The biggest fish you have ever seen \n just swam past you. \n \n If you catch it you could have food for days! \n A bit bigger and it would be a shark!");
        ui.choice1.setText("Follow it");
        ui.choice2.setText("Back to the forest");

        game.nextPosition1 = "followFishPond";
        game.nextPosition2 = "forestAroundThePond";
    }
    public void followFishPond(){
        ui.mainTextArea.setText("You swim as fast as you can \n Diving between breaths \n \n You can touch the slippery fin of this colossal fish. \n It slips out of your grasp and dives deeper");
        ui.choice1.setText("Dive after it");
        ui.choice2.setText("Let it go");

        game.nextPosition1 = "caveUnderPond";
        game.nextPosition2 = "forestAroundThePond";
    }
    public void caveUnderPond(){
        ui.mainTextArea.setText("You reach once again for the fish \n You grabbed it!!! \n \n But this fish is stronger than most. \n It carries you deep underwater. To a small opening on the \n pond's floor.");
        ui.choice1.setText("I can't let go");
        ui.choice2.setText("");

        game.nextPosition1 = "pondCaveOpening";
        game.nextPosition2 = "";
    }
    public void pondCaveOpening(){
        ui.mainTextArea.setText("The initial small opening expands until you arrive to \n an underwater cave! \n \n The fish dragged you to it's home. \n You are drowning, so you let go of it and swim upwards.");
        ui.choice1.setText("Blurghl");
        ui.choice2.setText("Arghbl");

        game.nextPosition1 = "pondCaveSurface";
        game.nextPosition2 = "pondCaveSurface";
    }
    public void pondCaveSurface(){
        ui.mainTextArea.setText("You follow your oxygen bubbles to a part of the cave, that isn't submerged. \n You get out of the water!\n You take deep breaths, almost drowned there. \n It's dark, but something glows deeper in the cave.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "deeperPondCave";
        game.nextPosition2 = "";
    }
    public void deeperPondCave(){
        ui.mainTextArea.setText("The light in the cave is blue and faint \n You follow it, walking barefoot on the sharp wet rock. \n \n Who would have thought under such a small pond\n  there could be such a cave!");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "lamiaLair";
        game.nextPosition2 = "";
    }
    public void lamiaLair(){
        ui.mainTextArea.setText("As you walk deeper, the smell of mud and moss increases \n It's not an unpleasant smell. \n \n Finally you arrive at a rock wall with crystals encrusted in it. \n These blue crystals illuminate the cave.");
        ui.choice1.setText("Grab them");
        ui.choice2.setText("");

        game.nextPosition1 = "meetLamia";
        game.nextPosition2 = "";
    }
    public void meetLamia(){
        ui.mainTextArea.setText("'Hello there, please don't take my crystals' A woman \n with reptile eyes and gator feet talks from the shadows. \n \n 'Sor.. sorry! I didn't know these were yours ma'am' You say!");
        ui.choice1.setText("Sorry again");
        ui.choice2.setText("Who are you?");

        game.nextPosition1 = "lamiaIntro";
        game.nextPosition2 = "";
    }

    public void lamiaIntro(){
        ui.mainTextArea.setText("'You are a child!' The tall lady's eyes open wide, \n you can see her green eyes shine with narrow vertical pupils. \n \n 'Come with me, I'll show you my humble home', \n 'It's been very long since a human child visited me for the last time' \n Her tongue is split like a snake's tongue ");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "lamiaHome";
        game.nextPosition2 = "";
    }
    public void lamiaHome(){
        ui.mainTextArea.setText("'My name is Lamia, child' \n and I've lived in this pond, since before humans arrived to this land. \n Would you like to stay with me while I tell you my story?' \n\n You aren't sure if you can say no. ");
        ui.choice1.setText("Fine");
        ui.choice2.setText("Gotta go");

        game.nextPosition1 = "lamiaStory";
        game.nextPosition2 = "";
    }
    public void lamiaStory(){
        ui.mainTextArea.setText("'You see, I used to be a queen' \n 'in a prosperous kingdom far away from here' Lamia guides you deeper \n in the cave \n 'Then the gods got jealous of me, and cursed me. \n She pointed at her reptile feet");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "lamiaSecondStory";
        game.nextPosition2 = "";
    }
    public void lamiaSecondStory(){
        ui.mainTextArea.setText("'This world is a cruel place'\n 'The gods turned me into a monster' \n 'I had to leave my kingdom after what I did' \n 'and now, I live here'. \n\n In front of you there's a small room full of jewels and relics.");
        ui.choice1.setText("Wow");
        ui.choice2.setText("This is yours?");

        game.nextPosition1 = "lamiaStoryEnding";
        game.nextPosition2 = "";
    }
    public void lamiaStoryEnding(){
        ui.mainTextArea.setText("'This is all mine, grab as much as you want', \n 'My children weren't able to enjoy my wealth, \n 'after I got this terrible curse' \n \n You don't hesitate and fill your pockets with gold!");
        ui.choice1.setText("What happened to them?");
        ui.choice2.setText("What is your curse?");

        game.nextPosition1 = "lamiaRevealCurse";
        game.nextPosition2 = "lamiaRevealCurse";
    }
    public void lamiaRevealCurse(){
        ui.mainTextArea.setText("'You see'\n 'the night the gods turned me into this' \n 'I also became extremely hungry' \n 'after eating all the food in the royal kitchen' \n 'I slithered to my children's rooms'\n \n \n'And one by one I ate them all' ");
        ui.choice1.setText("Wha.. What?");
        ui.choice2.setText("...");

        game.nextPosition1 = "lamiaRevealCursePic";
        game.nextPosition2 = "lamiaRevealCursePic";
    }
    public void lamiaRevealCursePic(){
        vm.showPicture();
        ui.image = new ImageIcon(".//res//lamia.png");
        ui.pictureLabel.setIcon(ui.image);

        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "lamiaFight";
        game.nextPosition2 = "";
    }
    public void lamiaFight(){
        ui.mainTextArea.setText("Lamia stands in front of you, with her jaw wide open. \n A row of yellow sharp teeth drip venom down her chin. \n \n 'Oh man, I just wanted to get that fish...' \n You weren't too lucky this time.");
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");

        game.nextPosition1 = "throwGoldLamia";
        game.nextPosition2 = "throwGoldLamia";
    }

    public void throwGoldLamia(){
        ui.mainTextArea.setText("You throw the gold from your pockets to her face, \n and knock a few teeth out of her purple mouth. \n Then run to the pile of gold for more things to throw at her. \n \n She follows you hissing. ");
        ui.choice1.setText("Shit");
        ui.choice2.setText("...");

        game.nextPosition1 = "findSmallAxe";
        game.nextPosition2 = "findSmallAxe";
    }
    public void findSmallAxe(){
        ui.mainTextArea.setText("'Aaaaaaaaah', she bit you on your arm.\n \n You reach into the pile of jewels and grab a handle of something buried\n underneath.\n As you try to take it out, your vision becomes blurry.\n 'Am I... poisoned?'");
        player.hp -= 4;
        ui.hpLabelNumber.setText(""+ player.hp);
        ui.choice1.setText("Pull from handle");
        ui.choice2.setText("Face Lamia");

        game.nextPosition1 = "attackLamia";
        game.nextPosition2 = "attackLamia";
    }
    public void attackLamia(){
        ui.mainTextArea.setText("Lamia's eyes turn greener and narrower as she approaches you \n \n Her body turning into a giant snake's body. \n She dislocates her jaw and shows her bloody teeth.\n Your eyelids are heavy and your body stiff from the venom.");
        ui.choice1.setText("Attack");
        ui.choice2.setText("");

        game.nextPosition1 = "killLamia";
        game.nextPosition2 = "killLamia";
    }
    public void killLamia(){
        ui.mainTextArea.setText("'Sorry child, I'm cursed'\n \n As the terrible reptile jumps to devour you \n a strength you didn't know you had, makes you lift a small axe\n by the handle, from under the pile of Gold\n and swing it at her. ");
        player.currentWeapon = new Weapon_SmallAxe();
        ui.weaponLabelName.setText(player.currentWeapon.name);
        ui.choice1.setText("Aaaaaah");
        ui.choice2.setText("");

        game.nextPosition1 = "lamiaDeath";
        game.nextPosition2 = "";
    }
    public void lamiaDeath(){
        ui.mainTextArea.setText("The axe splits her head \n Purple blood comes out of her mouth. \n And with an infernal scream, Lamia, the cursed one. Dies. \n \n You can't move anymore, the poison makes you fast asleep.");
        ui.choice1.setText("I... did... it");
        ui.choice2.setText("");

        game.nextPosition1 = "asleepInLamias";
        game.nextPosition2 = "";
    }
    public void asleepInLamias(){
        ui.mainTextArea.setText(".................. What's happening........................................ \n .......Am I dead?........................................................ \n ..................................................................................... \n You are delirious in your dream, \n\n You can't tell what's real and what isn't anymore \n If only Dad could help you now...");
        ui.choice1.setText("No");
        ui.choice2.setText("...");

        game.nextPosition1 = "helpFullRedFish";
        game.nextPosition2 = "helpFullRedFish";
    }
    public void helpFullRedFish(){
        ui.mainTextArea.setText("'Come on sir, you have to wake up' \n You wonder who's saying that... \n \n 'Come to the water, it's magical, it will cure your wounds!' \n 'Come over' ");
        ui.choice1.setText("You!");
        ui.choice2.setText("The Fish!");

        game.nextPosition1 = "talkingFish";
        game.nextPosition2 = "talkingFish";
    }
    public void talkingFish(){
        ui.mainTextArea.setText("'A red giant fish calls you from the water, \n Come over, I'm tired of screaming to you'-\n \n This is critical, you feel nausea and drowsiness.\n You crawl there.");
        ui.choice1.setText("What the...");
        ui.choice2.setText("Oh, no");

        game.nextPosition1 = "crawlToFish";
        game.nextPosition2 = "crawlToFish";
    }
    public void crawlToFish(){
        ui.mainTextArea.setText("You must be going crazy from the venom \n\n This is ridiculous. \n Still you get to the edge and put your arm in the water. \n 'Oh man, this is awful.'- \n The water turns red.  ");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "thanksFish";
        game.nextPosition2 = "";
    }
    public void thanksFish(){
        ui.mainTextArea.setText("Your arm burns like fire \n You felt the same last night in the edge of the pond  \n 'Thanks fish'-, you start feeling better\n\n You are sooo drowsyy");
        ui.choice1.setText("Ugh");
        ui.choice2.setText("");

        game.nextPosition1 = "gnPondSleep";
        game.nextPosition2 = "";
    }
    public void gnPondSleep(){
        ui.mainTextArea.setText("....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................\n");
        ui.choice1.setText("What, what?");
        ui.choice2.setText("");

        game.nextPosition1 = "wakeUpCave";
        game.nextPosition2 = "";
    }
    public void wakeUpCave(){
        ui.mainTextArea.setText("You awake, no wounds. The cave is silent. \n\n You grab the axe and head for the exit.\n You wonder if what happened was real. \n But wait, what should you do? ");
        ui.choice1.setText("Call fish");
        ui.choice2.setText("Get jewels & leave");

        game.nextPosition1 = "callFish";
        game.nextPosition2 = "getGoldAndLeave";
    }
    public void callFish(){
        ui.mainTextArea.setText("'Hello?'-, your voice echoes thru the underwater cave.\n A grumpy deep voice answers.\n\n 'Oh, look who woke up?', 'Are you gonna try to kill me again?'- \n A red fin emerges at the side of\n the blue water.");
        ui.choice1.setText("My bad");
        ui.choice2.setText("");

        game.nextPosition1 = "myBadFish";
        game.nextPosition2 = "";
    }
    public void getGoldAndLeave(){
        ui.mainTextArea.setText("You grab a bag of jewels and go to the entrance of the cave\n you don't see any fish. \n You jump to the water and dive to the way out.");
        ui.choice1.setText("Blluuurgh");
        ui.choice2.setText("Broooluuhp");

        game.nextPosition1 = "outCave";
        game.nextPosition2 = "";
    }
    public void myBadFish(){
        ui.mainTextArea.setText("'My bad, I didn't mean to hurt a talking fish'-\n \n You are shocked, but so many things happened \n lately, that it doesn't surprise you that much...\n \n 'Come on kid, I'll help you out of here'.");
        ui.choice1.setText("Let's go");
        ui.choice2.setText("");

        game.nextPosition1 = "outCaveWFish";
        game.nextPosition2 = "";
    }
    public void outCaveWFish(){
        ui.mainTextArea.setText("You and the fish go outside the cave and swim to\n the shore. \n\n 'Wufff, thank you Mr Fish!'\n 'You saved me'- You smile at your weird ally. \n\n 'Don't mention it. You just have to be more careful'- ");
        ui.choice1.setText("sure");
        ui.choice2.setText("nah");

        game.nextPosition1 = "tellFishStory";
        game.nextPosition2 = "";
    }
    public void tellFishStory(){
        ui.mainTextArea.setText("'So what's your story?'- the fish asks. \n\n\n 'My story? Well, ummm'\n'I'm lost, my hometown is full of monsters' \n 'so I can't go back.' \n\n 'Dad said to find a village near here.'-");
        ui.choice1.setText("What about you?");
        ui.choice2.setText("");

        game.nextPosition1 = "whatAboutFish";
        game.nextPosition2 = "";
    }
    public void whatAboutFish(){
        ui.mainTextArea.setText("'What do you mean?'- \n\n 'What about me? What's wrong with me?'\n The fish seems confused. \n 'I was born in this pond, I'm not lost.'-");
        ui.choice1.setText("Do all fish talk?");
        ui.choice2.setText("Why can you talk?");

        game.nextPosition1 = "fishConversation";
        game.nextPosition2 = "fishConversation";
    }    public void fishConversation(){
        ui.mainTextArea.setText("'Oh, I understand now'- \n \n The fish smiles. \n 'Not all fishes are like me, right? Only the ones born in this pond, I think'.\n \n 'There's something in this water that gives great power\n to whoever goes in it.'-");
        ui.choice1.setText("I swam there!");
        ui.choice2.setText("I drank some!");

        game.nextPosition1 = "greatWaterPond";
        game.nextPosition2 = "greatWaterPond";
    }    public void greatWaterPond(){
        ui.mainTextArea.setText("'I know.'- The fish answers. \n 'I haven't seen any human go in before, so I don't know what will' \n 'happen to you'-. \n \n \n You don't feel different, but your wounds healed. \n Your hp went back to normal.");
        player.hp += 18;
        ui.hpLabelNumber.setText(""+ player.hp);
        ui.choice1.setText("Do you know the way?");
        ui.choice2.setText("");

        game.nextPosition1 = "fishWay";
        game.nextPosition2 = "";
    }
    public void fishWay(){
        ui.mainTextArea.setText("'Hey Mr. fish, do you know where's the village?'- \n \n 'No, I do not. However, there's someone I know that can help you.'- \n 'There's a shed in the forest past those trees' \n'I saw someone coming in and out of it, go there!'-\n\n This fish seems to be telling the truth.\n Exactly in the direction pointed out, there's a brown blur.\n Could be a shed");
        ui.choice1.setText("Thank you");
        ui.choice2.setText("Bye");

        game.nextPosition1 = "goodByeFish";
        game.nextPosition2 = "goodByeFish";
    }
    public void goodByeFish(){
        ui.mainTextArea.setText("'It was a pleasure' \n 'Hey, kid, before you go.' \n \n 'If you ever need to rest or you get wounded, come back here' \n 'I won't mind sharing my pond with you'- \n \n Such a nice fishy, and to think that a moment ago, you were \n planning on making him dinner...");
        ui.choice1.setText("To the shed");
        ui.choice2.setText("");

        game.nextPosition1 = "toTheShed";
        game.nextPosition2 = "";
    }    public void toTheShed(){
        ui.mainTextArea.setText("You run to the woods with your new weapon \n 'To the shed!'- Is your battle cry. \n \n However, all that time in the pond, made you forget how dark and \n disorienting the woods are.");
        ui.choice1.setText("What's that?");
        ui.choice2.setText("Uh?");

        game.nextPosition1 = "backWoodsFromFish";
        game.nextPosition2 = "backWoodsFromFish";
    }    public void backWoodsFromFish(){
        monster = new Monster_GiantScorpion();
        positionAfterBattle = "firstScorpionDeath";
        ui.mainTextArea.setText("You hear noises around you. \n Could it be monsters? \n The tall trees reach the sky, blocking the sun. \n \n \n Suddenly a "+ monster.name + " with "+monster.hp+ " hp " +"jumps in front of you.");
        ui.choice1.setText("attack");
        ui.choice2.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "";
    }
    public void fight(){
        ui.mainTextArea.setText(monster.name + ": " + monster.hp + "\n\n\nWhat do you do?" );
        ui.choice1.setText("Laifu");
        ui.choice2.setText("Heyhu");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "";
    }
    public void playerAttack(){
        int playerDamage = new java.util.Random().nextInt(5) +player.currentWeapon.damage;
        ui.mainTextArea.setText("You attacked the " + monster.name + " and gave " + playerDamage + " Damage!");
        monster.hp -= playerDamage;
        ui.choice1.setText("Next");
        ui.choice2.setText("");


        if(monster.hp>0){
            game.nextPosition1 = "monsterAttack";
            game.nextPosition2 = "";
        }
        else if(monster.hp<1){
            game.nextPosition1 = positionAfterBattle;
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



    public void firstScorpionDeath(){
        ui.mainTextArea.setText("You did it!. Your new " + player.currentWeapon.name+ " kicks ass! \n You leave the crushed bug behind and continue forth in the woods.\n\n You can see the shed up ahead. ");
        monster.hp +=20;
        ui.choice1.setText("Continue");
        ui.choice2.setText("");

        game.nextPosition1 = "closerToShed";
        game.nextPosition2 = "";
    }
    public void closerToShed(){
        ui.mainTextArea.setText("You are about to arrive to the shed, but in front of it\n There's a familiar figure.\n\n Another " + monster.name + " but this one is green and bigger. \n\n Only one more fight.");
        positionAfterBattle = "secondScorpionDeath";
        ui.choice1.setText("Fight");
        ui.choice2.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "";
    }
  public void secondScorpionDeath(){
        ui.mainTextArea.setText("If you could defeat one, \n you can defeat another. \n You have some wounds, but are so close to the shed that going back \n to the pond, would be pointless.\n\n You are at the door");
        ui.choice1.setText("Knock");
        ui.choice2.setText("Open");
        monster.hp += 20;
        game.nextPosition1 = "knockMonkeyShed";
        game.nextPosition2 = "";
    }
  public void knockMonkeyShed(){
        ui.mainTextArea.setText("You see a shadow looking through the window. \n The door is unlocking, and as it opens\n a Monkey dressed as a warrior and with a golden crown appears\n behind it.");
        ui.choice1.setText("I need help");
        ui.choice2.setText("Ask about village");

        game.nextPosition1 = "meetMonkeyKing";
        game.nextPosition2 = "";
    }
    public void meetMonkeyKing(){
        ui.mainTextArea.setText("'Get inside, quickly!' \n 'You'll get killed out here!'- You walk in. \n 'I'm the monkey king, what brings you to me, Kid?'- \n \n \n You examine him, he looks as wounded as you.\n On one hand he carries a wooden stick");
        ui.choice1.setText("I need help");
        ui.choice2.setText("Ask about village");

        game.nextPosition1 = "askMonkeyHelp";
        game.nextPosition2 = "";
    }
   public void askMonkeyHelp(){
        ui.mainTextArea.setText("The monkey king responds: \n 'Help? I'm trapped here, no matter how many bugs I defeat' \n 'more and more keep coming. \n \n 'I don't think I can help you, but you can rest here for a bit.'-");
        ui.choice1.setText("Ask about village");
        ui.choice2.setText("");

        game.nextPosition1 = "askAboutVillage";
        game.nextPosition2 = "";
    }
    public void askAboutVillage(){
        ui.mainTextArea.setText("'There's a village nearby'- You say. \n 'Do you know how to get there?' \n 'Perhaps we can run to it and find help there'- \n \n The monkey king is thinking silently.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "monkeyYaluRiver";
        game.nextPosition2 = "";
    }
    public void monkeyYaluRiver(){
        ui.mainTextArea.setText("'There's a village on the Yalu River, not too far from here'\n'I think that's the place you want to go' \n \n 'But we'd still have to walk for hours to get there.' \n 'And the forest is very dangerous' ");
        ui.choice1.setText("It doesn't matter");
        ui.choice2.setText("Let's go!");

        game.nextPosition1 = "monkeyMedicine";
        game.nextPosition2 = "monkeyMedicine";
    }
  public void monkeyMedicine(){
        ui.mainTextArea.setText("'Alright, it's unlikely we'll make it there alive.' \n 'But I feel like fighting.'- \n \n The monkey hands you a root of a plant. \n \n 'Chew it, you'll recover health!-");
        ui.choice1.setText("Take it");
        ui.choice2.setText("Don't take it");

        game.nextPosition1 = "takeMonkeyMedicine";
        game.nextPosition2 = "noMonkeyMedicine";
    }
    public void takeMonkeyMedicine(){
        ui.mainTextArea.setText("You hp was restored!");
        player.hp = 20;
        ui.hpLabelNumber.setText(""+player.hp);
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "thanksMonkey";
        game.nextPosition2 = "";
    }
    public void thanksMonkey(){
        ui.mainTextArea.setText("The Monkey King doesn't have any medicine left for himself \n 'Let's go, kid' \n \n You go outside, no scorpions around.\n You start running behind the king. ");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "giantSpiderAppears";
        game.nextPosition2 = "";
    }
    public void giantSpiderAppears(){
        ui.mainTextArea.setText("It's getting late. \n But it'doesn't matter, in the forest it's always dark and cold. \n \n You think you saw a tree move. \n Suddenly, from behind it a spider\n the size of a person appears.");
        monster = new Monster_GiantSpider();
        positionAfterBattle = "defeatGiantSpider";
        ui.choice1.setText("Defeat");
        ui.choice2.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "";
    }
    public void defeatGiantSpider(){
monster.hp = 30;
        ui.mainTextArea.setText("You defeated the spider. \n And the monkey king can still walk. \n You continue, in silence. \n \n \n Hoping no other monsters appear.");
        ui.choice1.setText("...");
        ui.choice2.setText("");

        game.nextPosition1 = "forestAfterSpider";
        game.nextPosition2 = "";
    }
    public void forestAfterSpider(){
        ui.mainTextArea.setText("It's been forever \n \n Does this monkey even know where we are? \n No sounds, just the forest looks like it's breathing \n And then... \n You see eight hairy legs with yellow rings behind a tree..");
        ui.choice1.setText("attack");
        ui.choice2.setText("keep walking");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "walkPastSpider";
    }
    public void walkPastSpider(){
        ui.mainTextArea.setText("You point the legs out to the Monkey. \n And keep walking slowly past it. \n As you walk near the tree, you see a leg swing you way. \n\n It stabs you in your stomach.");
        monster = new Monster_GiantSpider();
        player.hp -= 5;
        ui.hpLabelNumber.setText(""+ player.hp);
        ui.choice1.setText("Fight back");
        ui.choice2.setText("Help me MK!");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "monkeyKingHelps";
    }
    public void monkeyKingHelps(){
        ui.mainTextArea.setText("The monkey throws his wooden staff, and crushes \n the giant arachnid. \n\n The enemy is defeated, but the King seems \n very tired. ");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");

        game.nextPosition1 = "swampOfDeath";
        game.nextPosition2 = "";
    }
    public void swampOfDeath(){
        ui.mainTextArea.setText("");
        ui.choice1.setText("Continue");
        ui.choice2.setText("");

        game.nextPosition1 = "swampOfDeath";
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
