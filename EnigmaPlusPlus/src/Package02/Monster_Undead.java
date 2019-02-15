package Package02;

public class Monster_Undead extends SuperMonster{

    public Monster_Undead(){
        name = "Undead";
        hp = 20;
        attacks = new Integer[]{0, 2, 3, 4};
        attackMessages = new String[]{"The undead runs towards you \n and tries to bite you!", "You get scratched by the undead. \n It screams incoherently", "'Guawlh, gualgh'- The zombie punches and kicks you.", "The monster goes crazy, it starts attacking \n while screaming with rage."};
    }

}
