package com.example.bruce.triples_1_5;


import android.content.Context;

import java.util.ArrayList;

public class GameModel {
    private Deck deck;
    private ArrayList<Card> mCardOnBoard;
    private ArrayList<Integer> mSelectedCards;
    private long mStartTime;
    private int mScore, mTriplesRemaining, mLevel;

    GameModel(int numOfCardsInDeck, int level){
        // to be implemented
    }

    /*************************************************
     * Getters and Setters
     *************************************************/

     // to be implemented


    /*************************************************
     * Concrete Methods
     *************************************************/
    protected void dealTopCard(int index){
        // to be implemented
    }

    /************* to be implemented *********
    *
    protected Card dealBoard(){
    }
    *
    ****************************************/

    protected void listSelectedCards(boolean isSelected, int cardIndex){
        // to be implemented
    }

    protected void removeSelectedCard(int index){
        // to be implemented
    }

    protected boolean isTriple(int firstCard, int secondCard, int thirdCard){
        // to be implemented
        return true; // temporary placeholder until implementation
    }

    protected boolean playIsPossible(){
        // to be implemented
        return true;  // temporary placeholder until implementation
    }

    protected int updateScore() {
        // to be implemented
        return -1; // temporary placeholder until implementation
    }

    protected String getGameOverMessage(Context context){
        String message = context.getString(R.string.game_over);
        if(mTriplesRemaining > 0)
            message = "      " + message + "\n" + context.getString(R.string.play_not_possible);
        return message;
    }
}


