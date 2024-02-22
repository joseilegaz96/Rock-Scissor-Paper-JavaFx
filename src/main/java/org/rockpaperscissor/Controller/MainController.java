package org.rockpaperscissor.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Random;

public class MainController {

    @FXML
    public TextField valueMachine;
    @FXML
    public Button btnPaper;
    @FXML
    public Button btnSscissor;
    public Text messageWinner;
    public Text playerScore;
    public Text machineScore;

    private int pScore;
    private int mScore;

    public void initialize() {
        String array[] = {"Rock", "Paper", "Scissor"};
        Random random = new Random();
        int positionArray = random.nextInt(0, 3);

        valueMachine.setText(array[positionArray]);
        valueMachine.setVisible(false);
        System.out.println(valueMachine.getText());
        attempts();
    }

    public void rock(ActionEvent actionEvent) {
        String getValueMachine = valueMachine.getText();

        switch (getValueMachine) {
            case "Rock":
                messageWinner.setText("Draw!");
                initialize();
                break;
            case "Paper":
                messageWinner.setText("Machine Win! \nPaper win rocks");
                mScore++;
                machineScore.setText(String.valueOf(mScore));
                initialize();
                break;
            case "Scissor":
                messageWinner.setText("Player Win! \nRock Win scissors");
                pScore++;
                playerScore.setText(String.valueOf(pScore));
                initialize();
                break;
        }

    }

    public void paper(ActionEvent actionEvent) {
        String getValueMachine = valueMachine.getText();

        switch (getValueMachine) {
            case "Rock":
                messageWinner.setText("Player Win! \nPaper win rock");
                pScore++;
                playerScore.setText(String.valueOf(pScore));
                initialize();
                break;
            case "Paper":
                messageWinner.setText("Draw!");
                initialize();
                break;
            case "Scissor":
                messageWinner.setText("Machine Win! \nScissor win paper");
                mScore++;
                machineScore.setText(String.valueOf(mScore));
                initialize();
                break;
        }
    }

    public void scissor(ActionEvent actionEvent) {
        String getValueMachine = valueMachine.getText();

        switch (getValueMachine) {
            case "Rock":
                messageWinner.setText("Machine Win! \nRocks win scissor");
                mScore++;
                machineScore.setText(String.valueOf(mScore));
                initialize();
                break;
            case "Paper":
                messageWinner.setText("Player Win! \n Scissor win paper");
                pScore++;
                playerScore.setText(String.valueOf(pScore));
                initialize();
                break;
            case "Scissor":
                messageWinner.setText("Draw!");
                initialize();
                break;
        }

    }

    private void attempts() {
        if (pScore == 3) {
            pScore = 0;
            playerScore.setText("0");

            mScore = 0;
            machineScore.setText("0");

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Winner");
            alert.setHeaderText("Your Winner this game");
            alert.showAndWait();
        }

        if (mScore == 3) {
            mScore = 0;
            machineScore.setText("0");

            pScore = 0;
            playerScore.setText("0");

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Winner");
            alert.setHeaderText("Machine Winner this game");
            alert.showAndWait();
        }
    }
}