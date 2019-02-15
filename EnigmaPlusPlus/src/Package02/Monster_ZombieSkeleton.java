package Package02;

public class Monster_ZombieSkeleton extends SuperMonster{

    public Monster_ZombieSkeleton(){
        name = "Zombie Skeleton";
        hp = 20;
        attacks = new Integer[]{0, 2, 3, 4};
        attackMessages = new String[]{"The zombie walks slowly towards you \n and tries to bite you!", "You get scratched by the zombie. \n It screams incoherently", "'Guawlh, gualgh'- The zombie punches and kicks you.", "The monster goes crazy, it starts attacking \n while screaming with rage."};
    }

}
