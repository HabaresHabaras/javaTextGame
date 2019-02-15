package Package01;

public class VisibilityManager {

    UI ui;

    public VisibilityManager(UI userInterface){

        ui = userInterface;


    }
    public void showTitleScreen(){

        //show the title screen
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        //Hide the game screen start
        ui.mainTextPanel.setVisible(false);
        ui.mainPictureArea.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }
    public void showGameScreen(){

        //show the title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        //Hide the title screen start
        ui.mainTextPanel.setVisible(true);
        ui.mainPictureArea.setVisible(false);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
    }
    public void showPicture(){

        //show the title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        //Hide the title screen start
        ui.mainTextPanel.setVisible(false);
        ui.mainPictureArea.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);    }
}

