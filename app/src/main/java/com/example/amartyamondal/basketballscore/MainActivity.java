package com.example.amartyamondal.basketballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int A_score=0;
    int B_score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Dealing with instances for team A
     */
    public void A_display(){
        TextView score_of_a = (TextView) findViewById(R.id.a_score);
        score_of_a.setText("" + A_score);



    }
    public void A_3point(View view){
    A_score=A_score+3;
    A_display();
    }

    public void A_2point(View view){
    A_score=A_score+2;
    A_display();
    }


    public void A_1point(View view){
    A_score=A_score+1;
    A_display();
    }

    public void A_minus1point(View view){
        A_score=A_score-1;
        A_display();
    }

    /**
     * Dealing with instances for team A
     */
    public void B_display(){

        TextView score_of_b = (TextView) findViewById(R.id.b_score);
        score_of_b.setText("" + B_score);


    }

    public void B_3point(View view){
    B_score=B_score+3;
    B_display();
    }

    public void B_2point(View view){
        B_score=B_score+2;
        B_display();
    }

    public void B_1point(View view){
        B_score=B_score+1;
        B_display();
    }


    public void B_minus1point(View view){
        B_score=B_score-1;
        B_display();
    }
    public void Game_display(String rprint ) {

        TextView game_result = (TextView) findViewById(R.id.game_text_view);
        game_result.setText("" + rprint);
    }

    public void Game(View view) {
        String rprint;
        if (A_score > B_score) {
            rprint = "TEAM A WON";
        }
        else if (A_score < B_score) {
            rprint ="TEAM B WON";
        }
        else{
            rprint="MATCH IS DRAW";
        }
        Game_display(rprint);
    }


    /**
     * Dealing with the work of Reset Bottom
     */

    public void Reset(View view){
        String rprint="";
        A_score=0;
        B_score=0;
        A_display();
        B_display();
        Game_display(rprint);

    }

}
