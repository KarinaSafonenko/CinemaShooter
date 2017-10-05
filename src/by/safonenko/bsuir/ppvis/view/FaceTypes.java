package by.safonenko.bsuir.ppvis.view;

import by.safonenko.bsuir.ppvis.controller.Controller;

import javax.swing.*;
import java.util.Map;

public class FaceTypes {

    Controller controller;
    private Map<String, FaceView> faces;
    private FaceView firstFace;
    private FaceView secondFace;
    private FaceView thirdFace;
    private FaceView fourthFace;
    private FaceView fifthFace;
    private FaceView sixthFace;
    private FaceView seventhFace;

    public FaceTypes(Controller controller){
        this.controller = controller;
    }

    public FaceView getFirstFace() {
        firstFace = new FaceView(new ImageIcon("D:\\PPVIS\\Cinema_Shooter\\src\\by\\safonenko\\bsuir\\ppvis\\view\\resourses\\face1.png"), controller);
        firstFace.setSize(90,98);
        return firstFace;
    }

    public FaceView getSecondFace() {
        secondFace = new FaceView(new ImageIcon("D:\\PPVIS\\Cinema_Shooter\\src\\by\\safonenko\\bsuir\\ppvis\\view\\resourses\\face2.png"), controller);
        secondFace.setSize(84,106);
        return secondFace;
    }

    public FaceView getThirdFace() {
        thirdFace = new FaceView(new ImageIcon("D:\\PPVIS\\Cinema_Shooter\\src\\by\\safonenko\\bsuir\\ppvis\\view\\resourses\\face3.png"), controller);
        thirdFace.setSize(104,101);
        return thirdFace;
    }

    public FaceView getFourthFace() {
        fourthFace = new FaceView(new ImageIcon("D:\\PPVIS\\Cinema_Shooter\\src\\by\\safonenko\\bsuir\\ppvis\\view\\resourses\\face4.png"), controller);
        fourthFace.setSize(95,104);
        return fourthFace;
    }

    public FaceView getFifthFace() {
        fifthFace = new FaceView(new ImageIcon("D:\\PPVIS\\Cinema_Shooter\\src\\by\\safonenko\\bsuir\\ppvis\\view\\resourses\\face5.png"), controller);
        fifthFace.setSize(115,110);
        return fifthFace;
    }

    public FaceView getSixthFace() {
        sixthFace = new FaceView(new ImageIcon("D:\\PPVIS\\Cinema_Shooter\\src\\by\\safonenko\\bsuir\\ppvis\\view\\resourses\\face6.png"), controller);
        sixthFace.setSize(99,106);
        return sixthFace;
    }

    public FaceView getSeventhFace() {
        seventhFace = new FaceView(new ImageIcon("D:\\PPVIS\\Cinema_Shooter\\src\\by\\safonenko\\bsuir\\ppvis\\view\\resourses\\face7.png"), controller);
        seventhFace.setSize(113,103);
        return seventhFace;
    }

}
