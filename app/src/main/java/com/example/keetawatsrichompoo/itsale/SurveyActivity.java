package com.example.keetawatsrichompoo.itsale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SurveyActivity extends AppCompatActivity {

    private TextView question;
    private RadioButton select, A, B, C, D;
    private RadioGroup radioGroup;
    private Button submit;
    private String answer,
            genre = "null", genre_sub = "null", type = "null", type_sub = "null", player = "null";

    int page = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        addListenerOnButton();

    }

    private void addListenerOnButton() {

        question = (TextView) findViewById(R.id.question);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        submit = (Button) findViewById(R.id.submit);

        A = (RadioButton) findViewById(R.id.choiceA);
        B = (RadioButton) findViewById(R.id.choiceB);
        C = (RadioButton) findViewById(R.id.choiceC);
        D = (RadioButton) findViewById(R.id.choiceD);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                A.setChecked(false);
                B.setChecked(false);
                C.setChecked(false);
                D.setChecked(false);

                int selectedId = radioGroup.getCheckedRadioButtonId();
                select = (RadioButton) findViewById(selectedId);
                answer = select.getText().toString();

                if( page == 0 ) {

                    if (answer.equals("Shooting")) {
                        question.setText("Select Sub genre");

                        A.setText("First Person");
                        B.setText("Third Person");
                        C.setVisibility(View.INVISIBLE);
                        D.setVisibility(View.INVISIBLE);

                        Log.d("test", "genre: Shooting" );
                        genre = "Shooting";

                    }

                    if (answer.equals("Role playing")) {
                        question.setText("Select Sub genre");

                        A.setText("Simulation");
                        B.setText("Open world");
                        C.setVisibility(View.INVISIBLE);
                        D.setVisibility(View.INVISIBLE);

                        Log.d("test", "genre: Role playing" );
                        genre = "Role playing";

                    }

                    if (answer.equals("Racing")) {
                        question.setText("Select Sub genre");

                        A.setText("Vehicle");
                        B.setText("on Foot");
                        C.setVisibility(View.INVISIBLE);
                        D.setVisibility(View.INVISIBLE);

                        Log.d("test", "genre: Racing" );
                        genre = "Racing";

                    }

                    if (answer.equals("Strategy")) {
                        question.setText("Select Sub genre");

                        A.setText("Build and play");
                        B.setText("Mind game");
                        C.setVisibility(View.INVISIBLE);
                        D.setVisibility(View.INVISIBLE);

                        Log.d("test", "genre: Strategy" );
                        genre = "Strategy";

                    }

                    if (answer.equals("First Person") || answer.equals("Third Person")) {
                        question.setText("Game style");

                        A.setText("Adventure");
                        B.setText("Linear");
                        C.setText("Story telling");
                        C.setVisibility(View.VISIBLE);
                        D.setVisibility(View.INVISIBLE);

                        Log.d("test", "genre_sub: " + answer );
                        genre_sub = answer;

                    }

                    if (answer.equals("Simulation") || answer.equals("Open world")) {
                        question.setText("Game style");

                        A.setText("Fighting");
                        B.setText("Planing");
                        C.setVisibility(View.INVISIBLE);
                        D.setVisibility(View.INVISIBLE);

                        Log.d("test", "genre_sub: " + answer );
                        genre_sub = answer;

                    }

                    if (answer.equals("Vehicle") || answer.equals("on Foot")) {
                        question.setText("Theme");

                        A.setText("Baby design");
                        B.setText("Normal");
                        C.setText("Car maker himself");
                        C.setVisibility(View.VISIBLE);
                        D.setVisibility(View.INVISIBLE);

                        Log.d("test", "genre_sub: " + answer );
                        genre_sub = answer;

                    }

                    if (answer.equals("Build and play") || answer.equals("Mind game")) {
                        question.setText("Theme");

                        A.setText("History based");
                        B.setText("Realistic");
                        C.setText("Unthinkable");
                        C.setVisibility(View.VISIBLE);
                        D.setVisibility(View.INVISIBLE);

                        Log.d("test", "genre_sub: " + answer );
                        genre_sub = answer;

                    }

                    if (answer.equals("Adventure") || answer.equals("Linear") || answer.equals("Story telling")) {
                        question.setText("Theme");

                        A.setText("Historical");
                        B.setText("Modern");
                        C.setText("Future");
                        D.setVisibility(View.INVISIBLE);

                        Log.d("test", "type: " + answer );
                        type = answer;

                    }

                    if (answer.equals("Fighting") || answer.equals("Planing")) {
                        question.setText("Theme");

                        A.setText("Ancient");
                        B.setText("Standard");
                        C.setText("Futuristic");
                        C.setVisibility(View.VISIBLE);
                        D.setVisibility(View.INVISIBLE);

                        Log.d("test", "type: " + answer );
                        type = answer;

                    }

                    if (answer.equals("Historical") || answer.equals("Modern") || answer.equals("Future")) {
                        page = 2;

                        Log.d("test", "type_sub: " + answer );
                        type_sub = answer;

                    }

                    if (answer.equals("Ancient") || answer.equals("Standard") || answer.equals("Futuristic")) {
                        page = 2;

                        Log.d("test", "type_sub: " + answer );
                        type_sub = answer;
                    }

                    if (answer.equals("Baby design") || answer.equals("Normal") || answer.equals("Car maker himself")) {
                        page = 2;

                        Log.d("test", "type: " + answer );
                        type = answer;
                    }

                    if (answer.equals("History based") || answer.equals("Realistic") || answer.equals("Unthinkable")) {
                        page = 2;

                        Log.d("type", "type_sub: " + answer );
                        type_sub = answer;

                    }

                }

                if( page == 2 ) {
                    question.setText("Game type?");

                    A.setText("Singleplayer");
                    B.setText("Multiplayer");
                    C.setText("Mixed");
                    D.setVisibility(View.INVISIBLE);

                    if( answer.equals("Multiplayer") ) {
                        question.setText("Type?");

                        A.setText("Player vs Player");
                        B.setText("Player vs Environment");
                        C.setText("Cooperative");
                        C.setVisibility(View.VISIBLE);
                        D.setVisibility(View.INVISIBLE);

                    }

                    if( answer.equals("Player vs Player") || answer.equals("Player vs Environment") || answer.equals("Cooperative") ) {
                        A.setText("Player vs Player");
                        B.setText("Player vs Environment");
                        C.setText("Cooperative");
                        player = select.getText().toString();

                        Log.d("test", "player: " + player );

                    }

                    if( answer.equals("Singleplayer") || answer.equals("Mixed") ) {
                        player = select.getText().toString();

                        Log.d("test", "player: " + player );

                    }

                }

                if(!player.equals("null")){
                    Intent i = new Intent( SurveyActivity.this, ResultActivity.class);
                    i.putExtra("genre",genre);
                    i.putExtra("genreSub",genre_sub);
                    i.putExtra("type",type);
                    i.putExtra("typeSub",type_sub);
                    i.putExtra("player",player);
                    startActivity(i);

                    Log.d("result", "genre: " + genre );
                    Log.d("result", "genre_sub: " + genre_sub );
                    Log.d("result", "type: " + type );
                    Log.d("result", "type_sub: " + type_sub );
                    Log.d("result", "player: " + player );

                }

            }

        });
    }

}
