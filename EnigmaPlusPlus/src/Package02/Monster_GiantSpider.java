package Package02;

public class Monster_GiantSpider extends SuperMonster{

    public Monster_GiantSpider(){
        name = "Giant Spider";
        hp = 20;
        attacks = new Integer[]{0, 2, 3, 4};
        attackMessages = new String[]{"You can see the yellow rings around the eight dark legs. \n move towards you.", "The spider ejects purple hairs your way like missiles. ", "The spider bites your leg.", "The creature stabs you with a leg."};
    }

}
