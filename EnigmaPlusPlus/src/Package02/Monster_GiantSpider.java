package Package02;

public class Monster_GiantSpider extends SuperMonster{

    public Monster_GiantSpider(){
        name = "Giant Spider";
        hp = 20;
        attacks = new Integer[]{0, 2, 3, 4};
        mainMessage = "A spider, the size of a person with hairy legs\nand purple venom dripping from its mandible, \nawaits in front of you.";
        attackMessages = new String[]{"You can see the yellow rings around the eight dark legs. \n move towards you.", "The spider ejects purple hairs your way like missiles. ", "The spider bites your leg.", "The creature stabs you with a leg."};
    }

}
