package Package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    //this is Game
    Story story = new Story(this, ui, vm);

    String nextPosition1, nextPosition2;

    public static void main(String[] args) {
        new Game();
    }
    public Game() {
        ui.createUI(cHandler);
        story.defaultSetUp();
        vm.showTitleScreen();
    }
    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            String yourChoice = event.getActionCommand();

            switch(yourChoice){
                case "start": vm.showGameScreen(); story.wakeUp(); break;
                case "c1": story.selectPosition(nextPosition1); break;
                case "c2": story.selectPosition(nextPosition2); break;
            }
        }
    }
}
