package com.example.proejct2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;

public class HelloController {





    @FXML
    private Label label;


    @FXML
    protected void onRockButtonClick()
    {
        Random computerChoice = new Random();
        int choice = computerChoice.nextInt(1,6);
        if (choice == 1)
        {
            label.setText("Tie");
        }
        else if (choice == 2)
        {
            label.setText("Results: Paper covers rock. You Lose");
        }
        else if (choice == 3)
        {
            label.setText("Results: Rock crushes scissors. You Win");
        }
        else if (choice == 4)
        {
            label.setText("Results: Spock vaporizes rock. You Lose!");
        }
        else if (choice == 5)
        {
            label.setText("Results: Rock Crushes Lizard. You Win!");
        }
    }
    @FXML
    protected void onPaperButtonClick()
    {
        {
            Random computerChoice = new Random();
            int choice = computerChoice.nextInt(1,6);
            if (choice == 1)
            {
                label.setText("Results: Paper covers Rock, You Win");
            }
            else if (choice == 2)
            {
                label.setText("Results: Tie");
            }
            else if (choice == 3)
            {
                label.setText("Results: Scissors Cuts paper you lose");
            }
            else if (choice == 4)
            {
                label.setText("Results: Paper disproves Spock, You Win");
            }
            else if (choice == 5)
            {
                label.setText("Results: Lizard eats Paper, You lose");
            }
        }
    }

    @FXML
    protected void onScissorsButtonClick()
    {
        {
            Random computerChoice = new Random();
            int choice = computerChoice.nextInt(1,6);
            if (choice == 1)
            {
                label.setText("Results: Rock Crushes scissors, You Lose");
            }
            else if (choice == 2)
            {
                label.setText("Results: Scissors cuts paper, You Win");
            }
            else if (choice == 3)
            {
                label.setText("Results: Tie");
            }
            else if (choice == 4)
            {
                label.setText("Results: Spock smashes Scissors, You lose");
            }
            else if (choice == 5)
            {
                label.setText("Results: Scissors decapitates Lizard, You Win");
            }
        }
    }

    @FXML
    protected void onSpockButtonClick()
    {
        {
            Random computerChoice = new Random();
            int choice = computerChoice.nextInt(1,6);
            if (choice == 1)
            {
                label.setText("Results: Spock Vaporizes Rock, You Win");
            }
            else if (choice == 2)
            {
                label.setText("Results: Paper disproves Spock, You Lose");
            }
            else if (choice == 3)
            {
                label.setText("Results: Spock Smashes Scissors, You Win");
            }
            else if (choice == 4)
            {
                label.setText("Results: Tie");
            }
            else if (choice == 5)
            {
                label.setText("Results: Lizard Poisons, You Lose");
            }
        }
    }




    @FXML
    protected void onLizardButtonClick()
    {
        {
            Random computerChoice = new Random();
            int choice = computerChoice.nextInt(1,6);
            if (choice == 1)
            {
                label.setText("Results: Rock crushes lizard, you lose");

                label.getGraphic( );
            }
            else if (choice == 2)
            {
                label.setText("Results: Lizard eats paper, You Win");
            }
            else if (choice == 3)
            {
                label.setText("Results: Scissors decapitates Lizard, You Lose");
            }
            else if (choice == 4)
            {
                label.setText("Results: Lizard poisons Spock, You Win");
            }
            else if (choice == 5)
            {
                label.setText("Results: Tie");
            }
        }
    }



    }

