package Package02;

public class Monster_MutantZombie extends SuperMonster{

    public Monster_MutantZombie(){
        name = "Mutant Zombie";
        hp = 45;
        attacks = new Integer[]{0, 4, 6, 7};
        attackMessages = new String[]{"The mutant zombie tries \n to grab you!", "You get scratched by the sharp claws of the mutant zombie. \n It screams incoherently as it attacks.", "'Guawlh, gualgh'- \n The zombie punches and kicks you as it drips yellow goo \n from its mouth.", "The monster goes crazy, it's eyes look about to burst out \n 'Raaaaarghl'- It bites you ferociously!."};
    }
}