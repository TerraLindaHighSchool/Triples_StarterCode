package com.example.bruce.triples_1_5;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    private final int MAX_IMAGES = 18;
    private ImageView[] mImageArray = new ImageView[MAX_IMAGES];
    private TextView mTextCardsRemaining, mTextScore, mTextHighScore;
    private Button mButtonQuit;
    private GameModel game;
    private Animation wobble, slideDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // Get level from UI and assign number of cards on board and in deck
        int level = getIntent().getIntExtra("Level",1);
        int numCardsOnBoard = 12;  //default cards on board
        int numCardsInDeck = 81;  //default cards in deck
        switch(level){
            case 1: numCardsOnBoard = 15;
                numCardsInDeck = 27;
                break;
            case 2: numCardsOnBoard = 12;
                numCardsInDeck = 27;
                break;
            case 3: numCardsOnBoard = 18;
                numCardsInDeck = 54;
                break;
            case 4: numCardsOnBoard = 15;
                numCardsInDeck = 81;
                break;
            case 5: numCardsOnBoard = 12;
                numCardsInDeck = 81;
                break;
        }

        // set board features
        mTextCardsRemaining = findViewById(R.id.TextView_CardsRemaining);
        mTextScore = findViewById(R.id.TextView_Score);
        mTextHighScore = findViewById(R.id.TextView_High_Score);
        mButtonQuit = findViewById(R.id.Button_Quit);
        setImageArray();

        // begin game methods
        //setAnimationsAndListener();
        //game = new GameModel(numCardsInDeck, level);
        //beginGame(numCardsOnBoard);
        //beginRound(numCardsOnBoard);
    }

    /*************************************************
     * Misc Concrete Methods
     *************************************************/

     private void setImageArray(){
        mImageArray[0] = findViewById(R.id.imageView_0_0);
        mImageArray[1] = findViewById(R.id.imageView_0_1);
        mImageArray[2] = findViewById(R.id.imageView_0_2);
        mImageArray[3] = findViewById(R.id.imageView_1_0);
        mImageArray[4] = findViewById(R.id.imageView_1_1);
        mImageArray[5] = findViewById(R.id.imageView_1_2);
        mImageArray[6] = findViewById(R.id.imageView_2_0);
        mImageArray[7] = findViewById(R.id.imageView_2_1);
        mImageArray[8] = findViewById(R.id.imageView_2_2);
        mImageArray[9] = findViewById(R.id.imageView_3_0);
        mImageArray[10] = findViewById(R.id.imageView_3_1);
        mImageArray[11] = findViewById(R.id.imageView_3_2);
        mImageArray[12] = findViewById(R.id.imageView_4_0);
        mImageArray[13] = findViewById(R.id.imageView_4_1);
        mImageArray[14] = findViewById(R.id.imageView_4_2);
        mImageArray[15] = findViewById(R.id.imageView_5_0);
        mImageArray[16] = findViewById(R.id.imageView_5_1);
        mImageArray[17] = findViewById(R.id.imageView_5_2);
    }


}
