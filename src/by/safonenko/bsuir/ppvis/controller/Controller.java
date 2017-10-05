package by.safonenko.bsuir.ppvis.controller;

import by.safonenko.bsuir.ppvis.view.FaceView;
import by.safonenko.bsuir.ppvis.view.FaceTypes;
import by.safonenko.bsuir.ppvis.view.MainScreen;
import by.safonenko.bsuir.ppvis.view.PatronPanel;

public class Controller {
    private MainScreen main_screen;
    private StartGame start;
    private FaceTypes faces;
    private PatronPanel patronPanel;

    public Controller(StartGame start){
        this.start = start;
        this.main_screen = start.getMainScreen();
        faces = new FaceTypes(this);
        this.patronPanel = main_screen.getBackgroundPanel().getPatronPanel();
    }

    public  void hidePatron(){
        patronPanel.hidePatron();
    }

    public  int getTime(){
        return  main_screen.getBackgroundPanel().getCurrentTimer().getTime();
    }

    public void stopTime() {
       main_screen.getBackgroundPanel().getCurrentTimer().stopTimer();
    }

    public  void  stop(){
        main_screen.getMainFrame().setEnabled(false);
        start.getTimer().cancel();
        for (int i=0; i<main_screen.getFaceList().getFaceList().size(); i++){
            main_screen.getFaceList().getFaceList().get(i).hide();
            main_screen.getFaceList().getFaceList().get(i).getTimer().cancel();
        }
    }

    public  void  startGame(){
        for (int i=0; i<main_screen.getFaceList().getFaceList().size(); i++){
            main_screen.getFaceList().getFaceList().get(i).hide();}
            main_screen.getFaceList().removeAll();
            main_screen.getBackgroundPanel().setInitialScore();
            patronPanel.recharge();
            start.start();
    }

    public  int getScore(){
        return main_screen.getBackgroundPanel().getScore();
    }

    public  void  addScore(){
        main_screen.getBackgroundPanel().addScore();
    }

    public  void subScore(){
        main_screen.getBackgroundPanel().subScore();
    }

    public  void addFace(FaceView newFace){
        main_screen.getFaceList().addFace(newFace);
        main_screen.getBackgroundPanel().updateFace(newFace);
    }

    public  void  removeFace(FaceView currentFace){
        main_screen.getFaceList().removeFace(currentFace);
    }

    public FaceTypes getFaces() {
        return faces;
    }

    public MainScreen getMain_screen() {
        return main_screen;
    }

}
