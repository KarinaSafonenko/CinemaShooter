package by.safonenko.bsuir.ppvis.controller;

import by.safonenko.bsuir.ppvis.view.MainScreen;
import by.safonenko.bsuir.ppvis.view.TimerLabel;

import java.util.Timer;

public class StartGame {

    private Timer timer;
    private FirstTask task;
    private MainScreen mainScreen;
    private Controller controller;
    private TimerLabel time;

    public  StartGame(){
        mainScreen = new MainScreen();
        controller = new Controller(this);
        time = mainScreen.getBackgroundPanel().getCurrentTimer();
        AffableThread affableThread = new AffableThread(controller);
        affableThread.start();
        start();
    }

    public  void start(){
        if (task != null) task.cancel();
        if (timer != null) timer.cancel();
        mainScreen.getMainFrame().setVisible(true);
        timer = new Timer();
        task = new FirstTask(controller);
        time.restartTimer();
        timer.schedule(task, 0, 1000);
    }

    public Timer getTimer() {
        return timer;
    }

    public MainScreen getMainScreen() {
        return mainScreen;
    }

    public Controller getController() {
        return controller;
    }
}
