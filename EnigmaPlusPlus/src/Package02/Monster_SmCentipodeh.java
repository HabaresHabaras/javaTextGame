package Package02;

public class Monster_SmCentipodeh extends SuperMonster{

    public Monster_SmCentipodeh(){
        name = "Centi-Podeh";
        hp = 30;
        attacks = new Integer[]{ 0, 5, 7, 9};
        mainMessage = "The murderer stares at you with dark eyes\nhis hands shaking.";
        attackMessages = new String[]{"The murderer tries to catch you!", "The killer punches your face!", "The murderer almost chokes you.", "The murderer lands several kicks to your stomach!"};
    }
}
