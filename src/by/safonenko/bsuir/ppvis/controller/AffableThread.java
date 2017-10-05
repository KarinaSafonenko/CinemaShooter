package by.safonenko.bsuir.ppvis.controller;

import by.safonenko.bsuir.ppvis.view.InformationFrame;

public class AffableThread extends  Thread {
    Controller controller;

    public AffableThread(Controller controller){
        this.controller = controller;
    }
    public void  run(){
        while (true){
            try {
                if(controller.getScore()==0){
                    controller.stopTime();
                    controller.stop();
                    int time = controller.getTime();
                    InformationFrame info = new InformationFrame( "Вы продержались", "Попробовать снова", time);
                    while (info.isFlag()){
                        Thread.sleep(1000);
                    }
                    info.setVisible(false);
                    controller.startGame();
                    controller.getMain_screen().getMainFrame().setEnabled(true);
                }
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
