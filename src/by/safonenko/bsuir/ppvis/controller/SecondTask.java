package by.safonenko.bsuir.ppvis.controller;

import by.safonenko.bsuir.ppvis.view.FaceView;

import java.util.TimerTask;

public class SecondTask extends TimerTask {
    FaceView currentFace;
    Controller controller;

    public SecondTask(FaceView currentFace, Controller controller) {
        this.controller = controller;
        this.currentFace = currentFace;
    }

    public void run() {
        if (currentFace.isKilled()) {
            controller.subScore();
            currentFace.hide();
            controller.removeFace(currentFace);
        }
    }
}
