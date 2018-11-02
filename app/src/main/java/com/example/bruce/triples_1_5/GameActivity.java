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

        // More to be added later
    }

    // Additional Methods to be added later
}
