package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;

import java.awt.event.MouseEvent;
import java.util.Random;

public class Controller {
    @FXML
    Label label1;
    @FXML
    Label label2;
    @FXML
    Label label3;

    @FXML
    Slider slider1;
    @FXML
    Slider slider2;
    @FXML
    Slider slider3;

    @FXML
    Pane color1;
    @FXML
    Pane color2;
    @FXML
    Pane color3;
    @FXML
    Pane colormix;

    @FXML
    public void initialize(){
        Integer tempRandom = random.nextInt(255);
        label1.setText(tempRandom.toString());
        slider1.setValue(tempRandom);
        ;

        tempRandom = random.nextInt(255);
        label2.setText(tempRandom.toString());
        slider2.setValue(tempRandom);

        tempRandom = random.nextInt(255);
        label3.setText(tempRandom.toString());
        slider3.setValue(tempRandom);
    }

    public void mouseClick(){
        label1.setText(Long.toString(Math.round(slider1.getValue())));
        label2.setText(Long.toString(Math.round(slider2.getValue())));
        label3.setText(Long.toString(Math.round(slider3.getValue())));
        setStyleForColorMix((int)slider1.getValue(), (int)slider2.getValue(), (int)slider3.getValue());
        setStyleForColorBlocks((int)slider1.getValue(), (int)slider2.getValue(), (int)slider3.getValue());
    }

    private void setStyleForColorMix(int r, int g, int b){
        colormix.setStyle("-fx-background-color: rgb("+r+", "+g+", "+b+")");
    }
    private void setStyleForColorBlocks(int r, int g, int b){
        color1.setStyle("-fx-background-color: rgb("+r+", 0, 0)");
        color2.setStyle("-fx-background-color: rgb(0, "+g+", 0)");
        color3.setStyle("-fx-background-color: rgb(0, 0, "+b+")");
    }

    private Random random = new Random();
}


