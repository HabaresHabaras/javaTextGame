package Package02;

public class Monster_BlindZombieMutant extends SuperMonster{

    public Monster_BlindZombieMutant(){
        name = "Zombie Blind Mutant";
        hp = 50;
        mainMessage = "The blind man, turned into zombie\nlooks at you with rage, dripping blood from his mouth.";
        attacks = new Integer[]{0, 4, 5, 7};
        attackMessages = new String[]{"\nThe zombie walks slowly towards you \n and tries to bite you!", "\nYou get scratched by the zombie. \n It screams incoherently", "\n'Guawlh, gualgh'- The zombie punches and kicks you.", "\nThe monster goes crazy, it starts attacking \n while screaming with rage."};
    }

}
