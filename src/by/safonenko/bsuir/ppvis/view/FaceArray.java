package by.safonenko.bsuir.ppvis.view;

import java.util.ArrayList;

public class FaceArray {
    private  ArrayList<FaceView> faceList;

    public  FaceArray(){
        faceList = new ArrayList<>();
    }

    public void  addFace(FaceView newFace){
        faceList.add(newFace);
    }

    public  void removeFace(FaceView currentFace){
        faceList.remove(currentFace);
    }

    public  void  removeAll(){
        faceList.clear();
    }

    public ArrayList<FaceView> getFaceList() {
        return faceList;
    }
}
