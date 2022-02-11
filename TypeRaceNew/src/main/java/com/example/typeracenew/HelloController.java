package com.example.typeracenew;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloController
{
    @FXML

    public TextField textTyped;

    @FXML
    private Label welcomeText;


    @FXML
    protected int onHelloButtonClick()
    {
        if(textTyped.getText().equals(welcomeText.getText()))
            return 1;
        else
            return 0;
    }
    public void onSpaceKey(String data)
    {

        while (true)
        {
            String s = textTyped.getText();
            if(s.equals(data))
                break;
        }
    }
    public void onClickTextBox()
    {
        try
        {
            File myObj = new File("fileName");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                welcomeText.setText(data);
                onSpaceKey(data);

            }


            myReader.close();
        }

        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}