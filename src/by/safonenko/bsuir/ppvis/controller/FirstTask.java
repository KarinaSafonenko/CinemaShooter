package by.safonenko.bsuir.ppvis.controller;

import by.safonenko.bsuir.ppvis.view.FaceView;

import java.util.Random;
import java.util.TimerTask;

public class FirstTask extends TimerTask {
    private Controller controller;
    private  Random random;
    private FaceView newFace;

    public FirstTask(Controller controller){
        this.controller = controller;
    }

    public void  run(){
        random = new Random();
        int faceNumber = 1 + random.nextInt(8-1);
        switch (faceNumber){
            case 1:
                newFace = controller.getFaces().getFirstFace();
                initFace(newFace);
                break;

            case 2:
                newFace = controller.getFaces().getSecondFace();
                initFace(newFace);
                break;

            case 3:
                newFace = controller.getFaces().getThirdFace();
                initFace(newFace);
                break;

            case 4:
                newFace = controller.getFaces().getFourthFace();
                initFace(newFace);
                break;
            case 5:
                newFace = controller.getFaces().getFifthFace();
                initFace(newFace);
                break;
            case 6:
                newFace = controller.getFaces().getSixthFace();
                initFace(newFace);
                break;
            case 7:
                newFace = controller.getFaces().getSeventhFace();
                initFace(newFace);
                break;
    }
}

    private  void initFace(FaceView newFace){
        int xCoord = random.nextInt(970);
        int yCoord = 350 + random.nextInt(500-350);
        newFace.setLocation(xCoord,yCoord);
        controller.addFace(newFace);
        int rand = 1 + random.nextInt(4-1);
        SecondTask task = new SecondTask(newFace,controller);
        newFace.getTimer().schedule(task,rand*1000);
        }
}
