package Package02;

public class Monster_MutantDeathBear extends SuperMonster{

    public Monster_MutantDeathBear(){
        name = "Mutant Death Bear";
        hp = 45;
        mainMessage = "A bear with hairless patches all over its body\nand zombie eyes, looks at you, hungry for death";
        attacks = new Integer[]{0, 4, 6, 7};
        attackMessages = new String[]{"The undead bear tries to bite off\n one of your hands!", "The bear looks hungry and keeps growling. \n It reaches you with its sharp nails.", "The death bear attacks you two times, \n and makes deep cuts on your skin", "The mutant bear chewed your arm, \nYou can barely move it now after the bite."};
    }
}