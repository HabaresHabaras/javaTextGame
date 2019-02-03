package Package02;

public class Monster_Goblin extends SuperMonster{

    public Monster_Goblin(){
        name = "Goblin";
        hp = 20;
        attacks = new Integer[]{0, 2, 3, 4};
        attackMessages = new String[]{"The goblin tried to steal your wallet \n and kicked you!", "The goblin swings a bag of gold to your head!", "This monster is so fast!", "'Ha Ha haha', the creature mocks you!"};
    }

}
