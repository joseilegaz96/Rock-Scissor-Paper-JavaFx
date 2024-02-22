package org.rockpaperscissor.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Screen;

import java.util.Random;

public class MainController {

    @FXML
    public Button btnScissors;
    @FXML
    public Button btnPaper;
    @FXML
    public Button btnRock;
    @FXML
    public Text txtResult;
    @FXML
    public Text scoreMachine;
    @FXML
    public Text scoreUser;
    @FXML
    public Text txtHidden;

    private String valueMachine[] = {"Rock", "Paper", "Scissor"};

    private int scoreU = 0;

    private int scoreM;
    private int valueRandom = 0;

    private Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

    public void initialize() {
        Random random = new Random();
        valueRandom = random.nextInt(0, 3);
        txtResult.setText(valueMachine[valueRandom]);
        txtResult.setVisible(false);
        txtHidden.setVisible(true);
    }

    public void valueScissor(ActionEvent actionEvent) {
        String machineValue = txtResult.getText();

        switch (machineValue) {
            case "Rock":
                scoreM = scoreM + 1;
                scoreMachine.setText(String.valueOf(scoreM));
                alert.setTitle("Results");
                alert.setHeaderText("Machine Wins!");
                txtResult.setVisible(true);
                txtHidden.setVisible(false);
                alert.showAndWait();
                initialize();
                break;
            case "Paper":
                scoreU = scoreU + 1;
                scoreUser.setText(String.valueOf(scoreU));
                alert.setTitle("Results");
                alert.setHeaderText("Player Wins!");
                txtResult.setVisible(true);
                txtHidden.setVisible(false);
                alert.showAndWait();
                initialize();
                break;
            case "Scissor":
                alert.setTitle("Empate");
                alert.setHeaderText("Empate");
                txtResult.setVisible(true);
                txtHidden.setVisible(false);
                alert.showAndWait();
                initialize();
                break;
        }

    }

    public void valuePaper(ActionEvent actionEvent) {
        String machineValue = txtResult.getText();

        switch (machineValue) {
            case "Rock":
                scoreU = scoreU + 1;
                scoreUser.setText(String.valueOf(scoreU));
                alert.setTitle("Results");
                alert.setHeaderText("Players Wins!");
                txtResult.setVisible(true);
                txtHidden.setVisible(false);
                alert.showAndWait();
                initialize();
                break;
            case "Paper":
                alert.setTitle("Empate");
                alert.setHeaderText("Empate");
                txtResult.setVisible(true);
                txtHidden.setVisible(false);
                alert.showAndWait();
                initialize();
                break;
            case "Scissor":
                scoreM = scoreM + 1;
                scoreMachine.setText(String.valueOf(scoreM));
                alert.setTitle("Results");
                alert.setHeaderText("Machine Wins!");
                txtResult.setVisible(true);
                txtHidden.setVisible(false);
                alert.showAndWait();
                initialize();
                break;
        }
    }

    public void valueRock(ActionEvent actionEvent) {
        String machineValue = txtResult.getText();

        switch (machineValue) {
            case "Rock":
                alert.setTitle("Empate");
                alert.setHeaderText("Empate");
                txtResult.setVisible(true);
                txtHidden.setVisible(false);
                alert.showAndWait();
                initialize();
                break;
            case "Paper":
                scoreM = scoreM + 1;
                scoreMachine.setText(String.valueOf(scoreM));
                alert.setTitle("Results");
                alert.setHeaderText("Machine Wins!");
                txtResult.setVisible(true);
                txtHidden.setVisible(false);
                alert.showAndWait();
                initialize();
                break;
            case "Scissor":
                scoreU = scoreU + 1;
                scoreUser.setText(String.valueOf(scoreU));
                alert.setTitle("Results");
                alert.setHeaderText("Player Wins!");
                txtResult.setVisible(true);
                txtHidden.setVisible(false);
                alert.showAndWait();
                initialize();
                break;
        }

    }
}