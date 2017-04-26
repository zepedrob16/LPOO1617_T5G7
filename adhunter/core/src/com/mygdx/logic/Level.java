package com.mygdx.logic;

import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;

import java.util.Timer;
import java.util.TimerTask;

public class Level {
    private float timeLeft;
    private int index, steps;
    private ImageButton[] buttons;

    public Level(int index){


        if (index >= 1 && index <= 10) timeLeft = 15f;
        if (index >= 11 && index <= 20) timeLeft = 12f;
        if (index >= 21 && index <= 30) timeLeft = 8f;
        if (index >= 31) timeLeft = 5f;

        if (index % 2 == 0) steps = 5;
        else steps = 3;

        if (index % 10 == 0){ //Boss level.
            timeLeft = 10f;
            steps = 1;
        }

    }

    public int getIndex(){
        return index;
    }

}
