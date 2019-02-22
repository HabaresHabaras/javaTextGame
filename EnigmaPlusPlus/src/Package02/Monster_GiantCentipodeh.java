package Package02;

public class Monster_GiantCentipodeh extends SuperMonster{

    public Monster_GiantCentipodeh(){
        name = "Giant Centi-Podeh";
        hp = 200;
        attacks = new Integer[]{ 0, 10, 14, 15};
        mainMessage = "An interdimensional beast, fuel of nightmares,\nCenti-Podeh, the giant killer centipede\nstands in front of you.";
        attackMessages = new String[]{"Centi-Podeh tries to sting you!", "The giant insect stabs you\nwith it's sharp legs!", "'Tsk, tsk, I'm going to kill ya'- The monster says\nbefore jumping on top of you and stinging you", "Centi-Podeh traps you in between his mandibles,\nmaking deep cuts on your body."};
    }
}
